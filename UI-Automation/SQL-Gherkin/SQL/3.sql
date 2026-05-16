show databases;
use classicmodels;
show tables;
describe customers;

select count(customername), country from customers group by (country);
describe orderdetails;
select priceeach from orderdetails;

select avg(priceeach) from orderdetails;
select min(priceeach) from orderdetails;
select max(priceeach) from orderdetails;