package main.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        if (!pessoaList.isEmpty()) {
            List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            System.out.println("A lista está vazia!");
            return null;
        }
    }

    public List<Pessoa> ordenarPorAltura(){
        if (!pessoaList.isEmpty()) {
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            System.out.println("A lista está vazia!");
            return null;
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        System.out.println("Ordenando e exibindo por idade a lista VAZIA: ");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Joao", 15, 1.67);
        ordenacaoPessoas.adicionarPessoa("Maria", 22, 1.58);
        ordenacaoPessoas.adicionarPessoa("Ana", 33, 1.72);
        ordenacaoPessoas.adicionarPessoa("Pedro", 21, 1.93);

        System.out.println("Exibindo a lista de pessoas adicionadas: ");
        System.out.println(ordenacaoPessoas.pessoaList);

        System.out.println("Ordenando e exibindo por idade: ");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println("Ordenando e exibindo por altura: ");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
