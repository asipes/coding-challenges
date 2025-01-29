CREATE TABLE IF NOT EXISTS Students (student_id int, student_name varchar(20));
CREATE TABLE IF NOT EXISTS Subjects (subject_name varchar(20));
CREATE TABLE IF NOT EXISTS Examinations (student_id int, subject_name varchar(20));
TRUNCATE TABLE Students;
INSERT INTO Students (student_id, student_name)
VALUES ('1', 'Alice'),
       ('2', 'Bob'),
       ('13', 'John'),
       ('6', 'Alex');
TRUNCATE TABLE Subjects;
INSERT INTO Subjects (subject_name)
VALUES ('Math'),
       ('Physics'),
       ('Programming');
TRUNCATE TABLE Examinations;
INSERT INTO Examinations (student_id, subject_name)
VALUES ('1', 'Math'),
       ('1', 'Physics'),
       ('1', 'Programming'),
       ('2', 'Programming'),
       ('1', 'Physics'),
       ('1', 'Math'),
       ('13', 'Math'),
       ('13', 'Programming'),
       ('13', 'Physics'),
       ('2', 'Math'),
       ('1', 'Math');