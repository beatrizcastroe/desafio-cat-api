# Desafio-Cat-Api

Este projeto faz parte do processo seletivo do Itau: um desafio técnico com o objetivo consumir a The Cat Api com Spring Boot, utilizando o banco de dados MySQL.

## Arquitetura

![image](https://user-images.githubusercontent.com/88193030/169151059-17189b8c-07ea-474b-8b28-6c00410a3b0e.png)

#### Api(Spring boot): Recebe as requisições e retorna para o cliente os dados coletados pelo Cat, contém entidades e repositório.
#### Cat (Feign): Faz a coleta dos dados na The Cat Api e salva no banco de dados.

## Integrações

Banco de dados MySQL e The cats API

## Tecnologias
Spring / Spring Cloud Task / Spring Data / Hibernate / JPA / Spring Open Feign

## Pré-requisitos da Montagem

1. Durante esse projeto, foi utilizado o banco de dados local do MySQL. 
2. Ao iniciar o projeto, primeiramente deve-se iniciar o main da aplicação AboutCatsApplication, do serviço cat. Dessa forma, automaticamente será criado o banco de dados db_cat, com suas tabelas e os dados solicitados (foi utilizado o Open Feign e Spring Cloud).
3. Após isso, podemos parar a aplicação acima e iniciar o main da ApiAplication, podendo, assim, utilizar a collection no postman para fazer as requisições exigidas pelo desafio.
4. O projeto foi organizado de acordo com a arquitetura MVC.
5. A metodologia de organização de tempo foi baseada na SCRUM, mesmo que com apenas 1 pessoa envolvida.

## Documentação Swagger

A documentação swagger da ApiApplication pode ser acessada ao iniciá-la no main e acessar o endereço: http://localhost:8080/swagger-ui.html#

![image](https://user-images.githubusercontent.com/88193030/169170606-961a389a-d20e-4bfb-9f02-7160721d87f7.png)


## Pontos a melhorar

Visto o curto prazo, alguns pontos a melhorar são: Deploy do microserviço na nuvem, implementação dos testes unitários, desacoplamento de algumas funções, melhor documentação do projeto e implementação da parte bônus do desafio.

## Sobre a autora

Meu nome é Beatriz Castro, tenho 22 anos e estou finalizei o bootcamp da Generation Brasil. Lá, além dos meus aprimoramentos nas soft-skills, a parte técnica foi voltada para JAVA e seus frameworks. Tive experiências profissionais que envolvem Perl, Javascript, Node e como objetivo profissional, quero utilizar meus aprendizados no bootcamp e estudos pessoais em JAVA. 



