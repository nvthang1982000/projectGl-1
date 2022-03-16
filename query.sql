-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.33 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for project1
CREATE DATABASE IF NOT EXISTS `project1` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `project1`;

-- Dumping structure for table project1.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `ID_ad` int(11) NOT NULL AUTO_INCREMENT,
  `Ad_name` varchar(45) NOT NULL,
  `Ad_email` varchar(45) NOT NULL,
  `Ad_UN` varchar(45) NOT NULL,
  `Ad_PW` varchar(500) NOT NULL,
  `Ad_image` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_ad`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table project1.admin: ~0 rows (approximately)
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`ID_ad`, `Ad_name`, `Ad_email`, `Ad_UN`, `Ad_PW`, `Ad_image`) VALUES
	(1, '1', '1', '1', '1', '1');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;

-- Dumping structure for table project1.bill
CREATE TABLE IF NOT EXISTS `bill` (
  `Bill_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ProductID_pro` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `UserID_user` int(11) NOT NULL,
  `PriceID_Price` int(11) NOT NULL,
  `Date` varchar(50) DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`Bill_ID`),
  KEY `ProductID_pro_idx` (`ProductID_pro`),
  KEY `UserID_user_idx` (`UserID_user`),
  KEY `PriceID_Price_idx` (`PriceID_Price`),
  CONSTRAINT `PriceID_Price` FOREIGN KEY (`PriceID_Price`) REFERENCES `price` (`ID_Price`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ProductID_pro3` FOREIGN KEY (`ProductID_pro`) REFERENCES `product` (`ID_pro`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `UserID_user` FOREIGN KEY (`UserID_user`) REFERENCES `user` (`ID_user`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

-- Dumping data for table project1.bill: ~12 rows (approximately)
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` (`Bill_ID`, `ProductID_pro`, `Quantity`, `UserID_user`, `PriceID_Price`, `Date`, `total`) VALUES
	(1, 12, 2, 1, 1, '3/15/2022', NULL),
	(2, 12, 2, 1, 1, '3/15/2022', NULL),
	(3, 12, 2, 1, 1, '3/15/2022', NULL),
	(4, 12, 2, 1, 1, '3/15/2022', NULL),
	(5, 12, 2, 1, 1, '3/15/2022', NULL),
	(6, 12, 2, 1, 1, '3/15/2022', NULL),
	(10, 12, 2, 1, 1, '3/15/2022', 123213),
	(11, 12, 2, 1, 1, '3/15/2022', 123213),
	(12, 12, 2, 1, 1, '3/15/2022', 124213),
	(13, 12, 2, 1, 1, '3/15/2022', 214214),
	(14, 12, 2, 1, 1, '3/15/2022', 12421),
	(15, 12, 2, 1, 1, '3/15/2022', 12421);
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;

-- Dumping structure for table project1.categories
CREATE TABLE IF NOT EXISTS `categories` (
  `ID_cat` int(11) NOT NULL AUTO_INCREMENT,
  `Group` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_cat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table project1.categories: ~0 rows (approximately)
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;

-- Dumping structure for table project1.coupon
CREATE TABLE IF NOT EXISTS `coupon` (
  `ID_coupon` int(11) NOT NULL AUTO_INCREMENT,
  `Discount` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_coupon`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table project1.coupon: ~0 rows (approximately)
/*!40000 ALTER TABLE `coupon` DISABLE KEYS */;
/*!40000 ALTER TABLE `coupon` ENABLE KEYS */;

-- Dumping structure for table project1.image
CREATE TABLE IF NOT EXISTS `image` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Path` varchar(45) NOT NULL,
  `ProductID_pro` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ProductID_pro_idx` (`ProductID_pro`),
  CONSTRAINT `ProductID_pro4` FOREIGN KEY (`ProductID_pro`) REFERENCES `product` (`ID_pro`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table project1.image: ~0 rows (approximately)
/*!40000 ALTER TABLE `image` DISABLE KEYS */;
/*!40000 ALTER TABLE `image` ENABLE KEYS */;

-- Dumping structure for table project1.price
CREATE TABLE IF NOT EXISTS `price` (
  `ID_Price` int(11) NOT NULL AUTO_INCREMENT,
  `ProductID_pro` int(11) NOT NULL,
  `Price_bf_dis` int(11) NOT NULL,
  `Price_af_dis` int(11) NOT NULL,
  `Start_date` varchar(45) NOT NULL,
  `CouponID_Coupon` int(11) NOT NULL,
  `End_Date` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_Price`),
  KEY `ProductID_pro_idx` (`ProductID_pro`),
  KEY `CouponID_Coupon_idx` (`CouponID_Coupon`),
  CONSTRAINT `ProductID_pro5` FOREIGN KEY (`ProductID_pro`) REFERENCES `product` (`ID_pro`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table project1.price: ~0 rows (approximately)
/*!40000 ALTER TABLE `price` DISABLE KEYS */;
INSERT INTO `price` (`ID_Price`, `ProductID_pro`, `Price_bf_dis`, `Price_af_dis`, `Start_date`, `CouponID_Coupon`, `End_Date`) VALUES
	(1, 12, 12, 34, '12/12/2000', 1, '12/12/2001');
/*!40000 ALTER TABLE `price` ENABLE KEYS */;

-- Dumping structure for table project1.product
CREATE TABLE IF NOT EXISTS `product` (
  `ID_pro` int(11) NOT NULL AUTO_INCREMENT,
  `Pro_name` varchar(200) NOT NULL,
  `Left_Quantity` int(11) NOT NULL,
  `Flag_0_1` varchar(45) DEFAULT NULL,
  `SupplierID_Supplier` int(11) NOT NULL,
  PRIMARY KEY (`ID_pro`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

-- Dumping data for table project1.product: ~11 rows (approximately)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`ID_pro`, `Pro_name`, `Left_Quantity`, `Flag_0_1`, `SupplierID_Supplier`) VALUES
	(12, 'name1', 2, '0', 1),
	(13, 'name2', 3, '0', 1),
	(14, 'name3', 4, '0', 1),
	(15, 'name4', 5, '0', 1),
	(16, 'name5', 6, '0', 1),
	(17, 'name6', 4, '0', 1),
	(18, 'name7', 2, '0', 1),
	(19, 'name8', 3, '0', 1),
	(20, 'name9', 5, '0', 1),
	(21, 'name10', 6, '0', 1),
	(22, 'name11', 2, '0', 1);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

-- Dumping structure for table project1.product_categories
CREATE TABLE IF NOT EXISTS `product_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ProductID_pro` int(11) NOT NULL,
  `CategoriesID_Cat` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ProductID_pro_idx` (`ProductID_pro`),
  KEY `CategoriesID_Cat_idx` (`CategoriesID_Cat`),
  CONSTRAINT `CategoriesID_Cat` FOREIGN KEY (`CategoriesID_Cat`) REFERENCES `categories` (`ID_cat`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ProductID_pro1` FOREIGN KEY (`ProductID_pro`) REFERENCES `product` (`ID_pro`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table project1.product_categories: ~0 rows (approximately)
/*!40000 ALTER TABLE `product_categories` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_categories` ENABLE KEYS */;

-- Dumping structure for table project1.supplier
CREATE TABLE IF NOT EXISTS `supplier` (
  `ID_Supplier` int(11) NOT NULL AUTO_INCREMENT,
  `Sup_name` varchar(100) NOT NULL,
  `Sup_email` varchar(50) NOT NULL,
  `Sup_hotline` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_Supplier`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table project1.supplier: ~0 rows (approximately)
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;

-- Dumping structure for table project1.user
CREATE TABLE IF NOT EXISTS `user` (
  `ID_user` int(11) NOT NULL AUTO_INCREMENT,
  `User_name` varchar(200) NOT NULL,
  `User_address` varchar(200) NOT NULL,
  `User_email` varchar(50) NOT NULL,
  `User_phone` varchar(45) NOT NULL,
  `User_UN` varchar(45) NOT NULL,
  `User_PW` varchar(500) NOT NULL,
  `User_image` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_user`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table project1.user: ~0 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`ID_user`, `User_name`, `User_address`, `User_email`, `User_phone`, `User_UN`, `User_PW`, `User_image`) VALUES
	(1, 'a', 'a', 'a', 'a', 'a', 'a', 'a');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- Dumping structure for table project1.wishlist
CREATE TABLE IF NOT EXISTS `wishlist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ProductID_pro` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idUser_idx` (`idUser`),
  KEY `ProductID_pro_idx` (`ProductID_pro`),
  CONSTRAINT `ProductID_pro` FOREIGN KEY (`ProductID_pro`) REFERENCES `product` (`ID_pro`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `idUser` FOREIGN KEY (`idUser`) REFERENCES `user` (`ID_user`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table project1.wishlist: ~0 rows (approximately)
/*!40000 ALTER TABLE `wishlist` DISABLE KEYS */;
/*!40000 ALTER TABLE `wishlist` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
