CREATE TABLE IF NOT EXISTS Teacher
(
    teacher_id int,
    subject_id int,
    dept_id    int
);
TRUNCATE TABLE Teacher;
INSERT INTO Teacher (teacher_id, subject_id, dept_id)
VALUES ('1', '2', '3'),
       ('1', '2', '4'),
       ('1', '3', '3'),
       ('2', '1', '1'),
       ('2', '2', '1'),
       ('2', '3', '1'),
       ('2', '4', '1');