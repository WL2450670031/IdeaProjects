/*
吴乐 汉江师范学院 软件工程
begin    2022.1.29 18:10
happyend 2022.1.19
*/
public class M10
{
    static int[] a = {10,54,0,25,36,65994,45116,232,1,4455};
    static int[] b = new int[10];
    public static void main(String[] args)
    {
        mergeSort(a,0,9,b);
        for(int c:a)
            System.out.print(c+" ");
    }

    public static void mergeSort(int[] a,int m,int n,int[] temp)
    {
        if(m < n)
        {
            int p = m +(n-m)/2;
            mergeSort(a,m,p,temp);
            mergeSort(a,p+1,n,temp);
            merge(a,m,p,n,temp);
        }
    }

    public static void merge(int[] a,int m,int e,int n,int[] temp)
    {
        int p = 0;
        int p1 = m;
        int p2 = e + 1;
        while(p1<=e && p2<=n)
        {
            if(a[p1] < a[p2])
            {
                temp[p++] = a[p1++];
            }
            else
                temp[p++] = a[p2++];
        }
        while(p1 <= e)
        {
            temp[p++] = temp[p1++];
        }
        while(p2 <= n)
        {
            temp[p++] = temp[p2++];
        }
        for(int i = 0;i < n-m+1;i++)
        {
            a[m+i] = temp[i];
        }
    }
}
