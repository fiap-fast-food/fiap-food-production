# fiap-food-production

Microserviço responsável pelo gerenciamento e produção dos pedidos na lanchonete de autoatendimento.

## Descrição

Este microserviço faz parte da arquitetura de microsserviços do projeto de autoatendimento de fast food. Ele gerencia a produção dos pedidos, acompanhando o status e atualizando conforme necessário para refletir o progresso na cozinha.

## Funcionalidades

- Recebimento de novos pedidos e atualização do status.
- Monitoramento e atualização do status dos pedidos.
- Integração com outros microsserviços para sincronização de dados.

## Requisitos

- Java 17
- Maven 3.8.5+
- Docker

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker
- OpenAPI (Swagger)

## Configuração do Ambiente

### Pré-requisitos

- Docker instalado em sua máquina.

### Passos para Configuração

1. Clone o repositório em sua máquina local:
    ```bash
    git clone https://github.com/fiap-fast-food/fiap-food-production.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd fiap-food-production
    ```
3. Execute o Docker Compose para levantar os serviços necessários:
    ```bash
    docker-compose up -d
    ```

### Variáveis de Ambiente

Certifique-se de configurar as seguintes variáveis de ambiente no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/fiap-production
spring.datasource.username=postgres
spring.datasource.password=root
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update