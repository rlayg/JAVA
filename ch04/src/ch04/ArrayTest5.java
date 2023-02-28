package ch04;

public class ArrayTest5 {
//	배열은 이것만 잘 하면 된다
	
//	이름	    국어	영어	수학	총점	평균	
//	--------------------------------------------
//	김준수	80	70	90	240	80
//	이하이	70	90	90	250	83
//	안예은	80	70	80	230	76
//	국카스텐	90	90	70	250	83
//	--------------------------------------------
//	총계	    320	320	330	970	80
	
	public static void main(String[] args) {

		String[] m = {"이름", "국어", "영어", "수학", "총점", "평균"};
		String[] name = {"김준수", "이하이", "안예은", "국카스텐"};
		int[][] score = {{80,70,90},
						 {70,90,90},
						 {80,70,80},
						 {90,90,70}
						 };
		int[] tot = new int[3];
		int sum = 0, avg = 0, totAvg = 0, totSum = 0;
		System.out.println("성적표 \n");
		
		for(int i = 0; i < m.length; i++) {
			System.out.print(m[i] + "\t");
		}
		System.out.println("\n--------------------------------------------");

		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
//			score[0].length -> {80,70,80}
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j]; //총점에 대한 누적
				tot[j] += score[i][j]; //총계에 대한 누적
			}
			avg = sum / score[i].length;
			System.out.println(sum + "\t" + avg);
			sum = 0;
		}
		
		
		System.out.println("\n------------------총계----------------------");
		System.out.print("총계" + "\t");
		for(int j = 0; j < 3; j++) {
			System.out.print(tot[j] + "\t");
			totSum += tot[j];
		}
//		toAvg = totSum / 12;
		totAvg = totSum / (score.length*score[0].length);
		System.out.println(totSum + "\t" + totAvg);
		
		
		
//		for(int i = 0; i < name.length; i++) {for(int[] arr1 : score	) {  
//			for(int arr2 : arr1) { 
//				System.out.print(arr2 + "\t");
//
//			}
//			
//			System.out.println(name[i] + "\t");
//		}
//		}
		
		
		
		
	}

}
