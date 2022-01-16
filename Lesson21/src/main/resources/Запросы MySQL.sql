create database if not exists courses;

use courses;

CREATE TABLE if not exists `groups` ( 
group_ID integer NOT NULL, 
`name` VARCHAR(100), 
PRIMARY KEY (group_ID) 
);

CREATE TABLE if not exists student ( 
student_ID integer NOT NULL, 
`name` char(100), 
rating float DEFAULT 0.0, 
group_ID integer, 
PRIMARY KEY (student_ID) 
); 

CREATE TABLE if not exists course ( 
course_ID integer NOT NULL, 
name char(100), 
PRIMARY KEY (course_ID) 
); 

CREATE TABLE if not exists studentscources ( 
id integer NOT NULL, 
course_ID integer, 
student_ID integer, 
PRIMARY KEY (id) 
);
 
/*
INSERT INTO `groups` (group_ID, name) VALUES (1, "e01"); 
INSERT INTO `groups` (group_ID, name) VALUES (2, "e02"); 
INSERT INTO `groups` (group_ID, name) VALUES (3, "e03"); 

INSERT INTO course (course_ID, name) VALUES (1, "java basic"); 
INSERT INTO course (course_ID, name) VALUES (2, "java pro"); 

INSERT INTO student (student_ID, name, rating, group_ID) VALUES 
(1, "nick", 5, 1), 
(2, "tim", 7, 2), 
(3, "jonh", 4, 3), 
(4, "mike", 2, 1), 
(5, "joe", 8, 2), 
(6, "martin", 5, 3), 
(7, "niki", 9, 1), 
(8, "jimi", 6, 2), 
(9, "ante", 6, 3), 
(10, "antun", 6, 1); 

INSERT INTO studentscources (id, course_ID, student_ID) VALUES 
(1, 1, 1), 
(2, 2, 1), 
(3, 1, 3), 
(4, 2, 3), 
(5, 1, 5), 
(6, 2, 5), 
(7, 1, 7), 
(8, 2, 7), 
(9, 1, 9), 
(10, 2, 9), 
(11, 1, 2), 
(12, 1, 4), 
(13, 1, 6), 
(14, 1, 8), 
(15, 2, 10), 
(16, 1, 1); 
*/

/*Вывод самых высоких оценок по группам*/
select *
from
(
    select *, row_number() over (partition by group_ID order by rating desc) num
    from student
) parts
where num = 1;

/*Вывод самых низких оценок по группам*/
select *
from
(
    select *, row_number() over (partition by group_ID order by rating asc) num
    from student
) parts
where num = 1;

/*Средний балл группы*/
SELECT s.group_ID, g.name, COUNT(student_ID), AVG(rating) as avg
FROM student AS s, `groups` AS g
group by group_ID
order by group_ID asc; 

/*Рейтинг выше среднего по курсу (Или там надо было именно предмет, а не все группы?)*/
SELECT *
FROM student S
WHERE S.rating > (SELECT AVG(rating) FROM student);

/*Рейтинг выше среднего по группе*/
SELECT *
FROM student S
WHERE rating > (SELECT AVG(rating) FROM student where group_ID = S.group_ID group by group_ID);

/*Студенты, которые посещали только 1 курс*/
SELECT S.student_ID, S.`name`
FROM student S
INNER JOIN studentscources R ON S.student_ID = R.student_ID
GROUP BY S.student_ID
HAVING COUNT(*) = 1;

/*Наиболее посещаемый курс*/
SELECT S.course_ID
FROM studentscources S
group by course_ID
order by COUNT(course_ID) desc limit 1;

/*Наиболее часто используемая оценка*/
SELECT S.rating, COUNT(rating)
FROM student S
group by rating
order by COUNT(rating) desc limit 1;