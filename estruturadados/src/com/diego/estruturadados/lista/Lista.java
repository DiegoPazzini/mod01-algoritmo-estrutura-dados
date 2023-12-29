package com.diego.estruturadados.lista;

// Declaração da classe Lista, uma implementação de lista encadeada simples
public class Lista<T> {

    // Nó de início da lista
    private Node<T> inicio;

    // Nó de final da lista
    private Node<T> ultimo;

    // Variável para rastrear o tamanho da lista
    private int size = 0;

    // Método para adicionar um elemento no final da lista
    public void push(T elemento) {
        Node<T> novoNo = new Node<>(elemento);
        if (size == 0) {
            inicio = novoNo;
        } else {
            ultimo.setProximo(novoNo);
        }
        ultimo = novoNo;
        size++;
    }

    // Método para inserir um nó em uma posição específica na lista
    public void insert(int index, Node<T> novoNo) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        if (index == 0) {
            novoNo.setProximo(inicio);
            inicio = novoNo;
        } else {
            Node<T> atual = inicio;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.getProximo();
            }
            novoNo.setProximo(atual.getProximo());
            atual.setProximo(novoNo);
            size++;
        }
    }

    // Método para remover e retornar o último nó da lista
    public Node<T> pop() {
        if (inicio == null) {
            return null;
        }
        if (inicio.getProximo() == null) {
            Node<T> noRemovido = inicio;
            inicio = null;
            return noRemovido;
        }
        Node<T> atual = inicio;
        while (atual.getProximo().getProximo() != null) {
            atual = atual.getProximo();
        }
        Node<T> noRemovido = atual.getProximo();
        atual.setProximo(null);
        size--;
        return noRemovido;
    }

    // Método para remover um nó da lista com base no valor do elemento
    public void remove(T valor) {
        Node<T> anterior = null;
        Node<T> atual = inicio;
        for (int i = 0; i < this.size(); i++) {
            if (atual.getElemento().equals(valor)) {
                if (size == 1) {
                    inicio = null;
                    ultimo = null;
                } else if (atual == inicio) {
                    inicio = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == ultimo) {
                    ultimo = anterior;
                    anterior.setProximo(null);
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                size--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    // Método para remover um nó da lista com base no índice
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        if (size == 1) {
            inicio = null;
    
