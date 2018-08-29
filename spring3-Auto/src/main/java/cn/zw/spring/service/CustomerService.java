package cn.zw.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.zw.spring.dao.CustomerDao;
@Component
public class CustomerService {
	@Autowired
	CustomerDao customerDao;

	public String toString() {
		return "CustomerService [customerDao=" + customerDao + "]";
	}
	
}
