package Conjugation.ex090;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

//빌보드 차트 웹사이트에서 정보를 읽어 리스트에 저장하기
public class BillboardArrayMain {

	public static void main(String[] args) {
		ArrayList<String> htmls = new ArrayList<String>();
		String newUrls = "file:///D:/Programming/eclipse-workspace/Practice200/Billboard/2018-09-22.html";
		URL url = null;
		try {
			url = new URL(newUrls);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(url.openStream(), "euc-kr"), 8);
			String line = null;
			while((line = reader.readLine()) != null) {
				if(!line.trim().equals("")) {
					htmls.add(line.trim());
				}
			}
		} catch(Exception e) {
			System.out.println("Billboard Parsing error");
		}
		for(String str : htmls) {
			System.out.println(str);
		}
	}

}
