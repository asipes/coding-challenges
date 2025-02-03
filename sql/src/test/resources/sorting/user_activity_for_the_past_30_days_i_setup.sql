CREATE TABLE IF NOT EXISTS Activity
(
    user_id       int,
    session_id    int,
    activity_date date,
    activity_type varchar(20) CHECK (activity_type IN ('open_session', 'end_session', 'scroll_down', 'send_message'))
);
TRUNCATE TABLE Activity;
INSERT INTO Activity (user_id, session_id, activity_date, activity_type)
VALUES ('1', '1', '2019-07-20', 'open_session'),
       ('1', '1', '2019-07-20', 'scroll_down'),
       ('1', '1', '2019-07-20', 'end_session'),
       ('2', '4', '2019-07-20', 'open_session'),
       ('2', '4', '2019-07-21', 'send_message'),
       ('2', '4', '2019-07-21', 'end_session'),
       ('3', '2', '2019-07-21', 'open_session'),
       ('3', '2', '2019-07-21', 'send_message'),
       ('3', '2', '2019-07-21', 'end_session'),
       ('4', '3', '2019-06-25', 'open_session'),
       ('4', '3', '2019-06-25', 'end_session');