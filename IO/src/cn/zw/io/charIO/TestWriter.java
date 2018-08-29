package cn.zw.io.charIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 
 * <p>Title:TestWriter</p>
 * <p>Description:文件的写出</p>
 * @author zhengwei
 * @date 2017-5-10 上午10:25:58
 */
public class TestWriter {
	public static void main(String[] args) {
		File dest=new File("c:/迅雷下载/bs.txt");
		Writer writer=null;
		try {
			//true表示是追加文件
			writer=new FileWriter(dest,true);
			String str="锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆幸苦";
			writer.write(str);
			writer.append("郑伟开发的健康");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (null!=writer) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
