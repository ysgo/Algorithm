import java.util.Scanner;
// while�� ����
public class OneOneOneZero {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int n1, n2, sum=0;
		int chkNum=num;
		int newNum=0;
		int cycle=0;
		boolean check = true;
		end : while(check) {
			if(num >= 10) {
				n1 = num / 10; // ù��°�ڸ�
				n2 = num % 10; // �ι�°�ڸ�
				sum = n1 + n2; // ��
				newNum = n2 * 10 + sum % 10; // ���ο� ����
				cycle++;
				if(newNum == chkNum) {
					check = false;
					break end;
				} else {
					num = newNum;
				}
			} else { // 10�̸��϶�
				sum = num; // �Է°��� ���� ��
				newNum = num * 10 + sum % 10; // ���ο� ���ڴ� �Է°��� ���� ���ΰ�
				cycle++;
				if(newNum == chkNum) {
					check = false;
					break end;
				} else {
					num = newNum;
				}
			}
		}
		scn.close();
		System.out.println("����Ŭ �� : " + cycle);
	}
}
