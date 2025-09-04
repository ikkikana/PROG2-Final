package school.hei.components;

import java.sql.Timestamp;

public class Paiements {
    private int id;
    private double montantPaye;
    private Timestamp dateHeurePaiement;

    public Paiements(int id, double montantPaye, Timestamp dateHeurePaiement) {
        this.id = id;
        this.montantPaye = montantPaye;
        this.dateHeurePaiement = dateHeurePaiement;
    }

    public int getId() {
        return id;
    }

    public double getMontantPaye() {
        return montantPaye;
    }

    public Timestamp getDateHeurePaiement() {
        return dateHeurePaiement;
    }

}
