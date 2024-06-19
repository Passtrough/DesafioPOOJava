package Apple;

import Apple.internet.Navegador;
import Apple.musica.ReprodutorMusical;
import Apple.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

    public void tocarMusica() {
        System.out.println("Tocando Musica");
    }

    public void pausarMusica() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando Musica");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina");
    }

    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    public void ligar(String numero) {
        System.out.println("Discando...");
    }

    public void atender() {
        System.out.println("Alo, quem gostaria ?");
    }

    public void correioVoz() {
        System.out.println("tocando correio de voz");
    }
}
