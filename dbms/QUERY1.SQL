SELECT title FROM film A, film_category B, category C WHERE A.rating='PG-13' AND A.film_id = B.film_id AND B.category_id = C.category_id AND  C.name='Comedy';


SELECT A.title, count(A.film_id) FROM rental B JOIN inventory C ON B.inventory_id=C.inventory_id JOIN film A ON C.film_id = A.film_id JOIN film_category D ON A.film_id = D.film_id JOIN category E ON D.category_id = E.category_id WHERE E.name = 'Horror' GROUP by A.title ORDER by count(A.film_id) desc LIMIT 3;	


SELECT distinct customer_list.name  FROM  category, film_category, customer_list, rental, inventory  WHERE customer_list.country='India' and customer_list.ID = rental.customer_id and rental.inventory_id = inventory.inventory_id and inventory.film_id = film_category.film_id and film_category.category_id = category.category_id and category.name = 'Sports'  ORDER BY customer_list.name;


SELECT distinct name FROM actor, film_actor, rental, inventory, customer_list WHERE customer_list.ID = rental.customer_id and customer_list.country = 'Canada' and rental.inventory_id = inventory.inventory_id and inventory.film_id =film_actor.film_id and  actor.actor_id = film_actor.actor_id and first_name = 'NICK' and last_name = 'WAHLBERG';


SELECT count(*) as NUMBER FROM actor, film_actor WHERE actor.actor_id = film_actor.actor_id and first_name = 'SEAN' and last_name = 'WILLIAMS';
