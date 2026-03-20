
package com.mycompany.cinicalhospital;

public class Doctor {
   private String especialidad;
   private String tarjetaProfecional;

    public Doctor(String especialidad, String tarjetaProfecional) {
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
   
}
