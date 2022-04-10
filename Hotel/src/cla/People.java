package cla;

public class People
{
    private String name;//名字
    private int year;//年龄
    private String xingbie;//性别
    private String post;//职位
    public People(String name,int year,String xingbie,String post)
    {
        this.name=name;
        this.year=year;
        this.xingbie=xingbie;
        this.post=post;
    }
    public String toString()//重写
    {
        return "{姓名:"+name+" 年龄:"+year+" 性别:"+xingbie+" 职位:"+post+"}";
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public String getXingbie() {
        return xingbie;
    }
    public String getPost() {
        return post;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }
    public void setPost(String post) {
        this.post = post;
    }
}