-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.19-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema hbn_author
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ hbn_author;
USE hbn_author;

--
-- Table structure for table `hbn_author`.`author`
--

DROP TABLE IF EXISTS `author`;
CREATE TABLE `author` (
  `author_id` int(10) unsigned NOT NULL auto_increment,
  `author_nick` varchar(45) NOT NULL default '',
  `author_publisher` varchar(45) NOT NULL default '',
  `author_is_alive` varchar(45) NOT NULL default '',
  `person_id` int(10) unsigned NOT NULL default '0',
  PRIMARY KEY  (`author_id`),
  KEY `FK_author_1` (`person_id`),
  CONSTRAINT `FK_author_1` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hbn_author`.`author`
--

/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` (`author_id`,`author_nick`,`author_publisher`,`author_is_alive`,`person_id`) VALUES 
 (2,'Techdude','Harper Collins','Y',7),
 (3,'Techdude','Harper Collins','Y',8),
 (4,'Techdude','Harper Collins','Y',9),
 (5,'Techdude','Harper Collins','Y',10),
 (6,'Techdude','Harper Collins','Y',11),
 (7,'Techdude','Harper Collins','Y',12),
 (9,'Techdude','Harper Collins','Y',14),
 (10,'Techdude_New_New_New_New','Rambo publications','N',15),
 (11,'Techdude','Moon publications','N',16),
 (12,'Techdude','Harper Collins','Y',17),
 (13,'Techdude','Sun publications','N',16),
 (14,'Techdude_New',' Radar publications','N',15),
 (15,'Techdude_New',' Radar publications','N',15),
 (16,'Techdude','Harper Collins','Y',18),
 (17,'Techdude','Harper Collins','Y',19),
 (18,'Techdude','Harper Collins','Y',20),
 (19,'Mk','Harper','Y',22),
 (20,'TT','Sun Pub','Y',23);
/*!40000 ALTER TABLE `author` ENABLE KEYS */;


--
-- Table structure for table `hbn_author`.`author_work`
--

DROP TABLE IF EXISTS `author_work`;
CREATE TABLE `author_work` (
  `work_id` int(10) unsigned NOT NULL auto_increment,
  `author_id` int(10) unsigned NOT NULL default '0',
  PRIMARY KEY  (`work_id`),
  KEY `FK_author_work_1` (`author_id`),
  CONSTRAINT `FK_author_work_1` FOREIGN KEY (`author_id`) REFERENCES `author` (`author_id`),
  CONSTRAINT `FK_author_work_2` FOREIGN KEY (`work_id`) REFERENCES `work` (`work_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hbn_author`.`author_work`
--

/*!40000 ALTER TABLE `author_work` DISABLE KEYS */;
INSERT INTO `author_work` (`work_id`,`author_id`) VALUES 
 (3,9),
 (10,12),
 (11,12),
 (12,12),
 (7,13),
 (8,13),
 (9,13),
 (4,14),
 (5,14),
 (6,14),
 (23,18),
 (24,18),
 (25,18),
 (26,18),
 (27,18),
 (28,19),
 (29,20);
/*!40000 ALTER TABLE `author_work` ENABLE KEYS */;


--
-- Table structure for table `hbn_author`.`person`
--

DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `person_id` int(10) unsigned NOT NULL auto_increment,
  `person_name` varchar(45) NOT NULL default '',
  `person_DOB` datetime NOT NULL default '0000-00-00 00:00:00',
  `person_age` int(10) unsigned NOT NULL default '0',
  `person_country` varchar(45) NOT NULL default '',
  `person_email` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hbn_author`.`person`
--

/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` (`person_id`,`person_name`,`person_DOB`,`person_age`,`person_country`,`person_email`) VALUES 
 (7,'James Gosling','0018-05-31 00:00:00',12,'India','james@java.com'),
 (8,'James Gosling','0018-05-31 00:00:00',12,'India','james@java.com'),
 (9,'James Gosling','0018-05-31 00:00:00',12,'India','james@java.com'),
 (10,'James Gosling','0018-05-31 00:00:00',12,'India','james@java.com'),
 (11,'James Gosling','0018-05-31 00:00:00',12,'India','james@java.com'),
 (12,'James Gosling','0018-05-31 00:00:00',12,'India','james@java.com'),
 (14,'Steve Jobs','0018-05-31 00:00:00',12,'India','james@java.com'),
 (15,'James Gosling','0018-05-31 00:00:00',12,'India','james@java.com'),
 (16,'James Gosling','0018-05-31 00:00:00',12,'India','james@java.com'),
 (17,'James Gosling','0018-05-31 00:00:00',12,'India','james@java.com'),
 (18,'James Gosling','0018-05-31 00:00:00',12,'India','james@java.com'),
 (19,'James Gosling','0018-05-31 00:00:00',12,'India','james@java.com'),
 (20,'James Gosling','0018-05-31 00:00:00',12,'India','james@java.com'),
 (22,'Test','2006-10-15 10:46:40',12,'India','m@g.com');
INSERT INTO `person` (`person_id`,`person_name`,`person_DOB`,`person_age`,`person_country`,`person_email`) VALUES 
 (23,'Test','2006-10-15 10:50:09',23,'India','test@test.com');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;


--
-- Table structure for table `hbn_author`.`work`
--

DROP TABLE IF EXISTS `work`;
CREATE TABLE `work` (
  `work_id` int(10) unsigned NOT NULL auto_increment,
  `work_name` varchar(45) NOT NULL default '',
  `work_category` varchar(45) NOT NULL default '',
  `work_copies_sold` int(10) unsigned NOT NULL default '0',
  `work_value` double NOT NULL default '0',
  PRIMARY KEY  (`work_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hbn_author`.`work`
--

/*!40000 ALTER TABLE `work` DISABLE KEYS */;
INSERT INTO `work` (`work_id`,`work_name`,`work_category`,`work_copies_sold`,`work_value`) VALUES 
 (1,' Java 1.5 primer','Fact',300,34),
 (3,' Java 1.5 primer','Fact',300,23),
 (4,' Java 1.5 primer','Fiction',300,34),
 (5,' Java 1.5 primer','Fact',300,34),
 (6,' Java 1.5 primer','Fiction',280,34),
 (7,' Java 1.5 primer','Fact',300,34),
 (8,' Java 1.5 primer','Fiction',300,45),
 (9,' Java 1.5 primer','Fact',300,34),
 (10,' Java 1.5 primer','Fiction',300,21),
 (11,' Java 1.5 primer','Fiction',300,34),
 (12,' Java 1.5 primer','Fact',300,34),
 (23,' Java 1.5 primer','Fact',300,67),
 (24,' Java 1.5 primer','Fact',300,34),
 (25,' Java 1.5 primer','Fact',300,34),
 (26,' Java 1.5 primer','Fact',300,34),
 (27,' Java 1.5 primer','Fact',300,34),
 (28,'Coputing','Fiction',34,23),
 (29,'Java RMI','Fiction',345,34);
/*!40000 ALTER TABLE `work` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
