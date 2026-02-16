📚 Biblioteca API

API REST desenvolvida em Java com Spring Boot para gerenciamento de livros.

Projeto focado em boas práticas de arquitetura, separação de responsabilidades e tratamento de exceções.

🚀 Funcionalidades

✔ Listar todos os livros

✔ Buscar livro por ID

✔ Criar livro

✔ Atualizar livro

✔ Deletar livro

✔ Validação de dados com Bean Validation

✔ Tratamento global de exceções

✔ DTO + Mapper

✔ H2 Database

✔ Arquitetura em camadas (Controller / Service / Repository)

🏗️ Arquitetura

O projeto segue padrão de separação em camadas:

Controller → recebe requisições HTTP

Service → regras de negócio

Repository → acesso ao banco

DTO → objetos de transporte

Mapper → conversão entre DTO e entidade

Exception Handler → padronização de erros

🛠️ Tecnologias

Java 21

Spring Boot

Spring Data JPA

H2 Database

Bean Validation

Maven

📌 Endpoints
GET /biblioteca

Lista todos os livros

GET /biblioteca/buscar/{id}

Busca livro por ID

POST /biblioteca/criar

Cria novo livro

PUT /biblioteca/atualizar/{id}

Atualiza livro existente

DELETE /biblioteca/deletar/{id}

Remove livro

📦 Status

Versão inicial funcional com CRUD completo e tratamento de erros.