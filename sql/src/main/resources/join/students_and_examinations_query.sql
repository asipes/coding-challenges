-- https://leetcode.com/problems/students-and-examinations 1280. Students and Examinations

SELECT
    st.student_id,
    st.student_name,
    sub.subject_name,
    COUNT(e.student_id) attended_exams
FROM
    students st
        CROSS JOIN
    subjects sub
        LEFT JOIN
    examinations e
    ON
        st.student_id = e.student_id AND sub.subject_name = e.subject_name
GROUP BY st.student_id, st.student_name, sub.subject_name
ORDER BY st.student_id, sub.subject_name;
