public class Hourglass{
     public static int hourglassSum(List<List<Integer>> arr){
        int maxSum = Integer.MIN_VALUE;
        int numRows = arr.size();
        int numCols = arr.get(0).size();
        for(int i=1;i<numRows-1;i++){
            for(int j=1;j<numCols-1;j++){
                int sum = arr.get(i).get(j)+
                arr.get(i-1).get(j-1) + arr.get(i-1).get(j) + arr.get(i-1).get(j+1) +
                arr.get(i+1).get(j-1) + arr.get(i+1).get(j) + arr.get(i+1).get(j+1);

                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        List<List<Integer>>arr= new ArrayList<>();
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(0,1,0,0,0,0));
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(0,0,2,4,4,0));
        arr.add(Arrays.asList(0,0,0,2,0,0));
        arr.add(Arrays.asList(0,0,1,2,4,0));
        int maxSum = hourglassSum(arr);
        System.out.println(maxSum);
    }
}