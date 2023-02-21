package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_문제 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		
		System.out.print("index1 >> ");
		int a = scan.nextInt();
		System.out.print("index2 >> ");
		int b = scan.nextInt();
		
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
		
		System.out.println(Arrays.toString(arr));

		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}
		
		System.out.print("값1 >> ");
		a = scan.nextInt();
		System.out.print("값2 >> ");
		b = scan.nextInt();
		
		int aid = 0, bid = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if ( a == arr[i] ) aid = i;
			if ( b == arr[i] ) bid = i;
		}
		
		tmp = arr[aid];
		arr[aid] = arr[bid];
		arr[bid] = tmp;
		
		System.out.println(Arrays.toString(arr));
		
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		System.out.print("학번1 >> ");
		a = scan.nextInt();
		System.out.print("학번2 >> ");
		b = scan.nextInt();
		
		for (int i = 0; i < hakbuns.length; i++) {
			if ( a == hakbuns[i] ) aid = i;
			if ( b == hakbuns[i] ) bid = i;
		}
		
		tmp = scores[aid];
		scores[aid] = scores[bid];
		scores[bid] = tmp;
		
		System.out.println(Arrays.toString(scores));
		
		
	}
	
}
