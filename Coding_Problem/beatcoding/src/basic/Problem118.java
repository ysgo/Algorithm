package basic;

import java.util.Scanner;

public class Problem118 {	// 입력된 문자를 3개씩 쪼개서 합한 값 출력은 완료. 쪼갠 문자들을 출력하는데서 오류났었음
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = str.replaceAll(" ", "");
		System.out.println(str1);
		int count=0;
		int sum=0;
		String[] arr = str.split(" ", 3);
		for(String data : arr)
			System.out.print(data + " ");
		System.out.println();
		while(count < str1.length() - 3) {
		sum += Integer.parseInt(str1.substring(count, count+3));
		count += 3;
		}
		sum += Integer.parseInt(str1.substring(count, str1.length()));
		for(int i=0; i<arr.length; i++) {
			if(i == arr.length)
				System.out.println(arr[i] + " = " + sum);
			System.out.print(arr[i] + " + ");
		}
		sc.close();
	}
}
