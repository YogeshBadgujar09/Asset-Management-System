package com.yogesh.assetmanagement;

import java.io.Serial;
import java.rmi.server.UID;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.Flow.Publisher;

public class AddAsset {

	AddAsset(){
		
		System.out.println("***** Add New Asset *****");
		
		Scanner scanner = new Scanner(System.in);
        AssetModelClass assetModelClass = new AssetModelClass();
        
        System.out.println("Enter Asset Id :");
        assetModelClass.setAssetId(scanner.nextInt());
        
        System.out.println("Enter Asset Name :");
        assetModelClass.setAssetName(scanner.next(),scanner);
        
        System.out.println("Enter Asset Type :");
        assetModelClass.setAssetType(scanner.next());
        
        System.out.println("Enter Asset Serial No :");
        assetModelClass.setAssetSerialNumber(scanner.next());
        
        System.out.println("Enter Asset Purchase Date:");
        assetModelClass.setAssetPurchaseDate(scanner.next());
        
        System.out.println("Confirm Info :" + assetModelClass.toString());		
	}
	
//	public String serialNumber() {
//		return UUID.randomUUID().toString().substring(0, 8).toString().toUpperCase();
//	}
	
//	public String selectTypeOfAsset() {
//		
//		int choice;
//		
//		do {
//			
//			System.out.println("1.Laptop 2.Computer 3.Printer 4.Scanner 5.Router 6.Other");
//			choice = new Scanner(System.in).nextInt();
//			
//			switch (choice) {
//					
//					case 1 :
//						return "Laptop";
//					
//					case 2 :
//						return "Computer";
//						
//					case 3 :
//						return "Printer";
//						
//					case 4 :
//						return "Scanner";
//						
//					case 5 :
//						return "Router";
//						
//					case 6 :
//						return "Other";
//					
//					default:
//						System.out.println("Enter Valid Type Please ... !!!");
//						
//				}
//			
//		}while(choice >= 6 && choice > 0);
//		
//		return null;
//	}
//	
	public static void main(String[] args) {
		new AddAsset();
	}
	
}
