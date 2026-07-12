import java.util.Scanner;

public class countVovelsInString {

    static void countVovels(String s){
        String[] ss=s.split("");
        int count=0;
        for(String str:ss){
            // String sss= ss.charAt(ss);
            if(str.equalsIgnoreCase("a") || str.equalsIgnoreCase("e") ||str.equalsIgnoreCase("i") ||str.equalsIgnoreCase("o" )||str.equalsIgnoreCase("u")){
                count++;
            }
            
        }
        System.out.println(count);
    }


    static void main(){
        Scanner sc= new Scanner(System.in);
String s=sc.nextLine();
sc.close();
countVovels(s);


    }
    
}
