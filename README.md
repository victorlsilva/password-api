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
```curl -d "password=AbTp9!fok" -X POST http://localhost:8080/api/password/validation```

<br>

## Notas ##

<p> - Desenvolvimento feito em Java, pois é a linguagem que estou mais familiarizado;<p>

<p> - Defini pela utilização do framework Spring Boot, 
por ser um framework que otimiza o tempo de desenvolvimento ;</p>

<p> - Procurei segregar as regras, para usa-las de forma independente. <br>
Exemplo: Caso seja necessário criar outro endpoint onde será verificado apenas 
algumas das regras, nada precisará ser modificado, apenas é necessário 
adicionar o método e usar as regras já existentes.<p>

<p> - Utilização do Lombok para deixar o código mais clean</p>

<p> - Para as validações, preferi utilizar métodos fáceis de 
entender a lógica, fáceis de ler, mas com o contra de ter mais 
código escrito do que se tivesse utilizado regex, por exemplo. </p>