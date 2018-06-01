package java_example_13_180601;

import java.io.*; //이거쓰면 io기능 다쓰는거~~~~~~~
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _01_Fileclass {

	public static void main(String[] args) {
		//파일(텍스트파일)을 생성하고 내용을 쓰기~~
		String path = "D:\\test\\testfile.txt";//파일에 대한 저장경로 설정하는거~~~~
		//파일 객체 생성
		File file = new File(path); //import할때 컨트롤 쉬프트 o 누르면 자동생성
		
		try {
			FileWriter fw = new FileWriter(file);
			for(int i='B';i<='M';i++) {
				fw.write(i);
			}
			fw.close();
			System.out.println("쓰기 완료..");
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
