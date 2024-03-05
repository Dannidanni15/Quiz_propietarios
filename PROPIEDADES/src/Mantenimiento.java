import java.util.Date;

public class Mantenimiento extends Gasto {
    private int id_mantenimiento;
    private String responsable;

    public Mantenimiento(int id_mantenimiento, String responsable, int id_gasto, Date fecha, float valor, String descripcion) {
        super(id_gasto, fecha, valor, descripcion);
        this.id_mantenimiento = id_mantenimiento;
        this.responsable = responsable;
    }

    public String getInformacionMantenimiento() {
        return "ID Mantenimiento: " + id_mantenimiento + ", Responsable: " + responsable + ", " + super.reporteGastos();
    }
}
