CREATE TABLE students (
    student_id SERIAL PRIMARY KEY,
    first_name TEXT,
    last_name TEXT,
    email TEXT UNIQUE NOT NULL,
    school_enrollment_date DATE
);

CREATE TABLE professors (
    professor_id SERIAL PRIMARY KEY,
    first_name TEXT,
    last_name TEXT,
    department TEXT
);

CREATE TABLE courses (
    course_id SERIAL PRIMARY KEY,
    course_name TEXT,
    course_description TEXT,
    professor_id INT REFERENCES professors(professor_id)
);

CREATE TABLE enrollments (
    student_id INT REFERENCES students(student_id),
    course_id INT REFERENCES courses(course_id),
    enrollment_date DATE,
    PRIMARY KEY (student_id, course_id)
);

INSERT INTO students (first_name, last_name, email, school_enrollment_date) VALUES
('John', 'Doe', 'john.doe@example.com', '2022-08-15'),
('Jane', 'Smith', 'jane.smith@example.com', '2023-01-10'),
('Alice', 'Johnson', 'alice.johnson@example.com', '2021-09-05'),
('Bob', 'Brown', 'bob.brown@example.com', '2022-01-20'),
('Charlie', 'Davis', 'charlie.davis@example.com', '2023-05-30');

INSERT INTO professors (first_name, last_name, department) VALUES
('Dr. Emily', 'Wilson', 'Physics'),
('Dr. Michael', 'Smith', 'Chemistry'),
('Dr. Sarah', 'Johnson', 'Mathematics'),
('Dr. David', 'Lee', 'Computer Science');

INSERT INTO courses (course_name, course_description, professor_id) VALUES
('Physics 101', 'Introduction to Physics', 1),
('Chemistry 101', 'Basic Chemistry Concepts', 2),
('Calculus 101', 'Fundamentals of Calculus', 3);

INSERT INTO enrollments (student_id, course_id, enrollment_date) VALUES
(1, 1, '2023-09-01'),
(2, 1, '2023-09-01'),
(1, 2, '2023-09-01'),
(3, 3, '2023-09-02'),
(4, 2, '2023-09-03');

SELECT students.first_name || ' ' || students.last_name AS full_name
FROM students
JOIN enrollments ON students.student_id = enrollments.student_id
JOIN courses ON enrollments.course_id = courses.course_id
WHERE courses.course_name = 'Physics 101';

SELECT courses.course_name, professors.first_name || ' ' || professors.last_name AS professor_full_name
FROM courses
JOIN professors ON courses.professor_id = professors.professor_id;

SELECT DISTINCT courses.course_name
FROM courses
JOIN enrollments ON courses.course_id = enrollments.course_id;

UPDATE students
SET email = 'john.newemail@example.com'
WHERE student_id = 1;

DELETE FROM enrollments
WHERE student_id = 1 AND course_id = 1;