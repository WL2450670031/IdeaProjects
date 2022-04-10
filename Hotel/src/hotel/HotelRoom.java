package hotel;
/*
������Ϣ��
1.����š�
2.������1¥��׼�䣬2¥˫�˼䣬3¥���¼䡣
3.�Ƿ�ס�ˡ�
 */
class HotelRoom
{
    private int room1;//1.����š�
    private String room2;//2.������1¥��׼�䣬2¥˫�˼䣬3¥���¼䡣
    private boolean room3;//3.�Ƿ�ס�ˡ�

    public HotelRoom(int room1,String room2,boolean room3){
        this.room1=room1;
        this.room2=room2;
        this.room3=room3;
    }

    public void setRoom1(int room1)
    {
        this.room1=room1;
    }
    public void setRoom2(String room2){
        this.room2=room2;
    }
    public void setRoom3(boolean room3){
        this.room3=room3;
    }

    public int getRoom1(){
        return  room1;
    }
    public String getRoom2(){
        return  room2;
    }
    public boolean getRoom3(){
        return room3;
    }

    public String toString()
    {
        return "{���䣺"+room1+"\t"+room2+"\t"+room3+"}";
    }
}
/*������Ϣ����1¥ֻ����һ��������Ϣ��2.3¥����1����Ҳ����2������
1.����
2.�Ա�
3.�ֻ���
4.���֤��
 */
class Client
{
    private String name;//����
    private String gender;//�Ա�
    private String phone;//�ֻ���
    private String student_number;//���֤��

    public Client(String name,String gender,String phone,String student_number){
        this.name=name;
        this.gender=gender;
        this.phone=phone;
        this.student_number=student_number;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public void setStudent_number(String student_number){
        this.student_number=student_number;
    }

    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String getPhone(){
        return phone;
    }
    public String getStudent_number(){
        return student_number;
    }

    public String toString(){
        return "{����:"+name+","+gender+","+phone+","+student_number+"}";
    }
}
