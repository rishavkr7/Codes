public class Main {
    public static class Person{
        String name;
        int age;
        String contact;
    }
public static void main(String[] args){
    Person p1 = new Person();
     System.out.println(p1.name+" "+p1.age);  //By Default String is null and Integer is 0
     
     p1.name="admin";
     p1.age=20;
     p1.contact="8809892355";

     System.out.println(p1.name+" "+p1.age+" "+p1.contact);
    }
}
