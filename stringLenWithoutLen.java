public class stringLenWithoutLen {

    static void LengthStr(String s){
        int count=0;
String[] str = s.split("");
for(String ss:str){
    count++;
}
System.out.println(count);
    }


    static void main(){
        String s="Anuj kumar";
        LengthStr(s);
    
}
}