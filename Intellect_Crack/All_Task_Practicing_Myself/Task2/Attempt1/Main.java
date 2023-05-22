import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Contacts to be stored: ");
        int N = Integer.parseInt(sc.nextLine());
        // int N = sc.nextInt();
        TelePhoneIndex[] ArrayObjects = new TelePhoneIndex[N];

        // String name, number;
        System.out.println("Contact Details:");
        for(int i=0; i<N; i++){
            String name = sc.nextLine();
            String number = sc.nextLine();

            ArrayObjects[i] = new TelePhoneIndex();

            ArrayObjects[i].setName(name);
            ArrayObjects[i].setPhoneNumber(number);
        }

        System.out.println("Enter the string to be searched:");
        String checkString = sc.nextLine();

        for(int j =0; j<N; j++){
            if(ArrayObjects[j].MyFunction(checkString)){
                System.out.println(ArrayObjects[j].getName() + "" + ArrayObjects[j].getPhoneNumber());
            }
        }

    }
}