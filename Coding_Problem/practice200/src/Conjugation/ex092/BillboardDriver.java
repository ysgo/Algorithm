package Conjugation.ex092;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BillboardDriver {
	public String saveBillboard100(String today, String newUrls){
		 Document doc=null;
		 String fnames="billboard/";
		 String ss="";
	     try {
	    	 doc = Jsoup.connect(newUrls+today).get(); //GET
	    	 //button.chart-detail-header__date-selector-button ����
	    	 //ù��° ������Ʈ
	    	 Element bDay = doc.select("button.chart-detail-header__date-selector-button").first();
	    	 ss+=bDay.outerHtml()+"\n";
	    	 //System.out.println("1--------------");
	    	 //div.chart-number-one__info ����
	    	 //ù��° ������Ʈ
	    	 Element first = doc.select("div.chart-number-one__info").first();
	    	 ss+=first.outerHtml()+"\n";
	    	 //System.out.println("2--------------");
            //div.chart-list-item ��� ������Ʈ
	    	 Elements links = doc.select("div.chart-list-item");
	         for (Element link : links) {
	        	 ss+=link.outerHtml()+"\n";
	             //System.out.println("---------------------------------------");
	         }

		     //billboard/2018-09-14.html ����
		     fnames=fnames+today+".html";
			 PrintWriter pw=new PrintWriter(
						    new FileWriter(fnames));
		     pw.print(ss);
		     pw.close();
	     } catch (IOException e) {
			System.out.println(e);
		 }
	     return fnames;
	}
	public String saveBillboard100(String newUrls){
	     //billboard/2018-09-14.txt ����
	     SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	     String today=sdf.format(new Date());
	     return saveBillboard100(today,newUrls);
	}
}
