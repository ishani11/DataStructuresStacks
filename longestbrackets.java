package pcprac;

public class longestbrackets {
	
	public static int longestParenthesis(String s){
        
	      // Write your code here
	      
	      Stack<Integer> stk= new Stack<Integer>();
	      //stk.push(-1);
	      stk.push(-1);
	      if(s.charAt(0)==')' ){
	          stk.push(0);
	      }
	      
	      int count=0;
	      
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i)=='('){
	                stk.push(i);
	            }else{
	                if(stk.peek()=='('){
	                    stk.pop();
	                    
	                    count= count < i-stk.peep() ? i - stk.peek() : count;
	                }else{
	                    stk.push(i);
	                }
	            }
	            
	        }
	        
	        return count;
	      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
