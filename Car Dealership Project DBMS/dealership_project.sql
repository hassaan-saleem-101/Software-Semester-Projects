
---------------- creating database ----------------------

create database dealership 

use dealership

-------------------- making tables ------------------------

create table car

(
  car_id varchar(255) primary key not null,

  serial_number int,

  model varchar(255),

  car_year int 
);

create table sales_person (

sales_person_id varchar(255) primary key not null,

first_name varchar(255),

last_name varchar(255)

);

create table customer(

customer_id varchar(255) primary key not null,

first_name varchar(255),

last_name varchar(255),

customer_address varchar(255)

);


create table sales_invoice

(
   invoice_id varchar (255) primary key not null,

  invoice_number int,

  car_id_fk varchar(255) foreign key references car(car_id),
  
  sales_person_id_fk varchar(255) foreign key references sales_person(sales_person_id),
   
  customer_id_fk varchar(255) foreign key references customer(customer_id)

);


create table service_ticket(

service_ticket_id varchar(255) primary key not null,

date_received varchar(255),

car_id_fk varchar(255) foreign key references car(car_id),

customer_id_fk varchar(255) foreign key references customer(customer_id)

);


create table mechanic(

mechanic_id varchar(255) primary key not null,

first_name varchar(255),

last_name varchar(255)

);

create table company_service(

service_id varchar(255) primary key not null,

name_service varchar(255),

hourly_rate float ----(in dollars)

);

create table service_mechanic(

service_mechanic_id varchar(255) primary key not null,

rate float,

service_ticket_id_fk varchar(255) foreign key references service_ticket(service_ticket_id),

mechanic_id_fk varchar(255) foreign key references mechanic(mechanic_id),

service_id_fk varchar(255) foreign key references company_service(service_id)

);

----------------------- insertion --------------------------

insert into car(car_id,serial_number,model,car_year)

values('112 black',1,'corolla xli','2011')

insert into car(car_id,serial_number,model,car_year)

values('223 white',2,'honda rebirth','2014')

insert into car(car_id,serial_number,model,car_year)

values('445 silver',3,'suzuki wagonR','2015')


insert into sales_person(sales_person_id, first_name, last_name)

values('10','zaheer','abbass')


insert into sales_person(sales_person_id, first_name, last_name)

values('12','ilyaas','hamar')

insert into sales_person(sales_person_id, first_name, last_name)

values('14','rago','xar')

insert into customer(customer_id, first_name, last_name, customer_address)

values('11','razaq','ahmad','221 b park lane, phone: 0333-456-90')

insert into customer(customer_id, first_name, last_name, customer_address)

values('22','haji','sultan','rest q millenium street, phone: 0332-789-00')

insert into customer(customer_id, first_name, last_name, customer_address)

values('33','veer','shah','bbn false lane, phone: 0331-557-10')

insert into sales_invoice(invoice_id,invoice_number,car_id_fk,sales_person_id_fk,customer_id_fk)

values('33x',4,'112 black','10','11')

insert into sales_invoice(invoice_id,invoice_number,car_id_fk,sales_person_id_fk,customer_id_fk)

values('101y',5,'223 white','12','22')

insert into sales_invoice(invoice_id,invoice_number,car_id_fk,sales_person_id_fk,customer_id_fk)

values('676z',6,'445 silver','14','33')


insert into service_ticket( service_ticket_id, date_received, car_id_fk, customer_id_fk)

values('qr1','22 jan 2021 10:50 am','112 black','11')

insert into service_ticket( service_ticket_id, date_received, car_id_fk, customer_id_fk)

values('we2','23 june 2020 11:00 am','223 white','22')

insert into service_ticket( service_ticket_id, date_received, car_id_fk, customer_id_fk)

values('rt3','31 december 2019 4:40 pm','445 silver','33')

insert into mechanic(mechanic_id,first_name,last_name)

values('u1','jahzaib','shafiq')

insert into mechanic(mechanic_id,first_name,last_name)

values('m2','hammas','tarrar')

insert into mechanic(mechanic_id,first_name,last_name)

values('n3','juggas','yalaar')

insert into company_service(service_id,name_service,hourly_rate)

values('qas1','washing',2.5)

insert into company_service(service_id,name_service,hourly_rate)

values('ret2','oil changing',10.0)


insert into company_service(service_id,name_service,hourly_rate)

values('ert 3','deep clean',15.0)

insert into service_mechanic(service_mechanic_id,rate,service_ticket_id_fk,mechanic_id_fk,service_id_fk)

values('yer9',5.0,'qr1','u1','qas1')


insert into service_mechanic(service_mechanic_id,rate,service_ticket_id_fk,mechanic_id_fk,service_id_fk)

values('qwq8',20.0,'we2','m2','ret2')


insert into service_mechanic(service_mechanic_id,rate,service_ticket_id_fk,mechanic_id_fk,service_id_fk)

values('asd7',25.0,'rt3','n3','ert 3')


------------------------- selection ------------------------------------------

select * from car

select * from sales_person

select * from customer

select * from sales_invoice

select * from service_ticket

select * from mechanic

select * from company_service

select * from service_mechanic


------------------------------- queries ---------------------------


create procedure update_serial_number @car_id varchar(255) as

update car set serial_number = 1000

where car_id = @car_id

exec update_serial_number '112 black'

select * from car


create procedure select_ticket_4 @mechanic_id varchar(255) as

select s_t.car_id_fk,s_t.date_received,s_t.customer_id_fk,s_t.service_ticket_id from service_ticket s_t join service_mechanic s_m

on s_m.service_ticket_id_fk = s_t.service_ticket_id 

where s_m.mechanic_id_fk = @mechanic_id

exec select_ticket_4 'm2'

----,s_m.mechanic_id_fk,s_m.service_ticket_id_fk

---- 


--create procedure display_serial @car_id varchar(255), @customer varchar(255) as


--exec display_serial '223 white', '22'


create procedure update_rate @service_id varchar(255) as

update company_service set hourly_rate = 3.4 where  service_id = @service_id

exec update_rate 'qas1'

select * from company_service


