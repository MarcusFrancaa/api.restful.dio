### Diagrama de Classes

````mermaid
classDiagram
    class Usuario {
        UUID id
        String nome
        String email
        String senha
        List<EmpresaColeta> empresasFavoritas
    }

    class EmpresaColeta {
        UUID id
        String nome
        String endereco
        double latitude
        double longitude
        List<String> tiposResiduos
    }

    class TipoResiduo {
        UUID id
        String nome
    }

    Usuario "1" --> "*" EmpresaColeta 
    EmpresaColeta "*" --> "*" TipoResiduo
    Usuario "*" --> "*" TipoResiduo 
```
