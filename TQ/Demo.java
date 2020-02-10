package TQ;
import java.util.ArrayList;
import java.util.Collections;

class Demo {
    public static void main(String args[]) {
        Dept d1 = new Dept(1, "IT");
        Dept d2 = new Dept(2, "CSE");

        ArrayList<Emp11> al = new ArrayList<>();
        al.add(new Emp11(1001, "John", 75000, d1));
        al.add(new Emp11(1002, "Smith", 80000, d2));
        al.add(new Emp11(1003, "Mark", 90000, d1));

        Collections.sort(al);
    }
    
}