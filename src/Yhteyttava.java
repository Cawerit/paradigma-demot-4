
public interface Yhteyttava {

    default float getYhteytysMaara(){ return 0.5f; };

    default void yhteyta() {
        System.out.println("Yhteyttää " + getYhteytysMaara());
    }

}
