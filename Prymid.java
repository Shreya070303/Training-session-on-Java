package statement;

public class Prymid {
	public static void pattern() {
	    int rows = 5;

	    for (int i = 1; i <= rows; i++) {
	      for (int j = 1; j <= i; j++) {
	    	  if( i == 5 && j > 2) {
	        System.out.print(rows);
	        rows--;
	      }else {
	    	  System.out.print(j);
	      }
	      }
	      System.out.println();
	      }
	                       
	    
	  }
	    public static void main(String args[]) {
	    	pattern();
	    }

}