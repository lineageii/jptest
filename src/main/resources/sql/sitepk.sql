/*
SQLyog Enterprise - MySQL GUI v6.5 Beta1
MySQL - 5.0.22-community-nt : Database - sitepk
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

create database if not exists `sitepk`;

USE `sitepk`;

/*Table structure for table `sp_site` */

DROP TABLE IF EXISTS `sp_site`;

CREATE TABLE `sp_site` (
  `SITEID` varchar(13) NOT NULL COMMENT '网站ID',
  `URL` varchar(200) default NULL,
  `NAME` varchar(50) default NULL,
  `DESCRIPTION` varchar(500) default NULL,
  `RATING` decimal(4,2) default NULL,
  `RATE_USER_COUNT` decimal(8,0) default NULL,
  `PRICE` decimal(18,2) default NULL,
  `LAN` varchar(5) default NULL,
  `COUNTRY` varchar(50) default NULL,
  PRIMARY KEY  (`SITEID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC COMMENT='网站表';

/*Data for the table `sp_site` */

/*Table structure for table `sp_sitetags` */

DROP TABLE IF EXISTS `sp_sitetags`;

CREATE TABLE `sp_sitetags` (
  `ID` varchar(13) NOT NULL,
  `TAGNAME` varchar(20) NOT NULL,
  `SITEID` varchar(13) NOT NULL,
  PRIMARY KEY  (`ID`,`SITEID`),
  KEY `SITEID` (`SITEID`),
  KEY `TAGNAME` (`TAGNAME`),
  CONSTRAINT `sp_sitetags_ibfk_2` FOREIGN KEY (`TAGNAME`) REFERENCES `sp_tags` (`TAGNAME`),
  CONSTRAINT `sp_sitetags_ibfk_1` FOREIGN KEY (`SITEID`) REFERENCES `sp_site` (`SITEID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sp_sitetags` */

/*Table structure for table `sp_tags` */

DROP TABLE IF EXISTS `sp_tags`;

CREATE TABLE `sp_tags` (
  `TAGNAME` varchar(20) NOT NULL,
  `ISCLOSED` char(1) default NULL,
  `TOTAL` decimal(8,0) default NULL,
  PRIMARY KEY  (`TAGNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sp_tags` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
