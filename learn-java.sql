/*
SQLyog Ultimate v10.42 
MySQL - 5.5.5-10.1.16-MariaDB : Database - dede
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dede` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `dede`;

/*Table structure for table `karyawan_tb` */

DROP TABLE IF EXISTS `karyawan_tb`;

CREATE TABLE `karyawan_tb` (
  `id_karyawan` int(11) NOT NULL AUTO_INCREMENT,
  `kode_karyawan` varchar(50) DEFAULT NULL,
  `nama_karyawan` varchar(50) DEFAULT NULL,
  `alamat_karyawan` varchar(100) DEFAULT NULL,
  `id_toko` varchar(11) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_karyawan`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

/*Data for the table `karyawan_tb` */

insert  into `karyawan_tb`(`id_karyawan`,`kode_karyawan`,`nama_karyawan`,`alamat_karyawan`,`id_toko`,`password`) values (12,'asas','asas','sdsdsd','2','sasas'),(14,'asas','asas','sdsds','1','asa'),(15,'asas','asas','sdsds','4','asasa'),(16,'4444','Pebs','ererer','55','erer'),(17,'gf','fdfd','fsfs		','1','dfdfd'),(18,'1234','Mamang','Au	','BB45','mamangok'),(19,'Kode Karyawan','Nama Karyawan','Alamat	','Nama Toko','Password');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
