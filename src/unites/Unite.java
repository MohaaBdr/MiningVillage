package unites;
import outils.Position;
import ressources.Item;
import ressources.Ressource;

import java.util.ArrayList;

public abstract class Unite {

    //vrai si l'unite est en vie, faux sinon
    protected boolean enVie;
    protected Position position;
    //Ressources d'une unite
    protected ArrayList<Ressource> ressources;

    public Unite (){
        this.enVie = true;
        this.ressources = new ArrayList<>();
        this.ressources.add(new Ressource(Item.or));
        this.ressources.add(new Ressource(Item.fer));
        this.ressources.add(new Ressource(Item.charbon));
        this.ressources.add(new Ressource(Item.piece));
    }

    public void deplace(int a, int b){
        position.deplaceX(a);
        position.deplaceY(b);
    }

    /**
     * La fonction qui renvoie la quantite de la ressource correspondante a l item en parametre
     * @param item
     * @return la quantite de la ressource
     */
    public int getItem(Item item){
        for (Ressource r : this.ressources){
            if (r.getItem() == item) return r.getQuantite();
        }
        return 0;
    }

    public void setItemQuantite(Item item, int q){
        for (Ressource r : this.ressources){
            if (r.getItem() == item) r.setQuantite(q);
        }
    }

    /**
     * La fonction qui augmente la quantite d'une ressource en fonction de l'item
     * @param item
     * @param q la quantite a incrementer
     */
    public void incrItem(Item item, int q){
        for (Ressource r : this.ressources){
            if (r.getItem() == item) r.incrQuantite(q);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (Ressource r : ressources){
            s = s + "\n" +  r.toString();
        }
        return s;
    }
}
