
package models;

public class Doctor extends Persona{
   private String especialidad;
   private String tarjetaProfecional;

    public Doctor (String nombre, int edad, String cedula, String especialidad, String tarjetaProfecional) {
        super(nombre,cedula,edad);
        this.especialidad = especialidad;
        this.tarjetaProfecional = tarjetaProfecional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTarjetaProfecional() {
        return tarjetaProfecional;
    }

    public void setTarjetaProfecional(String tarjetaProfecional) {
        this.tarjetaProfecional = tarjetaProfecional;
    }

    @Override
    public String toString() {
        return "Doctor{" + "especialidad=" + especialidad + ", tarjetaProfecional=" + tarjetaProfecional + '}';
    }
   
    public void atender(Consulta c) {
        System.out.println(this.getNombre() + " está atendiendo la consulta de " + c.getMotivo());
    }
}
