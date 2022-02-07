import ressources.Item;
import unites.Chef;
import unites.Ouvrier;

public class Main {

    public static void main(String[] args) {
        Chef c = new Chef();
        Ouvrier v = new Ouvrier();

        System.out.println(c + "\n" + v);

        v.setItemQuantite(Item.fer, 100);

        System.out.println(c + "\n" + v);

        c.recuperer(v);

        System.out.println(c + "\n" + v);

    }
}
