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
    private int i=0;//ְԱ����
    public Peoples() {}
    public int input()
    {
        System.out.print("\n����:");
        String name=scn.next();
        System.out.print("����:");
        int year=scn.nextInt();
        System.out.print("�Ա�:");
        String xingbie=scn.next();
        System.out.print("ְλ:");
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