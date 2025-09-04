package school.hei.components;

import java.time.Instant;
import java.time.LocalDate;

public class Etudiant extends Frais {
    private final  int id;
    private final  String nom;
    private final  String prenom;
    private  final LocalDate dateEntrer;
    private groupe groupeActuelle;

    public Etudiant(int id, String label, double montantAPayer, Instant deadline, int id1, String nom, String prenom, LocalDate dateEntrer, groupe groupeActuelle) {
        super(id, label, montantAPayer, deadline);
        this.id = id1;
        this.nom = nom;
        this.prenom = prenom;
        this.dateEntrer = dateEntrer;
        this.groupeActuelle = groupeActuelle;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateEntrer() {
        return dateEntrer;
    }

    public groupe getGroupeActuelle() {
        return groupeActuelle;
    }
}
