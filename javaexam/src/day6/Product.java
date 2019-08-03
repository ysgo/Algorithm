package day6;

import java.io.Serializable;

public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int balance;
	private transient int price; // transient �Ͻ����� -> ������

	public Product() {
		this("��ũ����", 5, 10000);
	}

	public Product(String name, int balance, int price) {
		this.name = name;
		if (balance < 0 || price < 0)
			return;
		this.balance = balance;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int getPrice() {
		return price;
	}

}
