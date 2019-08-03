package Conjugation.ex088;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

//빌보드 차트 파일을 저장한 디렉토리 찾기
public class BillFiles {

	public static void main(String[] args) {
		File f = new File("billboard");
		File[] fd = f.listFiles();
		for(File ff : fd) {
			String fname = ff.getName();
			String post = fname.substring(fname.lastIndexOf(".") + 1);
			System.out.println(fname + " " + post);
			System.out.println(ff.getAbsolutePath());
			System.out.println(new Date(ff.lastModified()));
			try(BufferedReader br = new BufferedReader(
					new FileReader(ff.getAbsolutePath()))) {
				String msg = "";
				while((msg=br.readLine()) != null) {
					System.out.println(msg);
				}
			} catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("-------------------------------");
		}
	}

}
