import java.util.Scanner;
import java.util.HashMap;

class Student {
   public String name;
   public int rollno;
   public int age;
    public int marks;

    public  Student(String Name, int rollNo, int Age, int Marks) {
        this.name = Name;
        this.rollno = rollNo;
        this.age = Age;
        this.marks = Marks;
    }
    public void view(){
        System.out.println("Name :" + name);
        System.out.println("rollno." + rollno);
        System.out.println("Age :" + age);
        System.out.println("Marks :"+ marks);
    }

}

 public class StudentDataBase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        while (true) {
            System.out.println("1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Search Students");
            System.out.println("Average mark calculator");
            System.out.println("5.Exit");
            System.out.print("Enter your Choice :");
            int n= sc.nextInt();
            switch (n){
                case 1: 
                System.out.print("Enter Name:");
                String name = sc.next();
                System.out.print("Enter Roll No.:");
                int rollNo = sc.nextInt();
                System.out.print("Enter Age:");
                int age = sc.nextInt();
                System.out.print("Enter Marks:");
                int marks= sc.nextInt();

                Student temp= new Student(name,rollNo,age,marks );
                map.put(rollNo,temp);
                break;

                case 2: 
                for(Student i:map.values()){
                    i.view();
                    System.out.println("================================================================");
                }
                break;

                case 3 :
                System.out.print("Enter Your Roll No. : ");
                int m= sc.nextInt();
                map.get(m).view();
                break;

                case 4 : 
                int totalstd= map.size();
                int totalMarks= 0;
                for(Student i: map.values()){
                    totalMarks=totalMarks+i.marks;
                }
                System.out.println("Average Marks :"+ totalMarks/totalstd);
                break;

                case 5: 
                System.exit(0);
                break;


                


            }

        }
    }

}