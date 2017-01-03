package hw;

import java.util.Scanner;

/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 105021033 黃苡珊
 */
public class hw02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		String str1 = "1", str2 = "";
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				str2 = "" + i;
			} else {
				for (int j = 0; j < i; j++) {
					str2 += " " + i;
				}
			}
			sum += i;
			if (sum <= n)
				str1 += " " + sum;
		}
		System.out.println("數列一:" + str1);
		System.out.println("數列二:" + str2);
	}
}