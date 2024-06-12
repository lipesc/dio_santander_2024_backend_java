
/*## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 até 00:55

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java. */

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Chamar os métodos da classe iPhone
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Canção do amor");
        iphone.ligar("12345678");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

    @Override
    public void tocar() {
        // Lógica para reproduzir música
    }

    @Override
    public void pausar() {
        // Lógica para pausar a reprodução de música
    }

    @Override
    public void selecionarMusica(String musica) {
        // Lógica para selecionar uma música
        System.out.println("Selecionando: " + musica);
    }

    @Override
    public void ligar(String numero) {
        // Lógica para ligar o telefone
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        // Lógica para atender a ligação
    }

    @Override
    public void iniciarCorreioVoz() {
        // Lógica para iniciar o correio de voz
    }

    @Override
    public void exibirPagina(String url) {
        // Lógica para exibir uma página na web
    }

    @Override
    public void adicionarNovaAba() {
        // Lógica para adicionar uma nova aba no navegador
    }

    @Override
    public void atualizarPagina() {
        // Lógica para atualizar a página atual
    }
}