-- drop table if exists hibernate_sequence;
drop table if exists student;
-- create table hibernate_sequence (next_val bigint);
-- insert into hibernate_sequence values ( 1 );
create table student (id bigint not null auto_increment,
birth_certificate_number bigint,
date_of_birth datetime,
email_id varchar(255),
father_contact_no varchar(255),
father_name varchar(255),
father_occupation varchar(255),
mother_contact_no varchar(255),
mother_name varchar(255),
mother_occupation varchar(255),
name varchar(255),
password varchar(255),
rewrite_password varchar(255),
roll_no bigint,
class bigint,
student_id bigint,
primary key (id));