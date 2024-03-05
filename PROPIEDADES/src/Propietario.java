import java.util.ArrayList;

public class Propietario extends Persona {
    private ArrayList<Propiedad> propiedades;

    public Propietario(int documento, String nombres, String apellidos, int edad, ArrayList<Propiedad> propiedades) {
        super(documento, nombres, apellidos, edad);
        this.propiedades = propiedades;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return this.propiedades;
    }
}
