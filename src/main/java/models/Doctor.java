
package models;

public class Doctor extends Persona{
   private String especialidad;
   private String tarjetaProfecional;
   private int consultorio;

    public Doctor (String nombre, String cedula, int edad, int telefono, String especialidad, String tarjetaProfecional, int consultorio) {
        super(nombre,cedula,edad, telefono);
        this.especialidad = especialidad;
        this.tarjetaProfecional = tarjetaProfecional;
        this.consultorio = consultorio;
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

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }

    @Override
    public String toString() {
        return "Doctor{" + "especialidad=" + especialidad + ", tarjetaProfecional=" + tarjetaProfecional + "consultorio=" +consultorio + '}';
    }
   
    public void atender(Consulta c) {
        System.out.println(this.getNombre() + " está atendiendo la consulta de " + c.getMotivo());
    }
}
