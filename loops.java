import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//         for(int i=1;i<=100;i++){
//             // for(int j=0;j<i;j++){
//             System.out.println(i);
//         // }
//     }

//    int j=1;
//    while(j<10){
//     System.out.println(j);
//     j++;
//    }







// int i =1;
// do{
//     System.out.println(i);
//     i++;
// }
// while(i<11);











System.out.println("Enter the number:");
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int summm=0;
for(int m=1;m<=n;m++){
 summm=summm+m;
}
System.out.print("Sum is: ");
System.out.println(summm);
sc.close();

// int m=1;
// int sum=0;
// while(m<=n){
//     sum=sum+m;
//     m++;
// }
// System.out.println(sum);


Scanner ac= new Scanner(System.in);
//int a= ac.nextInt();
System.out.println("Table: ");
for(int b=1;b<=10;b++){
    System.out.println(n*b);
}
ac.close();
}
}


 