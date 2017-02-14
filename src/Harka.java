
class Harka extends Elain implements Liikkuva {
    public Harka(Harka a, Harka b) {
        super(a, b);
        dna.add("Härkä");
    }

    @Override
    public void liiku() {
        System.out.println("Hopoti hop hop");
    }
}