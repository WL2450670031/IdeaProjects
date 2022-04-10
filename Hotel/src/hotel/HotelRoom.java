package hotel;
/*
房间信息：
1.房间号。
2.房间规格。1楼标准间，2楼双人间，3楼情侣间。
3.是否住人。
 */
class HotelRoom
{
    private int room1;//1.房间号。
    private String room2;//2.房间规格。1楼标准间，2楼双人间，3楼情侣间。
    private boolean room3;//3.是否住人。

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
        return "{房间："+room1+"\t"+room2+"\t"+room3+"}";
    }
}
/*客人信息：（1楼只能有一条个人信息；2.3楼可以1条，也可以2条。）
1.姓名
2.性别
3.手机号
4.身份证号
 */
class Client
{
    private String name;//姓名
    private String gender;//性别
    private String phone;//手机号
    private String student_number;//身份证号

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
        return "{客人:"+name+","+gender+","+phone+","+student_number+"}";
    }
}
