package cn.zw.service;

import cn.zw.dao.UserDao;
import cn.zw.domain.User;

public class UserService {
	//service≤„“¿¿µdao≤„
	private UserDao userDao=new UserDao();
	public User find(){
		return userDao.find();
	}
}
