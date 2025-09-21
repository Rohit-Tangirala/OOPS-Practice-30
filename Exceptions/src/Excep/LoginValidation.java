package Excep;

public class LoginValidation {
 static void validation(String username, String password) {
	 if(!username.equals("admin") || !password.equals("1234")) {
		 throw new SecurityException("Invalid username or password!!");
	 }
	 else
		 System.out.println("Login Successfull");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	   validation("admin","1111");
   }
   catch(SecurityException e) {
	   System.out.println("Security exception : " + e.getMessage());
   }
   try {
	   validation("admin","1234");	
   }
  
	 catch(SecurityException e) {
		   System.out.println("Security exception : " + e.getMessage());
	   }
}
}
