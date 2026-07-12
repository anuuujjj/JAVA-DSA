public class ArmstrongNo {
    static void arm(int n){

        int cubeSum=0;
        int temp=n;
        while(n!=0){

            int digit=n%10;
            cubeSum+=(digit*digit*digit);
            n=n/10;

        }
        if(temp==cubeSum){
            System.out.println("Yes, it is an armstrong number.");
        }
        else{
            System.out.println("Not an armstrong number.");
        }
    }

    public static void main(String[] args) {
        arm(371);
    }
    
}
