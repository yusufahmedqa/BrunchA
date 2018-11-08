import java.util.*;

public class IteratorAccess {

    public static void main(String[] args) {
        List<String> name= new ArrayList<>();
        name.add("Mike");
        name.add("Sam");
        name.add("Robert");
        System.out.println(name);

        Iterator it= name.iterator();
        while(it.hasNext())


        System.out.println(it.next()+ " ");


    }

    public void iterateSet(){

        Set<String> it2= new HashSet<>();
        it2.add("Tamim");
        it2.add("Maymuna");
        it2.add("Maliha");
        Iterator name= it2.iterator();
        while(name.hasNext())

            System.out.println(name.next());




    }




}
