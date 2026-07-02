import java.util.*;
class TrieNode{
    TrieNode child[];
    int leafCount;
    int count;
    TrieNode(){
        child=new TrieNode[26];
        leafCount=0;
        count=0;
    }
}
public class trie {
    TrieNode root;
    trie(){
        root=new TrieNode();
    }
    void insert(String s){
        TrieNode curr=root;
        for(char x:s.toCharArray()){
            if(curr.child[x-'a']==null)
                curr.child[x-'a']=new TrieNode();
            curr=curr.child[x-'a'];
            curr.count++;
        }
        curr.leafCount++;
    }
    boolean search(String s){
        TrieNode curr=root;
        for(char x:s.toCharArray()){
            if(curr.child[x-'a']==null)
                return false;
            curr=curr.child[x-'a'];
        }
        return curr.leafCount>0;
    }
    int prefixCount(String s){
        TrieNode curr=root;
        for(char x:s.toCharArray()){
            if(curr.child[x-'a']==null)
                return 0;
            curr=curr.child[x-'a'];
        }
        return curr.count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        trie t=new trie();
        while(true){
            System.out.println("Enter 1 to insert, 2 to search, 3 to count prefix, 4 to check prefix, 5 to exit");
            int choice=sc.nextInt();
            if(choice==5){
                sc.close();
                break;
            }
            System.out.println("Enter the string");
            String s=sc.next().toLowerCase();
            switch(choice){
                case 1:
                    t.insert(s);
                    System.out.println("Inserted");
                    break;
                case 2:
                    if(t.search(s))
                        System.out.println("Found");
                    else
                        System.out.println("Not Found");
                    break;
                case 3:
                    System.out.println("Prefix count: "+t.prefixCount(s));
                    break;
                case 4:
                    if(t.prefixCount(s)>0)
                        System.out.println("Is a prefix");
                    else
                        System.out.println("Not a prefix");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
