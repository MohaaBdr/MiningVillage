package unites;

import ressources.Item;
import ressources.Ressource;

import java.util.ArrayList;

public class Chef extends Unite{

    //Prix d'un chef
    public final static int PRIX = 100;
    //Consommation d'un chef en nourriture
    public final static int CONS = 10;

    public Chef (){
        super();
    }


    /**
     * La fonction qui ajoute la quantite d'une ressource dans les ressources du chef
     * @param ressource la ressource a ajouter
     */
    private void ajoutRessource(Ressource ressource){
        if (Item.or == ressource.getItem()) incrItem(Item.or, ressource.getQuantite());
        else if (Item.fer == ressource.getItem()) incrItem(Item.fer, ressource.getQuantite());
        else if (Item.charbon == ressource.getItem()) incrItem(Item.charbon, ressource.getQuantite());
        else if (Item.piece == ressource.getItem()) incrItem(Item.piece, ressource.getQuantite());
        else {
            System.out.println("ajoutRessource() : pas la bonne ressource");
        }
    }

    /**
     * La fonction qui ajoute les ressources d'un ouvrier a celle du chef
     * @param rOuvrier la liste de ressources d'un ouvrier
     */
    public void recuperer(Ouvrier ouvrier){
        for (Ressource r : ouvrier.ressources){
            ajoutRessource(r);
            ouvrier.donneRessource(r);
        }

    }


}
