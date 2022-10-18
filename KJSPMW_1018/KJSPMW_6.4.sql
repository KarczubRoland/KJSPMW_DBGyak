CREATE TABLE termekek (tkod INT PRIMARY KEY, nev VARCHAR(50) NOT NULL, ear INT CHECK (EAR > 0), kategoria CHAR(20));
INSERT INTO termekek (tkod,nev,ear,kategoria) VALUES 
((1,"lapat",2000, "K1"),
(2, "sepru", 4000, "K1"),
(3, "mosogato gel", 1500, "K3"),
(4, "szappan", 1000, "K2"),
(5, "pohar",2400,"K3"));
