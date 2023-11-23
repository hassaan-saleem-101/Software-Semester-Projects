create database spare_parts_shop1

use spare_parts_shop1

create table customer(

c_id int not null PRIMARY KEY identity,

  c_name varchar(255),
 
  c_mail varchar(255),
 
  c_address varchar(255),
 
  c_phone_number varchar(255)
 
);

create table suppliers(

s_id int not null PRIMARY KEY identity,

s_name varchar(255),
 
  s_address varchar(255),
 
  s_phone_number varchar (255)
 
);

create table provide_bills(

c_id int  ,
  s_id int  ,

  CONSTRAINT bills_c_id FOREIGN key (c_id) references customer(c_id),
 
  CONSTRAINT bills_s_id FOREIGN key (s_id) references suppliers(s_id),
  primary key(c_id,s_id)
);

create TABLE staff(

staff_id int not null PRIMARY key identity,
 
 staff_name varchar(255),
 
  staff_address varchar(255),
 
  staff_phone_number varchar(255),
  staff_salary int,
  staff_gender varchar(255)

);

create table order_table(

 order_number int not null PRIMARY key identity,
 
  order_date varchar(255),
 
  staff_id int ,
 
  CONSTRAINT order_staff_id FOREIGN key(staff_id) references staff(staff_id)
 
);

create table transaction_table(

s_id int  ,

  order_number int not null  ,
 
 CONSTRAINT transaction_s_id FOREIGN key (s_id) references suppliers(s_id) ,

  CONSTRAINT transaction_order_num FOREIGN KEY (order_number) references order_table(order_number),  
  PRIMARY key(s_id,order_number)
);

create table spare_parts(

parts_id int not null PRIMARY key identity,

price int,
 
quantity int,
 
staff_id int ,
 
CONSTRAINT parts_staff_id FOREIGN key(staff_id) references staff(staff_id)
);

create table purchase(

c_id int  ,

parts_id int  ,
 
 CONSTRAINT purchase_c_id FOREIGN KEY (c_id) references customer(c_id),
 
 CONSTRAINT purchase_s_id FOREIGN KEY (parts_id) references spare_parts(parts_id),
primary key(c_id,parts_id)
);

create table electrical_part1 (

elec_name varchar (255),
 
parts_id int,  

CONSTRAINT electrical_partsid FOREIGN key (parts_id) references spare_parts(parts_id)  

);

create table transmission_part1(

trans_name varchar(255),
 
 parts_id int ,  
 
CONSTRAINT transmission_partsid FOREIGN key (parts_id) references spare_parts(parts_id)

);

create table nut_bolt_part1(

nut_bolt_name varchar(255),
 
 parts_id int ,  
 
CONSTRAINT nut_bolt_partsid FOREIGN key (parts_id) references spare_parts(parts_id)

);


create table rubber_part1(

rubber_name varchar(255),
 
 parts_id int ,  
 
CONSTRAINT rubber_partsid FOREIGN key (parts_id) references spare_parts(parts_id)

);



insert into customer(c_name,c_mail,c_address,c_phone_number)
Values ('Ali','ali9@gmail.com','house 5 ,13 st,samnabad,Lahore','0304-8836765');
insert into customer(c_name,c_mail,c_address,c_phone_number)
Values ('Hasan','hasan129@gmail.com','house 9 ,20 st,Islampura,Lahore','0304-82567');
insert into customer(c_name,c_mail,c_address,c_phone_number)
Values ('Aaqib','aqib19@gmail.com','house 3,19 st,samnabad,Lahore','0322-8534792');



insert into suppliers(s_name,s_address,s_phone_number)
Values ('Ahmed','house 9 ,14 st,samnabad,Lahore','0309-345678');
insert into suppliers(s_name,s_address,s_phone_number)
Values ('Hadi','house 12 ,17 st,chauburji,Lahore','0312-2345468');



insert into staff(staff_name,staff_address,staff_phone_number,staff_salary,staff_gender)
Values ('Asif','house 4 ,15 st,MughalPura,Lahore','0305-3545658',20000,'m');

insert into staff(staff_name,staff_address,staff_phone_number,staff_salary,staff_gender)
Values ('Ayesha','house9 ,12 st,MughalPura,Lahore','0304-3544658',20000,'f');
insert into staff(staff_name,staff_address,staff_phone_number,staff_salary,staff_gender)
Values ('Tamoor','house 12 ,16 st,chauburji,Lahore','0322-3547658',22000,'m');

insert into staff(staff_name,staff_address,staff_phone_number,staff_salary,staff_gender)
Values ('Aliyan','house 15 ,19 st,chauburji,Lahore','0309-3446789',21000,'m');


insert into provide_bills(s_id,c_id)
values (1,1)
insert into provide_bills(s_id,c_id)
values (2,3)
insert into order_table(order_date,staff_id)
values('2-4-2021','1')
insert into order_table(order_date,staff_id)
values('2-5-2021','2')
insert into order_table(order_date,staff_id)
values('2-4-2021','3')

insert into transaction_table(s_id,order_number)
values(1,2)
--insert into transaction_table(s_id,order_number)
--values(2,3)
--insert into transaction_table(s_id,order_number)
--values(3,1)

insert into spare_parts(price,quantity,staff_id)
values(12000,50,2)
insert into spare_parts(price,quantity,staff_id)
values(19000,20,1)
insert into spare_parts(price,quantity,staff_id)
values(15000,30,3)
insert into spare_parts(price,quantity,staff_id)
values(21000,90,4)


insert into purchase(c_id,parts_id)
VALUES(1,3)
insert into purchase(c_id,parts_id)
values(2,1)
insert into purchase(c_id,parts_id)
values(3,2)

INSERT into electrical_part1(elec_name,parts_id)
values('AGS battery',1)
insert into transmission_part1(trans_name,parts_id)
values('Night Stalker Torque Converter',2)
insert into nut_bolt_part1(nut_bolt_name,parts_id)
values('Grade 8 bolts',3)
insert into rubber_part1(rubber_name,parts_id)
values('Airsoft Rubber Air Bags',4)


select *from customer
select* from suppliers
select* from provide_bills
select * from staff
select*from order_table
SELECT*from purchase
select*from transaction_table
select*from spare_parts


