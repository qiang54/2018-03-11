package com.test.UserDao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.test.domain.User;
import com.test.uitls.HibernateUtils;

public class UserDao {

	public User findByNameAndPwd(User user) {
		Session session = HibernateUtils.getCurrentSession();
		Query query = session.createQuery("from User where uname = ? and password = ?");
		
		query.setParameter(0, user.getUname());
		query.setParameter(1, user.getPassword());
		
		List<User> list = query.list();
		if(list.size() > 0){
			return list.get(0);
		}
		return null;
	}

}
