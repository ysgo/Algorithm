package day12;
import java.util.*;
public class UtilTest2 {
   public static void main(String args[]) {
      Date d = new Date();

      System.out.println("���� �ð� : " + d);
      System.out.println("1970�� 1�� 1�� 0�ú��� ����� �и��� ������ ���� �ð� : " + 
                             d.getTime());
      long nextDay = d.getTime() + 60*60*24*1000;
      d.setTime(nextDay);
      System.out.println("�Ϸ� ���� �ð� : " + d);
      System.out.println( "����� ���� �Ϸ� ���� 1970�� 1�� 1�� 0�ú���"+
                                       " �и��� ������ �ð� : " + d.getTime());
   }
}

