
class Automotoress {
    private int cedulaDueño;
    private String marcaVehiculo;
    private int anioFabri;
    private double valorVehiculo;
    private double valorMatricula;
    private Fabricante fabricante;


    public Automotoress() {
    }

    public Automotoress(int cedulaDueño, String marcaVehiculo, int anioFabre, double valorVehiculo,Fabricante fabricante) {
        this.cedulaDueño = cedulaDueño;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabri = anioFabre;
        this.valorVehiculo = valorVehiculo;
        this.fabricante=fabricante;
    }

    public void setCedulaDueño(int cedulaDueño) {
        this.cedulaDueño = cedulaDueño;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public void setAnioFabri(int anioFabri) {
        this.anioFabri = anioFabri;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }
    public void calcularValormatricula() {
        this.valorMatricula =((this.getValorVehiculo()*0.002)*(2023-this.getAnioFabri()));
        this.valorMatricula =valorMatricula;
    }

    public int getCedulaDueño() {
        return cedulaDueño;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int getAnioFabri() {
        return anioFabri;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        return "Automotoress{" +
                "cedulaDueño=" + cedulaDueño +
                ", marcaVehiculo='" + marcaVehiculo + '\'' +
                ", anioFabri=" + anioFabri +
                ", valorVehiculo=" + valorVehiculo +
                ", valorMatricula=" + valorMatricula +
                ", fabricante=" + fabricante +
                '}';
    }
}
class Fabricante{
    private String nombreFabricante;
    private String ciudadOrigen;

    public Fabricante() {
    }

    public Fabricante(String nombreFabricante, String ciudadOrigen) {
        this.nombreFabricante = nombreFabricante;
        this.ciudadOrigen = ciudadOrigen;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "nombreFabricante='" + nombreFabricante + '\'' +
                ", ciudadOrigen='" + ciudadOrigen + '\'' +
                '}';
    }
}
public class problema1_3 {
    public static void main(String[] args) {
        Fabricante fabricante1=new Fabricante("Nissan Motor Co., Ltd.","Japon");
        Fabricante fabricante2=new Fabricante("Ford Motor Company","Detroit, Míchigan.");
        Automotoress automotores1=new Automotoress(1550041121,"Nissan",1980,25400,fabricante1);
        automotores1.calcularValormatricula();
        System.out.println(automotores1);
    }
}
