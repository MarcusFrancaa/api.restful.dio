package dio.api.Api.Rest.Avanade.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;



@Entity
@Table(name = "tb_EmpresaColeta")
public class EmpresaColeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false)
    @NotBlank
    private String nome;

    @Column(nullable = false)
    @NotBlank
    private String endereco;

    @Column(nullable = false)
    @NotBlank
    private String telefone;

    @Column(nullable = false)
    @NotBlank
    private String residuos;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank String getNome() {
        return nome;
    }

    public void setNome(@NotBlank String nome) {
        this.nome = nome;
    }

    public @NotBlank String getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotBlank String endereco) {
        this.endereco = endereco;
    }

    public @NotBlank String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank String getResiduos() {
        return residuos;
    }

    public void setResiduos(@NotBlank String residuos) {
        this.residuos = residuos;
    }
}

