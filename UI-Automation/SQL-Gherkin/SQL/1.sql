show databases;
create database mycreation;
drop database dassault;
use mycreation;
create table employeesdetails(
employeeid int auto_increment,
firstname varchar(30),
lastname varchar(30),
trigram varchar(8),
city varchar(15),
primary key (employeeid)
);
drop table employeesdetails;
insert into employeesdetails (firstname, lastname, trigram, city) values
("Aditya", "Rudrakanthwar", "ARR11", "Pune"),
("Sujit", "Mundhe", "SME22","Delhi"),
("Akash", "Sir", "ATE33", "Chinchwad"),
("Aaditya", "Pitke", "APK44","Pune"),
("Prachil","Kolhe","PKE55","Mumbai");

select * from employeesdetails;

create table HRmanager(
employeeid int auto_increment,
experience varchar(15),
brand varchar(15),
primary key (employeeid)
);

select * from HRmanager;


insert  into HRmanager (experience, brand) values
("3 years", "catia"),
("2 years", "inovia"),
("1 years", "medidata"),
("4 years", "3ds"),
("2 years", "solidworks");

select * from HRmanager;


select * from HRmanager where experience='2 years';

alter table employeesdetails drop trigram;
select * from employeesdetails;

-- alter table employeesdetails drop project;
alter table employeesdetails add column project varchar(20);
select * from employeesdetails;

insert into employeesdetails (project) values
("america"),
("france");

update employeesdetails set project='Japan' where employeeid=1;

show tables;
select database();    -- command to know which database is working
