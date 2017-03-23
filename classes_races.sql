-- MySQL dump 10.13  Distrib 5.7.14, for Win64 (x86_64)
--
-- Host: localhost    Database: pfsrd_db
-- ------------------------------------------------------
-- Server version	5.7.14-log

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
-- Table structure for table `classes`
--

DROP TABLE IF EXISTS `classes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classes` (
  `class_name` varchar(25) NOT NULL DEFAULT '',
  `pfsrd_link` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`class_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classes`
--

LOCK TABLES `classes` WRITE;
/*!40000 ALTER TABLE `classes` DISABLE KEYS */;
INSERT INTO `classes` VALUES ('Alchemist','http://www.d20pfsrd.com/classes/base-classes/alchemist'),('Antipaladin','http://www.d20pfsrd.com/classes/alternate-classes/antipaladin'),('Arcanist','http://www.d20pfsrd.com/classes/hybrid-classes/arcanist'),('Barbarian','http://www.d20pfsrd.com/classes/core-classes/barbarian'),('Barbarian-Unchained','http://www.d20pfsrd.com/classes/unchained-classes/barbarian-unchained'),('Bard','http://www.d20pfsrd.com/classes/core-classes/bard'),('Bloodrager','http://www.d20pfsrd.com/classes/hybrid-classes/bloodrager'),('Brawler','http://www.d20pfsrd.com/classes/hybrid-classes/brawler'),('Cavalier','http://www.d20pfsrd.com/classes/base-classes/cavelier'),('Cleric','http://www.d20pfsrd.com/classes/core-classes/cleric'),('Druid','http://www.d20pfsrd.com/classes/core-classes/druid'),('Fighter','http://www.d20pfsrd.com/classes/core-classes/fighter'),('Gunslinger','http://www.d20pfsrd.com/classes/base-classes/gunslinger'),('Hunter','http://www.d20pfsrd.com/classes/hybrid-classes/hunter'),('Inquisitor','http://www.d20pfsrd.com/classes/base-classes/inquisitor'),('Investigator','http://www.d20pfsrd.com/classes/hybrid-classes/investigator'),('Kineticist','http://www.d20pfsrd.com/occult-adventures/occult-classes/kineticist'),('Magus','http://www.d20pfsrd.com/classes/base-classes/magus'),('Medium','http://www.d20pfsrd.com/occult-adventures/occult-classes/medium'),('Mesmerist','http://www.d20pfsrd.com/occult-adventures/occult-classes/mesmerist'),('Monk','http://www.d20pfsrd.com/classes/core-classes/monk'),('Monk-Unchained','http://www.d20pfsrd.com/classes/unchained-classes/monk-unchained'),('Ninja','http://www.d20pfsrd.com/classes/alternate-classes/ninja'),('Occultist','http://www.d20pfsrd.com/occult-adventures/occult-classes/occultist'),('Oracle','http://www.d20pfsrd.com/classes/base-classes/oracle'),('Paladin','http://www.d20pfsrd.com/classes/core-classes/paladin'),('Psychic','http://www.d20pfsrd.com/occult-adventures/occult-classes/psychic'),('Ranger','http://www.d20pfsrd.com/classes/core-classes/ranger'),('Rogue','http://www.d20pfsrd.com/classes/core-classes/rogue'),('Rogue-Unchained','http://www.d20pfsrd.com/classes/unchained-classes/rogue-unchained'),('Samurai','http://www.d20pfsrd.com/classes/alternate-classes/samurai'),('Shaman','http://www.d20pfsrd.com/classes/hybrid-classes/shaman'),('Skald','http://www.d20pfsrd.com/classes/hybrid-classes/skald'),('Slayer','http://www.d20pfsrd.com/classes/hybrid-classes/slayer'),('Sorcerer','http://www.d20pfsrd.com/classes/core-classes/sorcerer'),('Spiritualist','http://www.d20pfsrd.com/occult-adventures/occult-classes/spiritualist'),('Summoner','http://www.d20pfsrd.com/classes/base-classes/summoner'),('Summoner-Unchained','http://www.d20pfsrd.com/classes/unchained-classes/summoner-unchained'),('Swashbuckler','http://www.d20pfsrd.com/classes/hybrid-classes/swashbuckler'),('Warpriest','http://www.d20pfsrd.com/classes/hybrid-classes/warpriest'),('Witch','http://www.d20pfsrd.com/classes/base-classes/witch'),('Wizard','http://www.d20pfsrd.com/classes/core-classes/wizard');
/*!40000 ALTER TABLE `classes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `races`
--

DROP TABLE IF EXISTS `races`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `races` (
  `race_name` varchar(20) NOT NULL DEFAULT '',
  `pfsrd_link` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`race_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `races`
--

LOCK TABLES `races` WRITE;
/*!40000 ALTER TABLE `races` DISABLE KEYS */;
INSERT INTO `races` VALUES ('Aasimar','http://www.d20pfsrd.com/races/other-races/featured-races/arg-aasimar'),('Catfolk','http://www.d20pfsrd.com/races/other-races/featured-races/arg-catfolk'),('Changeling','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-changeling'),('Dhampir','http://www.d20pfsrd.com/races/other-races/featured-races/arg-dhampir'),('Drow','http://www.d20pfsrd.com/races/other-races/featured-races/arg-drow'),('Duergar','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-duergar'),('Dwarf','http://www.d20pfsrd.com/races/core-races/dwarf'),('Elf','http://www.d20pfsrd.com/races/core-races/elf'),('Fetchling','http://www.d20pfsrd.com/races/other-races/featured-races/arg-fetchling'),('Gillman','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-gillmen'),('Gnome','http://www.d20pfsrd.com/races/core-races/gnome'),('Goblin','http://www.d20pfsrd.com/races/other-races/featured-races/arg-goblin'),('Grippli','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-grippli'),('Half-elf','http://www.d20pfsrd.com/races/core-races/half-elf'),('Half-orc','http://www.d20pfsrd.com/races/core-races/half-orc'),('Halfling','http://www.d20pfsrd.com/races/core-races/halfling'),('Hobgoblin','http://www.d20pfsrd.com/races/other-races/featured-races/arg-hobgoblin'),('Human','http://www.d20pfsrd.com/races/core-races/human'),('Ifrit','http://www.d20pfsrd.com/races/other-races/featured-races/arg-ifrit'),('Kitsune','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-kitsune'),('Kobold','http://www.d20pfsrd.com/races/other-races/featured-races/arg-kobold'),('Merfolk','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-merfolk'),('Nagaji','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-nagaji'),('Orc','http://www.d20pfsrd.com/races/other-races/featured-races/arg-orc'),('Oread','http://www.d20pfsrd.com/races/other-races/featured-races/arg-oread'),('Ratfolk','http://www.d20pfsrd.com/races/other-races/featured-races/arg-ratfolk'),('Samsaran','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-samsaran'),('Strix','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-strix'),('Suli','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-suli'),('Svirfneblin','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-svirfneblin'),('Sylph','http://www.d20pfsrd.com/races/other-races/featured-races/arg-sylph'),('Tengu','http://www.d20pfsrd.com/races/other-races/featured-races/arg-tengu'),('Tiefling','http://www.d20pfsrd.com/races/other-races/featured-races/arg-tiefling'),('Undine','http://www.d20pfsrd.com/races/other-races/featured-races/arg-undine'),('Vanara','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-vanaras'),('Vishkanya','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-vishkanyas'),('Wayang','http://www.d20pfsrd.com/races/other-races/uncommon-races/arg-wayang');
/*!40000 ALTER TABLE `races` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-23 11:14:36
