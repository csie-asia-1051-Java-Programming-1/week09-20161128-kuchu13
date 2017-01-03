package hw;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數，利用函式呼叫找出一連續整數數列讓該數列的和為此一正整數，有些正整數並不能找出連續整數，若找不到時，請印出「No」。
 例如: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author: 105021033 黃苡珊
 */
public class hw01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.print(n);
		for (int v1=1;v1<n;v1++) {
			int x=v1;
			int sum=0;
			while (true) {
				sum+=x;
				if (sum>=n)
					break;
				x++;
			}
			if (sum==n) {
				System.out.print("=");
				for (int v2=v1;v2<x+1;v2++) {
					if (v2==v1)
						System.out.print(v2);
					else
						System.out.print("+"+v2);
				}
			}
		}
	}
}