package school.hei.components;

public class Groupes {
    private final int id;
    private final String nom;

    public Groupes(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

}
