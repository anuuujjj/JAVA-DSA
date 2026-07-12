public class ReverseString {
    static void reverse(String s){
        int n=s.length();
        // String[] arr=s.split("");
        // String str ="";
        // for(int i=n-1;i>=0;i--){
        //    str += arr[i];

        // }

       //  String[] arr=s.split("");
        String str ="";
        for(int i=n-1;i>=0;i--){
           str += s.charAt(i);

        }
System.out.println(str);
    }


    static void main(){
        String a="Anuj";
        reverse(a);
    }
    
}
