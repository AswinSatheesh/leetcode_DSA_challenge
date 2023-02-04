import java.util.HashMap;
import java.util.Map;
public class HashmapTwoSum{
    public int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> hx = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            int compliment = target - arr[i];
            if(hx.containsKey(compliment)){
                return new int[] {hx.get(compliment),i}; //get(compliment) - means it will get the compliment value that is its index.
            }
            hx.put(arr[i],i);
        }
        return null;
    }
    public static void main(String[] args){
        int[] arr = {2,6,7,10};
        int target = 12;
        HashmapTwoSum obj = new HashmapTwoSum();
        int[] result = obj.twoSum(arr,target);
        System.out.println("Indices : " + result[0] + ", " + result[1]);
    }
}