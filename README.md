# About the project:
Spring security checks if the entered user is in database

If there is, the the liks become available:
localhost:8080/developers and localhost:8080/developers/{id}

Depending on the authorities which the user has, user can do these actions:
1. Obtain all users or exact user by ID(Get http requests) (developers:read - authority), can users with roles ADMIN and USER
2. Create, delete users (Post/Delete http requests) needs "developers:write" authority. Only user with a role "ADMIN" can do this, because only this role has "developers:write" authority

I added sql code in file database.sql. As you can see, there are 2 users:
* Adminka (password - adminka(encrypted in database)), email: adminka@gmail.com
* Userka - (password - userka(encrypted in database)), email - userka@gmail.com

Enter this data in login form, after you created database and users
