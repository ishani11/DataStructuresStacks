package pcprac;

import java.util.LinkedList;
import java.util.Queue;

public class Generatebin {

	public static void getBinary(int n){
	        //write your code here
		 Queue<String> q = new LinkedList<String>(); 
	        
	        q.add("1");
	        
	        while(n-->0){
	            String s1= q.peek();
	            
	            q.remove();
	            System.out.print(s1+" ");
	            
	            q.add(s1+"0");
	            
	            q.add(s1+"1");
	        }

	     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getBinary(5);
	}

}
