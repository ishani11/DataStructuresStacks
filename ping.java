package pcprac;

public class ping {

	static class RecentFetch {
	        Queue<Integer> q= new LinkedList<>();
	     
 	 }
 	 
 	 public int ping(int t) {
 	     int a= t-3000;
 	     
 	     if(q.size()==0){
 	         q.add(t);
 	         return q.size();
 	     }
 	     
 	  
 	    q.add(t);
 	    while(q.peek()>=a){
 	        q.remove();
 	    }
 	    
 	    return q.size();
 	     
 	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
