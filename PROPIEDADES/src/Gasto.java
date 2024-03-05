import java.util.Date;

public class Gasto {
    private int id_gasto;
    private Date fecha;
    private float valor;
    private String descripcion;

    public Gasto(int id_gasto, Date fecha, float valor, String descripcion) {
        this.id_gasto = id_gasto;
        this.fecha = fecha;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public String reporteGastos(Date fecha) {
        // Implementar la lógica para obtener el reporte de gastos para una fecha específica
        return "Reporte de gastos para la fecha " + fecha.toString();
    }

    public String reporteGastos() {
        // Implementar la lógica para obtener el reporte de todos los gastos
        return "Reporte de todos los gastos";
    }
}
