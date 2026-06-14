// day 3


import java.util.Scanner;

public class patterns {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        // for(int i=1;i<n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("* ");
        //     } System.out.println();
        // }



        // Scanner ac= new Scanner(System.in);
        // int a = ac.nextInt();

        // for(int i=1;i<a;i++){
        //     for(int j=1;j<=a;j++){

        //     if(i==1 || j==1 || i==a-1 || j==a){
        //         System.out.print("* ");
        //     }
        //     else{
        //         System.out.print("  ");
        //     }

            
        //     } System.out.println();
        // }




        // Scanner sc= new Scanner(System.in);
        // int n = sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j );
        //     } System.out.println();
        // }




        // Scanner bc= new Scanner(System.in);
        // int n = bc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-(i);j++){
                System.out.print("  ");
                
                
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");}
            System.out.println();
        }

        //    for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-(i);j++){
        //         System.out.print("  ");
                
                
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

// int a=1;
        // for(int i=1;i<=n;i++){
        //       a=(a+(i-1));
        //     int b=1;
        //     for(int j=a;b<=i;j++){
             
        //         System.out.print(j+" ");
                
        //         b++;
        //     }
           
        //     System.out.println();
        // }
//FLOIDS TRIANGLE
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(a+" ");
        //         a++;
        //     }
        //     System.out.println();
        // }

//            for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
// if((i+j)%2==0){
//                 System.out.print("1 ");
                
//   } 
// else{
//     System.out.print("0 ");
// } }
//             System.out.println();
//         }
  sc.close();  }
    }

