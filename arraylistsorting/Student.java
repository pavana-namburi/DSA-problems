package arraylistsorting;

public class Student {
   String name,branch;
   int rollNo,total;
   double cgpa;
   public Student(String sname, String br, int roll, int tot, double cgp) {
       name = sname;
       branch = br;
       rollNo = roll;
       total = tot;
       cgpa = cgp;
   }
   @Override
   public String toString() {
         return name + " " + branch + " " + rollNo + " " + total + " " + cgpa;
   }
}

