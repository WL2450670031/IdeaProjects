package binarysystem;

//����
class Wine
{
    private int number;//���
    private boolean poison;//tureΪ�þƣ�falseΪ����.

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
