package cn.zw.Dao;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import cn.zw.Domain.User;

/**
 * 数据类
 * @author zhengwei
 *
 */
public class UserDao {
	private String path="c:/迅雷下载/users.xml";//依赖数据文件
	/**
	 * 查询用户名是否重复
	 * @param username
	 * @return
	 */
	public User findByUsername(String username){
		/*
		 * 1.得到document
		 * 2.xpath查询
		 * 3.教研查询是否null，如果为null，返回null
		 * 4.如果不是null，需要Element封装到User中。
		 */
		//1.获得解析器
		SAXReader reader=new SAXReader();
		try {
			Document doc=reader.read(path);
			//2.通过xpath查询得到Element
			Element ele=(Element) doc.selectSingleNode("//user[@username='"+username+"']");
			//3.校验查询的结果是否为null
			if(ele==null) return null;
			//4.如果不是null，把ele封装到user中
			User user=new User();
			String uname=ele.attributeValue("username");
			String pwd=ele.attributeValue("password");
			user.setUsername(uname);
			user.setPassword(pwd);
			return user;
		} catch (DocumentException e) {
			throw new RuntimeException();
		}
	}
	/**
	 * 注册成功，向数据库中添加一条记录
	 * @param user
	 */
	public void add(User user){
		/*
		 * 1.得到document
		 * 2.通过document得到root元素，
		 * 3.使用参数user，转发成Element对象
		 * 4.把element添加到root元素中
		 * 5.保存document
		 */
	}
}
