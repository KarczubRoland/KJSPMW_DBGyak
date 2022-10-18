
CREATE TABLE Gyarto (adoszam INT PRIMARY KEY, nev varchar(30) , telephely varchar(30));
CREATE TABLE Termek (tkod INT PRIMARY KEY, nev varchar (50), ear INT CHECK (ear > 0), gyarto INT REFERENCES Gyarto);