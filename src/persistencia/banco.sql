create database crud;

use crud;

create table funcionario(
	idfuncionario int primary key auto_increment,
	nome varchar(40) not null,
	email varchar(40) not null,
	cpf varchar(20) not null,
	salario double(10,2) not null,
	nascimento date


);

desc funcionario;


insert into funcionario values(null,'jorge luis','jorge@gmail.com','123456789-99',1000.00,'2018-01-01');
insert into funcionario values(null,'jorge Maria','jm@gmail.com','123456789-99',2000.00,'2018-01-01');
insert into funcionario values(null,'jorge Doria','jorgeDoria@gmail.com','123456789-99',4000.00,'2018-01-01');
