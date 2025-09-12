package arraylistsorting;

import java.util.*;

public class SortByRollNoDesc implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if(a.rollNo==b.rollNo){
            return 0;
        }
        else if(a.rollNo<b.rollNo){
            return 1;
        }
        else{
            return -1;
        }
    }
}
