package binarysystem;

class Mouse {
    private int mouseNumber;//������
    private boolean life;//������

    public Mouse(int mouseNumber,boolean life){
        this.mouseNumber=mouseNumber;
        this.life = life;
    }
    public void setMouseNumber(int mouseNumber){
        this.mouseNumber=mouseNumber;
    }
    public int getMouseNumber() {
        return mouseNumber;
    }

    public void setLife(boolean life) {
        this.life = life;
    }
    public boolean getLife() {
        return life;
    }

    public String toString(){
        return "{"+(mouseNumber+1)+"��:"+(life?"��}":"��}");
    }
}
