### noteBook MVC Regulars
The task was to create a structure for entering data from the command line and validate them using regular expressions.

Create an entity "Record" in the "Notebook"
#### Record must consist of:
 - Name of subscriber
 - Surname
 - Patronymic of the subscriber
 - Generate from the entered data: Last name + Space + First letter of the name + dot
 - Nickname
 - Comment
 - Groups in which the subscriber is listed (Enum with group names).
 - Phone house
 - Phone mob.
 - Phone mob. 2 (may be absent)
 - E-mail
 - Skype
 - Adress which consist of
    - Zip code
    - City of residence
    - Street
    - House number
    - Apartment number
 - Dates of making entries in the notebook
 - Last Modified Dates
 
 The string of the full address formed from the data of item 13.
 
 #### how to start
__UNIX__


need installed [maven](https://maven.apache.org/install.html)
 - download or git clone
 - type in terminal where pom file locate: ```mvn package```
 - than type ```java -jar target/Regular-1.0-SNAPSHOT.jar```
