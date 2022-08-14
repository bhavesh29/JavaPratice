package user.bhavesh.pattern;
/**
 * 
 */

/**
 * @author bhavesh
 *
 */
public class Pattern5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int size=15;
		
		for(int i=0; i<=size; i++) {
			
			for(int j=0; j<=size; j++) {
				
				if( (i==size) || i==0 || (j<=(size/2)-i || j<=i-(size/2)) )
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			
			System.out.println("  ");
		}

	}

}
