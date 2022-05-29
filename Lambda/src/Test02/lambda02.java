package Test02;

public class lambda02
{
    public static void main(String[] args)
    {
//        Love love = new ILove();
//        love.love("爸爸，妈妈");
//
//        Love love1 = (String a) ->
//        {
//            System.out.println(a + ",我爱你们!");
//        };
//        love1.love("爸爸，妈妈");

        //简化1：去掉参数类型
        Love love2 = (a)->
        {
            System.out.println(a + ",我爱你们!");
        };
        love2.love("爸爸，妈妈");

        //简化2：去掉小括号(只有一个参数)
        Love love3 = a->
        {
            System.out.println(a + ",我爱你们!");
        };
        love3.love("爸爸，妈妈");

        //简化3：去掉大括号（代码只有一行）
        Love love4 = a-> System.out.println(a + ",我爱你们!");

    }

}

class ILove implements Love
{
    public void love(String a)
    {
        System.out.println(a + ",我爱你们!");
    }
}