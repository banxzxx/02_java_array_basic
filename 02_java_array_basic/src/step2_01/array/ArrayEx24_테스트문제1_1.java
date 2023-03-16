package step2_01.array;

//2023.03.16 17:17 ~ 17:25

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = { 10, 4, 5, 3, 1 };
		
		// 문제 1) 전체 요소의 합출력
		
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("sum = " + sum );
		
		// 문제 2) 데이터를 입력하면 배열의 인덱스 출력
		// 예) 5 => 2  ,  1 => 4
		int data = scan.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			if ( a[i] == data ) {
				System.out.println(data + "=>" + i);
			}
		}
		
		// 문제 3) 배열의 인덱스를 입력하면 데이터 출력
		// 예) 2 => 5  , 4 => 1
		int index = scan.nextInt();
		System.out.println(index + " => " + a[index]);

		// 문제 4) 배열중 가장 큰 데이터 출력 
		// 예) 10
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if ( max < a[i] ) max = a[i];
		}
		System.out.println("max = " + max);

		// 문제 5) 배열중 홀수의 개수 출력 
		// 예) 홀수의 개수 : 3
		int cntOdd =0;
		for (int i = 0; i < a.length; i++) {
			if ( a[i] % 2 == 1 ) cntOdd++;
		}
		System.out.println("홀수의 개수 : " + cntOdd);
			
		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0, 0, 5, 3, 1}
		int[] b = {0, 0, 0, 0, 0};
		
		for (int i = 0; i < a.length; i++) {
			if ( a[i] % 2 == 1 ) {
				b[i] = a[i];
			}
		}
		System.out.println("a = " + Arrays.toString(a));
		System.out.println("b = " + Arrays.toString(b));
		
		// 문제 7)  a의 값중 홀수만 c에 저장(저장위치는 앞에서부터 저장)
		// 예) c => {5, 3, 1, 0, 0}
		int[] c = { 0,0,0,0,0 };
		int cId = 0;
		for (int i = 0; i < a.length; i++) {
			if ( a[i] % 2 == 1 ) {
				c[cId++] = a[i];
				
			}
		}
		System.out.println("c = " + Arrays.toString(c));

		
	}

}
