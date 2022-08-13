package user.bhavesh.pattern;
/**
 * 
 */

/**
 * @author bhavesh
 *
 */
public class Pattern4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int size=20;
		
		for(int i=0; i<=size; i++) {
			
			for(int j=0; j<=size; j++) {
				
				if( (i==size) || i>size/2 && (j<i-(size/2) || j>(size-(i-(size/2)))) )
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			
			System.out.println("  ");
		}

	}	
		

}
