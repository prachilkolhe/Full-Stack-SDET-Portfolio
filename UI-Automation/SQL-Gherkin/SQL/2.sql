
use mycreation;
select database();
show tables;
select * from employeesdetails;
select * from hrmanager;

select concat(employeeid,' ',brand,' ' ,experience) as fulldetails from hrmanager;

select a.firstname, b.experience from employeesdetails as a, hrmanager as b where a.firstname='Akash' and b.employeeid=3;

select * from hrmanager;
alter table hrmanager add column salary int;
select * from hrmanager;

insert into hrmanager (salary) values
(10000),
(2645345),
(4567),
(4532);

alter table hrmanager add column laptop varchar(10);
insert into hrmanager (laptop) values
('mac'),
('thinkpad'),
('mac'),
('hp'),
('lenovo');

alter table hrmanager add column system_allocate varchar(10) unique;
insert into hrmanager (system_allocate) values
('mac'),
('thinkpad'),
('mac'),           -- unique doesnot return duplicate value
('hp'),
('lenovo');

select * from hrmanager;


