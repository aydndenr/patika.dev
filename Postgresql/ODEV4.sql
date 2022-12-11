select distinct replacement_cost from film 
select distinct replacement_cost,count(replacement_cost) from film group by replacement_cost
select count(*) from film where title like 'T%' and rating='G'
select count(*) from country where country like '_____'
select * from city where city ilike '%r'