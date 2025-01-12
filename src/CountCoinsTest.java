import org.junit.Test;

public class CountCoinsTest {
    @Test
    <CoinChange>
    void testZeroAmount() {
        CoinChange coinChange = new CoinChange();
        int ways = coinChange.countWays(0);
    }
}

