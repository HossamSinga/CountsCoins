public class CountCoins {

    private static final int[] Coins = {1, 5, 10, 25};


    public int countWays(int amount) {

        return  countWaysRecursive(amount,0);
    }
    private int countWaysRecursive(int amount , int coinsIndex){
        if (amount ==0){
            return 1;
        }
        if(amount <0 || coinsIndex>= Coins.length)
            return  0;
        return countWaysRecursive(amount-Coins[coinsIndex],coinsIndex)
                +countWaysRecursive(amount,coinsIndex+1);
    }

}
