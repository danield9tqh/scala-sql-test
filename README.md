# scala-sql-test
This repository contains example programs for the [scala-sql](https://github.com/danield9tqh/scala-sql) project. The sample file ScalaSQLTest.scala contains an example connection to a MySQL database. The url, username and password for the databse can be set to reference any MySQL database. The code currently supports the follwing schema:

`CREATE TABLE students (id INT(13), name VARCHAR(20), age INT(13))`

Tables with different schemas can be queried by creating `SQLSet`s of different classes. Use the `Student` class as a reference of how to create a new schema. The schemas currently only support integer and string type fields.
