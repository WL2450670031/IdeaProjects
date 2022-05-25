package 多个线程操作同一个对象;

public class Main
{
    public static void main(String[] args)
    {
        Test test = new Test();

        new Thread(test,"吴乐").start();
        new Thread(test,"张三").start();
        new Thread(test,"老师").start();
    }

}
