import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.math.BigInteger;

public class ShortCalculatorTest{
 
    private ShortCalculator shortCalculator;

    @Before
    public void setUp(){
        shortCalculator = new ShortCalculator();
    }
    
    
    @Test
    public void testOfShortAddition(){
        short s1 = 15;
        short s2 = 5;
        //Given
        short expected = 20;
        //When
        short actual = shortCalculator.add(s1, s2);
        //Then
        assertEquals(expected,actual);
        
    }
    
    @Test
    public void testOfSubtraction(){
        short s1 = 1000;
        short s2 = 167;
        //Given
        short expected = 833;
        //When
        short actual = shortCalculator.subtract(s1, s2);
        //Then
        assertEquals(expected,actual);
        
    }
    
    @Test
    public void testOfShortMultiplication(){
        short s1 = 10;
        short s2 = 54;
        //Given
        short expected = 540;
        //When
        short actual = shortCalculator.multiply(s1, s2);
        //Then
        assertEquals(expected,actual);
        
    }
    
    @Test
    public void testOfShortDivision(){
        short s1 = 15;
        short s2 = 5;
        //Given
        short expected = 3;
        //When
        short actual = shortCalculator.divide(s1, s2);
        //Then
        assertEquals(expected,actual);
        
    }
    
    @Test
    public void testOfShortRemainder(){
        short s1 = 8;
        short s2 = 3;
        //Given
        short expected = 2;
        //When
        short actual = shortCalculator.remainder(s1, s2);
        //Then
        assertEquals(expected,actual);
        
    }
}
