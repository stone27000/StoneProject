package dao;

import java.util.List;

import model.Goorder;

public interface GoorderJoin {
		//create
		boolean add(Goorder goorder);
		
		//read
		List<Goorder> selectAll();//select * from Gorder
		List<Goorder> sectById(int id);//select * from gorder where id=?
		
		//update
		boolean update(Goorder goorder);
		
		//delete
		boolean delete(int id);


}
