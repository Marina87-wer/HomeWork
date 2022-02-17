/**
 * Java 1. Home work #2
 *
 * @author Marina Kalugina
 * @version
 */
 
class MyHomeWork2 {
 
    public static void main (String[] args) {
        System.out.println(numBetween10and20(11, -5));
        System.out.println(numBetween10and20(15, -1));  

        wrPositiveorNegative(-7);
        wrPositiveorNegative(0);
        wrPositiveorNegative(3);

	    System.out.println(isNegative(-2));
        System.out.println(isNegative(0));
        System.out.println(isNegative(2));	

        wrRepeatS("Nice day", 5);		
	}

    static boolean numBetween10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }	

    static void wrPositiveorNegative(int c) {
		System.out.println(c >= 0? "Positive" : "Negative");
		
	}	
		
	static boolean isNegative(int g) {
        return g < 0;
	}	
		
	static void wrRepeatS(String a, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(a);
		}			
	}	
		
		
		
		
	
} 
    