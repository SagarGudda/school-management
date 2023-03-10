drop table if exists hibernate_sequence;
drop table if exists teacher;
create table hibernate_sequence (next_val bigint);
create table teacher (id bigint not null, address varchar(255), contact_no varchar(255), date_of_joining datetime, date_of_birth datetime, email_id varchar(255), name varchar(255), password varchar(255), registration_number bigint, rewrite_password varchar(255), primary key (id));