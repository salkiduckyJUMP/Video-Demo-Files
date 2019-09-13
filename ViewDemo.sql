#Execute each line individually!

#Brings us into the sakila database
use sakila;

#View the entire film table
select * from film;

#View the film_list view
select * from film_list;

#Create a view
create view short_rating_g as
select film_id, title, length, rating
from film where length<75 and
rating="G";

#View your new view
select * from short_rating_g;