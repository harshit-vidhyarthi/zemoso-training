SELECT count(distinct B.title) FROM film A JOIN film_list B ON A.film_id = B.FID WHERE A.special_features LIKE '%Deleted Scenes%' AND B.category='Documentary';


SELECT count(distinct D.rental_id) FROM film_list A, staff B, store C, rental D, inventory E WHERE A.category = 'Sci-Fi' and A.FID = E.film_id and C.manager_staff_id = B.staff_id and D.inventory_id = E.inventory_id and E.store_id = C.store_id and B.first_name = 'Jon' and B.last_name='Stephens';


SELECT total_sales FROM sales_by_film_category WHERE category = 'Animation';


SELECT D.category, count(D.category) FROM customer A JOIN rental B ON A.customer_id = B.customer_id JOIN inventory C ON B.inventory_id = C.inventory_id JOIN film_list D ON C.film_id = D.FID WHERE A.first_name = 'PATRICIA' AND A.last_name = 'JOHNSON' GROUP BY D.category ORDER BY count(D.category) desc  LIMIT 3;


SELECT count(*) FROM film_list A, rental B, customer C, inventory D WHERE A.rating = 'R' AND C.first_name = 'SUSAN' AND C.last_name = 'WILSON' AND C.customer_id = B.customer_id AND D.inventory_id = B.inventory_id AND D.film_id = A.FID;
