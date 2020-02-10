class stud_iterater implements Comparable<stud> {
    int sid;
    float per;
    String name;
    stud_iterater(int sid,float per,String name){
        this.sid = sid;
        this.per = per;
        this.name = name;
    }
    public int compareTo() {
        return s1.stud - s2.stud;
    }
}