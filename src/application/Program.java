package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
//sistema de vendedores que tem departamentos
	
	public static void main(String[] args) {
		Department obj= new Department(1,"Books");
		Seller seller = new Seller(23,"BO","bo@h",new Date(),3000.0,obj);
		System.out.println(seller);
	
	}

}
