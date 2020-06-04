package plantenApp.java.model;

/**@author Siebe*/
public class Plant {
    private int id;
    private String type;
    private String familie;
    private String geslacht;
    private String soort;
    private String variatie;
    private int minPlantdichtheid;
    private int maxPlantdichtheid;
    private String fgsv;
    private int status;
  private Foto foto;
    private Beheer beheer;
    private AbiotischeFactoren abiotischeFactoren;
    private Commensalisme commensalisme;
    private Fenotype fenotype;
    private Extra extra;


    public Plant(int id, String type, String familie, String geslacht, String soort, String variatie, int minPlantdichtheid, int maxPlantdichtheid,int status) {
        this.id = id;
        this.type = type;
        this.familie = familie;
        this.geslacht = geslacht;
        this.soort = soort;
        this.variatie = variatie;
        this.minPlantdichtheid = minPlantdichtheid;
        this.maxPlantdichtheid = maxPlantdichtheid;
        this.status = status;

    }

    public Plant(int id, String type, String familie, String geslacht, String soort, String variatie, int minPlantdichtheid, int maxPlantdichtheid, String fgsv, int status) {
        this.id = id;
        this.type = type;
        this.familie = familie;
        this.geslacht = geslacht;
        this.soort = soort;
        this.variatie = variatie;
        this.minPlantdichtheid = minPlantdichtheid;
        this.maxPlantdichtheid = maxPlantdichtheid;
        this.fgsv = fgsv;
        this.status = status;
    }

    public String getFgsv() {
        return fgsv;
    }

    public void setFgsv(String fgsv) {
        this.fgsv = fgsv;
    }

    public Plant(int id, String type, String familie, String geslacht, String soort, String variatie, int minPlantdichtheid, int maxPlantdichtheid, String fgsv) {
        this.id = id;
        this.type = type;
        this.familie = familie;
        this.geslacht = geslacht;
        this.soort = soort;
        this.variatie = variatie;
        this.minPlantdichtheid = minPlantdichtheid;
        this.maxPlantdichtheid = maxPlantdichtheid;
        this.fgsv = fgsv;
    }



    public Plant(int id, String type, String familie, String geslacht, String soort, String variatie, int minPlantdichtheid, int maxPlantdichtheid, Foto foto, Beheer beheer, AbiotischeFactoren abiotischeFactoren, Commensalisme commensalisme, Fenotype fenotype, Extra extra) {
        this.id = id;
        this.type = type;
        this.familie = familie;
        this.geslacht = geslacht;
        this.soort = soort;
        this.variatie = variatie;
        this.minPlantdichtheid = minPlantdichtheid;
        this.maxPlantdichtheid = maxPlantdichtheid;
        this.foto = foto;
        this.beheer = beheer;
        this.abiotischeFactoren = abiotischeFactoren;
        this.commensalisme = commensalisme;
        this.fenotype = fenotype;
        this.extra = extra;
    }

    public Plant(String type, String familie, String geslacht, String soort, String variatie){
        this.type = type;
        this.familie = familie;
        this.geslacht = geslacht;
        this.soort = soort;
        this.variatie = variatie;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getFamilie() {
        return familie;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public String getSoort() {
        return soort;
    }

    public String getVariatie() {
        return variatie;
    }

    public int getMinPlantdichtheid() {
        return minPlantdichtheid;
    }

    public int getMaxPlantdichtheid() {
        return maxPlantdichtheid;
    }

    public Foto getFoto() {
        return foto;
    }

    public Beheer getBeheer() {
        return beheer;
    }

    public AbiotischeFactoren getAbiotischeFactoren() {
        return abiotischeFactoren;
    }

    public Commensalisme getCommensalisme() {
        return commensalisme;
    }

    public Fenotype getFenotype() {
        return fenotype;
    }

    public Extra getExtra() {
        return extra;
    }

    public int getStatus() {return status;
    }
}
