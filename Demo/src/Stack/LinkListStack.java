package Stack;

public class LinkListStack {
    static String s="-";
    public static void main(String[] args)
    {
        new LinkListStack().s1();
        System.out.println(s);
    }
    void s1()
    {
        try {s2();}
        catch(Exception e){s+="c";}
    }

    void s2() throws Exception
    {
        s3();
        s+="2";
        s3();
        s+="3";
    }
    void s3() throws Exception
    {
        throw new Exception();
    }
}
