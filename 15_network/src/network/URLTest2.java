package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.URL;

public class URLTest2 {


	public static void main(String[] args) throws IOException {//MalformedURLException�� IOException�� ������ �����
		URL url = new URL ( "http://www.liebli.com/");
		
		 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		//BufferedReader�� ���پ� �о�´�
		
		String line = null;
		//�о�� �ڷḦ �־��ֱ����� line����
		int count = 0;

		String before = null;
		while((line = br.readLine()) != null) {//bufferedReader�� ���پ��о��ֱ� ������ ��� ���� �� �ֵ��� �ݺ�
			before += (line+"\n");				
		
				


		}
		
		
		before = before.toUpperCase(); // ������ ���� �������� ������ �������
//		System.out.print(before);
		String after = before.replace("14K", "14k");
//		System.out.print(after);

		for(int i = 0 ; i < before.length(); i++) {
			if(before.charAt(i) != after.charAt(i)) count++;
		}
		br.close();
		System.out.println("14k�� ���� = " +count);
		//��ҹ��� �������� �� ã�ƿ��� 14k����
	}
}


//����� �ؼ�
//package network;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class URLTest2 {
//
//   public static void main(String[] args) throws IOException {
//   
//      URL url = new URL("http://www.liebli.com");
//       BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
//       String line = null;
//       int count =0; //count ���� ����־�� �ؿ��� ������ֹǷ� ���⿡�� �ʱⰪ �ֱ�
//       
//       while( (line = br.readLine()) != null) {
//          System.out.println(line + "\n");
//         line = line.toLowerCase();
//         
//         int index = 0;
//         while( (index = line.indexOf("14k", index)) != -1){  //������ ġȯ�ϴ� ���� �����ϱ�
//                  
//               index += ("14k".length());
//               count++;
//            }//while
//         }//while
//               System.out.println("14K��� �ܾ "+ count +"�� �ֽ��ϴ�");
//               System.out.println();
//                br.close();
//       }
//
//   
//   }



//splitȰ�� �ؾ�
//package protocol;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.URL;
//
//public class URLTest2 {
//
//   public static void main(String[] args) throws IOException {
//
//      URL url = new URL("http://www.liebli.com/");
//
//      BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
//      String line = null;
//      
//      int count = 0;
//      
//      while ((line = br.readLine()) != null) {
//         
//      //   System.out.println(line + "\n");
//         
//         String str = line.toUpperCase();
//         
//      //   System.out.println("toUpperCase() : " + str + "\n");
//         
//         String[] splitBy14K = str.split("14K");
//         
//         count += splitBy14K.length - 1;
//      }
//
//      // 14K�� ��� ���Դ��� ���
//      // ��ҹ��� ���� x 14k 14K
//      
//      System.out.println("14k�� �󵵼� : " + count);
//
//      br.close();
//   }
//
//}
//
// 