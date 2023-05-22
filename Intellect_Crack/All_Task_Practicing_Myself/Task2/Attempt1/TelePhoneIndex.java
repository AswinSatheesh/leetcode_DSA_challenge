public class TelePhoneIndex{
    private String name ="";
    private String phoneNumber = "";

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public boolean MyFunction(String findName){
        if(name.startsWith(findName)){
            return true;
        }
        return false;
    }
}