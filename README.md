### Diagrama de Classes

````mermaid
classDiagram
    class Usuario {
        Long id
        String nome
        String email
        String senha
        List<EmpresaColeta> Favoritas
    }

    class EmpresaColeta {
        Long id
        String nome
        String endereco
        List<String> tiposResiduos
    }

    class TipoResiduo {
        Long id
        String nome
    }

    Usuario "1" --> "*" EmpresaColeta 
    EmpresaColeta "*" --> "*" TipoResiduo
    Usuario "*" --> "*" TipoResiduo 
```
