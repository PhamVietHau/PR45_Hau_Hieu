drop database if exists shopv3;

create database shopv3;

use shopv3;

create table user(
	Id int primary key auto_increment,
	RoleId int,
	UserName varchar(510),
	`Password` varchar(510),
	Email varchar(510),
	TimeCreate datetime default current_timestamp
);

create table role(
	Id int primary key auto_increment,
    `Role` text
);

create table ShippingInfo(
	Id int primary key auto_increment,
    UserId int,
    `Name` varchar(510),
    Phone varchar(20),
    Line1 varchar(510),
    Line2 varchar(510),
    City varchar(510),
    County varchar(510),
    Zip varchar(20),
    Country varchar(510),
    Other text
);


create table ShippingType(
	Id int primary key auto_increment,
    Service varchar(510),
    Cost int
);

create table Coupon(
	Id int primary key auto_increment,
    `Name` varchar(510),
    `Description` text,
    `Code` varchar(20),
    Discount int,
    MaxDiscountAmount int,
    Expired datetime,
    `Usage` int,
    `Enable` boolean default true
);


create table `Order`(
	Id int primary key auto_increment,
    UserId int,
    PaymentMethodId int,
    CouponId int,
    Total int,
    StatusId int,
    ShippingInfoId int,
    ShippingTypeId int,
    TimeCreate datetime default current_timestamp
);

create table OrderDetail(
	Id int primary key auto_increment,
    OrderId int,
    ProductId int,
    Quantity int,
    Total int
);

create table PaymentMethod(
	Id int primary key auto_increment,
    `Name` varchar(510),
    `Description` text
);

create table `Status`(
	Id int primary key auto_increment,
    `Name` varchar(510)
);


create table Product(
	Id int primary key auto_increment,
    ProductTypeId int,
    `Name` varchar(510),
    PriceId int,
    Tag varchar(510),
    `Description` text,
    Image text,
    TimeCreate datetime default current_timestamp,
    StatusId int
);

create table ProductType(
	Id int primary key auto_increment,
    `Name` varchar(510)
);

create table Amount(
	Id int primary key auto_increment, 
	ProductId int,
    ColorId int,
    SizeId int,
    Amount int
);

create table Color(
	Id int primary key auto_increment,
    `Name` varchar(510)
);

create table Size(
	Id int primary key auto_increment,
    `name` varchar(510)
);


create table Price(
	Id int primary key auto_increment,
    Price int,
    TimeStart datetime default current_timestamp,
    TimeEnd datetime default current_timestamp
);


insert into `Role` (`Role`) values ('ADMIN'),('USER');
insert into `User` (RoleId,UserName,`Password`,Email) values (1,'Admin','Admin','Admin@shops.com'),(2,'User1','User1','User1@gmail.com');
insert into Color (`Name`) values ('Red'),('Blue'),('Green'),('Black');
insert into Size (`Name`) values ('XS'),('S'),('M'),('L'),('XL'),('XXL');
insert into Coupon values (1,'Tết Nguyên Đán 2023','Mừng Tết Nguyên Đán 2023, Giảm giá sặp sàn','2023',99,1000000,current_timestamp(),999,true);
insert into Price values (1,799999,current_timestamp(),date_add(current_timestamp(),interval 365 day)),
	(2,999999,current_timestamp(),date_add(current_timestamp(),interval 365 day));
insert into ProductType values (1,'Áo Thun'),(2,'Áo Khoác');
insert into ShippingType values (1,'Nhanh',50000),(2,'Thường',30000);
insert into `Status` values (1,'Enable'),(2,'Disable'),(3,'Delete');
insert into Amount (ProductId,ColorId,SizeId,Amount) values (1,3,1,50),(1,3,2,50),(1,3,3,50),(1,3,4,50),(1,3,5,50),(1,3,6,50),
	 (2,4,1,50),(2,4,2,50),(2,4,3,50),(2,4,4,50),(2,4,5,50),(2,4,6,50);
insert into Product values (1,1,'Áo Thun Xanh',1,'','Áo thun xanh','Ao_thun_xanh.png',current_timestamp(),1),
	(2,2,'Áo khoác',2,'','Áo khoác','Ao_khoac.png',current_timestamp(),1);





















