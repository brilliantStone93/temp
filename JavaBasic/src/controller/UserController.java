package controller;

import java.util.ArrayList;

import model.UserDTO;

public class UserController {
   //로그인 메소드
   private ArrayList<UserDTO> list;
   public UserController() {
      list = new ArrayList<>();
      UserDTO u1 = new UserDTO();
      u1.setId(1);
      u1.setUserId("admin");
      u1.setPassword("111");
      u1.setNickname("운영자");
      
      UserDTO u2 = new UserDTO();
      u2.setId(2);
      u2.setUserId("a");
      u2.setPassword("222");
      u2.setNickname("사용자 a");
      
      UserDTO u3 = new UserDTO();
      u3.setId(3);
      u3.setUserId("b");
      u3.setPassword("333");
      u3.setNickname("사용자 b");
      
      list.add(u1);
      list.add(u2);
      list.add(u3);
   }
   
   public UserDTO logIn(UserDTO attempt) {
      UserDTO logIn = null;
      for(UserDTO u : list) {
    	  //이 for 문의 의미는
    	  //만약 배열이나 리스트처럼 한가지 데이터타입이 여러개 모였을 경우
    	  //0번인덱스부터 끝까지를 하나씩 뽑아내서 u라고 부른다.
    	  if(attempt.getUserId().equals(u.getUserId()) && attempt.getPassword().equals(u.getPassword())) {
    		  logIn = u;
    	  }
      }
    
      return logIn;
      
   }
   
   public void insert(UserDTO u) {
	   list.add(u);
		
		
	}//insert
   
   public boolean isDuplicatedUserId(String id)	{
	   for(UserDTO u : list) {
		   if(u.getUserId().equals(id)) {
			   return true;
		   }
	   }
	   return false;
   }
}//