package school.hei.TypePaiement;

import school.hei.components.Paiements;

import java.sql.Timestamp;

public class PaiementsMensuel extends Paiements {

    public PaiementsMensuel(int id, double montantPaye, Timestamp dateHeurePaiement) {
        super(id, montantPaye, dateHeurePaiement);
    }

}
