package BankTest_5_7;

public class BankingAccount extends Account{
    private int days;
    private double rate;

    public BankingAccount()
    {
        super();
    }
    public BankingAccount(String idCard,double balance)
    {
        super(idCard,balance);
    }
    public BankingAccount(String idCard,double balance,int days,double rate)
    {
        super(idCard,balance);
        this.days=days;
        this.rate=rate;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }

    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getInterest()
    {
        return getBalance()*rate*days/365;
    }

    public String toString()
    {
        return getIdCard()+"�˻���"+getBalance()+"Ԫ����"+days+"�´����Ϣ:"+getInterest()+"(������Ϊ"+rate*100+"%)";
    }
}
