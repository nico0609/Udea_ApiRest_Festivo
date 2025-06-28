package festivos.api.core.interfaces.servicios;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import festivos.api.core.dominio.DTOs.FestivoDTO;


@Service
public interface IFestivoServicio {

    List<FestivoDTO> ListarPorAño(int año);
    boolean verificar(LocalDate fecha);


}
