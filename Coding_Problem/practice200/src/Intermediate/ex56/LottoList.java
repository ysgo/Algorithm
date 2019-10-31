package Intermediate.ex56;

import java.util.ArrayList;
import java.util.List;

//배열보다 편리한 List 사용하기
public class LottoList {

	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			ilist.add(i);
		}
		
		for(int i=0; i<ilist.size(); i++) {
			int m = ilist.get(i);
			System.out.printf("%d\t", m);
		}
		System.out.println();
	}

}
