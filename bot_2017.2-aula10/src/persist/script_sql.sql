create schema if not exists aula08;

use aula08;

create table endereco(
	id int primary key auto_increment,
	logradouro varchar(255),
	bairro varchar(150),
	cidade varchar(150),
	cep varchar(9),
	id_pessoa int
);


create table especializacao (
	id int primary key auto_increment,
	titulo varchar(255),
	id_professor int
);