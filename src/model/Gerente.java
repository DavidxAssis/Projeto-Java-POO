package model;

import interfaces.ICamareira;
import interfaces.IRecepcionista;

public class Gerente extends Pessoa implements ICamareira, IRecepcionista {

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void arrumarACama() {
        System.out.println("Sei muito bem arrumar a cama mais ou menos ");
        System.out.println();
    }

    @Override
    public void limparQuarto() {
        System.out.println("Sei muito bem limpar o quarto mais ou menos ");
        System.out.println();
    }
    @Override
    public void falarIngles() {
        System.out.println("Sei falar inglês very wel ");
        System.out.println();
    }

    @Override
    public void saberAtenderTelefone() {
        System.out.println("Sei atender o telefone");
        System.out.println();
    }

}
