public class VipAccount extends Account{
    @Override
    void setAccountBalance(int negativeBalance){
        if(negativeBalance > -10000 ){
           System.out.println("The balance can be negative but not less than -10000");
        }
    }

    

    public VipAccount(int acctId, String holderName, int accountBalance){
        super(acctId,holderName,accountBalance);
    }

    public VipAccount(){
        super();
    }
    Account obj = new Account(int acctId, String holderName, int accountBalance);
    System.out.println(obj.credit(getAccountBalance()));
}