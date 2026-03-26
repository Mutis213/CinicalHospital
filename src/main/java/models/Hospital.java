
package models;

import java.util.ArrayList;

public class Hospital {
        private String nombre;
        private String ciudad;
        private ArrayList<Consulta> consultas;

    public Hospital(String nombre, String ciudad, ArrayList<Consulta> consultas) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.consultas = consultas;
    }

    public Hospital(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    

    public void registrarConsulta(Consulta c){
        consultas.add(c);
        System.out.println("Consulta registrada: " + c.getFecha());
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Consulta> getConsulta() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", consultas=" + consultas + '}';
    }
            
}
