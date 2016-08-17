insert into division (name) values ('Finances');
insert into division (name) values ('HR');
insert into division (name) values ('R&D');


insert into contact_data (email, mobile_phone_number,home_phone_number,division_id,employee_id) values ('finances@comp.com','finances-mobile','finances-home',1,0);
insert into contact_data (email, mobile_phone_number,home_phone_number,division_id,employee_id) values ('hr@comp.com','hr-mobile','hr-home',2,0);
insert into contact_data (email, mobile_phone_number,home_phone_number,division_id,employee_id) values ('r&d@comp.com','r&d-mobile','r&d-home',3,0);
insert into contact_data (email, mobile_phone_number,home_phone_number,division_id,employee_id) values ('nicole.gilmore@comp.com','','',0,1);
insert into contact_data (email, mobile_phone_number,home_phone_number,division_id,employee_id) values ('nasim.strong@comp.com','','',0,2);
insert into contact_data (email, mobile_phone_number,home_phone_number,division_id,employee_id) values ('dana.pitts@comp.com','','',0,3); 
insert into contact_data (email, mobile_phone_number,home_phone_number,division_id,employee_id) values ('ina.pitts@comp.com','','',0,4);
insert into contact_data (email, mobile_phone_number,home_phone_number,division_id,employee_id) values ('matthew.fernandez@comp.com','','',0,5);
insert into contact_data (email, mobile_phone_number,home_phone_number,division_id,employee_id) values ('drew.hayes@comp.com','','',0,6);
insert into contact_data (email, mobile_phone_number,home_phone_number,division_id,employee_id) values ('jared.beard@comp.com','','',0,7);
insert into contact_data (email, mobile_phone_number,home_phone_number,division_id,employee_id) values ('aileen.roach@comp.com','','',0,8);
insert into contact_data (email, mobile_phone_number,home_phone_number,division_id,employee_id) values ('sandra.robinson@comp.com','','',0,9);
insert into contact_data (email, mobile_phone_number,home_phone_number,division_id,employee_id) values ('nehru.bates@comp.com','','',0,10);
    

insert into employee (pesel,name,surname,dob,division_id) values (86091361190,'Nicole','Gilmore','1977-06-30',2);
insert into employee (pesel,name,surname,dob,division_id) values (58693843036,'Nasim','Strong','1973-07-01',3);
insert into employee (pesel,name,surname,dob,division_id) values (75840336317,'Dana','Pitts','1969-08-20',2);
insert into employee (pesel,name,surname,dob,division_id) values (73609893023,'Ina','Fernandez','1977-02-06',3);
insert into employee (pesel,name,surname,dob,division_id) values (73458025427,'Matthew','Fernandez','1972-05-09',2);
insert into employee (pesel,name,surname,dob,division_id) values (76269539170,'Drew','Hayes','1979-03-29',2);
insert into employee (pesel,name,surname,dob,division_id) values (23763653426,'Jared','Beard','1971-11-24',2);
insert into employee (pesel,name,surname,dob,division_id) values (71193568748,'Aileen','Roach','1979-08-17',2);
insert into employee (pesel,name,surname,dob,division_id) values (52251433469,'Sandra','Robinson','1979-10-23',3);
insert into employee (pesel,name,surname,dob,division_id) values (83185371663,'Nehru','Bates','1971-11-04',1);
    
        
insert into project (name,type,start_of_project,end_of_project) values ('TFI0Z','EXTERNAL','1971-10-24','2020-06-25');
insert into project (name,type,start_of_project,end_of_project) values ('NCX6S','INTERNAL','1972-07-04','2025-11-19');
insert into project (name,type,start_of_project,end_of_project) values ('LTZ4U','EXTERNAL','1975-07-20','2062-11-26');
insert into project (name,type,start_of_project,end_of_project) values ('UOZ0S','INTERNAL','1971-12-10','2065-11-12');
insert into project (name,type,start_of_project,end_of_project) values ('UGG1J','INTERNAL','1970-11-18','2045-10-28');
insert into project (name,type,start_of_project,end_of_project) values ('WLL3P','INTERNAL','1973-01-14','2087-05-31');
insert into project (name,type,start_of_project,end_of_project) values ('TEQ0C','EXTERNAL','1970-04-06','2032-02-11');
insert into project (name,type,start_of_project,end_of_project) values ('GTT9A','EXTERNAL','1979-10-26','2077-05-25');
insert into project (name,type,start_of_project,end_of_project) values ('MFP0B','EXTERNAL','1973-11-25','2025-07-12');
insert into project (name,type,start_of_project,end_of_project) values ('XTL6V','EXTERNAL','1975-08-30','2018-10-21');
    
    
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('PL',1,10,'1982-01-22','2017-10-30','9156.45');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('PL',2,9,'1983-04-26','2013-02-04','9516.18');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('TCD',3,8,'1984-01-15','2018-11-30','855.46');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('PL',4,7,'1982-02-23','2013-05-22','4425.66');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('FCD',5,6,'1982-04-02','2019-08-24','699.04');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('TCD',6,5,'1982-08-21','2012-12-18','8502.77');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('PL',7,4,'1982-04-10','2020-03-13','5856.11');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('TCD',8,3,'1984-06-26','2012-10-03','7254.87');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('DEV',9,2,'1984-11-13','2013-04-05','8641.55');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('FCD',10,1,'1982-01-11','2012-05-26','8459.95');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('TCD',1,8,'2012-08-01','2018-06-30','8502.77');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('DEV',1,6,'2012-07-22','2016-09-30','7254.87');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('DEV',3,8,'2011-12-15','2015-11-30','855.46');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('PL',7,2,'2015-02-10','2021-03-13','5000.11');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary) values ('PL',7,1,'2015-01-15','2015-07-13','4843.11');