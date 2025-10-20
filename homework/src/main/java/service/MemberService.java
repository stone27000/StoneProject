package service;

import model.Member;
/*
 * 真正要用-->參考UI操作
 */
public interface MemberService {
	//create
		int addMember(Member member);//註冊-->判斷帳號重複-->註冊insert()
		
		//read
		//String findAllMember();
		
		Member Login(String username,String password);
		
		
		//update
		
		
		//delete
		
		//void deleteMember(int id);

}
