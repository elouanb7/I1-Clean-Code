package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets", 5));
        caisses.add(new Caisse("Moyens objets", 20));
        caisses.add(new Caisse("Grands objets", Integer.MAX_VALUE));
    }

    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.peutAjouter(item)) {
                caisse.getItems().add(item);
                return;
            }
        }
    }

    public int taille() {
        int tailleTotale = 0;
        for (Caisse caisse : caisses) {
            tailleTotale += caisse.getItems().size();
        }
        return tailleTotale;
    }
}
