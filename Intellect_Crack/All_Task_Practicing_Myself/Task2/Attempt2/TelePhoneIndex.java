public class TelePhoneIndex{
    private String name;
    private String number;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPhoneNumber(String number){
        this.number = number;
    }

    public String getPhoneNumber(){
        return number;
    }

    public boolean findName(String inputName){
        if(name.startsWith(inputName)){
            return true;
        }else{
            return false;
        }
    }

}