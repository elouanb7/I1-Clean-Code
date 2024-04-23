package ex1;

import java.util.Date;

/**
 * The {@code Entreprise} class represents a company entity with basic information.
 */
public class Entreprise {

    /** The maximum capital allowed for an enterprise. */
    public static final int CAPITAL_MAX = 3000000;

    /** The SIRET (Systeme d'Identification du Repertoire des Entreprises et de leurs Etablissements) number of the enterprise. */
    public int siret;

    /** The name of the enterprise. */
    public String nom;

    /** The address of the enterprise. */
    public String adresse;

    /** The date of creation of the enterprise. */
    public Date date_creation;

    /**
     * Displays the status of the enterprise.
     */
    public void afficherStatut() {
        // Implementation details can be added here
    }

}