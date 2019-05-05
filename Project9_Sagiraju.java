import java.util.Scanner;

//Create a Class
public class Project9_Sagiraju{
   
public static void main(String[] args) {
  Student stud1 = new Student();
   stud1.setName("Bob Stevens");
   stud1.setTest1(89);
   stud1.setTest2(92);
   stud1.setFinal(93);
   String n = stud1.getName();
   int t1 = stud1.getTest1();
   int t2 = stud1.getTest2();
   int finals = stud1.getFinal();
   double ave = stud1.getAverage();
   String s = stud1.toString(); 
   System.out.println("student1.getName() = " + n);
   System.out.println("student1.getTest1() = " + t1);
   System.out.println("student1.getTest2() = " + t2);
   System.out.println("student1.getFinal() = " + finals);
   System.out.println("student1.getAverage() = "+ ave);
   System.out.println(s); 
   System.out.println("");
   
   Student stud2 = new Student("James Kline");
   stud2.setGrades(75, 66, 89);
   s = stud2.toString(); 
   n = stud2.getName();
   ave = stud2.getAverage();
   System.out.println("student2.getName() = " + n);
   System.out.println("student2.getTest1() = " + t1);
   System.out.println("student2.getTest2() = " + t2);
   System.out.println("student2.getFinal() = " + finals);
   System.out.println("student2.getAverage() = "+ ave);
   System.out.println(s);
   System.out.println("");
   
    Student stud3 = new Student("Nancy Keen", 94, 97, 100);
    stud3.setTest();
    s = stud3.toString(); 
    n = stud3.getName();
    t1 = stud3.getTest1();
    t2 = stud3.getTest2();
    finals = stud3.getFinal();
    ave = stud3.getAverage();
    System.out.println("student3.getName() = " + n);
    System.out.println("student3.getTest1() = " + t1);
    System.out.println("student3.getTest2() = " + t2);
    System.out.println("student3.getFinal() = " + finals);
    System.out.println("student3.getAverage() = "+ ave);
    System.out.println(s);
    System.out.println("");
}}

