import java.util.Date;

public class Impuesto extends Gasto {
    private int id_impuesto;
    private String nombre;
    private String estado;

    public Impuesto(int id_impuesto, String nombre, String estado, int id_gasto, Date fecha, float valor, String descripcion) {
        super(id_gasto, fecha, valor, descripcion);
        this.id_impuesto = id_impuesto;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getInformacionImpuesto() {
        return "ID Impuesto: " + id_impuesto + ", Nombre: " + nombre + ", Estado: " + estado + ", " + super.reporteGastos();
    }
}
