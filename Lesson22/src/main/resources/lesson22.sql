create database if not exists courses_lesson22;
use courses_lesson22;

create table if not exists user (
    id int not null primary key auto_increment,
    login varchar(255) not null,
    `name` varchar(255) not null,
    password varchar(255) not null
);

create table if not exists posts (
    id int not null primary key auto_increment,
    time_published timestamp not null,
    `text` varchar(255) not null
);

alter table user add column email varchar(255);
alter table user add column time_reg timestamp not null;
alter table posts add column type varchar(255) not null;
alter table posts add column user_id int not null;
alter table user add column type_reg varchar(255);

alter table posts add constraint `fk_user_posts` foreign key (user_id) references user (id) ON delete CASCADE;

/*
create table if not exists user_posts (
    id int not null primary key auto_increment,
    user_id int not null,
    posts_id int not null,
    foreign key (user_id) references user (id),
    foreign key (posts_id) references posts (id)
);
*/
/*YYYY-MM-DD HH:MM:SS*/

insert into user (login, `name`, password, email, time_reg) VALUES ('yourLogin', 'yourName', 'yourPassword', 'laccsha@maol.dx', '2001/05/19 13.50.50');
insert into user (login, `name`, password, email, time_reg) VALUES ('yourLogin1', 'yourName1', 'yourPassword1', 'dscs@vade.vd', '2018-07-19 13:50:50');
insert into user (login, `name`, password, email, time_reg) VALUES ('yourLogin2', 'yourName2', 'yourPassword2', 'dsvavslvml@vsd.vs', '2021-05-19 13:50:50');
insert into user (login, `name`, password, email, time_reg, type_reg) VALUES ('yourLogin3', 'yourName3', 'yourPassword3', 'lavsa@maol.dx', '2002/05/19 13.50.50', 'avtive');
insert into user (login, `name`, password, email, time_reg, type_reg) VALUES ('yourLogin4', 'yourName4', 'yourPassword4', 'svdvdscs@vade.vd', '2018-08-19 13:50:50', 'active');
insert into user (login, `name`, password, email, time_reg, type_reg) VALUES ('yourLogin5', 'yourName5', 'yourPassword5', 'dsvavsvdsdlvml@vsd.vs', '2021-05-12 13:50:50', 'not_active');
insert into user (login, `name`, password, email, time_reg, type_reg) VALUES ('yourLogin6', 'yourName6', 'yourPassword6', 'lavsa@maol.dx', '2020/05/19 13.50.50', 'avtive');
insert into user (login, `name`, password, email, time_reg, type_reg) VALUES ('yourLogin7', 'yourName7', 'yourPassword7', 'svdvdscs@vade.vd', '2018-09-19 13:50:50', 'active');
insert into user (login, `name`, password, email, time_reg, type_reg) VALUES ('yourLogin8', 'yourName8', 'yourPassword8', 'dsvavsvdsdlvml@vsd.vs', '2021-05-06 13:50:50', 'not_active');

insert into posts (time_published, text, type, user_id) values ('2021-05-19 13:50:50', 'Text for you', 'social', 1);
insert into posts (time_published, text, type, user_id) values ('2003-01-19 13:50:50', 'Text for you', 'social', 1);
insert into posts (time_published, text, type, user_id) values ('2029-10-19 13:50:50', 'Text for you', 'registration_type', 2);
insert into posts (time_published, text, type, user_id) values ('2018-10-19 13:50:50', 'Text for you', 'registration_type', 2);
insert into posts (time_published, text, type, user_id) values ('2021-06-19 13:50:50', 'Text for you', 'registration_type', 1);

/*
2.	Составьте запрос, выбирающий количество дней между самым ранним и самым поздним постами в posts в разрезе типов поста, принадлежащих пользователю.
Результаты отсортируйте по количеству дней от большего к меньшему.
*/

/*Мне кажется, что что-то не то.. Если будет время, попробую доделать.
  Может можете что-то посоветовать?
  Пробовала с транзакциями, но там тогда такая же проблема с принадлежностью к пользователю*/
select DATEDIFF(max(p.time_published), min(p.time_published)), u.id
from posts p, user u
where u.id = p.user_id
group by type
order by DATEDIFF(MAX(p.time_published), MIN(p.time_published)) desc;

/*
3.	Составьте SQL запрос, который выбирает количество активных (is_active) пользователей в разрезе типов регистраций (registration_type).
В результатах должны быть отфильтрованы только те типы, самая ранняя регистрация в которых произошла позже 1 июня 2018 года.
Запрос должен возвращать информацию только об одном типе ― с наибольшим количеством пользователей.
*/

/*Может я неправильно понимаю суть задания? Или всё так?*/
select count(id) from user where user.type_reg = 'active' AND user.time_reg > '2018-06-01 00:00:00';

/*
4.	Выберите пользовательские мейлы и отправленные пользователям сообщения.
Если у пользователя нет ни одного полученного сообщения, то всё равно укажите его мейл и в соответствующих полях сообщения укажите null.
В результатах должны быть следующие колонки: email, message_id, read_time.
*/

/*Тут похоже тоже могла не понять правильно. Я запуталась
  Были посты, теперь почта и сообщения...
  Сделала, как понимаю, то есть сообщения это посты, а время отправки это время публикации*/
select u.email, p.id, p.time_published from user u left join posts p on u.id = p.user_id