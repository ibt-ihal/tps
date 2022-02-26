package ma.education.tp5.annotations;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        //set
        Set<String> set1 = new HashSet<String>();
        set1.add("ABC1");
        set1.add("ABC2");
        set1.add("ABC3");
        set1.add("ABC1");
        set1.add("ABC4");
        set1.add("ABC5");
        set1.forEach(i-> System.out.println(i));

    //class client
        Set<Client> set2 = new HashSet<Client>();
        set2.add(new Client(1,"ALAMI"));
        set2.add(new Client(1,"ALAMI"));
        set2.add(new Client(2,"SOUHAIL"));
        set2.forEach(i-> System.out.println(i));
       //treeset
        Set<Integer> set3 = new TreeSet<>();
        set3.add(22);
        set3.add(11);
        set3.add(15);
        set3.add(9);
        set3.forEach(i-> System.out.println(i));

        //CodeComparator
        Comparator<Client> c = new CodeComparator();
        Set<Client> set4 = new TreeSet<>(c);
        set4.add(new Client(1,"OMAR"));
        set4.add(new Client(3,"SAID"));
        set4.add(new Client(2,"HASSAN"));
        set4.forEach(i-> System.out.println(i));
        //Comparator avecles expressions Lambda
        Set<Client> set5 = new TreeSet<>((c1,c2) -> c1.code-c2.code);
        set5.add(new Client(1,"OMAR"));
        set5.add(new Client(3,"SAID"));
        set5.add(new Client(2,"HASSAN"));
        set5.forEach(i-> System.out.println(i));
        //Trier avec les expressions Lambda
        Set<Client> set6 = new TreeSet<>((c1,c2) -> c1.code-c2.code);
        set6.add(new Client(1,"OMAR"));
        set6.add(new Client(3,"SAID"));
        set6.add(new Client(2,"HASSAN"));
        set6.forEach(i-> System.out.println(i));
    }

    //RESULTAT set1 ABC1-ABC4-ABC5-ABC2-ABC3(les doublons n'existent pas dans la Set)
    //resultat set2 Client{code=1, name='ALAMI'}Client{code=2, name='SOUHAIL'};annuler les doublons si on un par exemple le client deux objets utiliser hashCode
    //resultat 9-11-15-22 TreeSet fait le tri.
    //resultat CodeComparator Client{code=1, name='OMAR'}Client{code=2, name='HASSAN'}Client{code=3, name='SAID'}
}
