package ch04;

public class ArrayTest3 {
//76,45,34,89,100,50,90,92 8개의 값을 1차원 배열로 초기화 하고 값에 
// 합계와 평균	그리고 최대값과 최소값을 구하는 프로그램을 작성
//	힌트 for 사용
	
	public static void main(String[] args) {
		int array[] = {76, 45, 34, 89, 100, 50, 90, 92};
		int sum = 0, avg = 0, max = 0, min = 100;
		
//		for(int i = 0; i < array.length; i++) {
//			sum += array[i];
//		}
//		System.out.println("sum = " + sum);
//		
//		for(int i = 0; i < array.length; i++) {
//			sum += array[i];
//			avg = sum / array.length;
//		}
//		System.out.println("avg = " + avg);
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
			if(array[i] > max) max = array[i];
			if(array[i] > min) min = array[i];
		}
		avg = sum / array.length;
		System.out.println("합계 = " + sum + " 평균 = " + avg);
		System.out.println("최대값은 = " + max + " 최소값은 = " + min);

		
	}

}
