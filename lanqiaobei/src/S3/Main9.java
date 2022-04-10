package S3;
import java.util.Scanner;
import java.util.Random;
public class Main9
{
    public static int quickSelect(int a[], int l, int r, int k) {
        Random rand = new Random();
        int p = rand.nextInt(r - l + 1) + l;
        int x = a[p];
        int tmp = a[p]; a[p] = a[r]; a[r] = tmp;
        int i = l, j = r;
        while(i < j) {
            while(i < j && a[i] < x) i++;
            if(i < j) {
                a[j] = a[i];
                j--;
            }
            while(i < j && a[j] > x) j--;
            if(i < j) {
                a[i] = a[j];
                i++;
            }
        }
        a[i] = x;
        p = i;
        if(i - l + 1 == k) return a[i];
 //       if(i - l + 1 < k) return quickSelect( ); //МоїХ
        else return quickSelect(a, l, i - 1, k);
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[]=new int[110];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println(quickSelect(a, 0, n-1, 5));
    }
}
