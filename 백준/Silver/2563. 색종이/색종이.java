import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        boolean[][] paper = new boolean[101][101];
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int total = 0;

        for (int i = 0; i<N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for (int j = x; j < x+10; j++) {
                for (int z = y; z < y+10; z++) {
                    if (!paper[j][z]) {
                        paper[j][z] = true;
                        total++;
                    }
                }
            }
        }

        System.out.println(total);
    }

}