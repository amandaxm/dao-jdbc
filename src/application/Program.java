package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
//sistema de vendedores que tem departamentos
	
	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== teste  1; seller findById===");
		Seller seller = sellerDao.findbyId(3);
		
		System.out.println(seller);

		}

}
