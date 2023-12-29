package com.diego.estruturadados.base;

// Declaração da classe genérica Base
public class Base<T> {

    // Declaração de variáveis de instância protegidas
    protected T[] elementos;
    protected int size;

    // Construtor que permite especificar a capacidade inicial da estrutura
    public Base(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.size = 0;
    }

    // Construtor padrão que chama o construtor acima com uma capacidade padrão de 10
    public Base(){
        this(10);
    }

    // Método que verifica se a estrutura está vazia
    public boolean isEmpty(){
        return this.size == 0;
    }

    // Método protegido para adicionar um elemento à estrutura
    protected boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.size < this.elementos.length) {
            this.elementos[this.size] = elemento;
            this.size++;
            return true;
        }
        return false;
    }

    // Método protegido para adicionar um elemento em uma posição específica na estrutura
    protected boolean adiciona(int posicao, T elemento){

        // Verifica se a posição é válida
        if (posicao < 0 || posicao > size){
            throw new IllegalArgumentException("Posição inválida");
        }

        // Garante que há capacidade suficiente na estrutura
        this.aumentaCapacidade();

        // Move todos os elementos para abrir espaço para o novo elemento
        for (int i=this.size-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.size++;

        return true;
    }

    // Método protegido para remover um elemento de uma posição específica na estrutura
    protected void remover(int posicao){
        // Verifica se a posição é válida
        if (!(posicao >= 0 && posicao < size)){
            throw new IllegalArgumentException("Posicao inválida");
        }

        // Move os elementos para preencher o espaço deixado pelo elemento removido
        for (int i = posicao; i < size - 1; i++){
            elementos[i] = elementos[i+1];
        }
        this.size--;
    }

    // Método privado para aumentar a capacidade da estrutura, se necessário
    private void aumentaCapacidade(){
        if (this.size == this.elementos.length){
            // Cria um novo array com o dobro da capacidade
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

            // Copia os elementos do array antigo para o novo array
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }

            // Atualiza a referência para o novo array
            this.elementos = elementosNovos;
        }
    }

    // Método para obter o tamanho atual da estrutura
    public int size(){
        return this.size;
    }

    // Sobrescrita do método toString para fornecer uma representação em string da estrutura
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i=0; i<this.size-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.size>0){
            s.append(this.elementos[this.size-1]);
        }
        s.append("]");
        return s.toString();
    }
}
