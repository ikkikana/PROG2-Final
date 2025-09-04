import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import school.hei.components.*;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PaiementTests {
    private Etudiant etudiant1;
    private Etudiant etudiant2;
    private Paiements paiementGates;
    private Paiements paiementMusk;

    @BeforeEach
    public void setUp() {
        etudiant1 = new Etudiant(1, "Bill", "GATES", LocalDate.now(), groupe.K1);
        etudiant2 = new Etudiant(2, "Elon", "Musk", LocalDate.now(), groupe.K2);
        paiementGates = new Paiements(3, 288000, 2025-12-12);
        paiementMusk = new Paiements(4, 99999999, 1997-06-11);
    }

    @Test

    public void Etudiant1TestStatus() {
        assertEquals("PAID", Frais.getStatus());
    }
    public void Etudiant2TestStatus() {
        assertEquals("OVERPAID", Frais.getStatus());
    }
}
