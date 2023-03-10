public class CountingValley{
    public static int Solution(int steps, String path){
        int altitude =0,valleys =0;
        for(int i =0; i<steps; i++){
            char step = path.charAt(i);
            if(step == 'U'){
                altitude++;
                if(altitude == 0){
                    valleys++;
                }
            }else if(step == 'D'){
                altitude--;
            }
        }
        return valleys;
    }

    public static void main(String[] args){
        int steps =12;
        String path = "DDUUDDUDUUUD";
        int result = Solution(steps,path);
        System.out.println("Number of Valleys : " + result);
    }
}