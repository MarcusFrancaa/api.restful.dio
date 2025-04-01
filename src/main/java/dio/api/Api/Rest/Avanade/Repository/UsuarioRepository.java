package dio.api.Api.Rest.Avanade.Repository;

import dio.api.Api.Rest.Avanade.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario,Long> {
}
