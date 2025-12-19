package SEE;
import CIE.Personal;

public class External extends Personal {
    public int[] see = new int[5];
    public External(String u, String n, int s, int a[]) {
        super(u,n,s);
        for(int i=0;i<5;i++) see[i] = a[i];
    }
}
