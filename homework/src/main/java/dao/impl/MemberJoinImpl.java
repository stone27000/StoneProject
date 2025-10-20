package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.MemberJoin;
import model.Member;
import util.DbConnection;

public class MemberJoinImpl implements MemberJoin{

	public static void main(String[] args) {
		
		//new MemberJoinImpl().insert(new Member("a","ter","456","台北","123"));;
		//Member m=new Member("bbb","teryy","456","台北","123");
		//new MemberJoinImpl().insert(m);
		Member m=new MemberJoinImpl().selectByUsernameAndPassword("teryy", "456");
		
		System.out.println(m+"\t"+m.getId()+
				"\t"+m.getName()+
				"\t"+m.getUsername()+
				"\t"+m.getPassword()+
				"\t"+m.getAddress()+
				"\t"+m.getPhone());

	}
	
	private static Connection conn=DbConnection.getDb();
	
	@Override
	public void insert(String name, String username, String password, String address, String phone) {
		String sql="insert into member(name,username,password,address,phone) "
				+ "values(?,?,?,?,?)";
	try {
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, username);
		ps.setString(3, password);
		ps.setString(4, address);
		ps.setString(5, phone);

		ps.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	@Override
	public void insert(Member member) {
		String sql="insert into member(name,username,password,address,phone) "
				+ "values(?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setString(2, member.getUsername());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getAddress());
			ps.setString(5, member.getPhone());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String selectAll() {
		String sql="select * from member";
		String show="";
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				show=show+"id:"+rs.getInt("id")
				+"\t名:"+rs.getString("name")+
				"\t帳號:"+rs.getString("username")+
				"\t密碼:"+rs.getString("password")+
				"\t地址:"+rs.getString("address")+
				"\t電話:"+rs.getString("phone")+"\n";
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return show;
	}
	
	@Override
	public void update(String name, String password, int id) {
		String sql="update member set name=?,password=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setInt(3, id);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void delete(int id) {
		String sql="delete from member where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean selectUsername(String username) {
		String sql="select * from member where username=?";
		boolean result=false;
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) result=true;
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		
		return result;
	}

	@Override
	public Member selectByUsernameAndPassword(String username, String password) {
		String sql="select * from member where username=? and password=?";
		Member member=null;
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				member=new Member();//id,name,....空
				member.setId(rs.getInt("id"));
				member.setName(rs.getString("name"));
				member.setUsername(rs.getString("username"));
				member.setPassword(rs.getString("password"));
				member.setAddress(rs.getString("address"));
				member.setPhone(rs.getString("phone"));
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		
		
		
		return member;
	}


}
