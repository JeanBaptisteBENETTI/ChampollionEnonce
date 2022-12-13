package champollion;

public class ServicePrevu {

    private UE ue;
    private Enseignant enseignant;
    private int volumeCM;
    private int volumeTD;
    private int volumeTP;

    /*public ServicePrevu(int volumeCM, int volumeTD, int volumeTP) {
        this.volumeCM = volumeCM;
        this.volumeTD = volumeTD;
        this.volumeTP = volumeTP;
    }*/

    public ServicePrevu(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        this.ue = ue;
        this.volumeCM = volumeCM;
        this.volumeTD = volumeTD;
        this.volumeTP = volumeTP;
    }

    public int getVolumeCM() {
        return volumeCM;
    }

    public int getVolumeTD() {
        return volumeTD;
    }

    public int getVolumeTP() {
        return volumeTP;
    }

    public UE getUe() {
        return ue;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setVolumeCM(int volumeCM) {
        this.volumeCM = volumeCM;
    }

    public void setVolumeTD(int volumeTD) {
        this.volumeTD = volumeTD;
    }

    public void setVolumeTP(int volumeTP) {
        this.volumeTP = volumeTP;
    }

    @Override
    public String toString() {
        return "ServicePrevu : \n" +
                "volumeCM = " + this.volumeCM +
                ", volumeTD = " + this.volumeTD +
                ", volumeTP = " + this.volumeTP;
    }
}
