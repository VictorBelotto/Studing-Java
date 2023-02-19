# Herança e interface são dois importantes conceitos da programação orientada a objetos e são amplamente utilizados na linguagem Java.

## Herança:

`` A herança permite que uma classe filha (ou subclasse) herde atributos e métodos de uma classe pai (ou superclasse). A classe filha pode então adicionar atributos e métodos próprios, ou mesmo substituir os métodos herdados da classe pai, usando a sobrescrita de métodos. Em Java, a herança é implementada usando a palavra-chave extends. Por exemplo: ``

```Java
class Animal {
    public void fazerSom() {
        System.out.println("O animal está fazendo som.");
    }
}

class Cachorro extends Animal {
    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }
}
```
- Nesse exemplo, a classe Cachorro herda o método fazerSom() da classe Animal e adiciona o método abanarRabo() próprio. Quando o método fazerSom() é chamado em um objeto da classe Cachorro, a implementação na classe Animal é executada.

## Interface:
``
A interface é um contrato que define um conjunto de métodos que uma classe deve implementar. Uma classe pode implementar várias interfaces e, portanto, fornecer implementações para vários conjuntos de métodos. Em Java, a interface é declarada usando a palavra-chave interface. Por exemplo:
``

```Java
interface Animal {
    public void fazerSom();
}

class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro está latindo.");
    }
}
```
- Nesse exemplo, a interface Animal define um único método fazerSom(). A classe Cachorro implementa a interface Animal e fornece uma implementação para o método fazerSom(). Quando o método fazerSom() é chamado em um objeto da classe Cachorro, a implementação na classe Cachorro é executada.

```
Em resumo, herança e interface são duas ferramentas poderosas da programação orientada a objetos em Java. 
A herança permite que as classes filhas herdem atributos e métodos da classe pai e adicionem seus próprios atributos e métodos, 
enquanto a interface define um conjunto de métodos que uma classe deve implementar.
Ambos são úteis para criar hierarquias de classes e garantir a reutilização do código.

