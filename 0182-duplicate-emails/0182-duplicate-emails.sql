SELECT email from (SELECT email,count(id) as freq from Person
GROUP BY email) t where t.freq > 1;