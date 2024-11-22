package model;

import interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista {

    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void falarIngles() {
        System.out.println("Sei falar inglês");
        System.out.println();
    }

    @Override
    public void saberAtenderTelefone() {
        System.out.println("Sei atender o telefone");
        System.out.println();
    }
}
