# Online_Restaurant_Reservation_Project
Simple Online table reservation and management system using Spring boot, Java, MySQL and Thyme leaf (Html, CSS, JavaScript, Jquery and Bootstrap). User can login and book their tables.    
  
## Features

### Logging and Security
-> We all know that logging and security is the most important part of the web development.  
-> In this project I included role based authentication, so that admin and manager can maintain the management system.  
-> Every person(user) who is signing up will be allocated as Role_USER and there is only one manager who can able to change the authority(Role). Basically the manager comes under Role_MANAGER. There are some features which the manager and the admin can have the authority to access that end point. \
-> Passwords are stored in encrypted format so that we can prevent the password from the outsider.

### Database - MySQL
In this project I used MySQL as a database. With the help of Hibernate and JPA we can easily map all the objects in to the entities, because hibernate is ORM (Object Relational Mapping) tool so that we can easily store all the objects into the database. We just have to annotate some dependency and JPA will take care of the things.

### Roles and what can they do 
#### :arrow_right: User
-> Register and Login \
->Book their slot

#### :arrow_right: Admin
-> Update the slot [localhost:2024/slots/addSlot](#)

#### :arrow_right: Manager
-> Update the slot [localhost:2024/slots/addSlot](#)
-> Update the users role [localhost:2024/users](#)
************************************************************************************************

## 💫 About Me:
As a fresh and enthusiastic Java full stack development student.  Having a strong knowledge in OOPs, MySQL, and front end(Html, Css, Javascript) and having a good knowledge in Springboot framework. 


<!-- Proudly created with GPRM ( https://gprm.itsvg.in ) -->




