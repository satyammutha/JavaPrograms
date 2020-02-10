package TQ;

class Emp11 implements Comparable<Emp11> {
    int id;
    String name;
    float sal;
    Dept d;

    Emp11(int id, String name, float sal, Dept d) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.d = d;
    }

    public int compareTo(Emp11 e11) {
        return this.d.getId() - e11.d.getId();
    }

    public String toString() {
        return "Id " + id + " Name " + name;
    }

}