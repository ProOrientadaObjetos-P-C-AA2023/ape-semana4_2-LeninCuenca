package semana4_2;

class Estudiante{
    private String nombreEst;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private Universidad universidad;

    public Estudiante(){}

    public Estudiante(String nombreEst, double nota1, double nota2, double nota3, Universidad universidad) {
        this.nombreEst = nombreEst;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.universidad=universidad;
    }

    public String getNombreEst() {

        return nombreEst;
    }

    public double getNota1() {

        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {

        return nota3;
    }

    public double getPromedio() {

        return promedio;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void calcularpormedio() {
        this.promedio = ((this.getNota1()+this.getNota2()+this.getNota3())/3);
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombreEst='" + nombreEst + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", promedio=" + promedio +
                ", universidad="+universidad+
                '}';
    }

}
class Universidad{
    private String nombreUnv;
    private String direccion;

    public Universidad() {
    }

    public Universidad(String nombreUnv, String direccion) {
        this.nombreUnv = nombreUnv;
        this.direccion = direccion;
    }

    public String getNombreUnv() {
        return nombreUnv;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombreUnv(String nombreUnv) {
        this.nombreUnv = nombreUnv;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombreUnv='" + nombreUnv + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

public class problema1_1 {
    public static void main(String[] args) {
        Universidad universidad1=new Universidad("UTPL","loja");
        Universidad universidad2=new Universidad("UNL","Argelia");
        Estudiante estudiante1=new Estudiante("lenin",10,10,10,universidad2);
        estudiante1.calcularpormedio();
        System.out.println(estudiante1);
       // System.out.println(universidad1);
    }
 }



