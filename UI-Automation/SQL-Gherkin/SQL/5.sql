use classicmodels;
select database();
 show tables;
 select * from employees;
 select * from offices;
select * from offices, employees limit 10;     -- limit 10 means just want 10 rows of output 
select * from employees as e inner join offices using (officecode);
select e.employeenumber ,e.lastname, e.firstname, o.officecode from employees e inner join offices o where o.officecode = e.officecode;

select e.employeenumber ,e.lastname, e.firstname, o.officecode from employees e inner join offices o using (officecode);
-- using used only when column name in both table is same