import java.lang.reflect.Array;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Ihminen i = new Ihminen(null, null);
        Harka h = new Harka(null, null);
        Minotaur m = i.lisaannySuvullisesti(h);
        System.out.println(m);
    }
}

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

class Elain extends Aitotumainen {
    public Elain(Elain a, Elain b) { super(a, b); dna.add("Elain"); }
}

class Kasvi extends Aitotumainen {
    public Kasvi(Kasvi a, Kasvi b) { super(a, b); }
}

class Sieni extends Aitotumainen {
    public Sieni(Sieni a, Sieni b) { super(a, b); }
}








