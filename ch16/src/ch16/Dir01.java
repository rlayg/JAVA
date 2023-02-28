package ch16;

import java.io.File;

public class Dir01 {

	public static void main(String[] args) {
//		File file = new File("../ch10/src/ch10");
		File file = new File(".");
//		.의 의미 현재 폴더만 보겟다
//		.. 의 의미는 상위폴더로 가겟다
		String[] fileList = file.list();
		for(String str : fileList) {
			System.out.println(str);
		}
	}

}
