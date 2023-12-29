package com.diego.estruturadados.fila;

// Classe de teste para a classe Fila
public class FilaTest {

    public static void main(String[] args) {

        // Criação de uma instância da classe Fila com elementos do tipo Integer
        Fila<Integer> inteiros = new Fila<>();

        // Adiciona elementos à fila
        inteiros.enqueue(1);
        inteiros.enqueue(3);
        inteiros.enqueue(4);
        inteiros.enqueue(2);

        // Exibe informações sobre a fila
        System.out.println("A fila está vazia? " + inteiros.isEmpty());
        System.out.println("Qual o tamanho da fila? " + inteiros.size());
        System.out.println("Qual o primeiro elemento da fila? " + inteiros.front());
        System.out.println("
