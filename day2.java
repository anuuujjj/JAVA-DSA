import java.util.*;



public class day2 {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
      /*sout + Tab--> */ System.out.println();



      String name = "Anuj";
      System.out.println(name);
      int age = 20;
      double weight = 59.9;
      weight = 60;

        double sum = age + weight;
        System.out.println(sum);

        double mul=age * weight;
        System.out.println(mul);

        System.out.print("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        System.out.println(name1);

        
        System.out.print("Enter your name:");
        Scanner sc1 = new Scanner(System.in);
        String name2 = sc1.nextLine();
        System.out.println(name2);

            //nextInt()    nextFloat()
            sc.close();
            sc1.close();
    }
}
