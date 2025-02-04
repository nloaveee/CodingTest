import java.util.*;

public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String str = scanner.next();
    String[] num = str.split("");
    int[] numArr = new int[num.length];

    for (int i = 0; i < num.length; i++) {
        numArr[i] = Integer.parseInt(num[i]);
    }

    Arrays.sort(numArr);

    for (int i = numArr.length - 1; i>=0; i--) {
        System.out.print(numArr[i]);
    }
    }
}
