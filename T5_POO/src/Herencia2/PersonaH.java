package Herencia2;

public abstract class PersonaH {

    protected String nombre, apellido;

    public PersonaH(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


    public void mostrarDatos() {
        System.out.println("Datos mostrados desde persona");
    }
}
