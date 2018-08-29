package com.zw.util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.imageio.ImageIO;

/**
 * ͼƬˮӡ������
 * @author zhengwei
 * 
 */
public class HandImg {
	//����	����	�����
	//����һ�����������ˮӡ
	/**
	 * ���ˮӡ�ķ���
	 * @param image	��ͼ·��
	 * @param targetIamge	ˮӡͼ·��
	 */
	public static void addWatermark(String image,String targetImage){
		FileOutputStream fs=null;
		try {
			//����ˮӡͼƬ
			File imageFile=new File(image);
			//��File����ת����image����
			Image src=ImageIO.read(imageFile);
			//��ȡͼƬ�Ŀ�Ⱥ͸߶�
			int width=src.getWidth(null);
			int height=src.getHeight(null);
			
			//����ˮӡ
			File _file=new File(targetImage);
			Image target=ImageIO.read(_file);
			int _width=target.getWidth(null);
			int _height=target.getHeight(null);
			
			//����һ������
			BufferedImage imageBuffer=new BufferedImage(_width, _height, BufferedImage.TYPE_INT_BGR);
			//�������ƹ���
			Graphics2D graphics2d=imageBuffer.createGraphics();
			//��Ŀ��ͼƬ����������
			graphics2d.drawImage(target, 0, 0, _width, _height, null);
			//��ˮӡͼƬ��ӵ�������
			graphics2d.drawImage(src, (_height-height)/2, (_width-width)/2,  width, height, null);
			//��������
			graphics2d.dispose();
			//����һ���ļ��������
			fs=new FileOutputStream(targetImage);
			JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(fs);
			encoder.encode(imageBuffer);
			System.out.println("���ˮӡ�ɹ���");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
				try {
					if(fs!=null){
						fs.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public static void main(String[] args) {
			addWatermark("img/logo.jpg", "img/timg.jpg");
		}
		//���ص�ͼ
		
		//���ˮӡ
}

