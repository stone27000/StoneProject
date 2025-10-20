package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.GoorderJoin;
import model.Goorder;
import util.DbConnection;

public class GoorderJoinImpl implements GoorderJoin{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private Connection conn=DbConnection.getDb();
	
	@Override
	public boolean add(Goorder goorder) {
		String sql="insert into gorder(name,noodle,chicken,golden,salad,beef,duck,fish,sum) values(?,?,?,?,?,?,?,?,?)";
		boolean insertResult=false;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, goorder.getName());
			ps.setInt(2, goorder.getNoodle());
			ps.setInt(3,goorder.getChicken());
			ps.setInt(4, goorder.getGolden());
			ps.setInt(5,goorder.getSalad());
			ps.setInt(6, goorder.getBeef());
			ps.setInt(7,goorder.getDuck());
			ps.setInt(8, goorder.getFish());
			ps.setInt(9,goorder.getSum());
			ps.executeUpdate();
			insertResult=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return insertResult;
	}

	@Override
	public List<Goorder> selectAll() {
		String sql="select * from gorder";
		List<Goorder> list=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Goorder goorder=new Goorder();
				goorder.setId(rs.getInt("id"));
				goorder.setName(rs.getString("name"));
				goorder.setNoodle(rs.getInt("noodle"));
				goorder.setChicken(rs.getInt("chicken"));
				goorder.setGolden(rs.getInt("golden"));
				goorder.setSalad(rs.getInt("salad"));
				goorder.setBeef(rs.getInt("beef"));
				goorder.setDuck(rs.getInt("duck"));
				goorder.setFish(rs.getInt("fish"));
				
				
				list.add(goorder);
			
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return list;
	}

	@Override
	public List<Goorder> sectById(int id) {
		String sql="select * from gorder where id=?";
		List<Goorder> list=new ArrayList();
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				Goorder goorder=new Goorder();
				goorder.setId(rs.getInt("id"));
				goorder.setName(rs.getString("name"));
				goorder.setNoodle(rs.getInt("noodle"));
				goorder.setChicken(rs.getInt("chicken"));
				goorder.setGolden(rs.getInt("golden"));
				goorder.setSalad(rs.getInt("salad"));
				goorder.setBeef(rs.getInt("beef"));
				goorder.setDuck(rs.getInt("duck"));
				goorder.setFish(rs.getInt("fish"));
				
				list.add(goorder);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public boolean update(Goorder goorder) {
		String sql="update gorder set name=?,noodle=?,chicken=?,golden=?,salad=?,beef=?,duck=?,fish=? where id=?";
		boolean updateResult=false;
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, goorder.getNoodle());
			ps.setInt(2, goorder.getNoodle());
			ps.setInt(3,goorder.getChicken());
			ps.setInt(4, goorder.getGolden());
			ps.setInt(5,goorder.getSalad());
			ps.setInt(6, goorder.getBeef());
			ps.setInt(7,goorder.getDuck());
			ps.setInt(8, goorder.getFish());
			ps.setInt(9,goorder.getSum());
			ps.executeUpdate();
			
			updateResult=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return updateResult;
	}

	@Override
	public boolean delete(int id) {
		String sql="delete from gorder where id=?";
		boolean deleteResult=false;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			deleteResult=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return deleteResult;
	}



}
