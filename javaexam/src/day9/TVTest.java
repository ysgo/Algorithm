package day9;
class SaleTV extends TV {
	private int price;
	SaleTV() {}
	SaleTV(int price, String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void play() {
		System.out.printf("�Ǹ�TV ä�� %d���� ���θ� �÷��� �մϴ�.\n", getChannel());
	}
	public void sale() {
		System.out.printf("%s ���� ��ǰ�� �Ǹ��մϴ�. %,d���� ������ �ּ���.\n", getModel(), getPrice());
	}
	public String toString() {
		return String.format("�ǸŻ�ǰ���� : �𵨸�(%s), ����(%,d), ũ��(%d)\n", getModel(), getPrice(), getSize());
	}
}
class RentalTV extends TV implements Rentable {
	private int price;
	RentalTV() {}
	RentalTV(int price, String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void play() {
		System.out.printf("�뿩TV ä�� %d���� ���θ� �÷��� �մϴ�.\n", getChannel());
	}
	public void rent() {
		System.out.printf("%s ���� ��ǰ�� �뿩�մϴ�. %,d���� ������ �ּ���.\n", getModel(), getPrice());
	}
	public String toString() {
		return String.format("�뿩��ǰ���� : �𵨸�(%s), ����(%,d), ũ��(%d)\n", getModel(), getPrice(), getSize());
	}
}

public class TVTest {
	public static void main(String[] args) {
		TV st = new SaleTV(300000, "SALETV-1", 40, 1);
		TV rt = new RentalTV(100000, "RENTALTV-10", 42, 1);
		st.channelUp();
		st.channelUp();
		rt.channelDown();
		rt.channelDown();
		rt.channelDown();
		printAllTV(st);
		printAllTV(rt);
		printRentalTV((Rentable)rt);		
	}
	static void printAllTV(TV tv) {
		System.out.print(tv.toString());
		if(tv instanceof SaleTV) {
			((SaleTV)tv).play();
			((SaleTV)tv).sale();
		} else {
			((RentalTV)tv).play();
		}
	}
	static void printRentalTV(Rentable tv) {
		tv.rent();
	}
}
