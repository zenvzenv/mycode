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
 * 图片水印核心类
 * @author zhengwei
 * 
 */
public class HandImg {
	//属性	方法	代码块
	//定义一个方法：添加水印
	/**
	 * 添加水印的方法
	 * @param image	底图路径
	 * @param targetIamge	水印图路径
	 */
	public static void addWatermark(String image,String targetImage){
		FileOutputStream fs=null;
		try {
			//加载水印图片
			File imageFile=new File(image);
			//将File对象转换成image对象
			Image src=ImageIO.read(imageFile);
			//获取图片的宽度和高度
			int width=src.getWidth(null);
			int height=src.getHeight(null);
			
			//加载水印
			File _file=new File(targetImage);
			Image target=ImageIO.read(_file);
			int _width=target.getWidth(null);
			int _height=target.getHeight(null);
			
			//创建一个画板
			BufferedImage imageBuffer=new BufferedImage(_width, _height, BufferedImage.TYPE_INT_BGR);
			//创建绘制工具
			Graphics2D graphics2d=imageBuffer.createGraphics();
			//将目标图片划到画板上
			graphics2d.drawImage(target, 0, 0, _width, _height, null);
			//将水印图片添加到画板上
			graphics2d.drawImage(src, (_height-height)/2, (_width-width)/2,  width, height, null);
			//结束绘制
			graphics2d.dispose();
			//创建一个文件的输出流
			fs=new FileOutputStream(targetImage);
			JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(fs);
			encoder.encode(imageBuffer);
			System.out.println("添加水印成功！");
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
		//加载底图
		
		//添加水印
}

