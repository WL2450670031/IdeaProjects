package Test01;

public class Main
{
    public static void main(String[] args)
    {
        Lambda1 lambda1 = new yoshi();
        lambda1.lambda();

        lambda1 = new yoshi1();
        lambda1.lambda();

        class yoshi implements Lambda1  //局部内部类
        {
            public void lambda()
            {
                System.out.println("lambda,哟西哟西,2");
            }
        }
        lambda1 = new yoshi();
        lambda1.lambda();

        //匿名内部类,没有名称，不许借助接口或者父类。
        lambda1 = new Lambda1()
        {
            public void lambda()
            {
                System.out.println("lambda,哟西哟西,3");
            }
        };
        lambda1.lambda();

        //用lambda简化
        lambda1 = () ->//因为该接口是函数式接口，只有一个方法，所有可以用lambda表达式。
        {
            System.out.println("lambda，哟西哟西,4");
        };
        lambda1.lambda();
    }

    static class yoshi1 implements Lambda1   //静态内部类
    {
        public void lambda()
        {
            System.out.println("lambda,哟西哟西,1");
        }
    }
}
