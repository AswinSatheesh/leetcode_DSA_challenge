public class Account{
    private int acctId;
    private String holderName;
    private int accountBalance;

    public Account(){
        acctId = -1;
        holderName = "";
        accountBalance = 0;
    }

    public Account(int acctId, String holderName, int accountBalance){
        this.acctId = acctId;
        this.holderName = holderName;
        this.accountBalance = accountBalance;
    }

    void setAcctId(int acctId){
        this.acctId = acctId;
    }

    int getAcctId(){
        return acctId;
    }

    void setHolderName(String holderName){
        this.holderName = holderName;
    }

    String getHolderName(){
        return holderName;
    }

    void setAccountBalance(int accountBalance){
        this.accountBalance = accountBalance;
    }

    int getAccountBalance(){
        return accountBalance;
    }

    public int credit(int creditMoney){
        accountBalance = accountBalance + creditMoney;
        setAccountBalance(accountBalance);
        return accountBalance; 
    }




}