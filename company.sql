create table company(
	id integer not null,
	name character varying,
	CONSTRAINT company_pkey PRIMARY KEY (id)
);

create table person(
	id integer not null,
	name character varying,
	company_id integer references company(id),
	CONSTRAINT person_pkey PRIMARY KEY (id)
);

insert into company(id, name) values(1, 'Gazprom');
insert into company(id, name) values(2, 'Tatneft');
insert into company(id, name) values(3, 'Megafon');
insert into company(id, name) values(4, 'Sberbank');
insert into company(id, name) values(5, 'Sogaz');

insert into person(id, name, company_id) values(1, 'Mikle', 1);
insert into person(id, name, company_id) values(2, 'Ksenia', 2);
insert into person(id, name, company_id) values(3, 'Aleksandr', 3);
insert into person(id, name, company_id) values(4, 'Aleksey', 4);
insert into person(id, name, company_id) values(5, 'Aleksey', 5);

select * from person p left join company c on p.company_id = c.id where p.company_id != 5;
select c.name company, count(p.name) person_db from company c join person p on c.id = p.company_id
group by c.name
order by person_db desc limit 1;