package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Item> itemList = new ArrayList<>();

    public static void main(String[] args) {
        CarrinhoDeCompra listaCompras = new CarrinhoDeCompra();
        System.out.println("O nro total de itens no carrinho é: " + listaCompras.totalItensNoCarrinho() );

        listaCompras.adicionarItem("caneta", 10.00, 1);
        System.out.println("Valor total: " + listaCompras.calcularValorTotal());

        listaCompras.adicionarItem("lapis", 5.00, 2);
        System.out.println("Valor total: " + listaCompras.calcularValorTotal());


        listaCompras.adicionarItem("caderno", 50.00, 3);
        System.out.println("Valor total: " + listaCompras.calcularValorTotal());

        listaCompras.removerItem("lapis");
        System.out.println("O nro total de itens no carrinho é: " + listaCompras.totalItensNoCarrinho() );

        listaCompras.exibirItens();

        System.out.println("Valor total: " + listaCompras.calcularValorTotal());

    }



    public void adicionarItem(String nome, double preco, int qtd){
        itemList.add(new Item(nome, preco, qtd) );
        System.out.println("Adicionando o item: " + nome + " ------> valor: " + preco + " ---------> qtd: "+ qtd);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i: itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
        System.out.println("Removendo item: " + nome);
    }

    public Double calcularValorTotal() {
        Double total = 0.0;
        for(Item i : itemList){
            total = total + ( i.getPreco() * i.getQtd() );
        }
        return total;
    }

    public void exibirItens(){
        System.out.println("Exibindo itens do carrinho");
        for(Item i : itemList){
            System.out.println(i.toString());
        }
    }

    public int totalItensNoCarrinho(){
        return itemList.size();
    }

}

