package day12;
import java.util.*;
public class UtilTest4 {
   @SuppressWarnings("resource")
public static void main(String args[]) {
      String str1 = "I love Java";
      Scanner scan = new Scanner(str1);
      while(scan.hasNext())
          System.out.println(scan.next());
      scan.close();
      String str2 = "I:love:Java";
      scan = new Scanner(str2);
      scan = scan.useDelimiter(":"); // ��� ���ϸ� �⺻���� ����
      while(scan.hasNext())
          System.out.println(scan.next());
      scan.close();      
      String str3 = "1 fish    2 fish red fish blue fish";
      scan = new Scanner(str3);
      scan = scan.useDelimiter("\\s*fish\\s*"); // ����ǥ���� \\s:���鹮��
      System.out.println(scan.nextInt());
      System.out.println(scan.nextInt());
      System.out.println(scan.next());
      System.out.println(scan.next());      
      scan.close();
      scan.close();
   }
}





