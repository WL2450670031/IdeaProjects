package Demo;

import java.util.Scanner;

public class StudentScore
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("������ѧ����:");
        final int STUDENT_NUM=scn.nextInt();//ѧ����
        System.out.print("������γ���:");
        final int COURSE_NUM=scn.nextInt();//�γ���
        String[] student=new String[STUDENT_NUM];//�洢ѧ������
        String[] course=new String[COURSE_NUM];//�洢�γ�����
        double[][] score=new double[STUDENT_NUM][COURSE_NUM];//�洢ѧ�����Ƴɼ�
        printNum(student,course,score,STUDENT_NUM,COURSE_NUM);
        run(student,course,score);
    }
    public static void menu()
    {
        System.out.println("******ѧ���ɼ�����ϵͳ******");
        System.out.println("1.avg <����>or<�γ�>��ͳ��ѧ����γ̵�ƽ���֡�");
        System.out.println("2.get <����><�γ�>���õ���ѧ���ĸÿγ̵ĳɼ���");
        System.out.println("3.sort <�γ�>���г��ÿγ̵ĳɼ���������");
        System.out.println("4.rec,�г��ɼ�����");
        System.out.println("5.exit,�˳�.");

    }
    public static void run(String[] student,String[] course,double[][] score)
    {
        Scanner scn=new Scanner(System.in);
        while(true)
        {
            menu();
            System.out.print("����:");
            String command=scn.next();
            if(command.equalsIgnoreCase("avg")){
                String parameter=scn.next();
                getAvg(student,course,score,parameter);
            }
            if(command.equalsIgnoreCase("get")){
                String parameter1=scn.next();
                String parameter2=scn.next();
                getScore(student,course,score,parameter1,parameter2);
            }
            if(command.equalsIgnoreCase("sort")){
                String parameter=scn.next();
                scoreSort(student,course,score,parameter);
            }
            if(command.equalsIgnoreCase("rec")){
                reportCord(student,course,score);
            }
            if(command.equalsIgnoreCase("exit")){
                System.out.print("over");
                System.exit(0);
            }
        }
    }
    public static void getAvg(String[] student,String[] course,double[][] score,String parameter)//��ƽ��ֵ
    {
        int i_index=-1;//��ʾѧ��
        int j_index=-1;//��ʾ�γ�
        double avg=0;//ƽ��ֵ

        for(int i=0;i<student.length;i++)//�ж������Ƿ�Ϊѧ������û�д�ѧ��
            if(student[i].equalsIgnoreCase(parameter))
                i_index=i;//�ҵ���ѧ��
        for(int j=0;j<course.length;j++)//�ж������Ƿ�Ϊ�γ̺���û�д˿γ�
            if(course[j].equalsIgnoreCase(parameter))
                j_index=j;//�ҵ��ÿγ�

        if(i_index!=-1) {//�����ѧ��
            for (int i = 0; i < course.length; i++)
                avg += score[i_index][i];
            System.out.println(parameter+"ѧ����ƽ����Ϊ"+avg/course.length);
        }
        if(j_index!=-1){//������γ�
            for(double[] i:score)
                avg+=i[j_index];
            System.out.println(parameter+"�γ̵�ƽ����Ϊ"+avg/student.length);
        }
        if(i_index==-1&&j_index==-1)
            System.out.println("���޴���or���޴˿�");
    }
    public static void getScore(String[] student,String[] course,double[][] score,String parameter1,String parameter2)//��ȡ�ɼ�
    {
        int i_index=-1;//ѧ��
        int j_index=-1;//�γ�
        for(int i=0;i<student.length;i++){//���Ҹ�ѧ��
            if(student[i].equalsIgnoreCase(parameter1))
                i_index=i;
        }
        if(i_index!=-1){//����ѧ�����ڣ���������Ҹÿγ�
            for(int j=0;j<course.length;j++){
                if(course[j].equalsIgnoreCase(parameter2))
                    j_index=j;
            }
        }
        if(i_index==-1)System.out.println("���޴���");
        if(j_index==-1)System.out.println("���޴˿�");
        if(i_index!=-1&&j_index!=-1){
            System.out.println("����:"+student[i_index]);
            System.out.println("�γ�:"+course[j_index]);
            System.out.println("�ɼ�:"+score[i_index][j_index]);
        }
    }
    public static void scoreSort(String[] student,String[] course,double[][] score,String parameter)//��ɼ�����
    {
        int j_index=-1;
        String[] name=new String[student.length];//��ѧ������
        double[] sco=new double[student.length];//��ѧ���ɼ�
        String a;
        double b;
        for(int i=0;i<course.length;i++)//�������޸ÿγ�
            if(course[i].equalsIgnoreCase(parameter))
                j_index=i;//˵����
        if(j_index!=-1)
        {
            for (int i = 0; i < student.length; i++)
            {//��ѧ�������ɼ��Ƶ������顣
                name[i] = student[i];
                sco[i] = score[i][j_index];
            }

            for (int i = 0; i < name.length; i++) //ð������
            {
                for (int j = name.length - 1; j > i; j--)
                {
                    if (sco[j] > sco[j - 1])
                    {
                        b = sco[j - 1];
                        sco[j - 1] = sco[j];
                        sco[j] = b;//�ɼ�����λ��
                        a = name[j - 1];
                        name[j - 1] = name[j];//���ֽ���λ��
                        name[j] = a;
                    }
                }
            }
            System.out.println("��Ŀ:"+parameter+"\n����    �ɼ�");
            for(int i=0;i<name.length;i++){
                System.out.print(name[i]+"    ");
                System.out.println(sco[i]);
            }
        }
    }
    public static void reportCord(String[] student,String[] course,double[][] score)//�ɼ���
    {
        int i=0;
        int a=0;
        int m=0;
        double[] b=new double[course.length];
        System.out.println("*******************");
        for(double[] k:score) {//�����ܷ�
            for (double l : k)
                b[a] += l;
            a+=1;
        }
        for(String j:course)//�γ�
            System.out.print("   "+j+"  ");
        System.out.print("   �ܷ�");
        for(double[] k:score)
        {
            System.out.print("\n"+student[i++]+"  ");//����
            for(double l:k)
                System.out.print(l+"  ");
            System.out.print(b[m++]);
        }
        System.out.println("\n*******************");
    }
    public static void printNum(String[] student,String[] course,double[][] score,int STUDENT_NUM,int COURSE_NUM)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("������ѧ��������");
        for(int i=0;i<STUDENT_NUM;i++)
            student[i]=scn.next();
        System.out.println("������γ̵�����");
        for(int i=0;i<COURSE_NUM;i++)
            course[i]=scn.next();
        System.out.println("���������");
        for(int i=0;i<STUDENT_NUM;i++)
        {
            System.out.println(student[i]);
            for(int j=0;j<COURSE_NUM;j++)
            {
                System.out.print("  "+course[j]+":");
                score[i][j]=scn.nextDouble();
            }
        }
    }
}
