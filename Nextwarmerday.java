package pcprac;

import java.util.Stack;

public class Nextwarmerday {

	public static int[] findWarmerTemp(int T[] ){
		 // Write your code here only
		 
		    int[] res= new int[T.length];
		    Stack<Integer> stk= new Stack<Integer>();
		    
		    res[T.length-1]=0;
		    stk.push(T.length-1);
		    
		    for(int i=T.length-2;i>=0;i--){
		        while(stk.isEmpty()==false && T[i] >= T[stk.peek()]){
			 	          stk.pop();
			 	      }
		        
		        if(stk.isEmpty()){
		            res[i]=0;
		        }else{
		            res[i]=stk.peek()-i;
		        }
		        
		        stk.push(i);
		        
		    }
		    return res;
		 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {73, 74, 75, 71, 69, 72, 76, 73};
		int[] res= findWarmerTemp(arr);
		for(int i=0;i<8;i++) {
			System.out.println(res[i]);
		}
		

	}

}
