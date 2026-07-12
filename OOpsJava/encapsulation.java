package OOpsJava;

public class encapsulation {

public static class Student{
    public int id;
    public int age;
    public String name;
    public int nos;
    private String GfName;

    public  Student(int id, int age,String name,int nos,String GfName){
        this.id=id; 
        this.age=age;
        this.name=name;
        this.nos=nos;
        this.GfName=GfName;
    }
    //COpy ctor
    public Student(Student srcobj){
        System.out.println("Student copy ctor called");
        this.id= srcobj.id;
        this.age= srcobj.age;
        this.name=srcobj.name;
        this.nos = srcobj.nos;
       this.GfName = srcobj.GfName;
    }

    public String Getname(){
        return this.GfName;
    }
    


    //methods . Behaviours
    public void study(){
        System.out.println(name+" studying");
    }
     public void sleep(){
        System.out.println(name+" sleepijng");
    }
     public void bunk(){
        System.out.println(name+" bunking");

    }

}



  public void main(String[] args) {
    Student A= new Student(1,23,"Rahul",3,"Tina");

    Student B= new Student(A); 
    System.out.println(B.name);
    System.out.println(B.age);
    System.out.println(B.id);
    System.out.println(B.nos);
    System.out.println(B.GfName);
    B.sleep();
  }
}