import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.println("Find roots of Quadratic Equation of the form (ax^2 + bx + c = 0) :- ");

        System.out.print("Enter co-eff a : ");
        int a = inp.nextInt();

        System.out.print("Enter co-eff b : ");
        int b = inp.nextInt();

        System.out.print("Enter co-eff c : ");
        int c = inp.nextInt();

        double dis = b*b - (4*a*c) ;

        if(a==0 && b==0 ){
            System.out.println("Invalid Input");
        }else if(dis>0){
            double r1 = (-b + Math.sqrt(dis))/(2*a);
            double r2 = (-b - Math.sqrt(dis))/(2*a);
            System.out.printf("The roots are real and distinct . \n Root 1 : %f \n Root 2 : %f", r1 ,r2);
        }else if (dis==0){
            double r = -b / (2*a);
            System.out.printf("The roots are real and equal : \n Root : %f" , r);
        }else{
            System.out.print("No real solutions (Discriminant < 0)");
            double realPart = -b / (2.0*a);
            double imagPart = Math.sqrt(-dis) / (2.0*a);
            System.out.printf("\nThe roots are imaginary and complex conjugates:\nRoot 1 : %f + %fi\nRoot 2 : %f - %fi",
                              realPart, imagPart, realPart, imagPart);
        }
        inp.close();
    }
    
}
