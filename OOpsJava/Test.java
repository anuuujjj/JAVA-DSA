package OOpsJava;

public class Test {
    public static void main(String[] args) {

        encapsulation.Student A =
                new encapsulation.Student(1, 23, "Rahul", 3, "Tina");

        encapsulation.Student B =
                new encapsulation.Student(A);

        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.nos);

        System.out.println(B.Getname()); // ERROR

        B.sleep();
    }
}