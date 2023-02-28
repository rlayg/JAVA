package ch04;

public class VarArr01 {

	public static void main(String[] args) {
//		가변배열
		int[][] a = new int[3][];
		a[0] = new int[3]; //0,0 0,1 0,2
		a[1] = new int[2]; //1,0 1,1
		a[2] = new int[4]; //2,0 2,1 2,2 2,3
//		열은 각각 따로 줄 수 있다
		
		a[0][0] =  7; a[0][1] = 23; a[0][2] = 13;
		a[1][0] = 23; a[1][1] = 3; 
		a[2][0] =  2; a[2][1] = 21; a[2][2] = 56; a[2][3] = 71;
		//행                  3
		for(int i = 0; i < a.length; i++) {
			//열                   3 / 2 / 4
			for (int j = 0; j < a[i].length ; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
