package day12;
import java.util.*;
public class UtilTest1 {
   public static void main(String args[]) {
      String[] str={"��", "��", "��", "��", "��", "��", "��", "��"};
      for(String s : str)         
          System.out.print(s+"\t");
      System.out.println();
      int index = Arrays.binarySearch(str, "��");
      System.out.println("\"��\"�� �����ϴ� ��ġ : " + index);
      Arrays.sort(str);
      System.out.println("���� ��....");
      for(String s : str)         
          System.out.print(s+"\t");
      System.out.println();
      Arrays.fill(str, "��");     
      System.out.println("��� ������ ������ ���� ä�� ��....");
      for(String s : str)         
          System.out.print(s+"\t");
   }
}
