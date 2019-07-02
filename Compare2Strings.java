package pcprac;

import java.util.Stack;

public class Compare2Strings {
	
	public static boolean compareString(String s, String t) {
	 	 //write your code here
	 	 Stack<Character> stack1= new Stack<Character>();
	 	 Stack<Character> stack2= new Stack<Character>();
	 	 
	 	 for(int i=0;i<s.length(); i++){
	 	     char c=s.charAt(i);
	 	     if(c=='#'){
	 	         stack1.pop();
	 	     }else{
	 	         stack1.push(c);
	 	     }
	 	 }
	 	 
	 	 for(int i=0;i<t.length(); i++){
	 	     char c=t.charAt(i);
	 	     if(c=='#'){
	 	         stack2.pop();
	 	     }else{
	 	         stack2.push(c);
	 	     }
	 	 }
	 	 
	 	
	 	 
	 	 return stack1.equals(stack2);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(compareString("zb#d", "zbb##d"));

	}

}
