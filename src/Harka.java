
class Harka extends Elain implements Liikkuva {
    public Harka(Harka a, Harka b) {
        super(a, b);
        dna.add("Härkä");
    }

    @Override
    public void liiku() {
        System.out.println("Hopoti hop hop");
    }
    
    public Minotaur lisaannySuvullisesti(Ihminen b) {
        return new Minotaur(this, b);
    }

    public Harka lisaannySuvullisesti(Harka b) {
        return new Harka(this, b);
    }
}