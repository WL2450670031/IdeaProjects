package IM_6_4_2.wule;

//应用层
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
    public void readData()//读取数据
    {
        usbDriver.read();
    }
    public void writeData()//写入数据
    {
        usbDriver.write();
    }
}
