package IM_6_4_2.wule;

//����ʦ��ѧԺ ����
// 2021.11.24

public class Test {
    public static void main(String[] args)
    {
        Computer computer=new Computer();
        IMobileStorage fd=new FlashDisk();
        IMobileStorage mp3=new MP3Player();

        computer.setUsbDriver(fd);
        computer.readData();
        computer.writeData();

        computer.setUsbDriver(mp3);
        computer.readData();
        computer.writeData();
    }
}
