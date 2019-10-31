package Conjugation.ex085;

import java.util.ArrayList;


//빌보드 차트를 리스트에 저장하고 출력하기
public class BillboardArrayMain {

	public static void main(String[] args) {
		ArrayList<Billboard> bills = new ArrayList<Billboard>();
		bills.add(new Billboard(1, "Despacito", 1,
			"https://www.billboard.com/images/pref_images/q61808osztw.jpg", "luis fonsi"));
		bills.add(new Billboard(2, "That's What I Like", 2,
				"https://www.billboard.com/images/pref_images/q59725qvpol.jpg", "bruno mars"));
		bills.add(new Billboard(3, "I'm The One", 3,
				"https://www.billboard.com/images/pref_images/q64532pl64x.jpg", "dj khaled"));
		System.out.println(bills.size());
		showAbout(bills.get(0));
		bills.remove(1);
		System.out.println(bills.size());
		System.out.println("--------------------");
		for(Billboard bb : bills) {
			showAbout(bb);
		}
	}
	
	public static void showAbout(Billboard bb) {
		String sf = String.format("%d, %s, %d, %s, %s",
			bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
		System.out.println(sf);
	}

}
