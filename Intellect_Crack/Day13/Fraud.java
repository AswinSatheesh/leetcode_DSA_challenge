//Aswin's solution
import java.util.*;
public class Fraud{
    public int Solution(List<Integer> expenditure, int d){
        int len = expenditure.size();
        int k=0;
        int j = k + (d-1);
        int count =0; 

        while(j < len-1){
           
            List<Integer> temp = new ArrayList<>(d);
            for (int i = k; i <= j; i++) {
                temp.add(expenditure.get(i));
            }

            Collections.sort(temp);
            int median =0, mid =0;

            if(d % 2 != 0){
                mid = 0 + (d-1) /2; 
                median = temp.get(mid);
            }else{
                mid = 0 + (d-1) /2;
                median = (temp.get(mid) + temp.get(mid + 1)) / 2;
                if((temp.get(mid) + temp.get(mid + 1)) % 2 == 1){  // float numbers varumbo int akki less avum then * 2 cheyumbo 1 value kuravyum athu mattan - divide cheyumbo float vanal just add one with  median.
                    median++;
                }
            }

            int exp = expenditure.get(j + 1);
            if(exp >= (median * 2) ){
                count++;
                k++;
            }else{
                k++;
            }
            j++;
        }

        return count;

    }

    public static void main(String[] args){
        Fraud obj = new Fraud();
        List<Integer> expenditure = new ArrayList<>(9);
        expenditure.add(2);
        expenditure.add(3);
        expenditure.add(4);
        expenditure.add(2);
        expenditure.add(3);
        expenditure.add(6);
        expenditure.add(8);
        expenditure.add(4);
        expenditure.add(5);

        int d = 5;

        int result = obj.Solution(expenditure,d);

        System.out.println("Result : " + result);

    }
}