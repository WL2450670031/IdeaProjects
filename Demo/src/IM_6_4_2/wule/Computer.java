package IM_6_4_2.wule;

//Ӧ�ò�
public class Computer {
    private IMobileStorage usbDriver;

    public Computer(){}

    public Computer(IMobileStorage usbDriver)
    {
        this.usbDriver=usbDriver;
    }

    public void setUsbDriver(IMobileStorage usbDriver)
    {
        this.usbDriver=usbDriver;
    }
    public void readData()//��ȡ����
    {
        usbDriver.read();
    }
    public void writeData()//д������
    {
        usbDriver.write();
    }
}
