 import java.util.Scanner;

public class ShortCalculator {
    
    public static short add(short s1, short s2){
        return (short)(s1 + s2);
    }

    public static short subtract(short s1, short s2){
        return (short)(s1 - s2);
    }
    
    public static short multiply(short s1, short s2){
        return (short)(s1 * s2);
    }
    
    public static short divide(short s1, short s2){
        return (short)(s1 / s2);
    }
    
    public static short remainder(short s1, short s2){
        return (short)(s1 % s2);
    }
    
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);   
        System.out.println("Please type a number between 0 and 65535");
        short s1 = userInput.nextShort();
        System.out.println("Please type a number between 0 and 65535");
        short s2 = userInput.nextShort();
        
        short sum = add(s1, s2);
        short difference = subtract(s1, s2);
        short product = multiply(s1, s2);
        short quotient = divide(s1,s2);
        short remainder = remainder(s1,s2);
        
        System.out.printf("The sum of %d and %d is %d \n",s1,s2,sum);
        System.out.printf("The difference of %d minus %d is %d \n",s1,s2,difference);
        System.out.printf("The product of %d and %d is %d \n",s1,s2,product);
        System.out.printf("The quotient of %d divided by %d is %d \n",s1,s2,quotient);
        System.out.printf("The remainder of %d by %d is %d \n",s1,s2,remainder);
    }
}
