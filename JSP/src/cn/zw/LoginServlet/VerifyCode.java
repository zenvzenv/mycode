package cn.zw.LoginServlet;

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
 * ��̬�����֤��
 * @author zhengwei
 *
 */
public class VerifyCode {
	private int width=70;//ͼƬ�Ŀ�
	private int height=35;//ͼƬ�ĸ�
	private Random r=new Random();
	//����
	private String[] fontNames={"����","΢���ź�","����","���Ŀ���","��Բ"};
	private String codes="23456789abcdefghijkmnopqrstuvwxyzABCDEFGHIJKMNPQRSTUVWXYZ";
	private Color bgColor=new Color(255,255,255);//����ɫ
	private String text;
	
	private Color randomColor(){
		int red=r.nextInt(150);
		int green=r.nextInt(150);
		int blue=r.nextInt(150);
		return new Color(red,green,blue);
	}
	//�������
	private Font randomFont(){
		int index=r.nextInt(fontNames.length);
		String fontName=fontNames[index];
		int style=r.nextInt(4);//���������ʽ��0 ����ʽ��1���壬2б�壬3����+б��
		int size=r.nextInt(5)+24;//����ֺ�
		return new Font(fontName,style,size);
	}
	//������
	private void drawLine(BufferedImage image){
		int num=3;
		Graphics2D g2=(Graphics2D) image.getGraphics();
		for (int i = 0; i < num; i++) {
			int x1=r.nextInt(width);
			int y1=r.nextInt(height);
			int x2=r.nextInt(width);
			int y2=r.nextInt(height);
			g2.setStroke(new BasicStroke(1.5F));
			g2.setColor(randomColor());//��������ɫ
			g2.drawLine(x1, y1, x2, y2);//����ȷ��һ��ֱ��
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
	 * �õ���֤��ͼƬ
	 * @return
	 */
	public BufferedImage getImage(){
		BufferedImage bi=createImage();
		Graphics2D g2=(Graphics2D) bi.getGraphics();//�õ����ƻ���
		StringBuilder sb=new StringBuilder();//����װ����֤���ϵ��ı�
		//��ͼ�л��ĸ��ַ�
		for(int i=0;i<4;i++){
			String s=randomChar()+"";
			sb.append(s);
			float x=i+i*1.0f*width/4;//��ͼƬ�ֳ�4��
			g2.setFont(randomFont());
			g2.setColor(randomColor());
			g2.drawString(s,x,height-5);//��ͼ
		}
		this.text=sb.toString();
		drawLine(bi);//������
		return bi;
	}
	
	public String getText(){
		return text;
	}
	/**
	 * ����ͼƬ��ָ��·��
	 * @param image
	 * @param out
	 * @throws IOException
	 */
	public static void output(BufferedImage image,OutputStream out) throws IOException{
		ImageIO.write(image, "JPEG", out);
	}
}
