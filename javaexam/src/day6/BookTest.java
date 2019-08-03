package day6;

class Book {
	String title;
	String author;
	int price;
	
	Book() {
		this("�ڹ��� ����", "���ü�", 30000);
		/*
		title = "�ڹ��� ����";
		author = "���ü�";
		price = 30000;
		*/
	}
	
	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String getBookInfo() {
		return "å�̸� : " + title + ", ���� : " + author + ", ���� : " + price;
	}
}

public class BookTest {
	public static void main(String[] args) {
		Book bk[] = new Book[5];
		bk[0] = new Book();
		bk[1] = new Book("�̰��� �ڹٴ�", "�ſ��", 30000);
		bk[2] = new Book("Do it! HTML", "�����", 28000);
		bk[3] = new Book("������ ����", "�迵��", 13500);
		bk[4] = new Book("����Ҽ��� ������� �͵�", "����", 15000);
		
		for(int i=0; i<bk.length; i++) 
			System.out.println(bk[i].getBookInfo());
	}
}
