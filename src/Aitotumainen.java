import java.lang.reflect.Array;
import java.util.*;

abstract class Aitotumainen {

    public final List<String> dna = new ArrayList<String>();

    public Aitotumainen(Aitotumainen a, Aitotumainen b) {
        if (a != null) dna.add("Parent: " + a.dna);
        if (b != null) dna.add("Parent: " + b.dna);
        dna.add("Aitotumainen " + hashCode());
    }

    public String toString() {
        return getClass().getName() + " " + dna;
    }
}