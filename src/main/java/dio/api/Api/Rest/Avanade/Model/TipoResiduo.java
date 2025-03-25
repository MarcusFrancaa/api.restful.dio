package dio.api.Api.Rest.Avanade.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class TipoResiduo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank
    private String nome;

}
