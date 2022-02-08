create database if not exists projetoA3;
use projetoA3;

create table if not exists Usuario (
	cpf varchar(11) primary key not null,
	nome varchar(100) not null,
	senha varchar(8) not null,
	email varchar(100) not null,
	endereco varchar(200) not null,
	tipo_sanguineo varchar(2) not null,
	sexo varchar(1) not null,
	numero_emergencia varchar(10) not null
);

create table if not exists Consumo_DAgua (
	copos_agua varchar(255) primary key not null,
	data_registro date not null,
	foreign key(copos_agua) references usuario(cpf)
);

create table if not exists Cardapio (
	receitas varchar(255) primary key not null,
	horario_refeicoes time not null
);

create table if not exists Registro_Peso (
	data_registro date primary key not null,
	peso varchar(255) not null,
	altura double null,
	imc int(100) not null,
	foreign key(peso) references usuario(cpf)
);

create table if not exists Exercicios (
	nome_exercicio varchar(255) primary key not null,
	serie_exercicio varchar(255) not null,
	repeticao_exercicio varchar(255) not null
);

 









