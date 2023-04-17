public class Compiuter {
    private int id;
    private String ram;
    private String ssd;
    private String OS;
    private String colore;
    private String model;

    public Compiuter(String ram, String ssd, String OS, String colore, String model, int id){
        this.id = id;
        this.ram = ram;
        this.ssd = ssd;
        this.OS  = OS;
        this.colore = colore;
        this.model = model;

    }
    public  Integer getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public  String getRam() {
        return ram;
    }

    public void setRam(String ram){
        this.ram = ram;
    }

    public  String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd){
        this.ssd = ssd;
    }

    public  String getOS() {
        return OS;
    }

    public void setOS(String OS){
        this.OS = OS;
    }

    public  String getColore() {
        return colore;
    }

    public void setColore(String colore){
        this.colore = colore;

    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    @Override
    public String toString() {
        return "Compiuter{" +
                "id=" + id +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", OS='" + OS + '\'' +
                ", colore='" + colore + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
