package com.day11_12Assignment;

import java.util.Scanner;

public class StockPortfolio extends StockAccount {
	
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of Stocks");
		setNoOfStocks(sc.nextInt());
		for (int i = 1; i <= getNoOfStocks(); i++) {
			StockAccount st = new StockAccount();
			st.addShare();
			TotalValue += StockPrice;
		}
		System.out.println("\nTotal Value is " + TotalValue);*/
	
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of Stocks");
		setNoOfStocks(sc.nextInt());
		for (int i = 1; i <= getNoOfStocks(); i++) {
			StockAccount st = new StockAccount();
			st.addShare();
			TotalValue += StockPrice;
		}
		System.out.println("\nTotal Value is " + TotalValue);
	}
	}


