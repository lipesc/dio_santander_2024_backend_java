## Santander 2024 - Backend with Java


### Diagrama UML (Mermaid)
```mermaid
---
title: UML
---
classDiagram
  
    iPhone<|-- ReprodutorMusical
    
    iPhone<|-- AparelhoTelefonico
    iPhone<|-- NavegadorInternet
    iPhone: +String Iphone iphone()
    iPhone: iphone.tocar(100)
    iPhone: pausar()
    iPhone: selecionarMusica()
    iPhone: ligar()
    iPhone: atender()
    iPhone: iniciarCorreioVoz()
    iPhone: exibirPagina()
    iPhone: adicionarNovaAba()
    iPhone: atualizarPagina()
    class ReprodutorMusical{
        +tocar(int volume)
        +pausar()
        +selecionarMusica(String musica, String artista, String ano)
    }
    class AparelhoTelefonico{
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz() 
    }
    class NavegadorInternet{
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

 
```
