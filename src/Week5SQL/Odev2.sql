Fiyatlar arası arama;

SELECT replacement_cost FROM public.film
WHERE replacement_cost BETWEEN 12.99 AND 16.99;



İsimleri sıralama ödev maddesi;

SELECT first_name, last_name FROM public.actor
WHERE first_name IN ('Penelope','Nick','Ed');


Rental rate ve replacement cost sıralama;

SELECT * FROM public.film
WHERE rental_rate IN (0.99, 2.99,4.99)
AND replacement_cost IN (12.99, 15.99, 28.99);