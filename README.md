# Quiz System
---


You are requested to create a small part of a web application similar to socrative, kahoot, cms… In those application, student will login to a quiz session by providing their identity (user name) and the quiz session code (or room).
Assume that there was a backend app, which provides features for teacher to generate and manage quiz sessions. You are requested to a frontend app for student to join and perform a given quiz session.
Base on the given script, you have to create following page: Login Page for Student, Input Quiz Session Code, and Perform Quiz Page.
1. Create a Login Page for student
1. Create a Register Page
1. Create Showing Questions in a Quiz Session
1. Update the work of student to the database when they submitted the answer
The Script file: QuizSystem.sql is put in the same folder with this requirement
The database schema diagram as follow:

You can used Java Web Standard or Struts framework to create this part, but Struts framework is a preferred one with maximum score will be 10, otherwise, the maximum score is limited at 8.
You are requested to do following tasks:
1.	Create a web page for teacher to input his name, and based on the name, the teacher identification will be specified.
2.	Create a web page to show the live progress of latest session quiz which is running.





>     **Student**
- Student begin:
![Image](https://github.com/thaycacac/quiz-system-struts/blob/master/Image%20Demo/1.PNG?raw=true)

- When student click Join then redirect to page enter name:

![Image](https://github.com/thaycacac/quiz-system-struts/blob/master/Image%20Demo/2.PNG?raw=true)

> **Teacher**

- Teacher begin:

![Image](https://github.com/thaycacac/quiz-system-struts/blob/master/Image%20Demo/3.PNG?raw=true)

- Teacher can see all quiz, and choose quiz is progress...

![Image](https://github.com/thaycacac/quiz-system-struts/blob/master/Image%20Demo/4.PNG?raw=true)


> **All**

- When student does'nt join

![Image](https://github.com/thaycacac/quiz-system-struts/blob/master/Image%20Demo/5.PNG?raw=true)

- After student input name, student redirect  page to play quiz, and page teacher add more one student

![Image](https://github.com/thaycacac/quiz-system-struts/blob/master/Image%20Demo/6.PNG?raw=true)

- When student submit, that question not show and page teacher update question student done

![Image](https://github.com/thaycacac/quiz-system-struts/blob/master/Image%20Demo/7.PNG?raw=true)


### **Authors**
---
- [**Thaycacac**](https://github.com/thaycacac)