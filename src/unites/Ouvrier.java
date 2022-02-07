package unites;

import ressources.Item;
import ressources.Ressource;

import java.util.ArrayList;

public class Ouvrier extends Unite{

    //Prix d'un ouvrier
    public final static int PRIX = 10;
    //Consommation d'un ouvrier en nourriture
    public final static int CONS = 2;
    //Vrai si l'ouvrier est dans une mine, faux sinon
    private boolean enTravail;
    //Valeur representant la forme de l'ouvrier de 0 a 10 : 10 en forme et il meurt a 0
    private int forme;

    public Ouvrier(){
        super();
        this.enTravail = false;
        this.forme = 10;
    }

    /**
     * La fonction qui remet a 0 la quantite d'une ressource de l'ouvrier
     * @param ressource la ressource
     */
    public void donneRessource(Ressource ressource){
        if (Item.or == ressource.getItem()) setItemQuantite(Item.or, 0);
        else if (Item.fer == ressource.getItem()) setItemQuantite(Item.fer, 0);
        else if (Item.charbon == ressource.getItem()) setItemQuantite(Item.charbon, 0);
        else if (Item.piece == ressource.getItem()) setItemQuantite(Item.piece, 0);
        else {
            System.out.println("donneRessource() : pas la bonne ressource");
        }
    }

    /**
     * inverse la valeur de enTravail
     */
    public void changeTravail(){
        this.enTravail = !this.enTravail;
    }

    /**
     * Verifie la fatigue de l'ouvrier
     */
    public void verifForme(){
        if(this.forme == 0) this.enVie = false;
    }

    public void incrForme(){
        this.forme++;
    }

    public void decrForme(){
        this.forme--;
    }
}
