create database classroom;
use classroom;

create table Course(
   course_name varchar(30),
   course_id int not NULL,
   tutor_id int,
   primary key(course_id)
);
create table  Student(
   student_id int not null,
   student_name varchar(40) not null,
   student_class int ,
   student_course  int not null,
   primary key(student_id)
);
create table Teachers(
   teacher_name varchar(40) not null,
   teacher_id  int not null,
   teacher_salary int ,
   teacher_dept  varchar(40),
   primary key(teacher_id)
);

alter table course
add foreign key (tutor_id) references Teachers(teacher_id);

alter table student
add foreign key(student_course) references course(course_id);



insert into teachers
values ("jiten",101,15000,"teaching"),
       ("hardik",202,20000,"teaching"),
       ("prachi",303,25000,"managment"),
       ("scahin",404,18000,"teaching");
       
insert into course(course_name,course_id ,tutor_id )
values ("maths" ,1,202),
       ("commerce" ,2,404),
       ("bio",3,101);      
       
 
 insert into student
 values (1,"sourabh", 12,1),
        (2,"kunal", 12,2),
        (3,"sachin", 12,2),
        (4,"shradhha", 12,3),
        (5,"madhur", 12,1),
        (6,"saloni", 12,2);
        
-- Q-1. Write an SQL query to fetch unique values of DEPARTMENT from teachers table.
SELECT distinct teacher_dept from teachers; 
    
 -- Q-2.  Write an SQL query to fetch “student_NAME” from student table in upper case.
select UPPER(student_name) from student;  

-- Q-3. Write an SQL query to print details of the teachers whose SALARY lies between 10000 and 15000.
select * from teachers where teacher_salary between 10000 AND 15000;   

-- Q-4. Write an SQL query to fetch the count of teachers working in the department ‘teaching’.
select teacher_dept, count(*) from teachers where teacher_dept = 'teaching'; 

-- Q-5. Write an SQL query to fetch the list of teachers with the same salary.
select t1.* from teachers t1,teachers t2 where t1.teacher_salary=t2.teacher_salary and t1.teacher_id!= t2.teacher_id;  
       
-- Q-6. Select all the course_name and tutors_name 
select course_name ,teacher_name from course,teachers where tutor_id=teacher_id;   

-- Q-7. Select all the student_name and course_name
select student_name ,course_name from course,student where student.student_course=course.course_id;   


-- Q-8. Write an SQL query to print the student_NAME and student_course from sudent table into a single column COMPLETE_NAME.
-- A space char should separate them.
select CONCAT(student_name, ' ', student_course) AS COMPLETE_NAME from student;

