# Password Validation API

Projeto de API para validação de senhas, onde as senhas devem seguir as seguintes regras para serem válidas:


 - Nove ou mais caracteres;
 - Ao menos 1 dígito;
 - Ao menos 1 letra minúscula;
 - Ao menos 1 letra maiúscula;
 - Ao menos 1 caractere especial;
 - Considere como especial os seguintes caracteres: !@#$%^&*()-+ ;
 - Não possuir caracteres repetidos dentro do conjunto;


<br>

## Requisitos ##


- JDK 15+
- Maven 3.6+
- Git 

<br>


## Modos de rodar o projeto ##

* [Com IDE](#Rodando-com-IDE);

* [Sem IDE](#Rodando-sem-IDE);


<br>


### Primeiro passo ###

Baixe o projeto: ```git clone https://github.com/victorlsilva/password-api.git```

<br>

### Rodando com IDE ###

- Entre em sua IDE, e adicione o projeto (pode importar como projeto maven);
- Após a IDE resolver as dependencias, apenas rode o projeto (Spring Boot);


<br>

### Rodando sem IDE ###

- Abra a pasta do projeto no terminal;
- Rode o comando: ```mvn clean install```
- Após isso, rode o comando: ```java -jar target/password-api-0.0.1-SNAPSHOT.jar```

<br>

## Testando Aplicação ##

Via curl<br>
```
curl -d "password=AbTp9!fok" -X POST http://localhost:8080/api/password/validation
```

