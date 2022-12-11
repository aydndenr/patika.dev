select city,country from city inner join country on city.country_id=country.country_id
select  first_name,last_name from customer inner join payment on customer.customer_id=payment.customer_id
select first_name,last_name from customer inner join rental on customer.customer_id=rental.customer_id