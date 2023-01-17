package com.tcs.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.Daoi.Daoi;
import com.tcs.model.user;

@Service
public class ServiceIMPI implements ServiceI {
	@Autowired
	private Daoi daoi;
	@Override
	public int savedata(user user) {
		int save = daoi.savedata(user);
		
		return save;
	}
	@Override
	public List<user> getdata(user user) {
		
	    List<user> list = daoi.getdata();
		return list;
	}
	@Override
	public user edite(int id) {
		
		user user = daoi.edite(id);
		return user;
	}
	@Override
	public user update(user user) {
		user update = daoi.update(user);
		return update;
	}
	@Override
	public user logincheack(user user) {
		com.tcs.model.user user1 = daoi.logincheack(user);
		return user1;
	}

}
