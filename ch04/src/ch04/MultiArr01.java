package ch04;

public class MultiArr01 {

	public static void main(String[] args) {
//		2행3열의 2차원 배열
		int[][] a = new int[2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 11;
		a[1][1] = 12;
		a[1][2] = 13;
		
//			0열	1열	2열
//		0행	1	2	3
//		1행	11	12	13
		
		System.out.println("행 a.length ->" + a.length + "\n"); // 행의 length
		for(int i = 0; i < a.length; i++) { //행 --> 2
			for(int j = 0; j < a[i].length; j++) { //열-->3
				System.out.printf("a[%d] length->%d \t", i, a[i].length);
//				System.out.println("일반 For a[" + i + "][" + j + "]=" + a[i][j]);
				System.out.print("일반 For " + a[i][j] + "\t");
			}
			System.out.println();
		}
		
//		위와의 차이점: System.out.printf("a[%d] length->%d \t", i, a[i].length); 를 밑에두면 j 쓰지도 않고 
//		length->3 일일이 출력 그래서 위에 옮겨서 의미있는  출력 되게 만듦
//		for(int i = 0; i < a.length; i++) { //행 --> 2
//			System.out.printf("a[%d] length->%d \t", i, a[i].length);
//			for(int j = 0; j < a[i].length; j++) { //열-->3
//				System.out.print("일반 For a[" + i + "][" + j + "]=" + a[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
//		숙제 Foreach문으로 해보기
		
		
		System.out.println("=============향상된 For문==========");
		for(int[] arr1 : a	) { // 행 --> a[0], a[1] /여기서 2차원일때 1차원이 넘어간다 /1차원으로 받아야 해서 int[] arr1 넣어 /2차원배열을 1차원으로 받아
			for(int arr2 : arr1) { // 열 --> 0번행 a[0]-->[0][0], [0][1], [0][2] / 여기서 1차원을 int로 받아서 값 받아줘야해
				System.out.print("확장 For->" + arr2 + "\t");
			}
			System.out.println();
		}
		
	}

}
