package pcprac;

import java.util.Stack;

public class NGE {
	
	static void printNGE(int arr[], int n) 
	 { 
	 	  int[] nge= new int[arr.length];
	 	  Stack<Integer> stk= new Stack<Integer>();
	 	  
	 	  nge[arr.length-1]=-1;
	 	  stk.push(arr[arr.length-1]);
	 	  
	 	  for(int i=arr.length-2;i>=0;i--){
	 	      while(stk.isEmpty()==false && arr[i] > stk.peek()){
	 	          stk.pop();
	 	      }
	 	      
	 	      if(stk.isEmpty()){
	 	          nge[i]=-1;
	 	      }else{
	 	          nge[i]=stk.peek();
	 	      }
	 	      
	 	      stk.push(arr[i]);
	 	      
	 	      
	 	  }
	 	  
	 	  for(int i=0;i<arr.length;i++){
	 	      System.out.println(nge[i]);
	 	  }
	 	  
	 	  
	 	  
	 } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		printNGE(arr, 4);
	}

}
