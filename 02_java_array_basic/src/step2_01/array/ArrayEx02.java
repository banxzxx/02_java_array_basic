package step2_01.array;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		// 배열 사용 예시 1
		String[] test1 = null;
		test1 = new String[3];
		
		double[] test2 = new double[5];
		char[] test3 = new char[3];
		boolean[] test4 = new boolean[3];
		
		//배열 사용 예시 2 : 축약형 ( 배열을 처음 생성할 때만 가능 )
		int[] arr1 = {10,20,30,40,50};
		double[] arr2 = {150.1, 324.5, 234.6};
		String[] arr3 = {"하나", "둘", "셋"};
		char[] arr4 = {'O', 'X', 'X', 'O'};
		
		// arr1 = {1,2,3,4,5}; 이런식으로 할 수 없다
		
		//배열 사용 예시 3 : 다른 문법과의 조합
		int[] arr5 = new int[10]; // 값을 대입 하지 않으면 '0'으로 초깃값이 저장된다
		for ( int i = 0 ; i < arr1.length ; i++ ) {
			//arr5[i] = i + 1;
			System.out.print(" " + arr1[i]);
		}
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(" "+ arr2[i]);
		}
		System.out.println();
		
		// !!! 배열이 익숙해진 뒤에 사용해보기 !!!
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr1));
		
		for ( int i = 0 ; i < arr3.length ; i++ ) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();

	}

}
