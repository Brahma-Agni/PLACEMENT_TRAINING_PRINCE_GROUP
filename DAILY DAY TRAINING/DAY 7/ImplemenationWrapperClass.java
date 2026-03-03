import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class student {
    int id;
    int marks;
    String name;

    student(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;

    }
}

class sortBymarks implements Comparator<student> {
    public int compare(student s1, student s2) {
        return s1.marks - s2.marks;
    }
    }


public class ImplemenationWrapperClass {
    public static void main(String[] args) {
        ArrayList<student> alist = new ArrayList<>();
        alist.add(new student(1, 90, "Ram"));
        alist.add(new student(2, 80, "Seetha"));
        alist.add(new student(3, 85, "Lakshman"));
        alist.add(new student(4, 95, "Hanuman"));
        alist.add(new student(5, 70, "Jatayu"));

        Collections.sort(alist, new sortBymarks());
        for (student s : alist) {
            System.out.println(s.id + " " + s.marks + " " + s.name);
        }

    }

}
        