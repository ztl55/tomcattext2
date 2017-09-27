package com.itcast.enumtest;

import org.junit.Test;

public class User {
	private int id;
	private String name;
	
	private int role1;
	private Role2 role2;
	private Role3 role3;
	
	@Test
	public void run1() {
		User user=new User();
		user.id=1;
		user.name="ÎÒµÄ";
		//user.role1=Role1.BOSS;
		//user.role2=new Role2();
		user.role3=Role3.BOOS;
		
	}

}
enum Role3{
	BOOS,HR,WORKEY;
}
class Role2{
	public static final Role2 BOSS=new Role2();
	public static final Role2 HR=new Role2();
	public static final Role2 WORKER=new Role2();
	
}
class Role1{
	public static final int BOSS=0;
	public static final int HR=1;
	public static final int WORKER=2;
	
}