import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class dsu{
    int p[],n,components;
    HashMap<Integer,ArrayList<Integer>> hm=new HashMap<Integer,ArrayList<Integer>>();
    dsu(int n){
        this.n=n;
        p=new int[n];
        components=n;
        for(int i=0;i<n;i++){
            p[i]=i;
            hm.putIfAbsent(p[i],new ArrayList<>());
            hm.get(p[i]).add(i);
        }
    }
    int find(int i){
        if(p[i]==i){
            return i;
        }
        return find(p[i]);
    }
    void union(int i,int j){
        int i1 = find(i);
        int j1 = find(j);
        if(i1 != j1){
            p[i1] = j1;
            components--;
            ArrayList<Integer> al=hm.get(i1);
            hm.get(j1).addAll(al);
            hm.remove(i1);
        }
    }
    int count(){
        return components;
    }
    HashMap<Integer,ArrayList<Integer>> components(){
        return hm;
    }
    public static void main(String args[]){
        System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dsu d=new dsu(n);
        while(true){
            System.out.println("Enter 1 to union, 2 to find, 3 to count, 4 to components, 5 to exit");
            int ch=sc.nextInt();
            if(ch==1){
                System.out.println("Enter i and j:");
                int i=sc.nextInt();
                int j=sc.nextInt();
                d.union(i,j);
            }
            else if(ch==2){
                System.out.println("Enter i:");
                int i=sc.nextInt();
                System.out.println("Root is: "+d.find(i));
            }
            else if(ch==3){
                System.out.println(d.count());
            }
            else if(ch==4){
                HashMap<Integer,ArrayList<Integer>> hm=d.components();
                for(int key:hm.keySet()){
                    System.out.print(key+" : ");
                    for(int val:hm.get(key)){
                        System.out.print(val+" ");
                    }
                    System.out.println();
                }
            }
            else if(ch==5){
                break;
            }
        }
        sc.close();
    }
}