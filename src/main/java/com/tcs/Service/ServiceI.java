package com.tcs.Service;

import java.util.List;

import com.tcs.model.user;

public interface  ServiceI {
	
	
	public int savedata(user user);
    
	public List<user>getdata(user user);

	public user edite(int id);
	
	public user update(user user);
	public user logincheack(user user);
}
