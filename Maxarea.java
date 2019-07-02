package pcprac;

import java.util.Stack;

public class Maxarea {

	public static int maxRectArea(int[] ht) {
        //write your code here
        
        int[] nsel= new int[ht.length];
        int[] nser= new int[ht.length];
        
        Stack<Integer> stkl= new Stack<Integer>();
        
        
        nsel[0]=-1;
        stkl.push(0);
        for(int i=1; i<ht.length; i++){
            while(stkl.size()>0 && ht[i]< ht[stkl.peek()]){
                stkl.pop();
            }
            
            if(stkl.size()==0){
                nsel[i]=-1;
            }else{
                nsel[i]=stkl.peek();
            }
            
            stkl.push(i);
        }
        
        Stack<Integer> stkr= new Stack<Integer>();
        
        nser[ht.length-1]=-1;
        stkr.push(ht.length-1);
        for(int i=ht.length-2; i>=0; i--){
            while(stkr.size()>0 && ht[i]< ht[stkr.peek()]){
                stkr.pop();
            }
            
            if(stkr.size()==0){
                nser[i]=-1;
            }else{
                nser[i]=stkr.peek();
            }
            
            stkr.push(i);
        }
        
        int largest=ht[0]*(nser[0]- nsel[0] -1);
        for(int i=0;i<ht.length;i++){
            int n= ht[i]* (nser[i]- nsel[i] -1);
            if(n>largest)
                largest=n;
        }
        
        return largest;
 
 	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8, 3, 8, 2, 5, 6, 7, 9, 5};
		System.out.println(maxRectArea(arr));
		
	}

}
