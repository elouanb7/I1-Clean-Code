// CompteBancaire.java

package ex2;

public class CompteBancaire {

    private double solde;
    private double decouvert;
    private double tauxRemuneration;
    private String type;

    public CompteBancaire(String type, double solde, double decouvert) {
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
    }

    public CompteBancaire(String type, double solde, double decouvert, double tauxRemuneration) {
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
        this.tauxRemuneration = tauxRemuneration;
    }

    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    public void debiterMontant(double montant) {
        if (type.equals("CC")) {
            if (this.solde - montant >= -decouvert) { // Modification ici
                this.solde -= montant;
            }
        } else if (type.equals("LA")) {
            if (this.solde >= montant) { // Modification ici
                this.solde -= montant;
            }
        }
    }

    public void appliquerRemunerationAnnuelle() { // Modification ici
        if (type.equals("LA")) {
            this.solde += this.solde * this.tauxRemuneration / 100;
        }
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
