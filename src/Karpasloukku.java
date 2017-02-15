
public class Karpasloukku extends Kasvi implements Liikkuva, Yhteyttava {
    public Karpasloukku(Karpasloukku a, Karpasloukku b) {
        super(a, b);
    }
    public Karpasloukku lisaannySuvullisesti(Karpasloukku b) {
        return new Karpasloukku(this, b);
    }
    
    @Override
    public void liiku() {
        System.out.println("No jos nyt sitä vähän...");
    }
    @Override
    public float getYhteytysMaara(){ return 0.5f; };
}
