
public class Sinileva extends Kasvi implements Yhteyttava {
    public Sinileva(Sinileva a, Sinileva b) {
        super(a, b);
    }
    public Sinileva lisaannySuvuttomasti() {
        return new Sinileva(this, null);
    }
}
