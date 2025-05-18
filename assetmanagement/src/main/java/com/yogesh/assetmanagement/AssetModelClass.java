package com.yogesh.assetmanagement;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssetModelClass {
	
	private int assetId;
	private String assetName;
	private String assetType;
	private String assetSerialNumber;
	private String assetPurchaseDate;
	
	Pattern pattern ;
	Matcher matcher;
	
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName, Scanner scanner) {
		
		pattern = Pattern.compile("^[A-Za-z ]+{1,}$");
		matcher = pattern.matcher(assetName);
		
		if(matcher.matches()) {
			this.assetName = assetName;
		}
		else {
			System.out.println("Enter Valid Asset Name :");
		}
		
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public String getAssetSerialNumber() {
		return assetSerialNumber;
	}
	public void setAssetSerialNumber(String assetSerialNumber) {
		this.assetSerialNumber = assetSerialNumber;
	}
	public String getAssetPurchaseDate() {
		return assetPurchaseDate;
	}
	public void setAssetPurchaseDate(String assetPurchaseDate) {
		this.assetPurchaseDate = assetPurchaseDate;
	}
	
	@Override
	public String toString() {
		return "AssetModelClass [assetId=" + assetId + ", assetName=" + assetName + ", assetType=" + assetType
				+ ", assetSerialNumber=" + assetSerialNumber + ", assetPurchaseDate=" + assetPurchaseDate + "]";
	}
	
}
