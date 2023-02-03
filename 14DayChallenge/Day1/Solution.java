// normal method 

// public class TwoSum{
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4};
//         int target = 5;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]+arr[j] == target)
//                 {
//                     System.out.println("Index is : " + i + " "+ j);
//                 }
//             }
//             break;
//         }
       
//     }
// }

//------------------------------------------------------------------------------------------------------------------------

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 11, 15,7,3};
        int target = 90;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        for(int i=0; i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
        // System.out.println("Result: " + result[0] + ", " + result[1]);
    }
}
