import java.util.ArrayList;
import java.util.LinkedList;


public class ListPractice { 
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        ArrayList<String> alist = new ArrayList<>();
        list.add("Ram");
        list.add("Seetha");
        list.add("Lakshman");
        list.addFirst("Hanuman");
        list.addLast("Jatayu");

        System.out.println("Size of ArrayList = "+list.size());
        System.out.println(list);

        alist.add("Krishna");
        alist.add("Balaram");
        alist.add("Radha");
        alist.add("Subara");
        alist.add("Govardana Giri");
        alist.add("Yashoda");
        alist.add("Butter");

        System.out.println("This is Linkedlist");
        System.out.println("Size of LinkedList = "+alist.size());
        System.out.println(alist);
        
    }
}