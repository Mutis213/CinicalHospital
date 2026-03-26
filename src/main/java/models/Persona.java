
package models;


public class Persona {
    private String nombre;
    private String cedula;
    private int edad;
    private int telefono ;

    public Persona(String nombre, String cedula, int edad, int telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad +", telefono=" + telefono + '}';
    }

}
