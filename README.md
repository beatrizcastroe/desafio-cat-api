# Desafio-Cat-Api

Este projeto faz parte do processo seletivo do Itau: um desafio técnico com o objetivo consumir a The Cat Api com Spring Boot, utilizando o banco de dados MySQL.

## Arquitetura

![image](https://user-images.githubusercontent.com/88193030/169151059-17189b8c-07ea-474b-8b28-6c00410a3b0e.png)

#### Api(Spring boot): Recebe as requisições e retorna para o cliente os dados coletados pelo Cat, contém entidades e repositório.
#### Cat (Feign): Faz a coleta dos dados na The Cat Api e salva no banco de dados.


