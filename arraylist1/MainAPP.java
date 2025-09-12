import java.util.*;

import arraylistsorting.*;
public class MainAPP {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Enter number of students:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Branch: ");
            String branch = sc.next();
            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            System.out.print("Total Marks: ");
            int total = sc.nextInt();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();
            students.add(new Student(name, branch, rollNo, total, cgpa));
        }
        System.out.println("");
        System.out.println("Sorting by Name:");
        Collections.sort(students, new SortByName());
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("");
        System.out.println("Sorting by Roll No:");
        Collections.sort(students, new SortByRollNo());
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("");
        System.out.println("Sorting by CGPA:");
        Collections.sort(students, new SortByCgpa());
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("");
        System.out.println("Sorting by Total Marks:");
        Collections.sort(students, new SortByTotal());
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("");
        System.out.println("Sorting by Branch:");
        Collections.sort(students, new SortByBranch());
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("");
        System.out.println("Sorting by Roll No (Descending):");
        Collections.sort(students, new SortByRollNoDesc());
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("");
        System.out.println("Sorting by CGPA (Descending):");
        Collections.sort(students, new SortByCgpaDesc());
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("");
        System.out.println("Sorting by Total Marks (Descending):");
        Collections.sort(students, new SortByTotalDesc());
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("");
        System.out.println("Sorting by Branch (Descending):");
        Collections.sort(students, new SortByBranchDesc());
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("");
        System.out.println("Sorting by Name (Descending):");
        Collections.sort(students, new SortByNameDesc());
        for (Student s : students) {
            System.out.println(s);
        }
        sc.close();
    }
}
