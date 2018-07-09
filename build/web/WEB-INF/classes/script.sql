drop user if exists shop@locahost;
create user shop@localhost identified by 'asmp32hj26';

drop database if exists shop;
create database shop;

grant all privileges on shop.* to shop@localhost;

use shop;

create table users (
    id bigint not null auto_increment,
    name varchar(64) not null,
    email varchar(64) not null,
    primary key(id),
);

create table credentials (
    id bigint not null auto_increment,
    username varchar(64) not null,
    password varchar(64) not null,
    user_id bigint not null,
    primary key(id),
    foreign key(user_id) references users(id) 
    unique key(username)
);

create table user_attributes (
    id bigint not null,
    key varchar(32) not null,
    value text not null,
);

create table products (
    id bigint not null auto_increment,
    title varchar(255),
    price float,
    discount float,
);

create table product_attributes (
    id bigint not null,
    key varchar(32) not null,
    value text not null,
);
