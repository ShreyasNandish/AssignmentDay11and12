package com.bridgelabz.AssignmentDay11and12;

public class StockPortfolio {
    Stock[] stocks=new Stock[100];
    int index=0;

    public void add(Stock stock)
    {
        stocks[index]=stock;
        index++;
    }

    public double getTotalStockValue()
    {
        double totalStockValue=0;
        for (int i = 0; i < index; i++) {
            double stockValue=stocks[i].getStockValue();
            totalStockValue = totalStockValue +stockValue;
        }
        return totalStockValue;
    }
}
