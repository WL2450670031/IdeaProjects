package binarysystem;

import java.util.Arrays;
/*
��1000ƿ�ƣ�������һ��ƿ���ƺ���1����������10ֻ����һ���ҳ���ƿ���ơ�
����
�ѾƵı�Ż�Ϊ������������λΪ1�ĸ�10������ȣ�ʮλΪ1�ĸ�9������ȣ��Դ����ơ�
Ȼ��������������״̬�õ������Ƶı��룬ȷ�����Ʊ��
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

        for(int i=0;i<WINE_NUMBER;i++) //��һǧƿ�Ʊ��
            wine[i]=new Wine(i,true);
        for(int i=0;i<MOUSE_NUMBER;i++)//��������
            mouse[i]=new Mouse(i,true);

        int x=(int)(Math.random()*WINE_NUMBER);
        wine[x].setLifeOrdie(false);//���붾��
        System.out.println("³Ѹ˵:��"+x+"ƿ���ж�");

        for(int j=0;j<10;j++)//�����Ƶ�j+1λΪ1�ľ�
        {
            for (int i = 0; i < WINE_NUMBER; i++)
            {//�ѱ�ű�Ϊ�����ƣ������ظ�����jλ��ֵ,0����1.
                if(toBinaryArray(i, j)==1)//�Ѷ�����j+1λΪ1�ľƸ�j+1������ȣ��Դ�����.
                    if(!wine[i].getLifeOrdie())
                        mouse[9-j].setLife(wine[i].getLifeOrdie());
                    //������Ⱦ�,wine[i].getLifeOrdie��Ϊfalse����ᶾ������.
            }
        }
        //ÿƿ�ƶ��ж����Ʊ��룬���˺����������������ֶ��ƶ����Ʊ����ڶ�Ӧ��λ�и�1��û�����ֶ�ӦλΪ0��
        for(int i=0;i<MOUSE_NUMBER;i++) //���������1�����������0��
        {
            if(mouse[i].getLife())
                mouseLifeOrDie[i]=0;
            else
                mouseLifeOrDie[i]=1;
        }

        int number=0;
        for(int i=0;i<10;i++)//������������Ϊʮ������.
        {
            if (mouseLifeOrDie[i] != 0)
                number += Math.pow(2, 9 - i);
        }

        System.out.println("����״̬:");
        for(int i=0;i<10;i++)
        {
            System.out.print(mouse[i]);
        }
        System.out.println("\n��������:"+Arrays.toString(mouseLifeOrDie));
        System.out.println("��������ֻ��һ����");
        System.out.println("��"+number+"ƿ���ж���");
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