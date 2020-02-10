import java.util.Comparator;

class mysortByNM implements Comparator<stud>
{
    public int compare(stud s1,stud s2){
        return s1.getNm().compareTo(s2.getNm());
    }

    
}
