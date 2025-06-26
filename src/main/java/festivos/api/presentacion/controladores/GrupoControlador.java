package campeonatosfifa.api.presentacion.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campeonatosfifa.api.core.dominio.DTOs.TablaPosicionDto;
import campeonatosfifa.api.core.dominio.entidades.Encuentro;
import campeonatosfifa.api.core.dominio.entidades.Grupo;
import campeonatosfifa.api.core.interfaces.servicios.IGrupoServicio;

@RestController
@RequestMapping("/api/grupos")
public class GrupoControlador {

    @Autowired
    private IGrupoServicio servicio;

    @GetMapping("/encuentros/{id}")
    public List<Encuentro> obtenerEncuentros(@PathVariable int id) {
        return servicio.obtenerEncuentros(id);
    }

    @GetMapping("/posiciones/{id}")
    public List<TablaPosicionDto> obtenerTablaPosiciones(@PathVariable int id) {
        return servicio.obtenerTablaPosiciones(id);
    }

    @GetMapping("/campeonato/{idCampeonato}")
    public List<Grupo> listarCampeonato(@PathVariable int idCampeonato) {
        return servicio.listarCampeonato(idCampeonato);
    }
}
