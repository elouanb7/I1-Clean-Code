package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private int capaciteMax;
    private List<Item> items;

    public Caisse(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.items = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean peutAjouter(Item item) {
        return item.getPoids() <= capaciteMax;
    }
}
