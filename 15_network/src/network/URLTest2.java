package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.URL;

public class URLTest2 {


	public static void main(String[] args) throws IOException {//MalformedURLException가 IOException의 하위라 사라짐
		URL url = new URL ( "http://www.liebli.com/");
		
		 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		//BufferedReader는 한줄씩 읽어온다
		
		String line = null;
		//읽어온 자료를 넣어주기위해 line선언
		int count = 0;

		String before = null;
		while((line = br.readLine()) != null) {//bufferedReader는 한줄씩읽어주기 때문에 계속 읽을 수 있도록 반복
			before += (line+"\n");				
		
				


		}
		
		
		before = before.toUpperCase(); // 원본에 덮어 씌워주지 않으면 사라진다
//		System.out.print(before);
		String after = before.replace("14K", "14k");
//		System.out.print(after);

		for(int i = 0 ; i < before.length(); i++) {
			if(before.charAt(i) != after.charAt(i)) count++;
		}
		br.close();
		System.out.println("14k의 개수 = " +count);
		//대소문자 구별없이 다 찾아오기 14k갯수
	}
}


//강사님 해설
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
//       int count =0; //count 값이 살아있어야 밑에서 출력해주므로 여기에서 초기값 주기
//       
//       while( (line = br.readLine()) != null) {
//          System.out.println(line + "\n");
//         line = line.toLowerCase();
//         
//         int index = 0;
//         while( (index = line.indexOf("14k", index)) != -1){  //예전에 치환하던 문제 참고하기
//                  
//               index += ("14k".length());
//               count++;
//            }//while
//         }//while
//               System.out.println("14K라는 단어가 "+ count +"개 있습니다");
//               System.out.println();
//                br.close();
//       }
//
//   
//   }



//split활용 해안
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
//      // 14K가 몇번 나왔는지 계산
//      // 대소문자 구별 x 14k 14K
//      
//      System.out.println("14k의 빈도수 : " + count);
//
//      br.close();
//   }
//
//}
//
// 
