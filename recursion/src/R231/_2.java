package R231;
/*
给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
如果存在一个整数 x 使得 n = 2^x ，则认为 n 是 2 的幂次方。
*/
public class _2
{
    public boolean ofTwo(int n)
    {
        if(n == 1)//在不断地递归中，如果n是2的幂次方，不断除以2,最终结果是1.
        {
            return true;
        }
        if(n % 2 == 1)//发生以下结果则不是2的幂次方。
        {
            return false;
        }
        if(n < 1)
        {
            return false;
        }

        return ofTwo(n/2);
    }

}
