package cla;

import java.util.Scanner;

public class Peoples
        /*this.name=name;
        this.year=year;
        this.xingbie=xingbie;
        this.post=post;*/
{
    Scanner scn= new Scanner(System.in);
    private final People[] people=new People[10];
    private int i=0;//职员个数
    public Peoples() {}
    public int input()
    {
        System.out.print("\n姓名:");
        String name=scn.next();
        System.out.print("年龄:");
        int year=scn.nextInt();
        System.out.print("性别:");
        String xingbie=scn.next();
        System.out.print("职位:");
        String post=scn.next();
        people[i]=new People(name,year,xingbie,post);
        i++;
        return i;
    }
    public void print(int i)
    {
        if(i>0)
        {
            for(int k=0;k<=i-1;k++) {
                People peo = people[k];
                System.out.println(peo);
            }
        }
        else
            System.out.println("null");
    }
}