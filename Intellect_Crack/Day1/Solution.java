import java.util.*;

public class Solution {

    public static int sockMerchant(int n,List<Integer>ar){
        int ans =0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i <n; i++){
            if(!hs.contains(ar.get(i))){
                hs.add(ar.get(i));
            }else{
                hs.remove(ar.get(i));
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n = scanner.nextInt();
        List<Integer> ar = new ArrayList<>();
        System.out.println("Enter the values: ");
        for (int i = 0; i < n; i++) {
            ar.add(scanner.nextInt());
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
        scanner.close();
    }
}