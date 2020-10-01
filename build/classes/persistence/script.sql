create database prodata;

use prodata;

create table produto(idProduto int primary key auto_increment,
nome varchar(50),
descricao varchar (250),
preco varchar(50),
imagem varchar (255));

insert into produto(idProduto,nome,descricao,preco,imagem)values (null,'xanxung','o melhor','350','https://images-na.ssl-images-amazon.com/images/I/619vkSvGRSL._AC_SX425_.jpg');

