package cn.zw.Dao;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import cn.zw.Domain.User;

/**
 * ������
 * @author zhengwei
 *
 */
public class UserDao {
	private String path="c:/Ѹ������/users.xml";//���������ļ�
	/**
	 * ��ѯ�û����Ƿ��ظ�
	 * @param username
	 * @return
	 */
	public User findByUsername(String username){
		/*
		 * 1.�õ�document
		 * 2.xpath��ѯ
		 * 3.���в�ѯ�Ƿ�null�����Ϊnull������null
		 * 4.�������null����ҪElement��װ��User�С�
		 */
		//1.��ý�����
		SAXReader reader=new SAXReader();
		try {
			Document doc=reader.read(path);
			//2.ͨ��xpath��ѯ�õ�Element
			Element ele=(Element) doc.selectSingleNode("//user[@username='"+username+"']");
			//3.У���ѯ�Ľ���Ƿ�Ϊnull
			if(ele==null) return null;
			//4.�������null����ele��װ��user��
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
	 * ע��ɹ��������ݿ������һ����¼
	 * @param user
	 */
	public void add(User user){
		/*
		 * 1.�õ�document
		 * 2.ͨ��document�õ�rootԪ�أ�
		 * 3.ʹ�ò���user��ת����Element����
		 * 4.��element��ӵ�rootԪ����
		 * 5.����document
		 */
	}
}
