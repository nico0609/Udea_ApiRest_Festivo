package festivos.api.presentacion.controladores;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import festivos.api.core.dominio.DTOs.FestivoDTO;
import festivos.api.core.interfaces.servicios.IFestivoServicio;

@RestController
@RequestMapping("/festivos")
public class FestivoContolador {

    private IFestivoServicio servicio;

    public FestivoContolador(IFestivoServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/listar/{año}")
    public List<FestivoDTO> ListarPorAño(@PathVariable int año) {
        return servicio.ListarPorAño(año);
    }

    @GetMapping("/verificar/{año}/{mes}/{dia}")
    public ResponseEntity<String> verificar(@PathVariable int año, @PathVariable int mes, @PathVariable int dia) {
        try {
            LocalDate fecha = LocalDate.of(año, mes, dia);
            boolean esFestivo = servicio.verificar(fecha);
            if (esFestivo) {
                return ResponseEntity.ok("Es Festivo");
            } else {
                return ResponseEntity.ok("No es Festivo");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Fecha no válida");
        }
    }

}
