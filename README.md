# Projeto: Estruturas de Dados em Java

Pacote: com.diego.estruturadados.base
Base<T> Class:
Objetivo: Fornecer uma base genérica para estruturas de dados.
Detalhes:
Utiliza um array genérico para armazenar elementos.
Implementa métodos básicos como adiciona, adiciona(posicao, elemento), remover(posicao).
Métodos adicionais incluem isEmpty, size, e toString.

Pacote: com.diego.estruturadados.fila
Fila<T> Class:

Objetivo: Implementar uma fila usando a classe Base.
Detalhes:
Estende Base<T> para aproveitar funcionalidades básicas.
Métodos específicos incluem enqueue (adiciona elemento), dequeue (remove e retorna elemento), front (obtém o primeiro elemento), rear (obtém o último elemento).
FilaTest Class:

Objetivo: Testar a funcionalidade da classe Fila.
Detalhes:
Cria uma instância de Fila.
Adiciona elementos, verifica se está vazia, obtém tamanho e elementos, remove elementos e exibe a fila.

Pacote: com.diego.estruturadados.lista
Node<T> Class:

Objetivo: Representar um nó em uma lista encadeada.
Detalhes:
Contém métodos para obter e definir o elemento e o próximo nó.
Lista<T> Class:

Objetivo: Implementar uma lista encadeada usando a classe Node.
Detalhes:
Métodos principais incluem push (adiciona no final), insert (adiciona em uma posição), pop (remove do final), remove (remove por valor ou posição), clear (limpa a lista), size (retorna o tamanho), printList (exibe a lista).
ListaTest Class:

Objetivo: Testar a funcionalidade da classe Lista.
Detalhes:
Cria uma instância de Lista.
Adiciona, insere, remove elementos, verifica tamanho e exibe a lista.

Pacote: com.diego.estruturadados.pilha
Pilha<T> Class:

Objetivo: Implementar uma pilha usando a classe Base.
Detalhes:
Estende Base<T> para aproveitar funcionalidades básicas.
Métodos específicos incluem push (adiciona elemento), pop (remove e retorna o elemento do topo), top (obtém o elemento do topo).
PilhaTest Class:

Objetivo: Testar a funcionalidade da classe Pilha.
Detalhes:
Cria uma instância de Pilha.
Adiciona elementos, verifica se está vazia, obtém tamanho e elementos, remove elementos e exibe a pilha.
Resumo:
Este projeto Java fornece implementações simples de estruturas de dados, incluindo listas encadeadas, filas e pilhas. A classe Base serve como uma fundação genérica, enquanto as classes específicas estendem ou utilizam essa base. Os testes nas classes de teste garantem a correta implementação das estruturas. A utilização de generics torna o código flexível para diferentes tipos de elementos. A implementação é simples, visando a compreensão e utilização das estruturas de dados em Java.


## Skills utilizadas:
<div style="display: inline_block"><br>
   <img align="center" alt="Spring" height="50" width="50" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg">
  <img align="center" alt="Spring" height="60" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
