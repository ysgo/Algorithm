package Conjugation.ex091;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

//�̹� �� ������ ��Ʈ ���� ��¥ ã��
public class BillboardTimeMain {

	public static void main(String[] args) {
		String newUrls = "file:///D:/Programming/eclipse-workspace/Practice200/Billboard/2018-09-22.html";
		String s = "";
		URL url = null;
		try {
			url = new URL(newUrls);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(url.openStream(), "euc-kr"), 8);
			String line = "";	
			while((line=reader.readLine()) != null) {
				if(!line.trim().equals("")) {
					if(line.trim().contains("<time datetime=")) {
						s = line.trim();
							s = s.substring(0, s.indexOf(">")-1);
							s = s.substring(s.indexOf("\"")+1).trim();
							break;
					}
				}
			}
		} catch(Exception e) {
			System.out.println("Billboard Parsing error !!! ");
		}
		System.out.println("�̹� ������ ��Ʈ ��¥ : " + s);
	}

}
