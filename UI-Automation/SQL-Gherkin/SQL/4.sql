use classicmodels;
show tables;
describe customers;
select customername from customers;
select customernumber from customers;
create view mycustomers1 as select contactfirstname, contactlastname, phone, country from customers where country='usa';
create or replace view mycustomers1 as select contactfirstname, phone, country from customers where country='usa';
select * from mycustomers1;
drop view mycustomers1;
select database();
select customername, contactfirstname, addressline1 from customers where addressline1 is null;
select customername, contactfirstname, addressline1 from customers where addressline1 is not null;

select customername, contactfirstname, addressline2 from customers where addressline2 is null;
select customername, contactfirstname, addressline2 from customers where addressline2 is not null;

select contactfirstname from customers where contactfirstname like '_r%';
-- second letter will be 'r'
select contactfirstname from customers where contactfirstname like 'a%o';
-- begin with a ends with o and middle can any

select contactfirstname from customers where contactfirstname like 'a__%';
select contactfirstname from customers where contactfirstname like '%or%';

select contactfirstname from customers where (contactfirstname like '_r__') or (contactfirstname like '_r___');

select contactfirstname from customers where contactfirstname like 'a%a';

select creditlimit from customers;
select * from customers where creditlimit between 50000 and 60000;
-- both boundaries will consider

select * from customers where customername not between 'mini wheels co.' and 'saveley & henriot, co.' order by customername;
-- both boundaries will not considered

select * from orders;
select ordernumber, status from orders;

select ordernumber, status from orders order by status asc;

select ordernumber, status from orders order by field(status,
'in process',
'cancelled',
'disputed',
'on hold',
'shipped',
'resolved');



