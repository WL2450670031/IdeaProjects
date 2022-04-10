package S3;
//吴乐 汉江师范学院 2022.3.3
/*
汉字的字形存在于字库中，即便在今天16 点阵的字库也仍然使用广泛。
16 点阵的字库把每个汉字看成是 16×16 个像素信息。并把这些信息记录在字节中。
一个字节可以存储 8 位信息，用 32 个字节就可以存一个汉字的字形了。
把每个字节转为 2 进制表示，1 表示墨迹，0 表示底色。每行 2 个字节，一共 16 行
 */
public class Main8
{
    public static void main(String[] args)
    {
        int[] data =
                {
                4,0,4,0, 4,0,4,32, -1,-16,4,32, 4,32,4,32, 4,32,4,32,8,
                32,8,32,16, 34,16,34,32, 30,-64,0,16, 64,16,64,34, 68,127,126,66,
                -124,67,4,66, 4,66,-124,126, 100,66,36,66, 4,66,4,66, 4,126,4,66,
                40,0,16,4, 0,4,0,4, 0,4,32,-1, -16,4,32,4, 32,4,32,4, 32,4,32,8,
                32,8,32,16, 34,16,34,32, 30,-64,0,0, -128,64, -128, 48,-128,17,8,
                1,-4,2,8,8, 80,16,64,32,64,-32,64,32,-96,32, -96,33,16,34,8,36,14,
                40,4,4, 0,3,0,1,0,0,4,-1,-2,4, 0,4,16,7,-8,4,16,4,16,4, 16,8,16,
                8,16,16,16,32,-96,64, 64,16,64,20,72,62,-4,73,32,5, 16,1,0,63,-8,
                1,0,-1,-2,0, 64,0,80,63,-8,8,64,4,64,1,64,0,-128,0,16, 63,-8,1,0,
                1, 0,1,0,1,4,-1,-2,1,0,1, 0,1,0,1,0,1,0,1,0,1, 0,5,0,2,0, 2,0,2,0,7,
                -16,8,32,24,64,37,-128,2,-128,12, -128,113,-4,2,8,12, 16,18,32,33,
                -64,1,0,14,0,112,0,1,0,1, 0,1,0,9,32,9,16,17,12,17, 4,33,16,65, 16,
                1,32,1,64,0, -128,1,0,2,0,12,0,112,0,0, 0,0,0,7,-16,24,24,48,12,56,
                12,0,56,0,-32,0,-64,0,-128,0, 0,0,0,1,-128,3,-64,1,-128,0,0
                 };
        hanzi(data);
        System.out.println(Math.pow(9,9));
    }
    public static void hanzi(int[] a)
    {
        StringBuilder[] data = new StringBuilder[320];
        for(int i = 0;i < 320;i++)
        {
            data[i] = to8Binary(a[i]);
        }
        for(int i = 0;i < 320;i++)
        {
            for(int j = 0;j < 8;j++)
            {
                if (data[i].charAt(j) == '1') {
                    System.out.print('*');
                }
                else
                    System.out.print(" ");
            }
            if((i+1)%2==0)
                System.out.println();
            if((i+1)%32==0)
                System.out.println();
        }
    }

    public static StringBuilder to8Binary(int b)//返回参数的8位的二进制数
    {
        StringBuilder result = new StringBuilder();
        boolean minus = false;
        if(b < 0)
        {
            minus = true;
            b = Math.abs(b + 1);
        }
        do {
            StringBuilder remainder = new StringBuilder((!minus && b % 2 == 0) || (minus && b % 2 == 1) ? "0" : "1");
            result = remainder.append(result);
            b /= 2;
        } while (b != 0);
        if(!minus)
        {
            b = result.length();
            for(int i = 1;i <= 8-b;i++)
            {
                result = new StringBuilder("0").append(result);
            }
        }
        if(minus)
        {
            b = result.length();
            for(int i = 1;i <= 8-b;i++)
            {
                result = new StringBuilder("1").append(result);
            }
        }
        return result;
    }
}
