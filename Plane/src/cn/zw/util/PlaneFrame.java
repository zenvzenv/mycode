package cn.zw.util;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * <p>Title:PlaneFrame</p>
 * <p>Description:创建一个游戏主窗口</p>
 * @author zhengwei
 * @date 2017-4-28 下午8:35:49
 */
public class PlaneFrame extends JFrame{
	//获取资源所在的目录
	public static String path=System.getProperty("user.dir")+"/Resource/resource";
	//准备一个容器取所有的图片，集合String图片的名字，BufferedImage 图片
	public static HashMap<String, BufferedImage> maps=new HashMap<>();
	PlanePanel jp=new PlanePanel();
	//加载资源
	static{
		//加载
		File[] files=new File(path).listFiles();//加载所有的图片
		for (int i=0;i<files.length;i++) {
			try {
				maps.put(files[i].getName(), ImageIO.read(files[i]));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 构造方法
	 */
	public PlaneFrame(){
		//窗口是否可见
		setVisible(true);
		//设置标题
		this.setTitle("雷霆战机");
		//设计窗口的大小
		this.setSize(800, 800);
		//设置剧中
		this.setLocationRelativeTo(null);
		//设置固定的窗口
		this.setResizable(false);
		//默认关闭
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//把画布加载到窗体上
		this.setContentPane(jp);
		//添加键盘监听事件
		this.addKeyListener(new MykeyListerener());
	}
	//适配器,监听键盘的事件
	class MykeyListerener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			//调用面板里的方法
			jp.keyPressed(e);
		}
	}
	public static void main(String[] args) {
		PlaneFrame pf=new PlaneFrame();
//		System.out.println(path);
	}
}

class PlanePanel extends JPanel{
	//控制子弹左右
	int buff=0;
	//设置背景图片的位置
	Point bgPoint=new Point(0,-830);
	Point planePoint=new Point(200,500);
	//设置子弹
	List<Point> list=new ArrayList<>();
	//启动线程
	public PlanePanel(){
		new Thread(new BgThread()).start();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//创建一个画板
		BufferedImage image=new BufferedImage(640,700,BufferedImage.TYPE_INT_RGB);
		//画笔
		Graphics gs= image.getGraphics();
		//画背景
		gs.drawImage(PlaneFrame.maps.get("background1.bmp"), bgPoint.x, bgPoint.y, this);
		gs.drawImage(PlaneFrame.maps.get("background1.bmp"), bgPoint.x, bgPoint.y-1530, this);
		//画飞机
		gs.drawImage(PlaneFrame.maps.get("plane.png"), planePoint.x, planePoint.y, this);
		//画子弹
		for (int i = 0; i < list.size(); i++) {
			gs.drawImage(PlaneFrame.maps.get("m3.png"), list.get(i).x, list.get(i).y,this);
		}
		g.drawImage(image, 0, 0,  this);
	}
	//定义一个线程来控制图片的移动
	class BgThread implements Runnable{
		@Override
		public void run() {
			while(true){
				if (bgPoint.y==700) {
					bgPoint.y=-830;
				}
				bgPoint.y+=1;
				for (int i = 0; i < list.size(); i++) {
					list.get(i).y-=10;
				}
				//休眠
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//更新画板
				repaint();
			}
		}
	}
	/**
	 * 按键按下的方法
	 */
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_SPACE){
			fire();
		}
		//如果按的是上键
		if (e.getKeyCode()==KeyEvent.VK_UP) {
			planePoint.y-=10;
		}
		if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			planePoint.y+=10;
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			planePoint.x+=10;
		}
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			planePoint.x-=10;
		}
		repaint();
	}
	//发射子弹的方法
	public void fire(){
		if(buff==1){
			list.add(new Point(planePoint.x+30,planePoint.y-80));
			buff=0;
		}else{
			list.add(new Point(planePoint.x-5,planePoint.y-80));
			buff=1;
		}
	}
}


