public class Child1 extends MyMain{
    @Override
    public void myFun(){
        // System.out.println("Im child function");
        super.myFun();
    }
    public static void main(String[] args){
        MyMain obj = new Child1();
        obj.myFun();
    }
}