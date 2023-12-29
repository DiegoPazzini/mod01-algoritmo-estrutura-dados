package com.diego.estruturadados.lista;

// Declaração da classe Node, que representa um nó em uma lista encadeada
public class Node<T> {

    // Variável para armazenar o elemento do nó
    private T elemento;

    // Referência para o próximo nó na lista
    private Node<T> proximo;

    // Construtor padrão
    public Node() {
    }

    // Construtor que inicializa um nó com um elemento
    public Node(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    // Construtor que inicializa um nó com um elemento e uma referência para o próximo nó
    public Node(T elemento, Node<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    // Método para obter o elemento do nó
    public T getElemento() {
        return elemento;
    }

    // Método para definir o elemento do nó
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    // Método para obter o próximo nó na lista
    public Node<T> getProximo() {
        return proximo;
    }

    // Método para definir o próximo nó na lista
    public void setProximo(Node<T> proximo) {
        this.proximo = proximo;
    }

    // Sobrescrita do método toString para fornecer uma representação em string do nó
    @Override
    public String toString() {
        return "Node {" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}
