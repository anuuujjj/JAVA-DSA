public class GcD {
        static int gcd1(int a,int b){

            while(b!=0){
               int temp=b;
               b=a%b;
               a=temp;
            }
            return a;
    }



    // //TO find Lcm

    static int lcm(int a , int b ){
        int gcd=gcd1(a,b);
        int product= a*b;
        //since lcm + Hcf(gcd)= a*b
        // therefore lcm= a*b/gcd
        int lcm= product/gcd;
        return lcm;
    }
public static void main(String[] args){


    System.out.println(gcd1(12,18));

    System.out.println("Lcm: "+lcm(12,18));
 
}
}