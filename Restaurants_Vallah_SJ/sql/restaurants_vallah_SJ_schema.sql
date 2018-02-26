create database restaurants_vallah_SJ;

use restaurants_vallah_SJ;


create table restaurant(
id int not null auto_increment primary key,
name varchar(45),
beschreibung varchar(200),
link varchar(60),
nummer varchar(50),
kommentar varchar(400),
bewertung varchar(10),
typ varchar(45),
adresse_id int not null,
foreign key (adresse_id) references adresse (id)
);

create table adresse(
id int not null auto_increment primary key,
strasse varchar(45),
hnummer int,
ort varchar(45),
land varchar(45)
);

create table user(
id int not null auto_increment primary key,
vorname varchar(45),
name varchar(45),
eMail varchar(45),
userName varchar(45),
passwort varchar(45)
);

create table kommentar_bewertung(
id int not null auto_increment primary key,
kommentarText varchar(400),
bewertungSterne varchar(10),
restaurant_id int not null,
user_id int not null,
foreign key (restaurant_id) references restaurant (id),
foreign key (user_id) references user (id)
);

load data local infile 'T:\\_Team\\Informatiker 17\\zraubj\\10 - Anwendungsentwicklung\\AE700 - Projektarbeit\\Datenbank\\User.csv'
into table user 
character set utf8
fields terminated by ';'
ignore 1 Rows (id, vorname, name, eMail, userName, passwort);

load data local infile 'T:\\_Team\\Informatiker 17\\zraubj\\10 - Anwendungsentwicklung\\AE700 - Projektarbeit\\Datenbank\\Adresse.csv'
into table adresse
character set utf8
fields terminated by ';'
ignore 1 Rows (id, strasse, hnummer, ort, land);

load data local infile 'T:\\_Team\\Informatiker 17\\zraubj\\10 - Anwendungsentwicklung\\AE700 - Projektarbeit\\Datenbank\\Restaurant4.csv'
into table restaurant
character set utf8
fields terminated by ';'
ignore 1 Rows (name, beschreibung, link, nummer, kommentar, bewertung, typ, adresse_id);

select * from user;

select * from adresse;

select * from restaurant;

select r.*, a.* from restaurant as r, adresse as a
where r.name like "%a%" and r.adresse_id = a.id;

delete from adresse;

delete from restaurant;

insert into user(vorname, name, eMail, userName, passwort)
values("joel", "rauber", "joel@hotmail.com", "JoelRauber", "hallo");




drop table adresse;
drop table restaurant;
drop table kommentar_bewertung;

