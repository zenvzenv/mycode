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
 * <p>Description:����һ����Ϸ������</p>
 * @author zhengwei
 * @date 2017-4-28 ����8:35:49
 */
public class PlaneFrame extends JFrame{
	//��ȡ��Դ���ڵ�Ŀ¼
	public static String path=System.getProperty("user.dir")+"/Resource/resource";
	//׼��һ������ȡ���е�ͼƬ������StringͼƬ�����֣�BufferedImage ͼƬ
	public static HashMap<String, BufferedImage> maps=new HashMap<>();
	PlanePanel jp=new PlanePanel();
	//������Դ
	static{
		//����
		File[] files=new File(path).listFiles();//�������е�ͼƬ
		for (int i=0;i<files.length;i++) {
			try {
				maps.put(files[i].getName(), ImageIO.read(files[i]));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * ���췽��
	 */
	public PlaneFrame(){
		//�����Ƿ�ɼ�
		setVisible(true);
		//���ñ���
		this.setTitle("����ս��");
		//��ƴ��ڵĴ�С
		this.setSize(800, 800);
		//���þ���
		this.setLocationRelativeTo(null);
		//���ù̶��Ĵ���
		this.setResizable(false);
		//Ĭ�Ϲر�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�ѻ������ص�������
		this.setContentPane(jp);
		//��Ӽ��̼����¼�
		this.addKeyListener(new MykeyListerener());
	}
	//������,�������̵��¼�
	class MykeyListerener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			//���������ķ���
			jp.keyPressed(e);
		}
	}
	public static void main(String[] args) {
		PlaneFrame pf=new PlaneFrame();
//		System.out.println(path);
	}
}

class PlanePanel extends JPanel{
	//�����ӵ�����
	int buff=0;
	//���ñ���ͼƬ��λ��
	Point bgPoint=new Point(0,-830);
	Point planePoint=new Point(200,500);
	//�����ӵ�
	List<Point> list=new ArrayList<>();
	//�����߳�
	public PlanePanel(){
		new Thread(new BgThread()).start();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//����һ������
		BufferedImage image=new BufferedImage(640,700,BufferedImage.TYPE_INT_RGB);
		//����
		Graphics gs= image.getGraphics();
		//������
		gs.drawImage(PlaneFrame.maps.get("background1.bmp"), bgPoint.x, bgPoint.y, this);
		gs.drawImage(PlaneFrame.maps.get("background1.bmp"), bgPoint.x, bgPoint.y-1530, this);
		//���ɻ�
		gs.drawImage(PlaneFrame.maps.get("plane.png"), planePoint.x, planePoint.y, this);
		//���ӵ�
		for (int i = 0; i < list.size(); i++) {
			gs.drawImage(PlaneFrame.maps.get("m3.png"), list.get(i).x, list.get(i).y,this);
		}
		g.drawImage(image, 0, 0,  this);
	}
	//����һ���߳�������ͼƬ���ƶ�
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
				//����
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//���»���
				repaint();
			}
		}
	}
	/**
	 * �������µķ���
	 */
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_SPACE){
			fire();
		}
		//����������ϼ�
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
	//�����ӵ��ķ���
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


