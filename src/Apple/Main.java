package Apple;

    public class Main {
        public static void main(String[] args) {
            Iphone meuIphone = new Iphone();

            // Testando Reprodutor
            meuIphone.tocarMusica();
            meuIphone.pausarMusica();
            meuIphone.selecionarMusica();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            // Testando Aparelho
            meuIphone.ligar("123456789");
            meuIphone.atender();
            meuIphone.correioVoz();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            // Testando Navegador
            meuIphone.exibirPagina("www.exemplo.com");
            meuIphone.adicionarNovaAba();
            meuIphone.atualizarPagina();
        }
    }


