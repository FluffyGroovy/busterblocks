select * from genre;
insert into genre values (1,'Comedy');
insert into genre values (2,'Action');
insert into genre values (3,'Drama');
insert into genre values (4,'Science Fiction');

select * from actor;
insert into actor values (1,'Tom Hanks');
insert into actor values (2,'Priyanka Chopra');
insert into actor values (3,'Rinko Kikuchi');
insert into actor values (4,'Idris Elba');

select * from video_status;
insert into video_status values (1,'In service');
insert into video_status values (2,'Retired');

select * from movie;
insert into movie values (1,'Pacific Rim',2,132);
insert into movie values (2,'Avatar',2,161);
insert into movie values (3,'Forrest Gump',3,142);
insert into movie values (4,'Star Wars VII: The Force Awakens',4,null);

select * from video;
insert into video values (1,1,'1 Jul 2013');
insert into video values (2,2,'10 Dec 2009');
insert into video values (3,3,'6 Jul 1994');
insert into video values (4,4,'18 Dec 2015');

select * from video_item;
insert into video_item values (1,'abc',1,'2 Jul 2013',2);
insert into video_item values (2,'abcd',1,'2 Jul 2013',1);
insert into video_item values (3,'123',2,'1 Jan 2010',1);
insert into video_item values (4,'znj',3,'2 Aug 1994',1);

select * from movie_actor;
insert into movie_actor values (1,3);
insert into movie_actor values (1,4);
insert into movie_actor values (3,1);

select * from video_view;
select * from video_view vv where vv.movie_name in ('Pacific Rim');
select * from video_view vv where vv.actor_name in ('Idris Elba');

select * from customer;
insert into customer values (1,'Hrvoje','Butkovic','0833847835','7408095287080');
insert into customer values (2,'Janet','Ashman',null,null);
insert into customer values (3,'Radhika','Chintamaneni','0840263934',null);

select * from video_rental;
insert into video_rental values (1,3,1,'15 Jun 2015',null,null,null);
insert into video_rental values (2,3,1,'16 Jul 2015',null,null,null);
insert into video_rental values (3,2,3,'23 Feb 2015',null,'26 Feb 2015',null);
insert into video_rental values (4,2,3,'23 Nov 2015',null,null,null);

select * from last_video_rental_view;
