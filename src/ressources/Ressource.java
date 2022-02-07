package ressources;

public class Ressource {

    private Item item;
    private int quantite;

    public Ressource(Item item){
        this.item = item;
        this.quantite = 0;
    }

    public Item getItem(){
        return this.item;
    }

    public int getQuantite() {
        return quantite;
    }

    public void incrQuantite(int x){
        this.quantite += x;
    }

    public void setQuantite(int x) {
        this.quantite = x;
    }

    @Override
    public String toString() {
        return "Ressource{" +
                "item=" + item +
                ", quantite=" + quantite +
                '}';
    }
}