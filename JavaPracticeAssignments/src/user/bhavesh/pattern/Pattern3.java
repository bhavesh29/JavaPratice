package user.bhavesh.pattern;
/**
 * 
 */

/**
 * @author bhavesh
 *
 */
public class Pattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size=13;
		
		for(int i=0; i<size; i++) {
			
			for(int j=0; j<size; j++) {
				
				if((i==0 || i==size-1 || j==0 || j==size-1) ||
						(i<size/2 && ((j<=(size/2)-i) || j>=(size/2)+i)))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			
			System.out.println("  ");
		}

	}

}
