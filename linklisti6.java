import java.util.*;
public class linklisti6{
    public static void main(String args[]){
        // using iterator
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("HELLo");
        a.add("HELLo");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        Iterator itr=a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
    }
}
