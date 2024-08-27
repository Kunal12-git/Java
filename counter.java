 class objectCounter {
     static int count = 0;

     objectCounter() {
         count++;
     }

     static int get_obj_count() {
         return count;


     }
 }
    public class counter{
        public static void main(String[]args){
            objectCounter obj1 = new objectCounter();
            System.out.println("object called :"+obj1.get_obj_count()+" times");
            objectCounter obj2 = new objectCounter();
            System.out.println("object called :"+obj2.get_obj_count()+ " times");
            objectCounter obj3 = new objectCounter();
            System.out.println("object called :"+obj3.get_obj_count()+" times");


        }
    }

