package com.test.UserService;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.test.UserDao.UserDao;
import com.test.domain.User;
import com.test.uitls.HibernateUtils;

public class UserService {

	public User login(User user){
		
		Session session = HibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		User existUser = null;
		try{
			
			existUser = new UserDao().findByNameAndPwd( user);
			tr.commit();
		}catch(Exception e){
			tr.rollback();
			e.printStackTrace();
		}
		return existUser;
		
	}
	
	@Test
	public void run(){
		User user = new User();
		
		user.setUname("tom");
		user.setPassword("1234");
		User u = this.login(user);
		if( u != null){
			System.out.println("µÇÂ¼³É¹¦...");
		}
		
	}
}
