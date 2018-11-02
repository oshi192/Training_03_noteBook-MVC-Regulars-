CREATE  DATABASE if not exists registration_form;

use registration_form;

CREATE TABLE  NoteBook (
ID                      int AUTO_INCREMENT,
FirstName               VARCHAR(20) NOT NULL,
Surname                 VARCHAR(20) NOT NULL,
SecondName              VARCHAR(20) NOT NULL,
Zip                     VARCHAR(10) NOT NULL,
City                    VARCHAR(25) NOT NULL,
Street                  VARCHAR(25) NOT NULL,
HouseNumber             VARCHAR(6)  NOT NULL,
FlatNumber              VARCHAR(6)  NOT NULL,
HousePhoneNumber        VARCHAR(12) NOT NULL,
CellPhoneNumber         VARCHAR(12) NOT NULL,
SecondCellPhoneNumber   VARCHAR(12),
Email                   VARCHAR(64) NOT NULL,
Skype                   VARCHAR(12) NOT NULL,
Login                   VARCHAR(12) NOT NULL,
Coment                  VARCHAR(255) NOT NULL,
PersonGroup             VARCHAR(20) NOT NULL,
CreatedAt               DATETIME    NOT NULL,
UpdatedAt               DATETIME    NOT NULL,
PRIMARY KEY (ID)
);