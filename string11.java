import java.util.*;
class string11{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        //string union
        String  arr1[]=new String[n];
        for(int i=0;i<n;i++){
            arr1[i]=s.next();
        }
         int m=s.nextInt();
        String arr2[]=new String[n];
        for(int i=0;i<m;i++){
            arr2[i]=s.next();
        }
        Set<String> a=new HashSet<>();
        Set<String> b=new HashSet<>();
        for(String s1:arr1)
            a.add(s1);
        for(String  s2:arr2)
            b.add(s2);
        System.out.println(a);
        System.out.println(b);
        Set<String> c=new HashSet<>(a);
        c.addAll(b);
        System.out.println(c);
    }
}