package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int[] prices = {10,1,1,6};
        int[] result = new int[prices.length];
        result[prices.length - 1] = prices[prices.length - 1];
        for (int i = 0; i <prices.length-1 ; i++) {
            result[i] = prices[i];
            for (int j = i+1; j <prices.length ; j++) {
                if (prices[j] <= prices[i]) {
                    result[i] = result[i]-prices[j];
                    break;
                }
            }
        }
        for (int i = 0; i < prices.length; i++) {
            System.out.println(result[i]);
        }
    }
}
