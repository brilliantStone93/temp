package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUtil {
   //�Է°� ���õ� �޼ҵ�
   public static int validateInt(int minimum, int maximum) throws IOException {
      int parsedValue = stringToInt();
      while(parsedValue < minimum || parsedValue > maximum) {
         System.out.println("�߸��Է��ϼ̽��ϴ�.");
         parsedValue = stringToInt();
      }
      
      return parsedValue;
   }
   
   public static int stringToInt() throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("> ");
      String userInput = bufferedReader.readLine();
      while(!userInput.matches("\\d*")) {
         System.out.println("���ڸ� �Է����ּ���.");
         System.out.print("> ");
         userInput = bufferedReader.readLine();
      }
      return Integer.parseInt(userInput);
   }
}