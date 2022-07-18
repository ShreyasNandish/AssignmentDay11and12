package com.bridgelabz.AssignmentDay11and12;

import java.util.Scanner;

public class Stock {
        String name;
        int noOfShares;
        double sharePrice;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getNoOfShares() {
                return noOfShares;
        }

        public void setNoOfShares(int noOfShares) {
                this.noOfShares = noOfShares;
        }

        public double getSharePrice() {
                return sharePrice;
        }

        public void setSharePrice(double sharePrice) {
                this.sharePrice = sharePrice;
        }

        public void printStockReport() {
                double stockValue = this.noOfShares * this.sharePrice;
                System.out.println(name + " stock value is Rs:" + stockValue);
        }

        public double getStockValue() {
                double stockValue = noOfShares * sharePrice;
                return stockValue;
        }

        Scanner sc = new Scanner(System.in);

        public void setShares() {
                System.out.print(" Enter First Name : ");
                setName(sc.nextLine());
                System.out.print(" Enter no of shares : ");
                setNoOfShares(sc.nextInt());
                System.out.print(" Enter Share price : ");
                setSharePrice(sc.nextDouble());
        }

        public void viewShares() {
                System.out.print("Name:-" + name);
                System.out.print(" No of shares:" + noOfShares);
                System.out.print(" Shares: " + sharePrice);
        }
}


