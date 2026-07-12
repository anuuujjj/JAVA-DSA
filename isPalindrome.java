public class isPalindrome {

    
    static void checkPalindrome(String s){
        String r="";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            r+= s.charAt(i);
        }
        
        
        
         System.out.println(s.equals(r));
        // if(s.equalsIgnoreCase(r)){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }
    }

    static void main(){
        String a="naman";
        checkPalindrome(a);
    }
    
}
