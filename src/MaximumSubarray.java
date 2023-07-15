import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int array[] = new int[A];
        for(int i=0;i<A;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(calculateSubarray(array,A,B));
    }
    public static int calculateSubarray(int array[],int A,int B)
    {
        int max = 0;
        for(int i=0;i<A;i++)
        {
            int sum = 0;
            for(int j=i;j<A;j++)
            {
                sum+=array[j];
                if(sum>max && sum<=B)
                {
                    max = sum;
                }

            }
        }
        return max;
    }
}
//You are given an integer array C of size A.
// Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum. But the sum must not exceed B.
//Input
//A = 5
//B = 12
//C = [2, 1, 3, 4, 5]
//Output
//12