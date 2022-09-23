package Array;

public class ParentClass {
    void parent(){
        System.out.println("Im parent");
    }
}
class ChildClass extends ParentClass{
    void child(){
        System.out.println("Im Child");
    }
}
class SolutionClass{
    public static void main(String[] args) {
        ParentClass a = new ChildClass();
        ((ChildClass)a).child();
    }
}