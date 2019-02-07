 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger bI = new BigInteger("1");
            for(int i = 2; i <= value; i++){
                bI = bI.multiply(BigInteger.valueOf(i));
            }
        return bI;
    }

}
