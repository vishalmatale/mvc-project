package com.tcs.Daoi;

import java.util.List;

import com.tcs.model.user;

public interface Daoi  {

	
	public int savedata(user user);
	 public List<user>getdata();
	 
	 public user edite(int id);
	 
	 public user update(user user);
	 
     public  user logincheack(user user);
}