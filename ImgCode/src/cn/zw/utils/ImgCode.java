package cn.zw.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * <p>Title:ImgCode</p>
 * <p>Description:ͼƬ��֤��</p>
 * @author zhengwei
 * @date 2017-5-31 ����2:56:18
 */
public class ImgCode {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//���ͼƬ������
		BufferedImage bi=new BufferedImage(70,35,BufferedImage.TYPE_INT_RGB);
		//�õ����ƻ�������û���
		Graphics2D g2=(Graphics2D) bi.getGraphics();
		//���ñ�����ɫ
		g2.setColor(Color.WHITE);
		//����Ŷһ������
		g2.fillRect(0, 0, 70, 35);
		//��������
		g2.setFont(new Font("΢���ź�", Font.PLAIN, 10));
		//����������ɫ
		g2.setColor(Color.BLACK);
		//����ͼƬ�ϵ���
		g2.drawString("֣ΰ��˧", 20, 20);
		//���ͼƬ
		ImageIO.write(bi, "JPEG", new FileOutputStream("c:/Ѹ������/a.jpg"));
	}
}
