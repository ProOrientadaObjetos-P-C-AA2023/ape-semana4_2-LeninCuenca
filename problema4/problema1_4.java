class EntidadFinanciera{
    private double valorCheque;
    private double valorComision;
    private double valorcheque;
    private Clientes clientes;
    private Bancoss bancoss;

    public EntidadFinanciera() {
    }

    public EntidadFinanciera(double valorCheque,Clientes clientes,Bancoss bancoss) {
        this.valorCheque = valorCheque;
        this.clientes=clientes;
        this.bancoss=bancoss;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public void calcularComisionBanco(){
        this.valorComision=(this.getValorCheque()*0.003);
        this.valorComision=valorComision;
    }
    public double getValorCheque() {
        return valorCheque;
    }

    @Override
    public String toString() {
        return "EntidadFinanciera{" +
                "\nvalorCheque= " + valorCheque+"\n" +
                "valorComision=" + valorComision+"\n" +
                "clientes=" + clientes +"\n"+
                "bancoss=" + bancoss +"\n"+
                '}';
    }
}
class Clientes{
    private String nombres;
    private String apellidos;
    private int cedula;

    public Clientes() {
    }

    public Clientes(String nombres, String apellidos, int cedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cedula=" + cedula +
                '}';
    }
}
class Bancoss{
    private String nombreBanco;
    private int sucursales;

    public Bancoss() {
    }

    public Bancoss(String nombreBanco, int sucursales) {
        this.nombreBanco = nombreBanco;
        this.sucursales = sucursales;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void setSucursales(int sucursales) {
        this.sucursales = sucursales;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public int getSucursales() {
        return sucursales;
    }

    @Override
    public String toString() {
        return "Bancoss{" +
                "nombreBanco='" + nombreBanco + '\'' +
                ", sucursales=" + sucursales +
                '}';
    }
}
public class problema1_4 {
    public static void main(String[] args) {
        Clientes clientes1=new Clientes("Lenin Andres","Cuenca Cuenca",1550051121);
        Bancoss bancoss1=new Bancoss("Banco Pichincha",206);
        EntidadFinanciera entidadFinanciera1=new EntidadFinanciera(40000,clientes1,bancoss1);
        entidadFinanciera1.calcularComisionBanco();
        System.out.println(entidadFinanciera1);
    }
}
