
package models;


public class Consulta {
    private String fecha;
    private String motivo;
    private String diagnostico;
    private int duracionMinutos;

    public Consulta(String fecha, String motivo, String diagnostico, int duracionMinutos) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.duracionMinutos = duracionMinutos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    

    @Override
    public String toString() {
        return "Consulta{" + "fecha=" + fecha + ", motivo=" + motivo + ", diagnostico=" + diagnostico + "duracionMinutos=" + duracionMinutos +'}';
    }
    
}
