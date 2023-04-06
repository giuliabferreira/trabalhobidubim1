Alter table contasreceber add constraint fk_contasreceber_cliente foreign key(idcliente) references cliente(id);

insert into cliente (nomecliente) values ('Fernando');

insert into cliente (nomecliente) values ('Úrsula');


insert into contasreceber (dataconta, idcliente, valorconta) values ('2009-06-18', 1, 159.98);

insert into contasreceber (dataconta, idcliente, valorconta) values ('2011-12-04', 2, 1673.23);
