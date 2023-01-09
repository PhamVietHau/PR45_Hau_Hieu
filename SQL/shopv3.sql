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
    `usage` int
);


create table `Orders`(
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
    ordersId int,
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
    `description` text,
    image text
);

create table ProductType(
	id int primary key auto_increment,
    `name` varchar(510)
);

create table Amount(
	product_id int,
    color_id int,
    size_id int,
    amount int,
    image text
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

drop trigger if exists delete_order_detail;

delimiter //
create trigger delete_order_detail after delete on orders for each row
begin
	delete from OrderDetail where ordersId = old.id;
end//


insert into `Role` (`role`) values ('ADMIN'),('USER');
insert into `User` (roleId,userName,`password`,email) values (1,'Admin','Admin','Admin@shops.com'),(2,'User1','User1','User1@gmail.com');
insert into Color (`name`) values ('Red'),('Blue'),('Green'),('Black');
insert into Size (`name`) values ('XS'),('S'),('M'),('L'),('XL'),('XXL');
insert into Coupon values (1,'Tết Nguyên Đán 2023','Mừng Tết Nguyên Đán 2023, Giảm giá sặp sàn','2023',100,100000,current_timestamp(),999);
insert into Price values (1,80000,current_timestamp(),date_add(current_timestamp(),interval 365 day)),
	(2,90000,current_timestamp(),date_add(current_timestamp(),interval 365 day));
insert into ProductType values (1,'Áo Thun'),(2,'Áo Khoác'),(3,'Quần');
insert into ShippingType values (1,'Nhanh',50000),(2,'Thường',30000);
insert into `Status` values (1,'Enable'),(2,'Disable'),(3,'Delete');
insert into Amount (product_id,color_id,size_id,amount) values (1,3,1,50),(1,3,2,50),(1,3,3,50),(1,3,4,50),(1,3,5,50),(1,3,6,50),
	 (2,4,1,50),(2,4,2,50),(2,4,3,50),(2,4,4,50),(2,4,5,50),(2,4,6,50);
insert into Product values (1,1,'Áo Thun Xanh',1,'Áo thun xanh','Ao_thun_xanh.png'),
	(2,2,'Áo khoác',2,'Áo khoác','Ao_khoac.png');
insert into PaymentMethod values (1,'Tiền mặt'),(2,'Bankking');
insert into ShippingInfo values (1,2,'Ngo huynh hieu','0909090909','88 quang trung','Da nang','Da nang','VN',''),(2,2,'Ngo huynh hieu','0808080808','246 nguyen hue','Da nang','Da nang','VN','');
insert into orders values (1,2,1,1,570000,1,1,1,current_timestamp()),(2,2,2,null,360000,2,2,2,current_timestamp());
insert into OrderDetail values (1,1,1,5,400000),(2,1,2,3,270000),(3,2,2,4,360000);



















