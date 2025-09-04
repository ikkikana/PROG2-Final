package school.hei.components;

import java.time.LocalDate;

public class Etudiant {
    private final  int id;
    private final  String nom;
    private final  String prenom;
    private  final LocalDate dateEntrer;
    private groupe groupeActuelle;

    public Etudiant(int id, String nom, String prenom, LocalDate dateEntrer, groupe groupeActuelle) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateEntrer = dateEntrer;
        this.groupeActuelle = groupeActuelle;
    }

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
