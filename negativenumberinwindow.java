package pcprac;

import java.util.LinkedList;
import java.util.Queue;

public class negativenumberinwindow {
	
	public  static void window(int[] arr, int k){
	 	 // Write your code here
	 	 
		Queue<Integer> q= new LinkedList<>();
 	    
 	    for(int i=0;i<arr.length;i++){
 	        if(arr[i]<0){
 	            q.add(i);
 	        }
 	    }
 	    
 	    System.out.println(q);
 	    int i=0;
 	    
 	    while(i<=arr.length-k){
 	    	if(q.isEmpty()) {
	 	    		System.out.println(0);
	 	    		i++;
	 	    	}
 	    	
 	    	
 	    	if(q.isEmpty()==false && q.peek()<i+k && q.peek()>=i) {
 	    		System.out.println(arr[q.peek()]);
 	    		i++;
 	    	}else {
 	    		
 	    		if(q.isEmpty()==false && q.peek()<i) {
 	    			while(q.isEmpty()==false && q.peek()<i)
 	    				q.remove();
 	    		}else {
 	    			System.out.println(0);
 	    			i++;
 	    		}
 	    	
 	    	}
 	    }
// 	   if(q.isEmpty()==true) {
//    		while(i<=arr.length-k) {
//    			System.out.println(0);
//    		}
//    	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= { 12, -1, -7, 8, -15, 30, 16, 28};
		
		window(arr, 3);

	}

}
