package champollion;

import java.util.Date;

public class Intervention {

    private Salle salle;

    private UE ue;

    private TypeIntervention typeInter;
    private Date debut;
    private int duree;
    private boolean annule;
    private int heureDebut;

    public Intervention(Date debut, int duree, boolean annule, int heureDebut) {
        this.debut = debut;
        this.duree = duree;
        this.annule = annule;
        this.heureDebut = heureDebut;
    }

    public Date getDebut() {
        return debut;
    }

    public int getDuree() {
        return duree;
    }

    public boolean isAnnule() {
        return annule;
    }

    public int getHeureDebut() {
        return heureDebut;
    }

    public Salle getSalle() {
        return salle;
    }

    public UE getUe() {
        return ue;
    }

    public TypeIntervention getTypeInter() {
        return typeInter;
    }

    @Override
    public String toString() {
        return "Intervention : \n" +
                "debut = " + debut +
                ", duree = " + duree +
                ", annule = " + annule +
                ", heureDebut = " + heureDebut;
    }
}
