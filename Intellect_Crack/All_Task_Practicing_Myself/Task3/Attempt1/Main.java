import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int acctId;
        String holderName;
        int balance;
        int creditMoney;
        int negativeBalance;

        Account obj1 = new Account();
        VipAccount obj2 = new VipAccount();

        acctId = sc.nextInt();
        obj1.setAcctId(acctId);

        holderName = sc.next();
        obj1.setHolderName(holderName);

        balance = sc.nextInt();
        obj1.setAccountBalance(balance);

        creditMoney = sc.nextInt();
        obj1.setAccountBalance(creditMoney);


        negativeBalance = sc.nextInt();
        // obj1.setAccountBalance(negativeBalance);

        System.out.println(obj1.getAcctId() + " " + obj1.getHolderName() + " " + obj1.getAccountBalance());
        // obj1.credit(creditMoney);
        // System.out.println(obj1.getAccountBalance());
        // System.out.println(obj1.getAccountBalance());

        // obj2.setAccountBalance(negativeBalance);
        // System.out.println(obj2.getAccountBalance());
    }
}