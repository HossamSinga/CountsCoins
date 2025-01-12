import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCoinsTest {
    @Test
    public void testZeroCents(){
        CountCoins countCoins = new CountCoins();
           int Ways = countCoins.countWays(0);
        assertEquals(1,Ways);

    }
    @Test
    public void testFiveCents(){
        CountCoins countCoins = new CountCoins();
        int Ways = countCoins.countWays(5);
        assertEquals(2,Ways);

    }
    @Test
    public void testTenCents() {
        CountCoins countCoins = new CountCoins();
        int Ways = countCoins.countWays(10);
        System.out.println(Ways);
        assertEquals(4, Ways);
    }
    @Test
    public void testDollar(){
        CountCoins countCoins = new CountCoins();
        int Ways = countCoins.countWays(100);
        System.out.println(Ways);
        assertEquals(242,Ways);


    }
}





