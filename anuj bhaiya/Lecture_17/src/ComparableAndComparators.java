import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparators {

    public static void main(String[] args) {
        Animal a1 = new Animal(4,"Leo",10);
        Animal a2 = new Animal(8,"lucky",2);
        Animal a3 = new Animal(14,"abbs",6);
        Animal a4 = new Animal(6,"xyz",12);
        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs);

        Collections.sort(dogs);
        System.out.println(dogs);

    }
}
