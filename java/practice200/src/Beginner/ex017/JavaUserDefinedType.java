package Beginner.ex017;

public class JavaUserDefinedType {
	//����� ���� ���� Ÿ�� ����ϱ�
	public static void main(String[] args) {
		double latitude=37.52127220511242;
		double longitude=127.0074462890625;
		
		JLocation jloc = new JLocation();
		jloc.lat = latitude;
		jloc.lng = longitude;
		
		JLocation newLoc = jloc;
		System.out.println(newLoc.lat);
	}
}

class JLocation {
	public double lat;
	public double lng;
}
