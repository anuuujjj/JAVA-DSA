public class PerfectNo {
    static void perfectNumber(float n){
float sum=0;
float temp=n;
        for(float i=1;(i*i)<=n;i++){
            if(n%i==0){

                sum+=i;
                float quotient=n/i;
                if(quotient!=n){
                sum+=quotient;}

            }
        }
        // System.out.println(sum==temp + sum + temp);
        if(sum==temp){
            System.out.println("True"+sum);
        }
        else{
            System.out.println("False"+sum);
        }

        }

        public static void main(String[] args) {
            perfectNumber(6);
        }
    }

