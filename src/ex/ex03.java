package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021033 黃苡珊
 */

public class ex03 {


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		boolean flag = true;
		System.out.print("[ 1");
		
		for (int i=2;i<n;i++)
			if (n%i==0) {
				flag = false;
				System.out.print("," + i);
			}
		
		System.out.println("," + n + " ]");
		System.out.println(flag);
	}
}