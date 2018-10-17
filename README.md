The main request is in test.txt

I have finished the two part of the three items in the requirement. 
The third one can be directly found in spring boot guide. https://spring.io/guides/gs/crud-with-vaadin. It is no needed to copy paste into here.

#1
The requirement looks to create an array in database.
I have three ideas of creating array in database.
1. Use NoSQL database such as MongoDB. It is easy to store an array by json format.
2. Use relational database. It needs to create two tables to store the information.
3. Use a field or column to save a text with separate character. Such as "1|2|3"
I selected the second solution. 
I want to use an embedded databse.
The idea of using embedded database is to make the source running quickly. 

#2
i. It is easy to create a view for looking up the information
ii. The main idea is using RECURSIVE to find child element.
iii. It needs to sort by city
