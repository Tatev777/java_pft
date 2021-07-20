package autotests;

import org.junit.Assert;
import org.junit.Test;

public class PrimeTests {

  @Test
  public void testPrimes(){
    Assert.assertTrue(MyFirstProgram.isPrime(Integer.MAX_VALUE));
  }

  @Test
  public void testNonPrimes(){
    Assert.assertFalse(MyFirstProgram.isPrime(Integer.MAX_VALUE - 2));
  }
}
