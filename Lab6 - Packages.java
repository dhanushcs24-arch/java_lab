import java.util.*;
import CIE.*;
import SEE.*;

class FinalMarks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Personal p[] = new Personal[n];
        Internals in[] = new Internals[n];
        External ex[] = new External[n];

        for(int i=0;i<n;i++){
            String usn = sc.next();
            String name = sc.next();
            int sem = sc.nextInt();

            int ci[] = new int[5];
            for(int j=0;j<5;j++) ci[j] = sc.nextInt();

            int se[] = new int[5];
            for(int j=0;j<5;j++) se[j] = sc.nextInt();

            p[i] = new Personal(usn,name,sem);
            in[i] = new Internals(ci);
            ex[i] = new External(usn,name,sem,se);
        }

        for(int i=0;i<n;i++){
            System.out.println(p[i].usn+" "+p[i].name+" "+p[i].sem);
            for(int j=0;j<5;j++){
                int finalMarks = in[i].internal[j] + ex[i].see[j];
                System.out.print(finalMarks+" ");
            }
            System.out.println();
        }
    }
}
