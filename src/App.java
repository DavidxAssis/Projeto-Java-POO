import java.util.ArrayList;

import model.Camareira;
import model.Cliente;
import model.EnumTipo;
import model.Gerente;
import model.Quarto;
import model.Recepcionista;

public class App {
    public static void main(String[] args) {
        System.out.println("hotel Java");
        System.out.println();

        Recepcionista recepcionista1 = new Recepcionista("Carlos", "1799023344", "45505333990");

        Camareira camareira1 = new Camareira("Roberta", "17991325579", "45505312345");
        
        Gerente gerente1 = new Gerente("David", "17992240375", "46231088965");

        recepcionista1.saberAtenderTelefone();
        recepcionista1.falarIngles();

        camareira1.arrumarACama();
        camareira1.limparQuarto();

        gerente1.saberAtenderTelefone();
        gerente1.falarIngles();

        Quarto quarto1 = new Quarto();
        quarto1.setNumero("206A");
        quarto1.setValor(100.0);
        quarto1.setTipo(EnumTipo.BASICO);

        Quarto quarto2 = new Quarto();
        quarto2.setNumero("306A");
        quarto2.setValor(100.0);
        quarto2.setTipo(EnumTipo.PRESIDENCIAL);

        System.out.println(quarto2.getTipo());
        System.out.println(quarto2.getTipo().getValor());
        System.out.println();

        Cliente cliente1 = new Cliente("Julia", "17991067890", "45505588991", 22);
        Cliente cliente2 = new Cliente("Roberto", "17991067810", "45505588992", 23);
        Cliente cliente3 = new Cliente("Carlos", "17991067820", "45505588993", 24);
        Cliente cliente4 = new Cliente("Fernanda", "17991067390", "45505588994", 25);
        Cliente cliente5 = new Cliente("Glenda", "17991067490", "45505588995", 26);
        Cliente cliente6 = new Cliente("Leticia", "17991067590", "45505588996", 27);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);

        clientes.stream().count();
        clientes.size();

        clientes.stream()
        .limit(2)
        .forEach(c -> System.out.println("############ " + c.getNome() ));

        clientes.stream()
        .skip(2)
        .forEach(c -> System.out.println("************ " + c.getNome()));

        //var resultado3 = clientes.stream().sorted();

        clientes.stream().filter(c -> c.getIdade() > 20)
        .forEach(c -> System.out.println("------------ " + c.getNome()));

    } 
}