# Projeto de Testes Unitários com JUnit 5 🧪

Implementações e testes unitários desenvolvidos para a disciplina de **Arquitetura de Software (Teoria e Prática)**, sob orientação do **Prof. Dr. Frank J. Affonso** no Mestrado da **UNESP**. O projeto aborda a criação de software robusto em **Java 17**, validado através de suítes de teste com **JUnit 5 (Jupiter)**.

---

## 🚀 Tecnologias e Ferramentas

* **Linguagem:** Java 17 (OpenJDK 17)
* **Framework de Testes:** JUnit 5 (Jupiter)
* **Gerenciador de Dependências:** Apache Maven
* **IDE:** Visual Studio Code (VSCode)
* **Sistema Operacional:** Linux Ubuntu 26

---

## 📦 Estrutura do Projeto

O projeto segue as convenções de nomenclatura do Java e a estrutura padrão do Maven:

**Pacote Principal:** `br.unesp.moisesolimpio`

```text
junit5tutorial/
├── .vscode/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/
│   │   │       └── unesp/
│   │   │           └── moisesolimpio/
│   │   │               └── Vector.java         
│   │   └── resources/
│   └── test/
│       └── java/
│           └── br/
│               └── unesp/
│                   └── moisesolimpio/
│                       ├── JUnitTestSuite.java 
│                       ├── VectorEqualTest.java 
│                       └── VectorSizeTest.java  
├── .gitignore
├── pom.xml                                      
└── README.md