package arraylistsorting;

import java.util.*;

public class SortByBranch implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if(a.branch.compareTo(b.branch)==0){
            return 0;
        }
        else if(a.branch.compareTo(b.branch)<0){
            return -1;
        }
        else{
            return 1;
        }
    }
}
