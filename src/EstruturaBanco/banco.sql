CREATE TABLE tb_usuario(
    id_usuario serial,
    ativo boleam,
    nome_usuario varchar(50),
    usuario varchar(20),
    senha varchar(20),
    telefone varchar(11),
    email varchar(50)
);
INSERT INTO tb_usuario 
    (ativo,nome_usuario,usuario,senha,telefone,email) 
       VALUES(true,'Rodrigo De Oliveira Costa','administrador','costa123','34996887059','rodrigo.o.costa@ufv.br');
select * from tb_usuario;

CREATE TABLE tb_fazenda(
    id_fazenda serial,
    ativo boolean,
    nome_fazenda varchar(50),
    nome_prop varchar(50),
    cfp_prop varchar(20),
    insc_estadual varchar(20),
    telefone varchar(20),
    celular varchar(20),
    email varchar(20)
);

select id_fazenda,ativo,nome_fazenda,nome_prop,cfp_prop,insc_estadual,telefone,celular,email from tb_fazenda where nome like ?
INSERT INTO tb_fazenda 
    (ativo,nome_fazenda,nome_prop,cfp_prop,insc_estadual,telefone,celular,email) 
        values(true,'teste','proprietario teste','11316968677','00000000','3438512074','349999999','rodrigo@dsnet.com.br');
