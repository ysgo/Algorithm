package day13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;

public class CopyExam {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now(); // �ڹ�8�������� �߰���. �����ڰ� ������ ����(private��)
		int year = ld.getYear();		// new LocalDate()�� �ȵ�
		int month = ld.getMonthValue(); // �� ���⶧ 1���� ����
		int day = ld.getDayOfMonth(); // of�޼ҵ��� ���� ����
		String path = "C:/iotest/sample_" + year + "_" + month + "_" + day + ".txt";
		
		try(FileReader reader = new FileReader("C:\\iotest\\sample.txt"); // �Ѵܾ ������ ����
				BufferedReader br = new BufferedReader(reader); // ����� ������ ���
				FileWriter fw = new FileWriter(path, true)) {
			String data;
			while(true) {
				data = br.readLine();
				if(data == null)
					break;
				fw.write(data + "\r\n"); // printf������ %n�� ����
			}
			System.out.println("���� �Ϸ�Ǿ����ϴ�.");
		} catch(Exception e) { // FileNotFoundException�� IOException�� �ڽ��̱⿡ ���ڷ� ��� ����
			System.out.println("ó���ϴ� ���� ������ �߻��߽��ϴ�.");
		}
	}
}
