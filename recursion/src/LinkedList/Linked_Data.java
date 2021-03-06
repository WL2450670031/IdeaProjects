package LinkedList;


public class Linked_Data
{
    private int number;

    public Linked_Data()
    {
        super();
    }

    public Linked_Data(int number)
    {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean equals(Linked_Data data) {
        if(this.number == data.number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString() {
        return number +"";
    }
}
