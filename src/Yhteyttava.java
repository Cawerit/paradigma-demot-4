
import java.util.Random;

public interface Yhteyttava {

    default float getYhteytysMaara(){ return 2.5f; };

    default void yhteyta() {
        float satunnaisuus = new Random().nextFloat();
        System.out.println("Yhteyttää " + (getYhteytysMaara() * satunnaisuus));
    }

}
