package com.diego.estruturadados.pilha;

// Classe de teste para a classe Pilha
public class PilhaTest {

    // Método principal
    public static void main(String[] args) {

        // Criação de uma instância da classe Pilha para armazenar elementos do tipo Integer
        Pilha<Integer> inteiros = new Pilha<>();

        // Adiciona elementos à pilha usando o método push
        inteiros.push(1);
        inteiros.push(2);
        inteiros.push(3);
        inteiros.push(4);

        // Exibe se a pilha está vazia ou não
        System.out.println("A pilha está vazia? " + inteiros.isEmpty());

        // Exibe o tamanho atual da pilha
        System.out.println("O tamanho da pilha: " + inteiros.size());

        // Exibe os elementos da pilha utilizando a representação padrão (toString)
        System.out.print("Os elementos da pilha: ");
        System.out.println(inteiros);

        // Exibe o elemento no topo da pilha sem removê-lo (espiar)
        System.out.println("Espiando o elemento no topo: " + inteiros.top());

        // Remove e exibe o elemento do topo da pilha
        System.out.println("Desempilhando o elemento no topo: " + inteiros.pop());

        // Exibe os elementos da pilha após a remoção
        System.out.println(inteiros);

    }
}
