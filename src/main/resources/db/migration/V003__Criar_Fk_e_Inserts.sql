Alter table contasreceber add constraint fk_contasreceber_cliente foreign key(idcliente) references contasreceber(id);

insert into cliente (nomecliente) values ("Fernando");

insert into cliente (nomecliente) values ("Úrsula");


insert into contasreceber (idcliente, dataconta, valorconta) values (1, '2022-03-12', 145.99);

insert into contasreceber (idcliente, dataconta, valorconta) values (2, '2022-04-31', 319.86);

insert into contasreceber (idcliente, dataconta, valorconta) values (3, '2021-05-29', 59.64);

insert into contasreceber (idcliente, dataconta, valorconta) values (4, '2009-06-08', 1034.29);
