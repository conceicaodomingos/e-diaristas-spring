# Projeto e-diaristas

Projeto desenvolvido durante a imersão Multistack da Treinaweb utilizando Java e SpringBoot

## Dependências do Projeto

- Spring Boot
- Spring Web MVC
- Thymeleaf
- Spring Data JPA
- Bean Validation

## Dependências de Desenvolvimento

- Spring Boot Devtools
- Lombok

## Requisitos do Projeto

- Java 17
- Maven 3.9

## Como testar o projeto na minha máquina

Clone este repositório e entre na pasta do projeto

```sh
git clone https://github.com/conceicaodomingos/e-diaristas-spring.git
cd e-diaristas-spring
```

Atualize as configurações de acesso ao banco de dados no arquivo [application.properties](src/main/resources/application.properties)

```properties
spring.datasource.url=jdbc:mysql://host:porta/banco_de_dados
spring.datasource.username=usuario
spring.datasource.password=senha
```

Exeute o projeto através do Maven

```sh
mvn spring-boot:run
```

Acesse a aplicação em [http://localhost:8080/admin/servicos](http://localhost:8080/admin/servicos)