package festivos.api.core.dominio.DTOs;

import java.time.LocalDate;

public class FestivoDTO {
    
    private LocalDate fecha;
    private String nombre;

    public FestivoDTO(String nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
