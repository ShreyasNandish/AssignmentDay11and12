package com.bridgelabz.AssignmentDay11and12;

import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        Stock stock1=new Stock();
        stock1.setShares();
        stock1.viewShares();

        StockPortfolio portfolio1=new StockPortfolio();

        portfolio1.add(stock1);
        double total=portfolio1.getTotalStockValue();
        System.out.println(total);
        stock1.printStockReport();
    }
}


