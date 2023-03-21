package step2_01.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//2023.03.21 12:15 ~ 12:29

public class ArrayEx24_테스트문제1_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		// 예) 30 ==> e = {10,20,40,50,0};
		
		
		System.out.print("값 입력 >> ");
		int val = scan.nextInt();
		
		for (int i = 0, j = 0 ; i < d.length; i++) {
			if ( d[i] == val ) continue;
			e[j] = d[i];
			j++;
		}
		System.out.println(Arrays.toString(e));
		

		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		
		System.out.print("값 입력 >> ");
		val = scan.nextInt();
		
		for (int i = 0, j = 0 ; i < f.length; i++) {
			if( f[i] == val ) {
				i++;
				continue;
			}
			g[j] = f[i];
			j++;
		}
		System.out.println(Arrays.toString(g));
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		
		System.out.print("값 입력 >> ");
		val = scan.nextInt();
		
		for (int i = 0; i < h.length - 1; i++) {
			h[i] = h[i+1];
		}
		h[4] = val;
		
		System.out.println(Arrays.toString(h));
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] z = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		
		System.out.print("값 입력 >> ");
		val = scan.nextInt();
		
		for (int i = z.length - 1; i > 0 ; i--) {
			z[i] = z[i-1];
		}
		z[0] = val;
		
		System.out.println(Arrays.toString(z));
		
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] p = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};
		
		for (int i = 0, j = 4 ; i < k.length; i++, j--) {
			k[i] = p[j];
		}
		System.out.println(Arrays.toString(k));

		
		
		
	}

}
