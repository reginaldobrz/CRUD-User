
# 🧑‍💻 Projeto CRUD de Usuários com Spring Boot

Este projeto é um exemplo completo de uma API RESTful construída com **Spring Boot 3**, utilizando **JPA/Hibernate**, **Spring Security (auth básica e JWT)**, **Swagger/OpenAPI**, **Testes com JUnit/Mockito/TestContainers** e **MySQL via Docker**.

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot 3.5
  - Spring Web
  - Spring Data JPA
  - Spring Security
  - Spring Validation
- Hibernate
- MySQL 8 (via Docker)
- Swagger OpenAPI (springdoc)
- Lombok
- ModelMapper
- JUnit 5 + Mockito + TestContainers

## 🧱 Estrutura do Projeto

```
src/
├── main/
│   ├── java/com/estudo/crud/
│   │   ├── config/          # Configurações (Segurança, Swagger, Mapper, etc)
│   │   ├── controller/      # Controllers REST
│   │   ├── dto/             # Data Transfer Objects
│   │   ├── entity/          # Entidades JPA
│   │   ├── exception/       # Exceptions e handlers globais
│   │   ├── repository/      # Interfaces JPARepository
│   │   ├── security/        # Configurações de segurança e JWT
│   │   ├── service/         # Lógica de negócio
│   │   └── CrudApplication  # Classe principal
│   └── resources/
│       ├── application.yml  # Configuração da aplicação
│       └── ...
└── test/                    # Testes unitários e de integração
```

## ⚙️ Como executar localmente

### 1. Subir banco MySQL com Docker

```bash
docker compose up -d
```

Banco MySQL ficará disponível em: `localhost:3307`

Credenciais:

- **Usuário:** root
- **Senha:** root
- **Banco:** crud-db

### 2. Executar aplicação

```bash
./mvnw spring-boot:run
```

Ou pelo IntelliJ: rode a classe `CrudApplication`

---

## 🔐 Autenticação

A aplicação utiliza autenticação com Spring Security + JWT:

- **Usuário default:** `admin`
- **Senha default:** `admin123`

JWT pode ser obtido em `/api/auth/login`.

---

## 📘 Swagger/OpenAPI

Após iniciar a aplicação, acesse a documentação da API via Swagger:

📍 [`http://localhost:8080/swagger-ui.html`](http://localhost:8080/swagger-ui.html)

---

## 🧪 Testes

### Testes Unitários

```bash
./mvnw test
```

---

## 🧾 Endpoints principais

- `POST /api/auth/login`: autenticação JWT
- `GET /api/users`: lista todos os usuários
- `GET /api/users/{id}`: busca por ID
- `POST /api/users`: cria usuário
- `PUT /api/users/{id}`: atualiza usuário
- `DELETE /api/users/{id}`: remove usuário

---

## ✅ Boas práticas aplicadas

- ✅ Clean Code, SOLID, DRY, KISS
- ✅ DTOs para abstração da camada de transporte
- ✅ Validações com Bean Validation (JSR 380)
- ✅ Exception handler global (`@ControllerAdvice`)
- ✅ Injeção de dependência com Spring IoC
- ✅ Lombok para reduzir verbosidade
- ✅ Testes unitários e de integração automatizados
- ✅ API documentada com Swagger 3

---

## 📦 Requisitos mínimos

- Java 21
- Docker + Docker Compose
- Maven 3.8+

---

## 👨‍💻 Autor

Desenvolvido por [Reginaldo Aguiar](mailto:reginaldo-aguiar@hotmail.com)

---

## 📄 Evidencia

![image](https://github.com/user-attachments/assets/fe252f6a-ec76-4336-b7de-fb49fb49d4c4)

