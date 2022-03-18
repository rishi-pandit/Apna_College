package apna;

class Pen{
    //Property
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
    public void print(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class Oops1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "dot";

       pen1.print();
       pen2.print();

       // pen1.write();
       // System.out.println(pen1.color + " " + pen1.type);



    }
}
