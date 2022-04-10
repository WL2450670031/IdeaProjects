package binarysystem;

import java.util.Arrays;
/*
有1000瓶酒，里面有一屏瓶毒酒喝了1天后就死，用10只老鼠一天找出这瓶毒酒。
方法
把酒的编号化为二进制数，个位为1的给10号老鼠喝，十位为1的给9号老鼠喝，以此类推。
然后根据老鼠的死活状态得到二进制的编码，确定毒酒编号
 */
public class RatsWine
{
    static final int WINE_NUMBER = 1000;
    static final int MOUSE_NUMBER = 10;

    public static void main(String[] args)
    {
        Wine[] wine = new Wine[WINE_NUMBER];
        Mouse[] mouse = new Mouse[MOUSE_NUMBER];
        int[] mouseLifeOrDie=new int[10];

        for(int i=0;i<WINE_NUMBER;i++) //给一千瓶酒编号
            wine[i]=new Wine(i,true);
        for(int i=0;i<MOUSE_NUMBER;i++)//给老鼠编号
            mouse[i]=new Mouse(i,true);

        int x=(int)(Math.random()*WINE_NUMBER);
        wine[x].setLifeOrdie(false);//放入毒酒
        System.out.println("鲁迅说:第"+x+"瓶酒有毒");

        for(int j=0;j<10;j++)//二进制第j+1位为1的酒
        {
            for (int i = 0; i < WINE_NUMBER; i++)
            {//把编号变为二进制，并返回该数第j位的值,0或者1.
                if(toBinaryArray(i, j)==1)//把二进制j+1位为1的酒给j+1号老鼠喝，以此类推.
                    if(!wine[i].getLifeOrdie())
                        mouse[9-j].setLife(wine[i].getLifeOrdie());
                    //给老鼠喝酒,wine[i].getLifeOrdie若为false，则会毒死老鼠.
            }
        }
        //每瓶酒都有二进制编码，喝了后，老鼠死，可以体现毒酒二进制编码在对应的位有个1，没死体现对应位为0；
        for(int i=0;i<MOUSE_NUMBER;i++) //死老鼠代表1，活老鼠代表0。
        {
            if(mouse[i].getLife())
                mouseLifeOrDie[i]=0;
            else
                mouseLifeOrDie[i]=1;
        }

        int number=0;
        for(int i=0;i<10;i++)//将二进制数化为十进制数.
        {
            if (mouseLifeOrDie[i] != 0)
                number += Math.pow(2, 9 - i);
        }

        System.out.println("老鼠状态:");
        for(int i=0;i<10;i++)
        {
            System.out.print(mouse[i]);
        }
        System.out.println("\n二进制码:"+Arrays.toString(mouseLifeOrDie));
        System.out.println("所以真相只有一个！");
        System.out.println("第"+number+"瓶酒有毒！");
    }

    public static int toBinaryArray(int num,int j)
    {
        int x=1;
        int[] binary=new int[10];
        for(int i=0;i<10;i++)
        {
            if(((num>>i)&x)==1)
                binary[9-i]=1;
            else if(((num>>i)&x)==0)
                binary[9-i]=0;
        }
        return binary[9-j];
    }
}