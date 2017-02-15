
class Alruuna extends Aitotumainen implements Liikkuva, Puhuva {
    public Alruuna(Elain a, Kasvi b) {
        super(a, b);
    }
    public Alruuna(Kasvi a, Elain b) {
        super(a, b);
    }
    public Alruuna(Alruuna a, Alruuna b) {
        super(a, b);
    }
    
    public Alruuna lisaannySuvullisesti(Alruuna b) {
        return new Alruuna(this, b);
    }
    
}