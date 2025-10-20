package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Member;
import service.impl.MemberServiceImpl;

public class Tool {

	public static void main(String[] args) {
		//System.out.println(new MemberServiceImpl().Login("teacher", "123456"));
		//Member member=new MemberServiceImpl().Login("teryy", "456");
		//Tool.saveMember(member);
		System.out.println(Tool.readMember());

	}
	
	//存檔
	public static void saveMember(Member member) 
	{
		try {
		FileOutputStream fos=new FileOutputStream("Member.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(member);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//讀取檔案
	
		public static Member readMember()
		{
			Member member=null;
			
			try {
				FileInputStream fis=new FileInputStream("Member.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				
				member=((Member)ois.readObject());
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return member;
		}
	

}
