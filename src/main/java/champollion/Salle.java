package champollion;

public class Salle {

    private String intitule;
    private int capacite;

    public Salle(String intitule, int capacite) {
        this.intitule = intitule;
        this.capacite = capacite;
    }

    public String getIntitule() {
        return intitule;
    }

    public int getCapacite() {
        return capacite;
    }

    @Override
    public String toString() {
        return "Salle :\n" +
                "intitule = '" + this.intitule +
                ", capacite = " + this.capacite;
    }
}
