package Conjugation.ex092;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

//ã������ ��¥�� ������ ��Ʈ�� ����Ʈ�� �����ϱ�
public class RequestFromBillboardHot {
	 ArrayList<String> htmls=new ArrayList<String>();
	 boolean isConnection=false;

	 public RequestFromBillboardHot() {
		htmls.clear();
	 }
	 public void getAllHtml(String newUrls){
		htmls.clear();
		try {
			// �ּ����� ���� �ȱ�
			BufferedReader reader = new BufferedReader(  
		              new FileReader(newUrls));
			String line = "";
			while ((line = reader.readLine()) != null){
				if(!line.trim().equals("")){
					htmls.add(line.trim());
				}
			}
			isConnection=true;
		} catch (Exception e) {
			isConnection = false;
			System.out.println("Billboard Parsing error !!! ");
		} 
	 }
	 public void printHtml(){
		for (String ss : htmls) {
			System.out.println(ss);
		}
	 }
	 //<button class="chart-detail-header__date-selector-button"> 
	 //September 15, 2018 
	 //<span class="chart-detail-header__date-selector-caret fa fa-caret-down">
	 //</span> </button>
	 //���� September 15, 2018�� ��� 2018-09-15�� ��ȯ
		public String getTimeDate(String aurl) {
			Document doc;
			String sdate=null;
		    try {
		        doc = Jsoup.connect(aurl).get();
		        Element first = doc.select("button.chart-detail-header__date-selector-button").first();
		        sdate=first.text(); // September 15, 2018
		    } catch (IOException e) {
		        System.out.println(e);
		    }
			return sdate!=null?RestDay.saturday(sdate): RestDay.saturday();
		}
	 public static void main(String[] args) {
		RequestFromBillboardHot rfw=new RequestFromBillboardHot();
		String a="https://www.billboard.com/charts/hot-100/";
		String rs=rfw.getTimeDate(a);
		System.out.println("�̹� �� "+rs);
		//rs=RestDay.toWantedDay(rs, 1);  //1����
		//System.out.println("������ "+rs);
		String fnames="billboard/"+rs+".html";
		//-----���⼭ 
		File f=new File(fnames);
		BillboardDriver billdriver=null;
		if(!f.exists()){   //������ �������� ������
			billdriver=new BillboardDriver();
			fnames=billdriver.saveBillboard100(rs,a);
		}
		//-----������� �߰�
		System.out.println(fnames);
		rfw.getAllHtml(fnames);
		rfw.printHtml();
	 }
}
