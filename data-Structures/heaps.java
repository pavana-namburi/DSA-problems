import java.util.Scanner;
//import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
public class heaps {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of elements");
        int n=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            pq.add(s);
        }
        Iterator<Integer> it=pq.iterator();
        while(it.hasNext()){
            System.out.print(pq.poll()+" ");
        }
        sc.close();
    }
}
