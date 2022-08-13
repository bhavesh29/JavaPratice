package user.bhavesh.pattern;
/**
 * 
 */

/**
 * @author bhavesh
 *
 */
public class Pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		printINEURON(9);

	}

	private static void printINEURON(int size) {
		
			for(int i=0; i<size; i++) {
				
				// I
				for(int j=0; j<size; j++) {
					
					if(i==0 || i==size-1 || j==(size/2))
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
				
				System.out.print("  ");
				
				// N
				for(int j=0; j<size; j++) {
					
					if(j==0 || j==size-1 || j==i)
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
				
				System.out.print("  ");
				
				// E
				for(int j=0; j<size; j++) {
					
					if(i==0 || i==size-1 || i==(size/2) || j==0)
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
				
				System.out.print("  ");
				
				// U
				for(int j=0; j<size; j++) {
					
					if(((j==0 && i!=size-1) || (i==(size-1) && j!=0 && j!=(size-1))) || 
								(j==size-1 && i!=size-1))
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
				
				System.out.print("  ");
				
				// R
				for(int j=0; j<size; j++) {
					
					if(j==0 || i==0 || i==(size/2) ||
						(j==(size-1) && i<=(size/2)) ||
							(i>size/2 && (i==j)))
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
				
				System.out.print("  ");
				
				// 0
				for(int j=0; j<size; j++) {
					
					if((j==0) || i==0 || i==(size-1) || j==(size-1))
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
				
				System.out.print("  ");
				
				// N
				for(int j=0; j<size; j++) {
					
					if(j==0 || j==size-1 || j==i)
						System.out.print("*");
					else
						System.out.print(" ");
					
				}


				System.out.println();
			}
			
	}

}
