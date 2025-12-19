import java.util.Scanner;

class Student{
     String usn;
     String name;
     int[] credits;
     int[] marks;
     int n; 


     void accept(){
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter USN : ");
        this.usn = inp.nextLine();

        System.out.print("Enter Name : ");
        this.name = inp.nextLine();

        System.out.print("Enter number of subjects : ");
        this.n = inp.nextInt();

        credits = new int[n];
        marks = new int[n];

        for(int i = 0 ; i< n ; i++){
            System.out.print("Enter Credits for subject " + (i+1) + " : ");
            credits[i] = inp.nextInt();

            System.out.print("Enter marks for subject " + (i+1) + " : ");
            marks[i] = inp.nextInt();

        }
        inp.close();
     }

     void display(){
        System.out.println("USN : " + usn);
        System.out.println("Name : " + name);
        System.out.printf("SGPA : %.2f\n", calcSGPA());

     }

     double calcSGPA(){
        int totalcredits = 0;
        int weightedsum = 0;
        for(int i=0 ; i<n ; i++){
            int gradepoint = marks[i]/10;
            weightedsum += gradepoint * credits[i];
            totalcredits += credits[i];
        }
        return (double) weightedsum/totalcredits ;
     }
}

public class Lab2{
    public static void main(String[] args) {
        Student s = new Student();
        s.accept();
        s.display();
    }
}