package BankTest_5_7;

public class BankTest_5_7 {
    public static void main(String[] args)
    {
        FixedDepositAccount fixedDepositAccount=new FixedDepositAccount("001",100000.0,36,0.035);
        BankingAccount bankingAccount=new BankingAccount("002",100000.0,182,0.052);
        System.out.println(fixedDepositAccount);
        System.out.println(bankingAccount);
    }
}
