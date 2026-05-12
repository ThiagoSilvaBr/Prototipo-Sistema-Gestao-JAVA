# Teste Técnico

## Sobre o projeto

Este projeto foi desenvolvido para ser um protótipo de sistema de gestão para empresas de manutenções.

O sistema consiste em uma aplicação desktop em Java utilizando Swing para realizar o gerenciamento e visualização de peças em estoque, calculando automaticamente o patrimônio total e destacando o item de maior valor.

---

# Funcionalidades

* Cadastro de peças em memória
* Exibição das peças em tabela (`JTable`)
* Cálculo automático do valor total por peça
* Cálculo do patrimônio total do estoque
* Destaque do item mais valioso
* Formatação monetária em Real Brasileiro (R$)
* Interface gráfica utilizando Java Swing
* Tabela não editável

---

# Tecnologias utilizadas

* Java
* Java Swing
* JTable
* Orientação a Objetos (POO)
* Git/GitHub

---

# Estrutura do projeto

```text
src/
 ├── models/
 │    └── Peca.java
 │
 ├── services/
 │    └── EstoqueService.java
 │
 ├── ui/
 │    └── TelaEstoque.java
 │
 └── Main.java
```

---

# Conceitos aplicados

Durante o desenvolvimento foram aplicados conceitos importantes de desenvolvimento de software, como:

* Encapsulamento
* Separação de responsabilidades
* Organização em camadas
* Manipulação de listas
* Interface gráfica desktop
* Formatação de dados monetários
* Processamento de regras de negócio

---

# Como executar o projeto

## Pré-requisitos

* Java JDK 17+ instalado
* IDE Java (IntelliJ IDEA, Eclipse ou VS Code)

---

## Passos

1. Clone o repositório:

```bash
git clone https://github.com/ThiagoSilvaBr/Prototipo-Sistema-Gestao-JAVA
```

2. Abra o projeto na IDE

3. Execute a classe:

```text
Main.java
```

---

# Demonstração do sistema

A aplicação exibe:

* Relatório de estoque
* Lista de peças em tabela
* Valores formatados em moeda brasileira
* Patrimônio total
* Item mais valioso do estoque

---
