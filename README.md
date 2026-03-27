# 📌 Tratamento de Exceções em Java

## 📖 Descrição

Este projeto consiste em um exercício didático desenvolvido com base nas aulas do professor Nélio Alves, com foco no **tratamento de exceções em Java**.

O objetivo principal é demonstrar, na prática, como lidar com erros durante a execução de um programa, utilizando mecanismos robustos da linguagem para garantir maior controle, segurança e clareza no fluxo da aplicação.

---

## 🎯 Objetivos

- Compreender o uso de blocos `try`, `catch` e `finally`
- Aplicar boas práticas no tratamento de exceções
- Diferenciar exceções verificadas (*checked*) e não verificadas (*unchecked*)
- Implementar propagação de exceções utilizando `throw` e `throws`
- Melhorar a comunicação de erros para o usuário final

---

## 🛠️ Tecnologias Utilizadas

- Java (JDK 17)
- Programação Orientada a Objetos (POO)

---

## 🧠 Conceitos Abordados

### 🔹 Bloco Try-Catch
Utilizado para capturar e tratar exceções que podem ocorrer durante a execução do código, evitando que o programa seja interrompido abruptamente.

### 🔹 Propagação de Exceções
Uso da palavra-chave `throws` para delegar o tratamento da exceção a níveis superiores da aplicação.

### 🔹 Lançamento Manual de Exceções
Uso de `throw` para lançar exceções personalizadas ou tratar cenários específicos de erro.

### 🔹 Boas Práticas
- Evitar capturas genéricas (`Exception`)
- Fornecer mensagens claras e úteis ao usuário
- Separar lógica de negócio do tratamento de erros

---

## 📂 Estrutura do Projeto

```
src/
 ├── application/
 │    └── Program.java
 ├── model/
 │    ├── entities/
 │    └── exceptions/
```

- **application**: contém a classe principal responsável pela execução do programa
- **entities**: classes de domínio da aplicação
- **exceptions**: exceções personalizadas

---

## ▶️ Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Acesse a pasta do projeto:
```bash
cd seu-repositorio
```

3. Compile o projeto:
```bash
javac application/Program.java
```

4. Execute:
```bash
java application.Program
```

---

## 💡 Exemplo de Uso

O programa simula situações onde exceções podem ocorrer (como entrada de dados inválidos ou regras de negócio violadas) e demonstra como essas exceções são tratadas e apresentadas ao usuário de forma controlada.

---

## 📌 Considerações Finais

Este projeto tem caráter educacional e foi desenvolvido com o intuito de reforçar conceitos fundamentais sobre tratamento de exceções em Java, sendo uma base sólida para aplicações mais complexas e robustas.

