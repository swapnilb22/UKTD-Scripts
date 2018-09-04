/**
 * 
 */
package practice;

/**
 * @author swapnil
 *
 */
public class IfStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iDay = 7;
		String sDay = "Sunday";
		
		if(sDay.equals("Saturday")) {
			System.out.println("Today is Saturday");
		}
		else {
			System.out.println("Today is not a Saturday");
		}
		
		if(iDay==7) {
			System.out.println("This is 7th Day");
		}
		else {
			System.out.println("This isnt 7th day");
		}
		
	}

}
