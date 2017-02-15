
class Ihminen extends Elain implements Liikkuva, Puhuva, Labyrinttipako {
    public Ihminen(Ihminen a, Ihminen b) {
        super(a, b);
        dna.add("Ihminen");
    }

    public Ihminen lisaannySuvullisesti(Ihminen b) {
        return new Ihminen(this, b);
    }

    public Minotaur lisaannySuvullisesti(Harka b) {
        return new Minotaur(this, b);
    }
}