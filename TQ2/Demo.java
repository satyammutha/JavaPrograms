package TQ2;

import java.util.ArrayList;
import java.util.Collections;

class Demo {
    public static void main(String args[]) {
        Addr add1 = new Addr("Mumbai");
        Addr add2 = new Addr("Pune");
        Addr add3 = new Addr("Nagpur");
        ArrayList<stud> al = new ArrayList<>();
        al.add(new stud(1001, "John", 80, add1));
        al.add(new stud(1002, "Mark", 85, add2));
        al.add(new stud(1003, "Smith", 90, add3));
        Collections.sort(al);
    }
}