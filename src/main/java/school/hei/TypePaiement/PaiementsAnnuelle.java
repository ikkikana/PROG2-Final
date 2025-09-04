package school.hei.TypePaiement;

import school.hei.components.Paiements;

import java.sql.Timestamp;

public class PaiementsAnnuelle extends Paiements {

    public PaiementsAnnuelle(int id, double montantPaye, Timestamp dateHeurePaiement) {
        super(id, montantPaye, dateHeurePaiement);
    }
}
