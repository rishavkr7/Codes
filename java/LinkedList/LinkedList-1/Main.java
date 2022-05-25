public class Main {
    public static class Person{
        String name;
        int age;
    }
public static void main(String[] args){
    Person p1 = new Person();
     System.out.println(p1.name+" "+p1.age);
     
     p1.name="admin";
     p1.age=20;

     System.out.println(p1.name+" "+p1.age);
}
}
