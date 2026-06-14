public class algebraicPattern {
    public static void main(String[] args) {
        // int n=5;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //        int a=n-j;
        //        int b='A';
        //        int c=a+b;
        //         System.out.print((char)c+" ");
        //     }
        //     System.out.println();
        // }




        //Pattern 2

        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){

                int a= 'A';
                int b=j-1;
                int c=a+b;
                
                System.out.print((char)c+" ");
                a++;
            }
            for(int j=1;j<=i-1;j++){
                int a= 'A';
                int b=i-j-1;
                int c=a+b;
            
                System.out.print((char)c+" ");
            }
            System.out.println();
        }
        


        
    }

}



