package Array;

public class ParentClass {
    void parent(ChildClass out){
        out.child();
    }
}
class ChildClass extends ParentClass{
    void child(){
        System.out.println("Im Child");
    }
}

class SolutionClass {
    public static void main(String[] args) {
        ChildClass ref = new ChildClass();
        ParentClass p = new ParentClass();
        p.parent(ref);
    }
}
