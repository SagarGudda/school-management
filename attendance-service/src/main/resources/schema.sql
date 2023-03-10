drop table if exists attendance;
drop table if exists hibernate_sequence;
create table attendance (id bigint not null, curdate datetime, day varchar(255), roll_no bigint, name varchar(255), primary key (id));
create table hibernate_sequence (next_val bigint);
insert into hibernate_sequence values ( 1 );