import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int min = 0;
        int max = 0;
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            min = A[i];
            max = B[(B.length-1) - i];
            sum += min * max;
        }
        return sum;
    }
}