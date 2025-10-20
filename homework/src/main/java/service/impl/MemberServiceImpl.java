package service.impl;

import dao.impl.MemberJoinImpl;
import model.Member;
import service.MemberService;

public class MemberServiceImpl implements MemberService {

	public static void main(String[] args) {
		//Member m=new Member("a","tea45688","456","taipei","000");
		
		//System.out.println(new MemberServiceImpl().addMember(m));
		
		
		System.out.println(new MemberServiceImpl().Login("tea45688", "456"));

	}
	
	private MemberJoinImpl mdi=new MemberJoinImpl();
	
	@Override
	public int addMember(Member member) {
		/*
		 * 1.先判斷帳號重複true-->1
		 * 2.false-->註冊--->return 0;
		 */
		
		if(mdi.selectUsername(member.getUsername()))
		{
			return 1;
		}
		else
		{
			mdi.insert(member);
			return 0;
		}
		
		
		
	}



	@Override
	public Member Login(String username, String password) {
		// TODO Auto-generated method stub
		return mdi.selectByUsernameAndPassword(username, password);
	}



	

}
