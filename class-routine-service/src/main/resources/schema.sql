drop table if exists class_routine;
drop table if exists hibernate_sequence;
create table class_routine (id bigint not null, class_time varchar(255), day varchar(255), primary key (id));
create table hibernate_sequence (next_val bigint);
insert into hibernate_sequence values ( 1 );