public class CarInsurance{
    private int price =0;
    private int age =0;
    private int capacity =0;
    private String location = "";

    private double IDV;
    private double ODP;
    private double NCB;



    int thirdPartyPremium = 0;
    double depreciationPercentage = 0;
    double percent = 0;
    int pac = 100;
    double finalComprehensivePremium = 0;

    public CarInsurance(int price, int age, int capacity, String location){
        this.price = price;
        this.age = age;
        this.capacity = capacity;
        this.location = location;
    }

    public CarInsurance(){
        //default constructor
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    public double  getThirdPartyPremium(){
        return thirdPartyPremium;
    }

    public double getIDV(){
        return IDV;
    }

    public double getODP(){
        return ODP;
    }

    public double getNCB(){
        return NCB;
    }

    public double getFinalComprehPrem(){
        return finalComprehensivePremium;
    }

    //method 1
    public void calculateThirdPartyPremium(){
        if(capacity < 1000){
            thirdPartyPremium = 2182;
        }else if(capacity >= 1000 && capacity <= 1500){
            thirdPartyPremium = 3383;
        }else if(capacity > 1500){
            thirdPartyPremium = 7890;
        }
    }

    //method 2
    public void CalculateComprehensivePremium(int age){
        if(age == 1){
            depreciationPercentage = 20;
        }else if(age == 2){
            depreciationPercentage = 30;
        }else if(age == 3){
            depreciationPercentage = 40;
        }else if(age == 4){
            depreciationPercentage = 50;
        }else if(age >= 5){
            depreciationPercentage = 0;
        }

        double dcPrice = (depreciationPercentage * price)/100;

        IDV = price - dcPrice;

        if(age <= 3){
            percent =  3.127;
        }else if(age > 3){
            percent =  3.283;
        }

        ODP = (percent * IDV)/100;

        NCB = (25 * ODP)/100;

        finalComprehensivePremium = NCB + pac;
        
    }

}