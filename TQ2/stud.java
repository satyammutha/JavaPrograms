package TQ2;

class stud implements Comparable<stud> {
    int sid;
    String name;
    int per;
    Addr add;

    stud(int sid, String name, int per, Addr add) {
        this.sid = sid;
        this.name = name;
        this.per = per;
        this.add = add;
    }

    public int compareTo(stud s2) {
        if (this.add.getCity().compareTo(s2.add.getCity()) == 0) {
            return s2.per - this.per;
        } else {
            return (this.add.getCity().compareTo(s2.add.getCity()));
        }
    }

    public String toString() {
        return "SID:" + sid + " NAME:" + name + " Percentage:" + per + " Address:" + add;
    }
}