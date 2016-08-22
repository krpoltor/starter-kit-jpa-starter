insert into contact_data (email, mobile_phone_number,home_phone_number,version,created_at,modified_at) values ('finances@comp.com','finances-mobile','finances-home',1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');
insert into contact_data (email, mobile_phone_number,home_phone_number,version,created_at,modified_at) values ('hr@comp.com','hr-mobile','hr-home',1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');
insert into contact_data (email, mobile_phone_number,home_phone_number,version,created_at,modified_at) values ('r&d@comp.com','r&d-mobile','r&d-home',1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');
insert into contact_data (email, mobile_phone_number,home_phone_number,version,created_at,modified_at) values ('nicole.gilmore@comp.com','','',1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');
insert into contact_data (email, mobile_phone_number,home_phone_number,version,created_at,modified_at) values ('nasim.strong@comp.com','','',1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');
insert into contact_data (email, mobile_phone_number,home_phone_number,version,created_at,modified_at) values ('dana.pitts@comp.com','','',1,'1990-10-23 00:00:00', '1990-10-23 00:00:00'); 
insert into contact_data (email, mobile_phone_number,home_phone_number,version,created_at,modified_at) values ('ina.pitts@comp.com','','',1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');
insert into contact_data (email, mobile_phone_number,home_phone_number,version,created_at,modified_at) values ('matthew.fernandez@comp.com','','',1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');
insert into contact_data (email, mobile_phone_number,home_phone_number,version,created_at,modified_at) values ('drew.hayes@comp.com','','',1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');
insert into contact_data (email, mobile_phone_number,home_phone_number,version,created_at,modified_at) values ('jared.beard@comp.com','','',1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');
insert into contact_data (email, mobile_phone_number,home_phone_number,version,created_at,modified_at) values ('aileen.roach@comp.com','','',1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');
insert into contact_data (email, mobile_phone_number,home_phone_number,version,created_at,modified_at) values ('sandra.robinson@comp.com','','',1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');
insert into contact_data (email, mobile_phone_number,home_phone_number,version,created_at,modified_at) values ('nehru.bates@comp.com','','',1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');


insert into division (name,contact_data_id,version,created_at,modified_at) values ('Finances',1,1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');
insert into division (name,contact_data_id,version,created_at,modified_at) values ('HR',2,1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');
insert into division (name,contact_data_id,version,created_at,modified_at) values ('R&D',3,1,'1990-10-23 00:00:00', '1990-10-23 00:00:00');


insert into employee (pesel,name,surname,dob,division_id,contact_data_id,version,created_at,modified_at) values (86091361190,'Nicole','Gilmore','1977-06-30',2,4,1,'2016-08-19 14:58:00','2016-08-19 14:58:00');
insert into employee (pesel,name,surname,dob,division_id,contact_data_id,version,created_at,modified_at) values (58693843036,'Nasim','Strong','1973-07-01',3,5,1,'2016-08-19 14:58:00','2016-08-19 14:58:00');
insert into employee (pesel,name,surname,dob,division_id,contact_data_id,version,created_at,modified_at) values (75840336317,'Dana','Pitts','1969-08-20',2,6,1,'2016-08-19 14:58:00','2016-08-19 14:58:00');
insert into employee (pesel,name,surname,dob,division_id,contact_data_id,version,created_at,modified_at) values (73609893023,'Ina','Fernandez','1977-02-06',3,7,1,'2016-08-19 14:58:00','2016-08-19 14:58:00');
insert into employee (pesel,name,surname,dob,division_id,contact_data_id,version,created_at,modified_at) values (73458025427,'Matthew','Fernandez','1972-05-09',2,8,1,'2016-08-19 14:58:00','2016-08-19 14:58:00');
insert into employee (pesel,name,surname,dob,division_id,contact_data_id,version,created_at,modified_at) values (76269539170,'Drew','Hayes','1979-03-29',2,9,1,'2016-08-19 14:58:00','2016-08-19 14:58:00');
insert into employee (pesel,name,surname,dob,division_id,contact_data_id,version,created_at,modified_at) values (23763653426,'Jared','Beard','1971-11-24',2,10,1,'2016-08-19 14:58:00','2016-08-19 14:58:00');
insert into employee (pesel,name,surname,dob,division_id,contact_data_id,version,created_at,modified_at) values (71193568748,'Aileen','Roach','1979-08-17',2,11,1,'2016-08-19 14:58:00','2016-08-19 14:58:00');
insert into employee (pesel,name,surname,dob,division_id,contact_data_id,version,created_at,modified_at) values (52251433469,'Sandra','Robinson','1979-10-23',3,12,1,'2016-08-19 14:58:00','2016-08-19 14:58:00');
insert into employee (pesel,name,surname,dob,division_id,contact_data_id,version,created_at,modified_at) values (83185371663,'Nehru','Bates','1971-11-04',1,13,1,'2016-08-19 14:58:00','2016-08-19 14:58:00');
    
        
insert into project (name,type,start_of_project,end_of_project,version,created_at,modified_at) values ('TFI0Z','EXTERNAL','1971-10-24','2020-06-25',1,'1971-10-24 14:58:00','1971-10-24 14:58:00');
insert into project (name,type,start_of_project,end_of_project,version,created_at,modified_at) values ('NCX6S','INTERNAL','1972-07-04','2025-11-19',1,'1972-07-04 14:58:00','1972-07-04 14:58:00');
insert into project (name,type,start_of_project,end_of_project,version,created_at,modified_at) values ('LTZ4U','EXTERNAL','1975-07-20','2062-11-26',1,'1975-07-20 14:58:00','1975-07-20 14:58:00');
insert into project (name,type,start_of_project,end_of_project,version,created_at,modified_at) values ('UOZ0S','INTERNAL','1971-12-10','2065-11-12',1,'1971-12-10 14:58:00','1971-12-10 14:58:00');
insert into project (name,type,start_of_project,end_of_project,version,created_at,modified_at) values ('UGG1J','INTERNAL','1970-11-18','2045-10-28',1,'1970-11-18 14:58:00','1970-11-18 14:58:00');
insert into project (name,type,start_of_project,end_of_project,version,created_at,modified_at) values ('WLL3P','INTERNAL','1973-01-14','2087-05-31',1,'1973-01-14 14:58:00','1973-01-14 14:58:00');
insert into project (name,type,start_of_project,end_of_project,version,created_at,modified_at) values ('TEQ0C','EXTERNAL','1970-04-06','2032-02-11',1,'1970-04-06 14:58:00','1970-04-06 14:58:00');
insert into project (name,type,start_of_project,end_of_project,version,created_at,modified_at) values ('GTT9A','EXTERNAL','1979-10-26','2077-05-25',1,'1979-10-26 14:58:00','1979-10-26 14:58:00');
insert into project (name,type,start_of_project,end_of_project,version,created_at,modified_at) values ('MFP0B','EXTERNAL','1973-11-25','2025-07-12',1,'1973-11-25 14:58:00','1973-11-25 14:58:00');
insert into project (name,type,start_of_project,end_of_project,version,created_at,modified_at) values ('XTL6V','EXTERNAL','1975-08-30','2018-10-21',1,'1975-08-30 14:58:00','1975-08-30 14:58:00');
    
    
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('PL',1,10,'1982-01-22','2017-10-30','9156.45',1,'1982-01-22 14:58:00','1982-01-22 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('PL',2,9,'1983-04-26','2013-02-04','9516.18',1,'1983-04-26 14:58:00','1983-04-26 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('TCD',3,8,'1984-01-15','2018-11-30','855.46',1,'1984-01-15 14:58:00','1984-01-15 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('PL',4,7,'1982-02-23','2013-05-22','4425.66',1,'1982-02-23 14:58:00','1982-02-23 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('FCD',5,6,'1982-04-02','2019-08-24','699.04',1,'1982-04-02 14:58:00','1982-04-02 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('TCD',6,5,'1982-08-21','2012-12-18','8502.77',1,'1982-08-21 14:58:00','1982-08-21 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('PL',7,4,'1982-04-10','2020-03-13','5856.11',1,'1982-04-10 14:58:00','1982-04-10 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('TCD',8,3,'1984-06-26','2012-10-03','7254.87',1,'1984-06-26 14:58:00','1984-06-26 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('DEV',9,2,'1984-11-13','2013-04-05','8641.55',1,'1984-11-13 14:58:00','1984-11-13 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('FCD',10,1,'1982-01-11','2012-05-26','8459.95',1,'1982-01-11 14:58:00','1982-01-11 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('TCD',1,8,'2012-08-01','2018-06-30','8502.77',1,'2012-08-01 14:58:00','2012-08-01 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('DEV',1,6,'2012-07-22','2016-09-30','7254.87',1,'2012-07-22 14:58:00','2012-07-22 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('DEV',3,8,'2011-12-15','2015-11-30','855.46',1,'2011-12-15 14:58:00','2011-12-15 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('PL',7,2,'2015-02-10','2021-03-13','5000.11',1,'2015-02-10 14:58:00','2015-02-10 14:58:00');
insert into employee2project (role,employee_id,project_id,employee_start_of_work,employee_end_of_work,salary,version,created_at,modified_at) values ('PL',7,1,'2015-01-15','2015-07-13','4843.11',1,'2015-01-15 14:58:00','2015-01-15 14:58:00');