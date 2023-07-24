import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    static void denomination(int[] arr, int n,int amount)
    {
        int sum=0;
        int range=n-1;
        Arrays.sort(arr);
        int count=0;
        while(sum!=amount && range>=0)
        {
            if(sum+arr[range]<=amount)
            {
                sum=sum+arr[range];
                count++;
            }
            else
            {
                range=range-1;
            }
        }
        if(sum==amount)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println(-1);
        }


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int amount=scanner.nextInt();
        denomination(arr,n,amount);
    }
}
