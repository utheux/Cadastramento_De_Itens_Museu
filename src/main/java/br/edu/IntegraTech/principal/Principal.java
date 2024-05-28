package br.edu.IntegraTech.principal;

import br.edu.IntegraTech.models.Item;
import br.edu.IntegraTech.reporisotory.ItemRepository;

import java.util.Scanner;

public class Principal {
    Scanner leitura = new Scanner(System.in);
    private ItemRepository repository;

    public Principal(ItemRepository repository) {
        this.repository =  repository;
    }

    public void exibeMenu(){
        var opcao = -1;
        var mensagem = """
                1 - Cadastrar item
                2 - Buscar item
                
                3- sair
                """;
        while (opcao != 3){
            System.out.println(mensagem);
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao){
                case 1:
                    cadastraItem();
                    break;
            }
        }


    }

    private void cadastraItem(){
        System.out.println("Digite o nome do item que deseja cadastrar");
        //String nome, String dataDeAdesao, String descricao, String dataDeFabricacao, String fabricante, String historia, String estadoDeConservacao
        var nome = leitura.nextLine();
        System.out.println("Digite a data de adesão do produto");
        var dataDeAdesao = leitura.nextLine();
        System.out.println("Digite a descrição do produto");
        var descricao = leitura.nextLine();
        System.out.println("Digite a data de fabricação do produto");
        var dataDeFabricacao = leitura.nextLine();
        System.out.println("Digite o fabricante");
        var fabricante = leitura.nextLine();
        System.out.println("Digite a história do item");
        var historia = leitura.nextLine();
        System.out.println("Digite o estado de conservação");
        var estadoDeConservacao = leitura.nextLine();

        Item item =  new Item(nome, dataDeAdesao, descricao, dataDeFabricacao, fabricante, historia, estadoDeConservacao);
        repository.save(item);

    }


}
