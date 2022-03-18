package apna;

class Student{
     String Name;
     int Age;
     String Profession;

     Student(String name,int age, String profession){
         this.Name = name;
         this.Age= age;
         this.Profession= profession;
     }

     public void print(){
         System.out.println(this.Name);
         System.out.println(this.Age);
         System.out.println(this.Profession);
     }
}

public class Oops2 {
    public static void main(String[] args) {
        Student st = new Student("Rishi",22,"Software Devloper");
        st.print();
    }
}
