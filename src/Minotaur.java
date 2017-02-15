

class Minotaur extends Elain implements Liikkuva, Puhuva {
    public Minotaur(Ihminen a, Harka b) {
        super(a, b);
    }
    public Minotaur(Harka a, Ihminen b) {
        super(a, b);
    }
    public Minotaur(Minotaur a, Minotaur b) {
        super(a, b);
    }
    
    public Minotaur lisaannySuvullisesti(Minotaur b) {
        return new Minotaur(this, b);
    }
    
    @Override
    public void liiku() {
        System.out.println("Hopoti hop askel");
    }
    @Override
    public void puhu() {
        System.out.println("Goka vulgtm nglui cTsathoggua athg Yoggoth, vulgtm ph'hupadgh Azathoth ebunma.");
    }
}