package BankTest_5_7;

public class FixedDepositAccount extends Account{
    private int months;
    private double rate;

    public FixedDepositAccount()
    {
        super();
    }

    public FixedDepositAccount(String idCard,double balance)
    {
        super(idCard,balance);
    }
    public FixedDepositAccount(String idCard,double balance,int months,double rate)
    {
        super(idCard,balance);
        this.months=months;
        this.rate=rate;
    }

    public int getMonth() {
        return months;
    }
    public void setMonth(int month) {
        this.months = month;
    }

    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getInterest()
    {
        return getBalance()*rate*months/12;
    }

    public String toString()
    {
        return getIdCard()+"账户的"+getBalance()+"元存款的"+months+"月存款利息:"+getInterest()+"(年利率为"+rate*100+")";
    }
}
