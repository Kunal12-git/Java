class A {
    String name;
    long id;

    void details() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);

    }
}
    class B extends A{
        String DepartmentName;
        void depdetail(){
            System.out.println("Department: " + DepartmentName);
        }
    }
    class C extends B{
        String spesalizationname;
        void spdetail(){
            System.out.println("Spesalization: " + spesalizationname);
        }
    }


public class Multilevel_inheritance {
    public static void main(String[] args) {
        C c = new C();
        c.name="xyz";
        c.id = 221566985465L;
        c.DepartmentName="Btech";
        c.spesalizationname="Cyber Security";
        c.details();
        c.depdetail();
        c.spdetail();



    }
}
