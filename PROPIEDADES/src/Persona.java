public class Persona {
    private int documento;
    private String nombres;
    private String apellidos;
    private int edad;

    public Persona(int documento, String nombres, String apellidos, int edad) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getInformacion() {
        return "Documento: " + documento + ", Nombres: " + nombres + ", Apellidos: " + apellidos + ", Edad: " + edad;
    }
}
