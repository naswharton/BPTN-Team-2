package introtojava;
public class Examples {
	 public int numberOfSteps(int num) {
		 int count = 0;
	     while(num > 0){
	    	 if(num % 2 == 0){
	    		 num = num/2;
	         }
	         else{
	        	 num = num-1;
	         }
	         count++;
	     }
	     
	     return count;
	     
	 }

	 public static void main (String[] args){
	        Examples test = new Examples();
	        System.out.println(test.numberOfSteps(14));
	       
	    }

	
}
