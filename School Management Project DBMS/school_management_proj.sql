create database school

use school

create table administrator

(

ad_id int primary key identity,

ad_name varchar(255) not null unique,

ad_password varchar(255) not null

);

insert into administrator(ad_name,ad_password)

values('salman', 'password123')

select * from administrator


insert into administrator(ad_name,ad_password)

values('raza', 'password456')

select * from administrator


create table student(

st_id int primary key identity,

st_ftname varchar(255) not null,

st_ltname varchar(255) not null,

st_gender varchar(255) not null,

st_address varchar(255) not null,

st_enroll_date varchar(255) not null,

st_ad_fk_id int foreign key references administrator(ad_id)

);

insert into student (st_ftname,st_ltname,st_gender,st_address,st_enroll_date,st_ad_fk_id)

values('muhmmad','khan','male','212 B Baker street nazimabaad','monday 21 st january 2008',1)


insert into student (st_ftname,st_ltname,st_gender,st_address,st_enroll_date,st_ad_fk_id)

values('gujjar','deepak','male','lakecity street m-7','tuesday 23 rd june 2010',1)

select * from student

select * from administrator

select * from student where st_ad_fk_id = 1  --- question: ? how tou use name administrator in the case of st_ad_fk_id = 1; 


create table fees(

fee_id int primary key identity, -- receipt 

fee_amount float not null,

fee_date varchar(255),

fee_fk_st_id int foreign key references student(st_id)

); 


insert into fees(fee_amount,fee_date,fee_fk_st_id)

values(12900.0,'04/11/2021',1)


insert into fees(fee_amount,fee_date,fee_fk_st_id)

values(14900.0,'05/11/2021',2)

select * from fees


select st.st_ftname,st.st_gender,st.st_enroll_date, ad.* from student st inner join administrator ad on ad.ad_id = st.st_ad_fk_id where ad.ad_name = 'salman'

--- select * from sys.tables

select * from administrator 

select count (ad_id) from administrator where ad_name = 'raza'

select ad_password from administrator where ad_name = 'salman'















