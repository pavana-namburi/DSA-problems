package arraylistsorting;

import java.util.*;

public class SortByCgpa implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if(a.cgpa==b.cgpa){
            return 0;
        }
        else if(a.cgpa>b.cgpa){
            return 1;
        }
        else{
            return -1;
        }
    }
}
