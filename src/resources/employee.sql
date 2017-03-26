-- data
insert into department values(1,"BPO","International");
insert into department values(2,"Insurance","Insurance Appln");
insert into department values(3,"BA","Business Appln");

insert into projects values(1,"Amex Call Centre",1,sysdate(),sysdate());
insert into projects values(2,"Schwab Call Centre",2,sysdate(),sysdate());
insert into projects values(3,"Allstate Apps",2,sysdate(),sysdate());
insert into projects values(4,"AIG Apps",2,sysdate(),sysdate());
insert into projects values(5,"Walmart Apps",3,sysdate(),sysdate());
insert into projects values(5,"Amex Apps",3,sysdate(),sysdate());


insert into EMPLOYEE values(1,'Harilal','Ithikkat','1985/10/21','harilal.ib@gmail.com');
insert into EMPLOYEE values(2,'Saritha','P','1983/04/27','saritha.p@gmail.com');

insert into EMPLOYEE values(3,'Nanda','Harilal','2012/04/07','nanda@gmail.com');

insert into EMPLOYEE values(4,'Sudarsan','Ithikkat','1988/10/21','sudarsan@gmail.com');


desc projects;

desc department;
delete  from projects where proj_id<10;
select * from projects;
select * from employee;
select count(*) from employee;

desc projects