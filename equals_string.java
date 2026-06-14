public class equals_string {
    void main(String[] args){
        String name="Anuj";
        String name2="anuj";

       

         if(name==name2)  System.out.println(true);
        else System.out.println(false);
        
        if(name.equals(name2))  System.out.println(true);
        else System.out.println(false);

           if(name.equalsIgnoreCase(name2))  System.out.println(true);
        else System.out.println(false);

    }
}
