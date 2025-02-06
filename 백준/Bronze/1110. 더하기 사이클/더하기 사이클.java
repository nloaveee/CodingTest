import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int origin = scanner.nextInt();
        int next = origin;
        int count = 1;

        while(true) {
            int first, second;
            if (next < 10) {
                first = 0;
                second = next % 10;
            } else {
                first = next / 10;
                second = next % 10;
            }
            int sum = first + second;
            next  = (next%10*10) + (sum%10);
            if (next == origin) {
                break;
            }
            count++;
        }

        System.out.println(count);
    }
}
