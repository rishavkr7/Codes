public class Main {
    public static class Person{
        String name;
        int age;
        int contact;
    }
public static void main(String[] args){
    Person p1 = new Person();
     System.out.println(p1.name+" "+p1.age);
     
     p1.name="admin";
     p1.age=20;
     p1.contact=9876543210;

     System.out.println(p1.name+" "+p1.age+" "+p1.contact);
    }
}
