CREATE DATABASE  IF NOT EXISTS `restaurants_vallah_sj` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `restaurants_vallah_sj`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: restaurants_vallah_sj
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `adresse`
--

LOCK TABLES `adresse` WRITE;
/*!40000 ALTER TABLE `adresse` DISABLE KEYS */;
INSERT INTO `adresse` VALUES (1,'Selnaustrasse',16,'8001 Zuerich','Schweiz\r'),(2,'Seefeldstrasse',12,'8008 Zuerich','Schweiz\r'),(3,'Zahnradstrasse',21,'8005 Zuerich','Schweiz\r'),(4,'Hallwylstrasse',43,'8004 Zuerich','Schweiz\r'),(5,'Brauerstrasse ',4,'8004 Zuerich','Schweiz\r'),(6,'Langstrasse',197,'8005 Zuerich','Schweiz\r'),(7,'Rotachstrasse',12,'8003 Zuerich','Schweiz\r'),(8,'Weststrasse',192,'8003 Zuerich','Schweiz\r'),(9,'Badenerstrasse',125,'8004 Zerich','Schweiz\r'),(10,'Badenerstrasse',177,'8003 Zuerich','Schweiz\r'),(11,'Birmensdorferstrasse',364,'8055 Zuerich','Schweiz\r'),(12,'Meierwiesenstrasse',58,'8064 Zuerich','Schweiz\r'),(13,'Brauerstrasse',15,'8004 Zuerich','Schweiz\r'),(14,'Langstrasse',133,'8004 Zuerich','Schweiz\r'),(15,'Europaallee',15,'8004 Zuerich','Schweiz\r'),(16,'Pfingstweidstrasse',6,'8004 Zuerich','Schweiz\r'),(17,'Zuerichbergstrasse',71,'8044 Zuerich','Schweiz\r'),(18,'Schaffhauserstrasse',352,'8050 Zuerich','Schweiz\r'),(19,'Stampfenbachstrasse',32,'8006 Zuerich','Schweiz\r'),(20,'Muesterhof',8,'8001 Zuerich','Schweiz\r'),(21,'Ruistrasse',4,'8001 Zuerich','Schweiz\r'),(22,'Talstrasse',1,'8001 Zuerich','Schweiz\r'),(23,'Bahnhofplatz',7,'8001 Zuerich','Schweiz\r'),(24,'Niederdorfstrasse',10,'8001 Zuerich','Schweiz\r'),(25,'Sihlstrasse',28,'8001 Zuerich','Schweiz\r'),(26,'Quellenstrasse',49,'8005 Zuerich','Schweiz\r'),(27,'Bahnhofstrasse',88,'8001 Zuerich','Schweiz\r'),(28,'Klingenstrasse',33,'8005 Zuerich','Schweiz\r'),(29,'Hofwiesenstrasse',8,'8057 Zuerich','Schweiz\r'),(30,'Wallisellenstrasse',11,'8050 Zuerich','Schweiz\r'),(31,'Diendorfstrasse',223,'8052 Zuerich','Schweiz\r'),(32,'Augustinergasse',25,'8001 Zuerich','Schweiz\r'),(33,'In Gassen',6,'8001 Zuerich','Schweiz\r'),(34,'Niederdorfstrasse',80,'8001 Zuerich','Schweiz\r'),(35,'Limmatquai',82,'8001 Zuerich','Schweiz\r'),(36,'Sihlporte',3,'8001 Zuerich','Schweiz\r'),(37,'Pfalzgasse',1,'8001 Zuerich','Schweiz\r'),(38,'Schaffhauserstrasse',1,'8006 Zuerich','Schweiz\r'),(39,'Bahnhofstrasse',28,'8001 Zuerich','Schweiz\r'),(40,'Muesterhof',8,'8001 Zuerich','Schweiz\r'),(41,'Rosengasse',10,'8001 Zuerich','Schweiz\r'),(42,'Zoelingerstrasse',16,'8001 Zuerich','Schweiz\r'),(43,'Muestergasse',15,'8001 Zuerich','Schweiz\r'),(44,'Froschaufasse',12,'8001 Zuerich','Schweiz\r'),(45,'Langstrasse',209,'8005 Zuerich','Schweiz\r'),(46,'Rosengasse ',7,'8001 Zuerich','Schweiz\r'),(47,'Glockengasse',8,'8001 Zuerich','Schweiz\r'),(48,'Moerstrasse',23,'8004 Zuerich','Schweiz\r'),(49,'Altstetterstrasse',140,'8048 Zuerich','Schweiz\r'),(50,'Schiffle',18,'8001 Zuerich','Schweiz\r'),(51,'Limmatstrasse ',317,'8005 Zuerich','Schweiz\r'),(52,'Konradstrasse',69,'8005 Zuerich','Schweiz\r'),(53,'Militaerstrasse',14,'8004 Zuerich','Schweiz\r'),(54,'Heinrichstrasse',213,'8005 Zuerich','Schweiz\r'),(55,'Badenerstrasse ',171,'8003 Zuerich','Schweiz\r'),(56,'Bernerstrasse',224,'8064 Zuerich','Schweiz\r'),(57,'Franklinstrasse',20,'8050 Zuerich','Schweiz\r'),(58,'Wehntalerstrasse',289,'8046 Zuerich','Schweiz\r'),(59,'Badenerstrasse',248,'8004 Zeerich','Schweiz\r'),(60,'Badenerstrasse',676,'8048 Zuerich','Schweiz\r');
/*!40000 ALTER TABLE `adresse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `kommentar_bewertung`
--

LOCK TABLES `kommentar_bewertung` WRITE;
/*!40000 ALTER TABLE `kommentar_bewertung` DISABLE KEYS */;
/*!40000 ALTER TABLE `kommentar_bewertung` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `restaurant`
--

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant` DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (129,'Nagasui','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.nagasui.ch','044 288 28 88','','','asiatisch',1),(130,'Tiffins Asian Kitchen','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.tiffins.ch','044 382 18 88','','','asiatisch',2),(131,'LY\'S ASIA','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.lys-asia.ch','044 999 08 08','','','asiatisch',3),(132,'YEN\'S','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.yens-restaurant.ch','044 558 89 76','','','asiatisch',4),(133,'Restaurant Ach\'i','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.achi.restaurant','044 542 88 85','','','asiatisch',5),(134,'Lily\'s','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.lilys.ch','044 440 18 85','','','asiatisch',6),(135,'Mesob Restaurant and Bar','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.mesob-restaurant.ch','043 960 02 51','','','afrikanisch',7),(136,'Habesha Restaurant','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.habesha-restaurant.ch','044 463 59 24','','','afrikanisch',8),(137,'Queen Idia African Restaurant','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.queenidia.ch','044 291 01 50','','','afrikanisch',9),(138,'Le Manden','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.lemanden.ch','044 291 69 01','','','afrikanisch',10),(139,'Meskerem','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.meskerem-restaurant.ch','044 451 38 27','','','afrikanisch',11),(140,'Restaurant Moringa Teff','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.moringa-teff.ch','044 431 80 52','','','afrikanisch',12),(141,'The Bite','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.thebite.ch','044 242 30 00','','','amerikanisch',13),(142,'Holy Cow! Gourmet Burger Company','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.holycow.ch','021 312 24 04','','','amerikanisch',14),(143,'LOFT FIVE','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.loftfive.ch','044 755 50 50 ','','','amerikanisch',15),(144,'Brisket Southern BBQ & Bar','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.brisket.ch','044 241 20 20','','','amerikanisch',16),(145,'Grain','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.grain.ch','044 261 02 81','','','amerikanisch',17),(146,'Rolli\'s Steakhouse Oerlikon','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.rollis-steakhouse.ch','044 311 28 80','','','amerikanisch',18),(147,'Didi\'s Frieden','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.didisfrieden.ch','044 253 18 01','','','franzoesisch',19),(148,'Zunfthaus zur Waag','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.zunfthaus-zur-waag.ch','044 216 99 66','','','franzoesisch',20),(149,'Kronenhalle','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.kronenhalle.ch','044 262 99 00','','','franzoesisch',21),(150,'Restaurant Pavillon','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.aupavillon.ch','044 220 50 22','','','franzoesisch',22),(151,'Restaurant La Soupi?re','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.hotelschweizerhof.ch','044 218 88 22','','','franzoesisch',23),(152,'Brasserie Louis','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.brasserie-louis.ch','044 250 76 80','','','franzoesisch',24),(153,'Haus Hiltl','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.hiltl.ch','044 227 70 00','','','indisch',25),(154,'Tadka Indisches Restaurant','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.tadka.ch','044 578 06 41','','','indisch',26),(155,'Hiltl Dachterrasse','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.hiltl.ch','044 888 88 00','','','indisch',27),(156,'Vulkan','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.restaurant-vulkan.ch','044 273 76 67','','','indisch',28),(157,'Kerala','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.keralarestaurant.ch','044 364 45 77','','','indisch',29),(158,'Restaurant Malabar','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.malabar-restaurant.ch','044 311 31 17','','','indisch',30),(159,'La Fonte','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.la-fonte.ch','044 321 91 51','','','italienisch',31),(160,'Cantinetta Antinori','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.bindella.ch','044 211 72 10 ','','','italienisch',32),(161,'Ristorante Bindella Z?ich','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.bindella.ch','044 221 25 46','','','italienisch',33),(162,'La Pasta','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.lapasta-zh.ch','044 740 20 00','','','italienisch',34),(163,'Bianchi','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.bindella.ch','044 262 98 44','','','italienisch',35),(164,'Pizzeria Dal Nastro','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.dalnastro.ch','044 301 41 41','','','italienisch',36),(165,'Kindli','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.kindli.ch','043 888 76 76','','','schweizerisch',37),(166,'Differente Hotel Krone Unterstrass','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.hotel-krone.ch','044 360 56 56','','','schweizerisch',38),(167,'Zeughauskeller','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.zeughauskeller.ch','044 220 15 15','','','schweizerisch',39),(168,'Zunfthaus zur Waag','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.zunfthaus-zur-waag.ch','044 216 99 66','','','schweizerisch',40),(169,'Swiss Chuchi Restaurant Z?ich','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.hotel-adler.ch','044 266 96 66','','','schweizerisch',41),(170,'Raclette Stube','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.raclett-stube.ch','044 251 41 30','','','schweizerisch',42),(171,'Bodega Espanola','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.bodega-espanola.ch','044 251 23 10','','','spanisch',43),(172,'Restaurant Madrid','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.restaurantmadrid.ch','044 251 13 33','','','spanisch',44),(173,'Casa Aurelio','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.casaaurelio.ch','044 272 77 44','','','spanisch',45),(174,'Casco Viejo','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.casco-viejo.ch','044 260 82 11','','','spanisch',46),(175,'Taverna Catalana','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.tavernacatalana.ch','044 221 12 62','','','spanisch',47),(176,'Restaurant Real','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.restaurant-real.ch','044 241 44 41','','','spanisch',48),(177,'La Taqueria','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.lataqueria.ch','043 321 50 50','','','mexikanisch',49),(178,'Restaurant Papa Joe\'s','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.papajoes.ch','044 269 88 88','','','mexikanisch',50),(179,'Tacos Plaza','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.tacosplaza.ch','null','','','mexikanisch',51),(180,'El Luchador','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.elluchador.ch','044 271 72 00','','','mexikanisch',52),(181,'Cartel - Crazy Burrito Shack','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.cartelburito.ch','null','','','mexikanisch',53),(182,'Don Weber','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.donweber.ch','044 277 05 40','','','mexikanisch',54),(183,'Caf? BEBEK','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.bebek.ch','044 297 11 00','','','tuerkisch',55),(184,'01 Ocakbasi','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.01ocakbasi.ch','043 321 77 70','','','tuerkisch',56),(185,'Original Kebap House','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','null','043 558 66 44','','','tuerkisch',57),(186,'Ayverdi\'s Restaurant & Take Away','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','www.ayverdis.ch','043 299 02 30','','','tuerkisch',58),(187,'By Elvis - Der King Am Grill','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','null','044 777 24 24','','','tuerkisch',59),(188,'Bar Memo-Can','Lorem ipsum dolor sit amet, consetetur sadipscing elitr.','null','044 431 35 00','','','tuerkisch',60);
/*!40000 ALTER TABLE `restaurant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Fritz','Meier','fritz.meiner@bbcag.ch','FritzMeier','Fmeier\r'),(5,'Sebastian','Swoboda','seb@swob.ch','SebSwob','Sswob'),(6,'','','','asdf','asdf'),(7,'Ben','Meier','gravitylover@gmx.ch','BenMeier','BMeier');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-26 10:03:58