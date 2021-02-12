package Intermediate.ex72;

import java.util.Iterator;
import java.util.Map;

//System으로 환경변수 확인하기
public class SystemPropertyTest {

	public static void main(String[] args) {
		long namotime = System.nanoTime();
		for(int i = 0; i<100000; i++) {
			System.out.print("");
		}
		long namotime2 = System.nanoTime();
		System.out.println(namotime2 - namotime);
		System.out.println(System.getenv("JAVA_HOME"));
		
		Map<String, String> map = System.getenv();
		Iterator<String> iter = map.keySet().iterator();
		int j = 0;
		while(iter.hasNext()) {
			String keys = iter.next();
			System.out.println((++j + "\t") + keys + " : " + map.get(keys));
		}
	}

}
