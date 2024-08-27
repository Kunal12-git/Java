class  Dog_name{
    String color;
    int age;
     void display(){
        System.out.println("color: " + color );
        System.out.println("age: " + age );
    }
}
class Dog extends  Dog_name{
    String name;
    void display2(){
        System.out.println("name: " + name);
    }
}
public class single_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name="bruno";
        d.age=10;
        d.color="Black";
        d.display2();
        d.display();

    }
}
