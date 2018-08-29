package cn.zw.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 
 * <p>Title:GameFrame</p>
 * <p>Description:游戏窗体类</p>
 * @author zhengwei
 * @date 2017-4-22 下午9:34:04
 */
public class GameFrame extends Frame{	//GUI编程:AWT,SWING等
	/**
	 * 加载窗口
	 */
	public void launchFrame(){
		setSize(800,800);
		setLocation(100, 100);
		setVisible(true);
		setTitle("郑伟");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(100, 100, 200, 300);
		g.drawRect(20, 50, 200, 100);
		g.drawOval(20, 50, 200, 100);
		Font f=new Font("微软雅黑",Font.BOLD,100);
		g.setFont(f);
		g.drawString("我是郑伟", 200, 200);
		g.fillRect(100, 100, 20, 20);
		g.setColor(Color.green);
		g.fillOval(100, 200, 20, 20);
	}

	public static void main(String[] args) {
		GameFrame gf=new GameFrame();
		gf.launchFrame();
	}
}
