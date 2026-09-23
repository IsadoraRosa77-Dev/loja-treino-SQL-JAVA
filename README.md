# 🛒 LojaSQL - Aplicação Java com MySQL em Docker

Aplicação de gestão de produtos desenvolvida em **Java (NetBeans/Maven)** integrada com um banco de dados **MySQL 8.0** e **phpMyAdmin**, totalmente containerizada utilizando **Docker Compose**.

---

## 🚀 Tecnologias Utilizadas

* **Linguagem:** Java (JDBC)
* **IDE / Build:** NetBeans & Maven
* **Banco de Dados:** MySQL 8.0
* **Interface do BD:** phpMyAdmin
* **Containerização:** Docker & Docker Compose
* **Ambiente de Dev:** WSL 2 (Ubuntu)

---

## 🛠️ Infraestrutura com Docker

O projeto utiliza o Docker Compose para subir a base de dados e a interface visual sem a necessidade de instalar ferramentas como o XAMPP.

### Serviços Configurados:
* **`db` (MySQL 8.0):** Rodando na porta interna `3306`. Inicializa automaticamente a estrutura do banco via `init.sql`.
* **`phpmyadmin`:** Disponível em `http://localhost:8080` com autenticação automática via utilizador `root`.

---

## 📋 Como Executar o Projeto

### Pré-requisitos
* Git
* Docker Desktop com integração WSL 2 ativada

### Passo a Passo

1. **Clonar o repositório:**
   ```bash
   git clone [https://github.com/IsadoraRosa77-Dev/loja-treino-SQL-JAVA.git](https://github.com/IsadoraRosa77-Dev/loja-treino-SQL-JAVA.git)
   cd loja-treino-SQL-JAVA
