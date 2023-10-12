package Plataforma;

import Aplicativos.Musica.ReproduzirMusica;
import Aplicativos.Navegador.NavegadorInternet;
import Aplicativos.Telefone.AparelhoTelefonico;
import Funcoes.Funcoes;

public class Aparelho {
    public static void main(String[] args) {
        Funcoes iphone = new Funcoes();
        ReproduzirMusica musica = (ReproduzirMusica) iphone;
        AparelhoTelefonico telefonico = (AparelhoTelefonico) iphone;
        NavegadorInternet internet = (NavegadorInternet) iphone;


        System.out.println("Musica");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
        System.out.println(" ");

        System.out.println("Telefone");
        telefonico.ligar();
        telefonico.atender();
        telefonico.iniciarCorreioVoz();
        System.out.println(" ");

        System.out.println("Internet");
        internet.pagina();
        internet.adicionandoNovaPagina();
        internet.atualizaPagina();
    }
}
