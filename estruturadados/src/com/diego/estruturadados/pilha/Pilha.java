package com.diego.estruturadados.pilha;

// Importa a classe Base do pacote com.diego.estruturadados.base
import com.diego.estruturadados.base.Base;

// Declaração da classe Pilha que estende a classe Base
public class Pilha<T> extends Base<T> {

    // Construtor padrão da Pilha
    public Pilha() {
    }

    // Construtor que permite especificar a capacidade inicial da Pilha
    public Pilha(int capacidade) {
        super(capacidade);
    }

    // Método para adicionar um elemento no topo da Pilha
    public boolean push(T elemento) {
        // Chama o método adiciona da classe base para realizar a operação
        return super.adiciona(elemento);
    }

    // Método para remover e retornar o elemento do topo da Pilha (pilha: LIFO - Last In, First Out)
    public T pop() {
        // Verifica se a pilha está vazia
        if (this.isEmpty()) return null;

        // Retorna e remove o elemento do topo da pilha
        return this.elementos[--size];
    }

    // Método para obter o elemento do topo da Pilha sem removê-lo
    public T top() {
        // Verifica se a pilha está vazia
        if (this.isEmpty()) return null;

        // Retorna o elemento do topo da pilha usando o método size da classe base
        return super.elementos[size - 1];
    }
}
