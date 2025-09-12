package arraylistsorting;

import java.util.*;

public class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if( a.name.compareTo(b.name)==0){
            return 0;
        }
        else if(a.name.compareTo(b.name)<0){
            return -1;
        }
        else{
            return 1;
        }
    }
}
