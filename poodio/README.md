## Santander 2024 - Backend with Java


### Diagrama UML (Mermaid)
```mermaid
classDiagram
    class interface ReprodutorMusical {
        +tocar() : void
        +pausar() : void
        +selecionarMusica(String musica) : void

    }

    class interface AparelhoTelefonico {
        +ligar(String numero) : void
        +atender() : void
        +iniciarCorreioVoz() : void
    }

    class interface NavegadorInternet {
        +exibirPagina(String url) : void
        +adicionarNovaAba : void
        +atualizarPagina : void
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
