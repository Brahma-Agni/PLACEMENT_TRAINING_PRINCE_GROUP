class fair{
    void display(){
        System.out.println("This is the parent class");
    }
}
class child extends fair{
    void show(){
        System.out.println("This is the child class");
    }
}
class grandchild extends child{
    void print(){
        System.out.println("This is the grandchild class");
    }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        grandchild gc = new grandchild();
        gc.display(); // Inherited from fair
        gc.show();    // Inherited from child
        gc.print();   // Own method of grandchild
    }
}
