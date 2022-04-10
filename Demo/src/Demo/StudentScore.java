package Demo;

import java.util.Scanner;

public class StudentScore
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("请输入学生数:");
        final int STUDENT_NUM=scn.nextInt();//学生数
        System.out.print("请输入课程数:");
        final int COURSE_NUM=scn.nextInt();//课程数
        String[] student=new String[STUDENT_NUM];//存储学生名字
        String[] course=new String[COURSE_NUM];//存储课程名字
        double[][] score=new double[STUDENT_NUM][COURSE_NUM];//存储学生各科成绩
        printNum(student,course,score,STUDENT_NUM,COURSE_NUM);
        run(student,course,score);
    }
    public static void menu()
    {
        System.out.println("******学生成绩管理系统******");
        System.out.println("1.avg <名字>or<课程>，统计学生或课程的平均分。");
        System.out.println("2.get <名字><课程>，得到该学生的该课程的成绩。");
        System.out.println("3.sort <课程>，列出该课程的成绩的排名。");
        System.out.println("4.rec,列出成绩单。");
        System.out.println("5.exit,退出.");

    }
    public static void run(String[] student,String[] course,double[][] score)
    {
        Scanner scn=new Scanner(System.in);
        while(true)
        {
            menu();
            System.out.print("命令:");
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
    public static void getAvg(String[] student,String[] course,double[][] score,String parameter)//求平均值
    {
        int i_index=-1;//表示学生
        int j_index=-1;//表示课程
        double avg=0;//平均值

        for(int i=0;i<student.length;i++)//判断输入是否为学生和有没有此学生
            if(student[i].equalsIgnoreCase(parameter))
                i_index=i;//找到该学生
        for(int j=0;j<course.length;j++)//判断输入是否为课程和有没有此课程
            if(course[j].equalsIgnoreCase(parameter))
                j_index=j;//找到该课程

        if(i_index!=-1) {//有这个学生
            for (int i = 0; i < course.length; i++)
                avg += score[i_index][i];
            System.out.println(parameter+"学生的平均分为"+avg/course.length);
        }
        if(j_index!=-1){//有这个课程
            for(double[] i:score)
                avg+=i[j_index];
            System.out.println(parameter+"课程的平均分为"+avg/student.length);
        }
        if(i_index==-1&&j_index==-1)
            System.out.println("查无此人or查无此课");
    }
    public static void getScore(String[] student,String[] course,double[][] score,String parameter1,String parameter2)//获取成绩
    {
        int i_index=-1;//学生
        int j_index=-1;//课程
        for(int i=0;i<student.length;i++){//查找该学生
            if(student[i].equalsIgnoreCase(parameter1))
                i_index=i;
        }
        if(i_index!=-1){//若该学生存在，则继续查找该课程
            for(int j=0;j<course.length;j++){
                if(course[j].equalsIgnoreCase(parameter2))
                    j_index=j;
            }
        }
        if(i_index==-1)System.out.println("查无此人");
        if(j_index==-1)System.out.println("查无此课");
        if(i_index!=-1&&j_index!=-1){
            System.out.println("姓名:"+student[i_index]);
            System.out.println("课程:"+course[j_index]);
            System.out.println("成绩:"+score[i_index][j_index]);
        }
    }
    public static void scoreSort(String[] student,String[] course,double[][] score,String parameter)//求成绩排名
    {
        int j_index=-1;
        String[] name=new String[student.length];//存学生名字
        double[] sco=new double[student.length];//存学生成绩
        String a;
        double b;
        for(int i=0;i<course.length;i++)//查找有无该课程
            if(course[i].equalsIgnoreCase(parameter))
                j_index=i;//说明有
        if(j_index!=-1)
        {
            for (int i = 0; i < student.length; i++)
            {//将学生姓名成绩移到新数组。
                name[i] = student[i];
                sco[i] = score[i][j_index];
            }

            for (int i = 0; i < name.length; i++) //冒泡排序
            {
                for (int j = name.length - 1; j > i; j--)
                {
                    if (sco[j] > sco[j - 1])
                    {
                        b = sco[j - 1];
                        sco[j - 1] = sco[j];
                        sco[j] = b;//成绩交换位置
                        a = name[j - 1];
                        name[j - 1] = name[j];//名字交换位置
                        name[j] = a;
                    }
                }
            }
            System.out.println("科目:"+parameter+"\n姓名    成绩");
            for(int i=0;i<name.length;i++){
                System.out.print(name[i]+"    ");
                System.out.println(sco[i]);
            }
        }
    }
    public static void reportCord(String[] student,String[] course,double[][] score)//成绩单
    {
        int i=0;
        int a=0;
        int m=0;
        double[] b=new double[course.length];
        System.out.println("*******************");
        for(double[] k:score) {//计算总分
            for (double l : k)
                b[a] += l;
            a+=1;
        }
        for(String j:course)//课程
            System.out.print("   "+j+"  ");
        System.out.print("   总分");
        for(double[] k:score)
        {
            System.out.print("\n"+student[i++]+"  ");//名字
            for(double l:k)
                System.out.print(l+"  ");
            System.out.print(b[m++]);
        }
        System.out.println("\n*******************");
    }
    public static void printNum(String[] student,String[] course,double[][] score,int STUDENT_NUM,int COURSE_NUM)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("请输入学生的名字");
        for(int i=0;i<STUDENT_NUM;i++)
            student[i]=scn.next();
        System.out.println("请输入课程的名字");
        for(int i=0;i<COURSE_NUM;i++)
            course[i]=scn.next();
        System.out.println("请输入分数");
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
