package dao;

import model.Member;

public interface MemberJoin {
		//create
		void insert(String name,String username,String password,String address,String phone);
		void insert(Member member);//inject物件注入
		
		//read
		String selectAll();//select * from member
		boolean selectUsername(String username);
		Member selectByUsernameAndPassword(String username,String password);

		//update
		
		void update(String name,String password,int id);
		
		//delete
		
		void delete(int id);
}
