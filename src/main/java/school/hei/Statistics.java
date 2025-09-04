package school.hei;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

public class Statistics {
 private double fees;
 private double MissingFees;
 private double totalFees;

    public Statistics(double fees, double missingFees, double totalFees) {
        this.fees = fees;
        MissingFees = missingFees;
        this.totalFees = totalFees;
    }

    public double getFees() {
        return fees;
    }

    public double getMissingFees() {
        return MissingFees;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public List<Fees> getLateFees(List<fee> fees, Instant t) {
        return fees.stream().filter(f -> f.getDate().isAfter(t)).collect(Collectors.toList());
    }
    public double getTotalMissingFees(List<Fee> fees, Instant t) {
        return MissingFees;
    }
    public getTotalPaidByStudent(Etudiant student, List<Fees> fraiss, Instant t){
        return totalFees;
    }
}
