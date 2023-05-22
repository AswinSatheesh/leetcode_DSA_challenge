import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        TelePhoneIndex[] myObjects = new TelePhoneIndex[N];

        System.out.println("Contact Details : ");
        for(int i=0; i<N; i++){
            String name = scanner.nextLine();
            String number = scanner.nextLine();

            myObjects[i] = new TelePhoneIndex();
            myObjects[i].setName(name);
            myObjects[i].setPhoneNumber(number);
        }

        System.out.println("Enter the string to be searched :");
        String search = scanner.nextLine();

        for(int i=0; i<N; i++){
            if(myObjects[i].findName(search)){
                System.out.println(myObjects[i].getName() + " " + myObjects[i].getPhoneNumber());
            }
        }
    }
}