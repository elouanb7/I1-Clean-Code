// LivretA.java

package ex2;

public class LivretA extends CompteBancaire {

    public LivretA(String type, double solde, double tauxRemuneration) {
        super(type, solde, 0, tauxRemuneration);
    }

    @Override
    public void debiterMontant(double montant) {
        if (this.getSolde() >= montant) {
            this.setSolde(this.getSolde() - montant);
        }
    }

    @Override
    public void appliquerRemunerationAnnuelle() {
        double soldeActuel = this.getSolde();
        double tauxRemuneration = this.getTauxRemuneration();
        double interets = soldeActuel * tauxRemuneration / 100;
        this.setSolde(soldeActuel + interets);
    }
}
