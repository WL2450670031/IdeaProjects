package 静态代理;
//久旱逢甘露
//他乡遇故知
//洞房花烛夜
//金榜题名时
public class Main
{
    public static void main(String[] args)
    {
        My my = new My();
        Wed wed = new Wed(my);//婚庆公司就是代理，你给钱，然后负责结婚，其他事情交给婚庆公司，不需要自己干。
        wed.MarryLa();
    }

}


class My implements Marry//我
{
    public void MarryLa()
    {
        System.out.println("结婚啦！");
    }
}


class Wed implements Marry//代理
{
    private Marry target;

    public Wed(Marry target)
    {
        this.target = target;
    }
    @Override
    public void MarryLa()
    {
        after();
        this.target.MarryLa();
        before();
    }
    public void after()
    {
        System.out.println("布置婚礼");
    }
    private void before()
    {
        System.out.println("交房贷");
    }
}


