package step2_01.array;

public class ArrayEx01 {
	
	/*
	 * 
	 * # 배열 ( array )    
	 * 
	 *  [ 형식 ]
	 *  
	 *  1) 자료형[] 배열명 = new 자료형[방의개수];
	 *  2) 자료형 배열명[] = new 자료형[방의개수];
	 * 
	 * 	- '같은 자료형'의 데이터를 '여러개' 저장하기 위한 자료구조
	 * 
	 *  - 인덱스(index) : 0부터 시작하는 방 번호가 부여된다.
	 *  
	 *  - 엘리먼트(element) : 배열의 요소를 지칭한다.
	 *  
	 *  - 배열은 생성시에 초깃값이 부여되어 있다.
	 *    String 배열의 초기값   : null
	 *    int 배열의 초기값     : 0
	 *    double 배열의 초기값  : 0.0
	 *    char 배열의 초기값    : '0'
	 *    boolean 배열의 초기값 : false
	 *    
	 *  - 배열은 주소변수이다.
	 *  
	 *  - 배열을 크기가 변하지 않는다. 배열의 요소를 삭제하여도 배열의 크기는 고정되어있다.
	 *  
	 *  - 배열의 요소를 지우는 것은 배열의 초깃값으로 다시 저장하는 것을 의미한다.
	 * 
	 *  - null을 대입함으로써 배열의 전체를 삭제할 수 있다.
	 * 
	 * */

	public static void main(String[] args) {
		// 1. 변수 ( 단순 데이터 저장  )
		int price = 0;
		price = 30000;
		System.out.println(price);
		System.out.println();
		
		//2. 배열 ( 주소 저장 )
		int[] arr = null; //주소변수의 초기값은 null로 초기화한다
		arr = new int[5];
		
		System.out.println(arr); // 배열의 변수명은 주소 ! (주소가 출력된다 )
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for ( int i = 0 ; i < arr.length ; i++ ) { // 배열명.length = 배열의 크기 ! 
			System.out.println(arr[i]);
		}
		System.out.println();
		
		//배열의 요소 (element)를 삭제할 수 없고 다른값으로 대치하는 방법으로만 가능함
		//그냥 0으로 대입해서 지웠다고 치자~하는 것 밖에 없음
		
		
		//null 대입을 통해 배열 자체를 삭제할 수 있다.
		arr = null;
	}

}
