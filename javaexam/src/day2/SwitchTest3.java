package day2;

public class SwitchTest3 {
	public static void main(String[] args) {
		
		/*
		if (month == 12 || month == 1 || month == 2)
			System.out.println(month + " : �ܿ�");
		else if (month == 3 || month == 4 || month == 5)
			System.out.println(month + " : ��");
		else if (month == 6 || month == 7 || month == 8)
			System.out.println(month + " : ����");
		else
			System.out.println(month + " : ����");
	}
		 */
/*		
		int month = ((int)(Math.random()*12) + 1);		
		switch (month) {
		case 12 : 
		case 1 : 
		case 2 : System.out.println(month + "�� : �ܿ�");
			break;
		case 3 : 
		case 4 : 
		case 5 : System.out.println(month + "�� : ��");
			break;
		case 6 : 
		case 7 : 
		case 8 : System.out.println(month + "�� : ����");
			break;
		case 9 : 
		case 10 : 
		case 11 : System.out.println(month + "�� : ����");
		}
 	}
} */

	int month = ((int)(Math.random()*12) + 1);		
	System.out.println(month);
	String season;
	switch (month) {
	case 12 : 
	case 1 : 
	case 2 : 
		season = "�ܿ�";
		break;
	case 3 : 
	case 4 : 
	case 5 : 
		season = "��";
		break;
	case 6 : 
	case 7 : 
	case 8 : 
		season = "����";
		break;
	default:
		season = "�ܿ�";
	
		}
	
	System.out.println(month + "���� " + season);
	
	}
}
