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
 * <p>Description:图片验证码</p>
 * @author zhengwei
 * @date 2017-5-31 下午2:56:18
 */
public class ImgCode {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//获得图片缓冲区
		BufferedImage bi=new BufferedImage(70,35,BufferedImage.TYPE_INT_RGB);
		//得到绘制环境，获得画笔
		Graphics2D g2=(Graphics2D) bi.getGraphics();
		//设置背景颜色
		g2.setColor(Color.WHITE);
		//绘制哦一个矩形
		g2.fillRect(0, 0, 70, 35);
		//设置字体
		g2.setFont(new Font("微软雅黑", Font.PLAIN, 10));
		//设置字体颜色
		g2.setColor(Color.BLACK);
		//设置图片上的字
		g2.drawString("郑伟真帅", 20, 20);
		//输出图片
		ImageIO.write(bi, "JPEG", new FileOutputStream("c:/迅雷下载/a.jpg"));
	}
}
