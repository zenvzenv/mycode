package cn.zw.VetifyCode;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * 动态生成验证码
 * @author zhengwei
 *
 */
public class VerifyCode {
	private int width=70;//图片的宽
	private int height=35;//图片的高
	private Random r=new Random();
	//字体
	private String[] fontNames={"宋体","微软雅黑","楷体","华文楷体","幼圆"};
	private String codes="23456789abcdefghijkmnopqrstuvwxyzABCDEFGHIJKMNPQRSTUVWXYZ";
	private Color bgColor=new Color(255,255,255);//背景色
	private String text;
	
	private Color randomColor(){
		int red=r.nextInt(150);
		int green=r.nextInt(150);
		int blue=r.nextInt(150);
		return new Color(red,green,blue);
	}
	//随机字体
	private Font randomFont(){
		int index=r.nextInt(fontNames.length);
		String fontName=fontNames[index];
		int style=r.nextInt(4);//生成随机的样式，0 无样式，1粗体，2斜体，3粗体+斜体
		int size=r.nextInt(5)+24;//随机字号
		return new Font(fontName,style,size);
	}
	//干扰线
	private void drawLine(BufferedImage image){
		int num=3;
		Graphics2D g2=(Graphics2D) image.getGraphics();
		for (int i = 0; i < num; i++) {
			int x1=r.nextInt(width);
			int y1=r.nextInt(height);
			int x2=r.nextInt(width);
			int y2=r.nextInt(height);
			g2.setStroke(new BasicStroke(1.5F));
			g2.setColor(randomColor());//干扰线颜色
			g2.drawLine(x1, y1, x2, y2);//两点确定一条直线
		}
	}
	
	private char randomChar(){
		int index=r.nextInt(codes.length());
		return codes.charAt(index);
	}
	
	private BufferedImage createImage(){
		BufferedImage bi=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2=(Graphics2D) bi.getGraphics();
		g2.setColor(this.bgColor);
		g2.fillRect(0, 0, width, height);
		return bi;
	}
	/**
	 * 得到验证码图片
	 * @return
	 */
	public BufferedImage getImage(){
		BufferedImage bi=createImage();
		Graphics2D g2=(Graphics2D) bi.getGraphics();//得到绘制环境
		StringBuilder sb=new StringBuilder();//用来装载验证码上的文本
		//向图中画四个字符
		for(int i=0;i<4;i++){
			String s=randomChar()+"";
			sb.append(s);
			float x=i+i*1.0f*width/4;//把图片分成4块
			g2.setFont(randomFont());
			g2.setColor(randomColor());
			g2.drawString(s,x,height-5);//画图
		}
		this.text=sb.toString();
		drawLine(bi);//干扰线
		return bi;
	}
	
	public String getText(){
		return text;
	}
	/**
	 * 保存图片到指定路径
	 * @param image
	 * @param out
	 * @throws IOException
	 */
	public static void output(BufferedImage image,OutputStream out) throws IOException{
		ImageIO.write(image, "JPEG", out);
	}
}
