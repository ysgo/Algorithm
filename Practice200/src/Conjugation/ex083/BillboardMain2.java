package Conjugation.ex083;
//빌보드 차트 정보를 빌보드 저장 객체(DTO)에 저장하기
public class BillboardMain2 {

	public static void main(String[] args) {
		Billboard b1 = new Billboard(1, "Despacito", 1,
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg", "luis fonsi");
		showAbout(b1);
		
		Billboard b = b1;
		showAbout(b);
	}
	
	public static void showAbout(Billboard bb) {
		String sf = String.format("%d, %s, %d, %s, %s",
				bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
		System.out.println(sf);
	}

}
