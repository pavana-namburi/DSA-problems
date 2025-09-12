package arraylistsorting;

import java.util.*;

public class SortByTotal implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if(a.total==b.total){
            return 0;
        }
        else if(a.total>b.total){
            return 1;
        }
        else{
            return -1;
        }
    }
}
