CREATE DATABASE supperweb;
USE superweb;

create table product
(
    id          int auto_increment
        primary key,
    name        varchar(255)   null,
    price       decimal(10, 2) null,
    description varchar(255)   null
);

INSERT INTO superweb.product(id, name, price, description) VALUE
    (1,'Iphone',10000,'New Product'),
    (2,'SamSung',25000,'New Product')