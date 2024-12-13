import java.util.*;
public class Hashmap1_12{
    public static void main(String args[]){
        HashMap<String,String> a=new HashMap<>();
        a.put("sno","01");
        a.put("sname","raj");
        System.out.println(a);
        //printing hash map key value
        if(a.containsKey("sname")){
            String d=a.get("sname");
            System.out.println(d);
        }
    }
}