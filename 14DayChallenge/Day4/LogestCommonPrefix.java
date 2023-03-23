//Aswin Solution

public class LogestCommonPrefix{
    public String solution(String[] str){
        if(str.length == 0) return "";
        String prefix = str[0];
        for(int i=1;i<str.length;i++){
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return ""; 
            }
        }
        return prefix;
    }

    public static void main(String[] args){
        LogestCommonPrefix obj = new LogestCommonPrefix();
        String[] str = {"flower","flow","flight"};
        System.out.println(obj.solution(str));
    }
}