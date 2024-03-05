public class Propiedad {
    private String id_Propiedad;
    private String num_matricula;
    private String ciudad;
    private String direccion;
    private String descripcion;

    public Propiedad(String id_Propiedad, String num_matricula, String ciudad, String direccion, String descripcion) {
        this.id_Propiedad = id_Propiedad;
        this.num_matricula = num_matricula;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.descripcion = descripcion;
    }

    public String getId_Propiedad() {
        return this.id_Propiedad;
    }

    public String getNum_matricula() {
        return this.num_matricula;
    }

    public String getInformacion() {
        return "ID: " + this.id_Propiedad + ", Matrícula: " + this.num_matricula + ", Ciudad: " + this.ciudad + ", Dirección: " + this.direccion + ", Descripción: " + this.descripcion;
    }
}
