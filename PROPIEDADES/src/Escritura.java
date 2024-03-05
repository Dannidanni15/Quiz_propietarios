import java.util.Date;

public class Escritura {
    private int numero;
    private Date fecha;
    private int notaria;

    public Escritura(int numero, Date fecha, int notaria) {
        this.numero = numero;
        this.fecha = fecha;
        this.notaria = notaria;
    }

    public String getInformacion() {
        return "Número: " + numero + ", Fecha: " + fecha.toString() + ", Notaria: " + notaria;
    }
}
