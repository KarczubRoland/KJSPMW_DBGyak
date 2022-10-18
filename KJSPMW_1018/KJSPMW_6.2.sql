CREATE TABLE Gyarto (adoszam INT PRIMARY KEY, nev varchar(30), telephely varchar(200), irsz varchar(40), varos varchar(40), utca varchar(100) );
CREATE TABLE Termek (tkod INT PRIMARY KEY, nev varchar(50), ear INT CHECK (ear > 0), gyarto INT REFERENCES Gyarto);
CREATE TABLE Alkatresz (akod INT PRIMARY KEY, nev varchar(50));
CREATE TABLE Egysegek (aru INT REFERENCES Termek, db INT CHECK (db > 0)) ;
CREATE TABLE Komponens (Termek INT REFERENCES Termek, Alkatresz INT REFERENCES Alkatresz);