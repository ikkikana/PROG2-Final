package school.hei.components;

import java.time.Instant;

public class Frais {
    private int id;
    private String label;
    private double montantAPayer;
    private Instant deadline;

    public Frais(int id, String label, double montantAPayer, Instant deadline) {
        this.id = id;
        this.label = label;
        this.montantAPayer = montantAPayer;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public double getMontantAPayer() {
        return montantAPayer;
    }

    public Instant getDeadline() {
        return deadline;
    }

    public String getStatus(){
        var status1 = "IN_PROGRESS";
        var status2 = "PAID";
        var status3 = "LATE";
        var status4 = "OVERPAID";
        var status5 = "None";

        if (deadline.isBefore(Instant.now())) {
            return status1;
        }
        if (deadline.isAfter(Instant.now())) {
            return status3;
        }
        if (Etudiant.montantApayer == this.montantAPayer) {
            return status2;
        }
        if (Etudiant.montantApayer > this.montantAPayer) {
            return status4;
        }
        return status5;
    }

}
