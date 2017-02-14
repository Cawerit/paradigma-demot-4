
class Ihminen extends Elain implements Liikkuva {
    public Ihminen(Ihminen a, Ihminen b) {
        super(a, b);
    }

    public Ihminen lisaannySuvullisesti(Ihminen b) {
        return new Ihminen(this, b);
    }

    public Minotaur lisaannySuvullisesti(Harka b) {
        return new Minotaur(this, b);
    }
}