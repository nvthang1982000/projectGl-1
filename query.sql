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
DROP DATABASE IF EXISTS `project1`;
CREATE DATABASE IF NOT EXISTS `project1` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `project1`;

-- Dumping structure for table project1.admin
DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `ID_ad` int(11) NOT NULL,
  `Ad_name` varchar(45) NOT NULL,
  `Ad_email` varchar(45) NOT NULL,
  `Ad_UN` varchar(45) NOT NULL,
  `Ad_PW` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_ad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table project1.bill
DROP TABLE IF EXISTS `bill`;
CREATE TABLE IF NOT EXISTS `bill` (
  `Bill_ID` int(11) NOT NULL,
  `ProductID_pro` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `UserID_user` int(11) NOT NULL,
  `PriceProductID_pro` int(11) NOT NULL,
  `PriceID_Price` int(11) NOT NULL,
  PRIMARY KEY (`Bill_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table project1.categories
DROP TABLE IF EXISTS `categories`;
CREATE TABLE IF NOT EXISTS `categories` (
  `ID_cat` int(11) NOT NULL,
  `Group` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_cat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table project1.coupon
DROP TABLE IF EXISTS `coupon`;
CREATE TABLE IF NOT EXISTS `coupon` (
  `ID_coupon` int(11) NOT NULL,
  `Discount` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID_coupon`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table project1.image
DROP TABLE IF EXISTS `image`;
CREATE TABLE IF NOT EXISTS `image` (
  `ID` int(11) NOT NULL,
  `Path` varchar(45) NOT NULL,
  `ProductID_pro` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table project1.price
DROP TABLE IF EXISTS `price`;
CREATE TABLE IF NOT EXISTS `price` (
  `ID_Price` int(11) NOT NULL,
  `ProductID_pro` int(11) NOT NULL,
  `Price_bf_dis` int(11) NOT NULL,
  `Price_af_dis` int(11) NOT NULL,
  `Start_date` varchar(45) NOT NULL,
  `CouponID_Coupon` int(11) NOT NULL,
  `End_Date` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_Price`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table project1.product
DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `ID_pro` int(11) NOT NULL,
  `Pro_name` varchar(200) NOT NULL,
  `Left_Quantity` int(11) NOT NULL,
  `Price` int(11) NOT NULL,
  `Flag` varchar(45) NOT NULL,
  `SupplierID_Supplier` int(11) NOT NULL,
  PRIMARY KEY (`ID_pro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table project1.product_categories
DROP TABLE IF EXISTS `product_categories`;
CREATE TABLE IF NOT EXISTS `product_categories` (
  `id` int(11) NOT NULL,
  `ProductID_pro` int(11) NOT NULL,
  `CategoriesID_Cat` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table project1.supplier
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE IF NOT EXISTS `supplier` (
  `ID_Supplier` int(11) NOT NULL,
  `Sup_name` varchar(100) NOT NULL,
  `Sup_email` varchar(50) NOT NULL,
  `Sup_hotline` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_Supplier`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table project1.user
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `ID_user` int(11) NOT NULL,
  `User_name` varchar(200) NOT NULL,
  `User_address` varchar(200) NOT NULL,
  `User_email` varchar(50) NOT NULL,
  `User_phone` varchar(45) NOT NULL,
  `User_UN` varchar(45) NOT NULL,
  `User_PW` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table project1.wishlist
DROP TABLE IF EXISTS `wishlist`;
CREATE TABLE IF NOT EXISTS `wishlist` (
  `id` int(11) NOT NULL,
  `ProductID_pro` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
