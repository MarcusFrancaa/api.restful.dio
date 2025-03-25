package dio.api.Api.Rest.Avanade.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table (name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank
    private String nome;

    @Column(nullable = false, unique = true)
    @NotBlank
    private String email;

    @Column(nullable = false)
    @NotBlank
    private String senha;

    @OneToMany (mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List <EmpresaColeta> Favoritas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<EmpresaColeta> getFavoritas() {
        return Favoritas;
    }

    public void setFavoritas(List<EmpresaColeta> Favoritas) {
        this.Favoritas = Favoritas;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
