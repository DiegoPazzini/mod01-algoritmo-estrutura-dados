package com.diego.estruturadados.fila;

// Importa a classe Base do pacote com.diego.estruturadados.base
import com.diego.estruturadados.base.Base;

// Declaração da classe Fila que estende a classe Base
public class Fila<T> extends Base<T> {

    // Construtor padrão que chama o construtor da classe base sem especificar capacidade
    public Fila() {
        super();
    }

    // Construtor que permite especificar a capacidade inicial da fila
    public Fila(int capacidade) {
        super(capacidade);
    }

    // Método para adicionar um elemento ao final da fila
    public boolean enqueue(T elemento) {
        // Chama o método adiciona da classe base para realizar a operação
        return super.adiciona(elemento);
    }

    // Método para remover e retornar o elemento do início da fila (fila: FIFO - First In, First Out)
    public T dequeue() {
        // Verifica se a fila está vazia
        if (this.isEmpty()) return null;

        // Obtém o elemento do início da fila
        T elemento = elementos[0];

        // Remove o elemento do início da fila chamando o método remover da classe base
        super.remover(0);

        // Retorna o elemento removido
        return elemento;
    }

    // Método para obter o elemento do início da fila sem removê-lo
    public T front() {
        // Verifica se a fila está vazia
        if (this.isEmpty()) return null;

        // Retorna o elemento do início da fila
        return super.elementos[0];
    }

    // Método para obter o elemento do final da fila sem removê-lo
    public T rear() {
        // Verifica se a fila está vazia
        if (this.isEmpty()) return null;

        // Retorna o elemento do final da fila usando o método size da classe base
        return super.elementos[super.size() - 1];
    }
}
