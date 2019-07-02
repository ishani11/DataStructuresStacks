package pcprac;

import java.util.Stack;

public class checkScore {
	
	public static int calculatePoints(String[] ops) {
	 	 // Write ypur code here only
	 	 
	 	 
	 	    Stack<Integer> points= new Stack<>();
	 	    
	 	    
	 	    for(int i=0;i<ops.length;i++){
	 	        if(Character.isDigit(ops[i].charAt(0))){
	 	            points.push(Integer.parseInt(ops[i]));
	 	            
	 	        }else if(ops[i]=="C"){
	 	            points.pop();
	 	        }else if(ops[i]=="D"){
	 	            points.push(2* points.peek());
	 	        }else if(ops[i]=="+"){
	 	            int a= points.pop();
	 	            int b= points.pop();
	 	            points.push(b);
	 	            points.push(a);
	 	            points.push(a+b);
	 	        }else if(ops[i].charAt(0)=='-') {
	 	        	int x= Integer.parseInt(ops[i]);
	 	        	points.push(x);
	 	        }
	 	    }
	 	    
	 	    int sum=0;
	 	    while(!points.isEmpty()){
	 	        sum+=points.pop();
	 	    }
	 	    
	 	    return sum;
	 	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= { "5", "2", "C", "D", "+"};
		System.out.println(calculatePoints(arr));
	}

}
