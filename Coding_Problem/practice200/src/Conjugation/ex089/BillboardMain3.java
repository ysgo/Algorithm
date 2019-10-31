package Conjugation.ex089;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

//빌보드 차트 웹사이트에서 정보 읽어오기
public class BillboardMain3 {

	public static void main(String[] args) {
		String newUrls = "file:///D:/Programming/eclipse-workspace/Practice200/Billboard/2018-09-22.html";
		URL url = null;
		try {
			url = new URL(newUrls);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(url.openStream(), "euc-kr"), 8);
			String line = null;
			while((line = reader.readLine()) != null) {
				if(!line.trim().equals("")) {
					System.out.println(line.trim());
				}
			}
		} catch(Exception e) {
			System.out.println("Billboard Parsing error !!!");
		}
	}

}
