import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        CarInsurance obj = new CarInsurance();
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        obj.setPrice(price);

        int age = sc.nextInt();
        obj.setAge(age);

        int capacity = sc.nextInt();
        obj.setCapacity(capacity);

        String location = sc.next();
        obj.setLocation(location);

        System.out.println(obj.getPrice() + " " + obj.getAge() + " " + obj.getCapacity() + " " + obj.getLocation());

        obj.calculateThirdPartyPremium();
        System.out.println(obj.getThirdPartyPremium());

        obj.CalculateComprehensivePremium(obj.getAge());
        System.out.println((int)Math.ceil(obj.getIDV()));
        System.out.println((int)Math.ceil(obj.getODP()));
        System.out.println((int)Math.ceil(obj.getNCB()));
        System.out.println((int)Math.ceil(obj.getFinalComprehPrem()));

    }
}