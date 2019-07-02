package pcprac;

import java.util.Stack;

public class decodeString {
	
	public static String decode(String s) {
		 //Write your code here
		Stack<String> stringstk= new Stack<String>();
	    Stack<Integer> integerstk = new Stack<Integer>();
	    
	    stringstk.push("");
	    
	    int l= s.length();
	    int i=0;
	    
	    while(i<l){
	        String str="";
	        char ch= s.charAt(i);
	        if(Character.isDigit(ch)){
	            integerstk.push(ch- '0');
	            i++;
	        }else if(ch=='['){
	            stringstk.push(str+ch);
	            i++;
	            
	        }else if(ch==']'){
	            String part="";
	            while(stringstk.pop().equals("[")){
	                part=stringstk.pop();
	            }
	            if(integerstk.isEmpty()){
	            int count=integerstk.pop();
	            for(int j=1; j<count; j++){
	                part+=part;
	            }
	            stringstk.push(part);
	            }
	        }else{
	            stringstk.push(str+ch);
	            i++;
	        }
	        System.out.println(stringstk);
	        
	        
	    }
	    
	    return stringstk.peek();
	}
		    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decode("3[a2[c]]"));
	}

}
