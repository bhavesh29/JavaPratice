package user.bhavesh.pattern;
/**
 * 
 */

/**
 * @author bhavesh
 *
 */
public class Pattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Print below
		//1 1 1 1
		//2 2 2 2
		//3 3 3 3
		//4 4 4 4
		int size=4;
				
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		

	}

}
