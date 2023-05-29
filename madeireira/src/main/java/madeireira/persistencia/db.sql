/**
 * Author:  rianwlp
 * Created: May 17, 2023
 * 
 * Criacao da base de dados no banco de dados postgres
 */


-- Cria a base madeireira
CREATE DATABASE madeireira;

-- Cria o usuario da base
CREATE USER rianwlp WITH ENCRYPTED PASSWORD 'xxx15159';




CREATE DATABASE teste;
CREATE USER postgres WITH ENCRYPTED PASSWORD 'postgres';

CREATE TABLE order1();

CREATE TABLE order(
    id           SERIAL       PRIMARY KEY,
    id_people    INT          NOT NULL   ,
    orderDate    DATE                    ,
    deliveryDate DATE                    ,
    observations VARCHAR(255)            ,
    quantity     INT          NOT NULL 
);

CREATE TABLE order(
    id           SERIAL       PRIMARY KEY,
    id_people    INT          NOT NULL   ,
    orderDate    VARCHAR(15)             ,
    deliveryDate VARCHAR(15)             ,
    observations VARCHAR(255)            ,
    quantity     INT          NOT NULL 
);

CREATE TABLE merchandise(
    id          SERIAL      PRIMARY KEY, 
    name        VARCHAR(45) NOT NULL   ,
    description VARCHAR(255)           ,
    brand       VARCHAR(255)           ,
    price       BIGINT                 ,
    stock       VARCHAR(45) NOT NULL        
);

CREATE TABLE merchandise_order(


);

CREATE TABLE people(
    id                  SERIAL               ,
    name                VARCHAR (45) NOT NULL,
    type                VARCHAR(2)   NOT NULL, 
    cnpj                VARCHAR(15)          ,        
    cpf                 VARCHAR(11)          ,    
    bornDate            DATE                 ,
    creditLimit         BIGINT               ,
    outstanding balance BIGINT               
);

CREATE TABLE city(

);




CREATE produto(
    id         INT         NOT NULL, 
    nome       VARCHAR(45) NOT NULL,
    descricao  VARCHAR(255)        ,
    marca      VARCHAR (255)       ,
    preco      BIGINT              ,
    estoque    VARCHAR(45)         ,
    criado     TIMESTAMP           ,
    atualizado TIMESTAMP
);

CREATE pedido(
    id                    INT NOT NULL,
    id_cliente_fornecedor INT NOT NULL,
    data_realizado        DATE        ,
    data_entregue         DATE        ,
    observacoes           VARCHAR(255)
);

CREATE cliente_fornecedor(
    id              INT          NOT NULL,
    nome            VARCHAR (45) NOT NULL,
    tipo            VARCHAR(2)   NOT NULL, 
    cnpj            VARCHAR(15)          ,        
    cpf             VARCHAR(11)          ,    
    data_nascimento DATE                 ,
    limite_credito  BIGINT               ,
    saldo_devedor   BIGINT               
);

CREATE ();
