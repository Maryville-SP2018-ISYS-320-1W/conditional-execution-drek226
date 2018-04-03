/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expected results after the input is provided:
 
 1. 10 6     
 2. 9 9
 3. 3 4     a was triggered by else and b was just equal to b 
 4. 29 30   a was triggered by else and b was just equal to b 
 
 // It took me a while to understand this but now I think I understand now
  
 */
public class P4_IfElseMystery {

	public static void main(String[] args) {
		// Put your call to ifElseMyster2 here
		ifElseMystery(10, 2);

		
	}
	
	
    public static void ifElseMystery(int a, int b) {
        if (a * 2 < b) {
            a = a * 3;
        } else if (a > b){
            b = b + 3;
        }
        if (b < a) {
            b++;
        } else {
            a--;
            
        }System.out.println(a + " " + b);
    }

}
