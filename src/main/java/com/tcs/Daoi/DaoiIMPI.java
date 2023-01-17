package com.tcs.Daoi;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tcs.model.user;

@Repository
public class DaoiIMPI implements Daoi {
	@Autowired
	private SessionFactory session;

	@Override
	public int savedata(user user) {
		
		Session session2 = session.openSession();
		session2.beginTransaction();
		int save = (int) session2.save(user);
		session2.getTransaction();
		return save;
		}

	@Override
	public List<user> getdata() {
	
		Session session2 = session.openSession();
		session2.beginTransaction();
		String sql="from user";
		Query query = session2.createQuery(sql);
		List list = query.getResultList();
		session2.getTransaction().commit();
		return list;
	}

	@Override
	public user edite(int id) {
		Session session2 = session.openSession();
		user user = session2.get(user.class, id);
		return user;
	}

	@Override
	public user update(user user) {
		Session session2 = session.openSession();
		session2.beginTransaction();
		session2.update(user);
		session2.getTransaction().commit();;
		session2.close();
		    
		Session session3 = session.openSession();
		
		com.tcs.model.user update = session3.get(user.class, user.getId());
		
		return update;
	}

	@Override
	public user logincheack(user user) {
		
		Session session2 = session.openSession();
		String sql="from user";
		Query query = session2.createQuery(sql);
		List<user> list= query.getResultList();
		
       for( user user1:list) {
    	   
    	if(user.getName().equals(user1.getName()) && user.getEmail().equals(user1.getEmail()))  {
    		
    		return user1;
    	}
    	   
       }
			return null;
	}

}
