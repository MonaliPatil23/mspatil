package com.bridgelab.task;

import Utility.Utility;

public class stock
{

	private String stockName;
	private int stockPrice;
	private int stockNumber;
	Utility utility;
	public stock(String stockName, int stockPrice, int stockNumber) {
		super();
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		this.stockNumber = stockNumber;
	}
	public stock(String line) {
		// TODO Auto-generated constructor stub
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
	public int getStockNumber() {
		return stockNumber;
	}
	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}
	@Override
	public String toString() {
		return "stock [stockName=" + stockName + ", stockPrice=" + stockPrice + ", stockNumber=" + stockNumber + "]";
	}
	
}
