package festivos.api.infraestructura.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import festivos.api.core.dominio.entidades.Tipo;

@Repository
public interface ITipoRepositorio extends JpaRepository<Tipo, Integer> {
}
