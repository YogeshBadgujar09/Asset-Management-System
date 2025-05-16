package com.yogesh.assetmanagement;

public class AssetModelClass {
	
	private int assetId;
	private String assetName;
	private String assetType;
	private String assetSerialNumber;
	private String assetPurchaseDate;
	
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
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
