drop database if exists shopv3;

create database shopv3;

use shopv3;

create table user(
	id int primary key auto_increment,
	roleId int,
	userName varchar(510),
	`password` varchar(510),
	email varchar(510),
	timeCreate datetime default current_timestamp
);

create table role(
	id int primary key auto_increment,
    `role` text
);

create table ShippingInfo(
	id int primary key auto_increment,
    userId int,
    `name` varchar(510),
    phone varchar(20),
    street varchar(510),
    city varchar(510),
    county varchar(510),
    country varchar(510),
    other text
);


create table ShippingType(
	id int primary key auto_increment,
    service varchar(510),
    cost int
);

create table Coupon(
	id int primary key auto_increment,
    `name` varchar(510),
    `description` text,
    `code` varchar(20),
    discount int,
    maxDiscountAmount int,
    expired datetime,
    `usage` int,
    `enable` boolean default true
);


create table `Order`(
	id int primary key auto_increment,
    userId int,
    paymentMethodId int,
    couponId int,
    total int,
    statusId int,
    shippingInfoId int,
    shippingTypeId int,
    timeCreate datetime default current_timestamp
);

create table OrderDetail(
	id int primary key auto_increment,
    orderId int,
    productId int,
    quantity int,
    total int
);

create table PaymentMethod(
	id int primary key auto_increment,
    `name` varchar(510)
);

create table `Status`(
	id int primary key auto_increment,
    `name` varchar(510)
);


create table Product(
	id int primary key auto_increment,
    productTypeId int,
    `name` varchar(510),
    priceId int,
    tag varchar(510),
    `description` text,
    image text,
    statusId int
);

create table ProductType(
	id int primary key auto_increment,
    `name` varchar(510)
);

create table Amount(
	-- id int primary key auto_increment, 
	productId int,
    colorId int,
    sizeId int,
    amount int
);

create table Color(
	id int primary key auto_increment,
    `name` varchar(510)
);

create table Size(
	id int primary key auto_increment,
    `name` varchar(510)
);


create table Price(
	id int primary key auto_increment,
    price int,
    timeStart datetime default current_timestamp,
    timeEnd datetime default current_timestamp
);


insert into `Role` (`role`) values ('ADMIN'),('USER');
insert into `User` (roleId,userName,`password`,email) values (1,'Admin','Admin','Admin@shops.com'),(2,'User1','User1','User1@gmail.com');
insert into Color (`name`) values ('Red'),('Blue'),('Green'),('Black');
insert into Size (`name`) values ('XS'),('S'),('M'),('L'),('XL'),('XXL');
insert into Coupon values (1,'Tết Nguyên Đán 2023','Mừng Tết Nguyên Đán 2023, Giảm giá sặp sàn','2023',99,1000000,current_timestamp(),999,true);
insert into Price values (1,799999,current_timestamp(),date_add(current_timestamp(),interval 365 day)),
	(2,999999,current_timestamp(),date_add(current_timestamp(),interval 365 day));
insert into ProductType values (1,'Áo Thun'),(2,'Áo Khoác');
insert into ShippingType values (1,'Nhanh',50000),(2,'Thường',30000);
insert into `Status` values (1,'Enable'),(2,'Disable'),(3,'Delete');
insert into Amount (productId,colorId,sizeId,amount) values (1,3,1,50),(1,3,2,50),(1,3,3,50),(1,3,4,50),(1,3,5,50),(1,3,6,50),
	 (2,4,1,50),(2,4,2,50),(2,4,3,50),(2,4,4,50),(2,4,5,50),(2,4,6,50);
insert into Product values (1,1,'Áo Thun Xanh',1,'','Áo thun xanh','Ao_thun_xanh.png',1),
	(2,2,'Áo khoác',2,'','Áo khoác','Ao_khoac.png',1);





















