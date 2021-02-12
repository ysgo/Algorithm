package Intermediate.ex71;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

//System으로 연산 소요 시간 구하기
public class SystemTest {

	public static void main(String[] args) {
		long ltime = System.currentTimeMillis();
		System.out.println(ltime);
		for(int i=0; i<100000; i++) {
			System.out.print("");
		}
		long ltime2 = System.currentTimeMillis();
		System.out.println((ltime2-ltime));
		System.out.println(ltime2/1000/60/60/24/365 + "년");
		Properties pro = System.getProperties();
		System.out.println(pro.getProperty("java.vm.version"));
		System.out.println(pro.getProperty("file.separator"));
		
		System.out.println(new Date(System.currentTimeMillis()));
		Enumeration<Object> en = pro.keys();
		int i = 0;
		while(en.hasMoreElements()) {
			String keys = (String) en.nextElement();
			System.out.println((++i+ " ") + keys + " : " + pro.getProperty(keys));
		}
	}

}
