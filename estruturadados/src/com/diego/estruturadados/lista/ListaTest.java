package com.diego.estruturadados.lista;

// Classe de teste para a classe Lista
public class ListaTest {

    public static void main(String[] args) {
        
        // Criação de uma instância da classe Lista para armazenar elementos do tipo Integer
        Lista<Integer> inteiros = new Lista<>();

        // Adiciona elementos à lista usando o método push
        inteiros.push(1);
        inteiros.push(2);
        inteiros.push(3);
        inteiros.push(4);

        // Exibe o tamanho da lista
        System.out.println("O tamanho da lista: " + inteiros.size());

        // Exibe os elementos da lista usando o método printList
        System.out.println(inteiros.printList());

        // Insere um novo nó na posição 3 da lista
        inteiros.insert(3, new Node<>(5));
        System.out.println(inteiros.printList());

        // Obtém e exibe o elemento no índice 4 da lista
        System.out.println(inteiros.elementAt(4).getElemento());
        System.out.println(inteiros.printList());

        // Remove e exibe o último elemento da lista
        System.out.println("Removendo o elemento: " + inteiros.pop().getElemento());

        // Exibe o tamanho atual da lista
        System.out.println("O tamanho da lista: " + inteiros.size());

        // Obtém e exibe o elemento no índice 2 da lista
        System.out.println("O elemento no indice 2: " + inteiros.elementAt(2).getElemento());

        // Remove o elemento no índice 2 da lista e exibe a lista atualizada
        System.out.println("Removendo o elemento no indice 2: ");
        inteiros.remove(2);
        System.out.println(inteiros.printList());

        // Limpa a lista e exibe o tamanho atual
        inteiros.clear();
        System.out.println("O tamanho da lista: " + inteiros.size());
    }
}
