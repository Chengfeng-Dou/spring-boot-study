create table activity(
  ac_name varchar(100) not null ,
  ac_start_time datetime not null ,
  ac_end_time datetime not null ,
  ac_url varchar(100) not null ,
  ac_poster_url varchar(100) not null ,
  primary key (ac_name, ac_url)
);

create table participants(
  ac_name varchar(100) not null ,
  p_name varchar(100) not null ,
  p_institution varchar(100) default "UNKNOW",
  p_occupation varchar(100) default "UNKNOW",
  p_mobile_number varchar(21) not null ,
  p_referee varchar(100),
  primary key (ac_name, p_mobile_number),
  foreign key ac_p_key (ac_name) references activity(ac_name)
);

insert into activity value (
  '测试活动',
  '2018-7-21',
  '2018-9-10',
  'http://localhost/helloworld',
  'http://localhost/sdfasdf'
);

create table sys_user(
  uid int(11) auto_increment key ,
  user_name varchar(100) not null primary key,
  password varchar(100) not null
);

insert into sys_user(user_name, password) values ('tlosp', 'you_guess');

create table sys_role(
  uid int(11),
  user_role enum('MY_ROLE_ADMIN', 'MY_ROLE_USER'),
  primary key (uid, user_role),
  foreign key user_role_id_key (uid) references sys_user(uid)
);

insert into sys_role values (1, 'ROLE_ADMIN');
insert into sys_role values (1, 'ROLE_USER');

