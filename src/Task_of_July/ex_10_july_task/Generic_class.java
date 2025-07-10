package Task_of_July.ex_10_july_task;

public class Generic_class {
    public static void main(String[] args) {
    //Here it access any type of datatype
    //If we int values it will integer type
    //If we give boolean it bcz boolean type etc.,
    GenericClass g = new GenericClass(10);
    GenericClass g1 = new GenericClass("Abhi");
    GenericClass g2= new GenericClass(true);
    GenericClass g3 = new GenericClass(3.14);

    // T -> it is placeholder only -> it can be any data type.
    }
}

class GenericClass<T>{
    //private int data--> if we mention like this it will take only int data
    private T data;//This will accept any data type, Need to relace int with T or any

    //public GenericClass(int data)
    public GenericClass(T data) {
        this.data = data;
    }
    //  public int getData()
    public T getData() {
        return data;
    }
    //public void setData(int data)
    public void setData(T data) {
        this.data = data;
    }
}
