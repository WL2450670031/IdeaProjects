package BankTest_5_7;

public class Account {
    private String idCard;//���֤
    private double balance;//����
    public Account(){
        super();
    }
    public Account(String idCard,double balance){
        this.idCard=idCard;
        this.balance=balance;
    }

    public String getIdCard() {
        return idCard;
    }
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest()//����
    {
        return balance;
    }
}
