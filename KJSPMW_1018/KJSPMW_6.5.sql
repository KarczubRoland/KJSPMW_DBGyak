CREATE TABLE termekek (tkod INT PRIMARY KEY, nev VARCHAR(50) NOT NULL, ear INT CHECK (EAR > 0), kategoria CHAR(20));
INSERT INTO termekek VALUES (1,'lapát', 2000,'K1'); 
INSERT INTO termekek VALUES (8,NULL, 4000,'K1');
INSERT INTO termekek VALUES (15,'pohár A', 0,'K3');
INSERT INTO termekek VALUES (15,"pohár A", 20,'K3'); 
INSERT INTO termekek VALUES (15,'pohár A', '20','K3');

