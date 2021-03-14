package richest_customer_wealth_1672;

public class Main {
    public static void main(String[] args) {
        //[[2,8,7],[7,1,3],[1,9,5]]
        int[][] amountMoneys = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(amountMoneys));

    }

    public static int maximumWealth(int[][] accounts) {
        int richestCustomer = 0;

        for(int i=0;i< accounts.length;i++){
            int amountMoney = 0;
            for(int j =0 ;j<accounts[i].length;j++){
                amountMoney+=accounts[i][j];
            }

            if(amountMoney>richestCustomer){
                richestCustomer = amountMoney;
            }
        }

        return richestCustomer;
    }
}
