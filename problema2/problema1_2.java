class Profesores{
    private String nombre;
    private String apellido;
    private double sueldoBas;
    private double sueldoTot;
    private int cedula;
    private String provinciaNac;
    private Provincia provincia;

    public Profesores() {
    }

    public Profesores(String nombre, String apellido, double sueldoBas, int cedula, String provinciaNac,Provincia provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBas = sueldoBas;
        this.cedula = cedula;
        this.provinciaNac = provinciaNac;
        this.provincia=provincia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldoBas(double sueldoBas) {
        this.sueldoBas = sueldoBas;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setProvinciaNac(String provinciaNac) {
        this.provinciaNac = provinciaNac;
    }
    public void calcularSueldototal(){
        this.sueldoTot =((this.sueldoBas*0.2));
        this.sueldoTot=sueldoTot+sueldoBas;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sueldoBas=" + sueldoBas +
                ", sueldoTot=" + sueldoTot +
                ", cedula=" + cedula +
                ", provinciaNac='" + provinciaNac + '\'' +
                ", provincia=" + provincia +
                '}';
    }
}
class Provincia{
    private String nombreProv;
    private int numHabit;

    public Provincia() {
    }

    public Provincia(String nombreProv, int numHabit) {
        this.nombreProv = nombreProv;
        this.numHabit = numHabit;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public void setNumHabit(int numHabit) {
        this.numHabit = numHabit;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public int getNumHabit() {
        return numHabit;
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "nombreProv='" + nombreProv + '\'' +
                ", numHabit=" + numHabit +
                '}';
    }
}


public class problema1_2 {
    public static void main(String[] args) {
        Provincia provincia1=new Provincia("Loja",214855);
        Provincia provincia2=new Provincia("Napo",133705);
        Profesores profesores1=new Profesores("Luis","Diaz",450,1550041121,"Loja",provincia2);
        profesores1.calcularSueldototal();
        System.out.println(profesores1);
    }
}
