package maxprofit;

import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) {
        MaxProfit mp = new MaxProfit();
        //get input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of days:");
        int n = input.nextInt();
        int[] num = new int[n];
        System.out.println("Please enter prices: ");
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }
        System.out.println("Maximum profit is: " + mp.maxProfit(num, n));
    }

    // calculate max profit
    int maxProfit(int arr[], int arr_size) {
        int max_profit = arr[1] - arr[0];
        int i, j;
        for (i = 0; i < arr_size; i++) {
            for (j = i + 1; j < arr_size; j++) {
                if (arr[j] - arr[i] > max_profit)
                    max_profit = arr[j] - arr[i];
            }
        }
        if (max_profit < 0) {
            return 0;
        }
        return max_profit;
    }
}