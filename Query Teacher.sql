select sqs.ID, sqs.QuizSessionID, sqs.StudentID, st.Name from 
StudentQuizSession sqs, Student st
where sqs.StudentID = st.ID

select
case when qq.QuestionID = sqa.QuestionID 
then 1 else 0
end as 'done'
from QuestionQuiz qq
left outer join StudentQuizAnswer sqa
on qq.QuestionID = sqa.QuestionID
and qq.QuizID = sqa.QuizID
and StudentID = 1053