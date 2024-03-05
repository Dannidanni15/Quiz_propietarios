public class Inquilino extends Persona {
    private String id_inquilino;
    private String numeroContrato;
    private String telefono;
    private String correo;

    public Inquilino(int documento, String nombres, String apellidos, int edad, String id_inquilino, String numeroContrato, String telefono, String correo) {
        super(documento, nombres, apellidos, edad);
        this.id_inquilino = id_inquilino;
        this.numeroContrato = numeroContrato;
        this.telefono = telefono;
        this.correo = correo;
    }

    @Override
    public String getInformacion() {
        return super.getInformacion() + ", ID Inquilino: " + id_inquilino + ", Contrato: " + numeroContrato + ", Teléfono: " + telefono + ", Correo: " + correo;
    }
}
