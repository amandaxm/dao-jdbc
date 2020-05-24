package model.dao;

import java.util.List;

import model.entities.Department;

//model compreende classes que fazem transformacao
public interface DepartmentDao {

	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer obj);
	Department findbyId(Integer id);//retorna id
	//retorna todos 
	List<Department> findAll();
	
	
	
	
}
