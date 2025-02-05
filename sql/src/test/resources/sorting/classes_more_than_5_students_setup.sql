CREATE TABLE IF NOT EXISTS Courses
(
    student varchar(255),
    class   varchar(255)
);
TRUNCATE TABLE Courses;
INSERT INTO Courses (student, class)
VALUES ('A', 'Math'),
       ('B', 'English'),
       ('C', 'Math'),
       ('D', 'Biology'),
       ('E', 'Math'),
       ('F', 'Computer'),
       ('G', 'Math'),
       ('H', 'Math'),
       ('I', 'Math');