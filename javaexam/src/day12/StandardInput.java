package day12;

import java.io.InputStreamReader;

public class StandardInput {
	public static void main(String[] args) throws Exception {
		System.out.print("�Է� : ");
		// char input = (char)System.in.read(); // InputStream��ü ����
		char input = (char)new InputStreamReader(System.in).read();
		System.out.println("�Էµ� ���� : " + input);
	}
}
