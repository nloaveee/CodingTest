import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
   

        for (int i = 0; i < N; i++) {
            A[i]=scanner.nextInt();
        }
        long sum =0;
        long max=0;
        
        for (int i = 0; i < N; i++) {
            if(A[i]>max) max=A[i];
            sum+=A[i];
        }
        double avg=(double) sum*100/max/N;
        System.out.println(avg);
    }
}
