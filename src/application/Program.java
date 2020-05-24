package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
//sistema de vendedores que tem departamentos
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== teste  1; seller findById===");
		Seller seller = sellerDao.findbyId(3);
		
		System.out.println(seller);

		System.out.println("\n=== teste  2; seller findBydep===");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== teste  3; seller findAll===");
		
		list = sellerDao.findAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println("\n=== teste  4; seller insert===");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com", new Date(),4000.00,department);
		sellerDao.insert(newSeller);
		System.out.println("Insert "+newSeller.getId());
	
		System.out.println("\n=== teste  5; seller update");
		seller = sellerDao.findbyId(1);
		seller.setName("Matrha");
		sellerDao.update(seller);
		System.out.println("Update completed ");

		System.out.println("\n=== teste  6; seller delete");
		System.out.println("entre com id");
		int id =sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("delete completed");

	}

}
