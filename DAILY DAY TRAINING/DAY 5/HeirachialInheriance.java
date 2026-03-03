class polarbear{
    void prin(){
        System.out.println("This is the parent class");
    }
}
class cub1 extends polarbear{
    void show(){
        System.out.println("This is the child class 1");
    }
}
class cub2 extends polarbear{
    void print(){
        System.out.println("This is the child class 2");
    }
}


public class HeirachialInheriance {
    public static void main(String[] args) {
        cub1 c1 = new cub1();
        cub2 c2 = new cub2();
        c1.prin();
        c1.show();
        c2.prin();    
        c2.print();   
    }
}
