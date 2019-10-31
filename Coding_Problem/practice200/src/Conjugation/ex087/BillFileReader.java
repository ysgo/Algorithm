package Conjugation.ex087;

import java.io.BufferedReader;
import java.io.FileReader;

//������ ������ ��Ʈ ���� ������ �о�帮��
public class BillFileReader {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(
				new FileReader("billboard\\bill.txt"))) {
			String msg = "";
			while((msg=br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
