## Santander 2024 - Backend with Java


### Diagrama UML (Mermaid)
```mermaid
classDiagram

    class iPhone {
    

    iPhone --> ReprodutorMusical {
        class interface ReprodutorMusical {
        +tocar() : void
        +pausar() : void
        +selecionarMusica(String musica, String artista, String ano) : void
        }
    }
     
    iPhone --> AparelhoTelefonico {
        class interface AparelhoTelefonico {
        +ligar(String numero) : void
        +atender() : void
        +iniciarCorreioVoz() : void
        }
    }

    iPhone --> NavegadorInternet {
        class interface NavegadorInternet {
        +exibirPagina(String url) : void
        +adicionarNovaAba : void
        +atualizarPagina : void
        }
    }
}
 
```
