package cla;

public class People
{
    private String name;//����
    private int year;//����
    private String xingbie;//�Ա�
    private String post;//ְλ
    public People(String name,int year,String xingbie,String post)
    {
        this.name=name;
        this.year=year;
        this.xingbie=xingbie;
        this.post=post;
    }
    public String toString()//��д
    {
        return "{����:"+name+" ����:"+year+" �Ա�:"+xingbie+" ְλ:"+post+"}";
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