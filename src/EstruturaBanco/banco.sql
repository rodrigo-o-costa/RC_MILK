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


CREATE TABLE tb_bovino(
    cod serial,
    ativo boolean,
    nome varchar(50),
    brinco int,
    data_nasc date,
    idade int,
    sexo varchar(10),
    raca varchar(50),
    cor varchar(50),
    quantCria int,
    observacao varchar(400),
    codPai int,
    nome_pai varchar(50),
    codmae int,
    nome_mae varchar(50)
);
select * from tb_bovino
INSERT INTO  tb_bovino
	(ativo, nome, brinco, data_nasc, idade, sexo, raca, 
	 cor, quantCria, observacao, codPai, nome_pai, codmae, nome_mae)
	 values (true,'mimosa','1','20/07/2020','1','Fêmea','HOLANDESA','preta',0,'nada consta',-1,'tiao',-1,'cabana')
select cod, ativo, nome, brinco, data_nasc, idade, sexo, raca, cor, quantCria, observacao, nome_pai, nome_mae
	 from tb_bovino


UPDATE tb_bovino set ativo = ?, nome = ?, brinco = ?, data_nasc = ?, idade = ?, sexo = ?, raca = ?, cor = ?, quantCria = ?, observacao = ?, codPai = ?, nome_pai = ?, codmae = ?, nome_mae = ? where cod = ? 

CREATE TABLE tb_cio(
    codCio serial;
    dataCio date;
    codVaca int;
    nomeVaca varchar(50);
    codTouro int;
    nomeTouro varchar(50);
    confirmado boolean;
    dataConfirmacao date;
    repetiuCio boolean;
    obs varchar(400);
);

select codCio, dataCio, codVaca, nomeVaca, codTouro, nomeTouro , confirmado, dataConfirmacao, repetiuCio, obs from tb_cio;

update tb_cio set codCio = ?, dataCio = ?, codvaca = ?, nomeVaca = ?, codTouro = ?, nomeTouro = ?, confirmado = ?, dataConfirmacao = ?, repetiucio = ?, obs = ?;

INSERT INTO tb_cio insert into (codCio, dataCio, codVaca, nomeVaca, codTouro, nomeTouro , confirmado, dataConfirmacao, repetiuCio, obs) values (?,?,?,?,?,?,?,?,?,?);


SELECT  c.codvaca, bov.nome, bov.brinco, bov.idade,bov.raca,bov.cor, bov.data_nasc,
		count(codcio) as Quant_Cios,
		SUM(CASE c.repetiucio WHEN TRUE THEN 1 ELSE 0 END) as Quant_Cios_rep,
		SUM(CASE c.parto WHEN TRUE THEN 1 ELSE 0 END) as Quant_Cios_partos,
		SUM(CASE c.perdeu WHEN TRUE THEN 1 ELSE 0 END) as Quant_Cios_Perdidos,
		(COUNT(c.codcio)  - (SUM(CASE c.repetiucio WHEN TRUE THEN 1 ELSE 0 END)+
						  SUM(CASE c.parto WHEN TRUE THEN 1 ELSE 0 END)+
						  SUM(CASE c.perdeu WHEN TRUE THEN 1 ELSE 0 END))) as Quant_cios_Confirmados_Sem_Finalizar
FROM tb_cio as c inner join tb_bovino as bov on c.codvaca = bov.cod
GROUP BY c.codvaca,bov.cod
ORDER BY c.codvaca;


	
	 