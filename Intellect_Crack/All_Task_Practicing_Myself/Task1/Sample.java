public class Sample{
    public static void main(String[] args){
        int depreciationPercentage = 40;
        int price = 416000;
        int dcPrice = (depreciationPercentage * price)/100;
        System.out.println(dcPrice);
    }
}