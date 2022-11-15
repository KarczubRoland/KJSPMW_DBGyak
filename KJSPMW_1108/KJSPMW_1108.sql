SELECT a.rendszam FROM Auto a JOIN tulajdonos t ON a.Tulaj = t.Tkód WHERE t.Varos!= 'Miskolc' AND a.Ar > (SELECT(avg(a.Ar) FROM Auto a WHERE t.Varos = 'Miskolc');

