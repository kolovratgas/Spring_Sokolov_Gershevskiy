insert into supplier(name, INN, address, phone) values('supplier1', '123123123', 'Samara', '774466');
insert into supplier(name, INN, address, phone) values('supplier2', '333333333', 'Tolyatti', '776655');
insert into supplier(name, INN, address, phone) values('supplier3', '321312312', 'Samara', '776644');
insert into supplier(name, INN, address, phone) values('supplier4', '222333222', 'Samara', '777777');
insert into supplier(name, INN, address, phone) values('supplier5', '111111111', 'Dimitrovgrad', '778899');

insert into product(name, code, price) values('Bread', '123', '15.0');
insert into product(name, code, price) values('Onion', '111', '5.0');
insert into product(name, code, price) values('Butter', '131', '55.0');
insert into product(name, code, price) values('Lemonade', '313', '43.0');
insert into product(name, code, price) values('Ice Cream', '321', '20.5');

insert into supplier_product(supplier_id, product_id) select s.id, p.id from supplier s, product p order by p.id desc;
