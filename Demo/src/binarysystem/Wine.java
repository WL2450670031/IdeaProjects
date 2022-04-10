package binarysystem;

//酒类
class Wine
{
    private int number;//编号
    private boolean poison;//ture为好酒，false为毒酒.

    public Wine(int number,boolean poison)
    {
        this.number=number;
        this.poison = poison;
    }

    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }

    public void setLifeOrdie(boolean poison) {
        this.poison = poison;
    }
    public boolean getLifeOrdie(){
        return poison;
    }
}
