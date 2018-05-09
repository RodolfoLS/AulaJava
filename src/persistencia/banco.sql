create database aula9;

use aula9;

create table aluno(
	mat int primary key auto_increment,
	nome varchar(30) not null,
	email varchar(30) not null,
	nascimento date not null
);

create table endereco(
	id int primary key auto_increment,
	rua varchar(30) not null,
	bairro varchar(30) not null,
	cidade varchar(30) not null,
	mat_aluno int not null unique,
	foreign key (mat_aluno) references aluno(mat)
);

desc aluno;
desc endereco;