package hotel;

import java.util.Scanner;

/*
        1.printOtherRoom,??????з???????????????????????????????????
        2.printOneRoom?????????????????????????????????????????????
        3.?????getRoom???????outRoom??
        4.getClientInformation,????????????????????????????????????
*/
public class Hotel {
    Scanner scn=new Scanner(System.in);
    private final HotelRoom[][] rooms=new HotelRoom[3][6];
    private final Client[] client1=new Client[6];
    private final Client[][][] clients23=new Client[2][6][2];
    public Hotel()
    {
        for(int i=0;i<rooms.length;i++)
        {
            for (int j = 0; j < rooms[0].length; j++)
            {
                if (i == 0)
                    rooms[i][j] = new HotelRoom((i + 1) * 10 + (j + 1), "?????", true);
                else if (i == 1)
                    rooms[i][j] = new HotelRoom((i + 1) * 10 + (j + 1), "????", true);
                else if (i == 2)
                    rooms[i][j] = new HotelRoom((i + 1) * 10 + (j + 1), "???·?", true);
            }
        }
        String haha="-";
        for(int i=0;i<client1.length;i++)
            client1[i]=new Client(haha,haha,haha,haha);
        for(int i=0;i<clients23.length;i++)
            for(int j=0;j<clients23[0].length;j++)
            {
                clients23[i][j][0]=new Client(haha,haha,haha,haha);
                clients23[i][j][1]=new Client(haha,haha,haha,haha);
            }
    }
    public void getRoom(int roomnumber)//???
    {
        int i=roomnumber/10-1;//???
        int j=roomnumber%10-1;//??β??

        HotelRoom room;
        room=rooms[i][j];
        if(room.getRoom3()) //????????????????????
        {
            if (i == 0) //??????????
            {
                client1[j] = getClientInformation(1);//1????????????
                room.setRoom3(false);//???????,?????????
            }
            else if (i == 1 || i == 2)//????2.3????????,??1~2??.
            {
                System.out.println("?м??????");
                int k = scn.nextInt();//???????
                if (k == 1 || k == 2)
                {
                    for (int u = 0; u < k; u++)
                        clients23[i-1][j][u] = getClientInformation((u + 1));//2.3????????
                    room.setRoom3(false);//???????,?????????
                }
                else
                    System.out.println("??????1~2?????????:");
            }
        }
        else
            System.out.println("?÷????");
    }
    public void outRoom(int roomnumber)//???
    {
        int i=roomnumber/10-1;//???
        int j=roomnumber%10-1;//??β??

        HotelRoom room;
        room=rooms[i][j];

        String haha="-";
        if(!room.getRoom3())
        {
            room.setRoom3(true);//??????
            if (i == 0)
                client1[i] = new Client(haha,haha,haha,haha);
            if (i == 1 || i == 2) {
                clients23[i-1][j][0] = new Client(haha,haha,haha,haha);
                clients23[i-1][j][1] = new Client(haha,haha,haha,haha);
            }
            System.out.println("??????");
        }
        else
            System.out.println("??????");
    }
    public void printOtherRoom()//????????з??估????????
    {
        for(int i=0;i<client1.length;i++)
        {
            System.out.print(rooms[0][i]);//???1????????
            System.out.println(client1[i]);//???1????????
        }
        for(int i=0;i<clients23.length;i++)
            for(int j=0;j<clients23[0].length;j++)
            {
                System.out.print(rooms[i+1][j]);//???2.3????????
                System.out.print(clients23[i][j][0]);//???2.3????????
                System.out.println(clients23[i][j][1]);
            }
    }
    public void printOneRoom(int roomnumber)//?????????估????????
    {
        int i=roomnumber/10-1;//???
        int j=roomnumber%10-1;//??β??
        HotelRoom room;
        room=rooms[i][j];
        if(!room.getRoom3())
        {
            System.out.print(room);
            if(i==0)
                System.out.println(client1[i]);
            else
            {
                System.out.print(clients23[i-1][j][0]);
                System.out.println(clients23[i-1][j][1]);
            }

        }
        else
            System.out.println("??????");

    }
    public Client getClientInformation(int num)//?????????????
    {
        String name;
        String gender;
        String phone;
        String student_number;
        System.out.println("???????:"+num+"λ????????");
        System.out.print("????:");
        name=scn.next();
        System.out.print("???:");
        gender=scn.next();
        System.out.print("?绰????:");
        phone=scn.next();
        System.out.print("????:");
        student_number=scn.next();
        return new Client(name,gender,phone,student_number);
    }
}
