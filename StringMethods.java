public class StringMethods {
    static void printEachChar(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            
            System.out.println(s.charAt(i));
        }

    }
    static void main(){

        String s ="ANuj";
        printEachChar(s);
    // String input ="Anuj";
    //  char[] ann= input.toCharArray();

    //  for(char ch: ann){
    //     System.out.println(ch);
    //  }
// String name="My,name,is,Anuj.";
// String[] words = name.split(",");
// for(String s:words){
// System.out.println(s);

// }


//Replace old char to new char######################//#endregion

// String name= "Anujm";
// name= name.replace('m','j');
// System.out.println(name);

}
}