CREATE TABLE tb_usuario(
    id_usuario serial,
    ativo bit(1),
    nome_usuario varchar(50),
    usuario varchar(20),
    senha varchar(20),
    telefone varchar(11),
    email varchar(50)
);
INSERT INTO tb_usuario 
    (ativo,nome_usuario,usuario,senha,telefone,email) 
       VALUES('1','Rodrigo De Oliveira Costa','administrador','costa123','34996887059','rodrigo.o.costa@ufv.br');
select * from tb_usuario;
