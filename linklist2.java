import java.util.*;
public class linklist2{
    public static void main(String args[]){
        LinkedList<Integer> a=new LinkedList<>();
        //ACCEPTIN values in linkedlists
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            int s=sc.nextInt();
            a.addFirst(s);
        }
        for(int i=0;i<size;i++){
            System.out.println(a.get(i)+" ");
        }                                         
    }
}