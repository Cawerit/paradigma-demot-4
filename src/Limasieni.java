
public class Limasieni extends Alkuelio implements Liikkuva, Labyrinttipako {
    public Limasieni(Limasieni a, Limasieni b) {
        super(a, b);
    }
    public Limasieni lisaannySuvullisesti(Limasieni b) {
        return new Limasieni(this, b);
    }
    public Limasieni lisaannySuvuttomasti() {
        return new Limasieni(this, null);
    }
    
    @Override
    public void liiku() {
        System.out.println("Hitaasti mutta varmasti!");
    }
}
