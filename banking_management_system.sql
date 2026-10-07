-- MySQL dump 10.13  Distrib 8.0.46, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: banking_management_system
-- ------------------------------------------------------
-- Server version	8.0.46

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `account_number` bigint NOT NULL,
  `customer_id` int DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `account_type` varchar(100) NOT NULL,
  PRIMARY KEY (`account_number`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `account_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1000000001,1,3000,'Savings'),(1000000002,1,15800,'Savings'),(1000000003,5,5000,'Savings'),(1000000004,1,5000,'Savings'),(1000000005,1,5000,'Savings'),(1000000008,5,5000,'Savings');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `customer_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `mobile_number` varchar(15) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'FARUK','9908941073','faruk@gmail.com','4-178/4,kummari bazaar,vinukonda,palnadu,a.p.'),(2,'Fardeen Vali','8486810070','fardeenvali@gmail.com','4-150,kummari bazaar,vinukonda'),(3,'Rahul','9876543210','rahul@gmail.com','Hyderabad'),(4,'FARUK','9908941073','faruk@gmail.com','4-178/4,kummari Bazar,vinukonda'),(5,'Test Customer','9876543210','testcustomer@gmail.com','Mumbai'),(6,'Test Customer','9876543210','testcustomer@gmail.com','Mumbai');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transaction` (
  `transaction_id` int NOT NULL AUTO_INCREMENT,
  `account_number` bigint NOT NULL,
  `transaction_type` varchar(50) NOT NULL,
  `amount` double NOT NULL,
  `transaction_date_time` datetime NOT NULL,
  PRIMARY KEY (`transaction_id`),
  KEY `account_number` (`account_number`),
  CONSTRAINT `transaction_ibfk_1` FOREIGN KEY (`account_number`) REFERENCES `account` (`account_number`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES (1,1000000001,'Deposit',5000,'2026-09-12 14:54:17'),(2,1000000001,'Deposit',2000,'2026-09-12 17:07:54'),(3,1000000001,'Withdrawal',2000,'2026-09-13 11:43:54'),(4,1000000001,'Deposit',2000,'2026-09-13 12:17:37'),(5,1000000001,'Withdrawal',2000,'2026-09-13 12:17:37'),(6,1000000001,'Deposit',999999,'2026-09-13 12:20:45'),(7,1000000001,'Withdrawal',2000,'2026-09-13 12:20:46'),(8,1000000001,'Withdrawal',999999,'2026-09-13 12:22:04'),(9,1000000001,'Transfer',1000,'2026-09-13 12:52:56'),(10,1000000001,'Transfer',1000,'2026-09-14 17:01:26'),(11,1000000001,'Deposit',500,'2026-09-14 17:12:45'),(12,1000000001,'Deposit',500,'2026-09-15 11:33:54'),(13,1000000001,'Withdrawal',500,'2026-09-15 11:35:05'),(14,1000000001,'Transfer',500,'2026-09-15 11:36:38'),(15,1000000001,'Deposit',5000,'2026-09-15 17:08:39'),(16,1000000001,'Deposit',5000,'2026-09-17 15:37:26'),(17,1000000001,'Deposit',500,'2026-09-18 08:24:07'),(18,1000000001,'Withdrawal',1000,'2026-09-18 08:25:30'),(19,1000000001,'Transfer',500,'2026-09-18 08:27:53'),(20,1000000001,'Deposit',500,'2026-09-18 09:21:55'),(21,1000000001,'Withdrawal',1000,'2026-09-18 09:22:53'),(22,1000000001,'Transfer',500,'2026-09-18 09:24:59'),(23,1000000001,'Deposit',5000,'2026-09-18 15:20:08'),(24,1000000001,'Transfer',1000,'2026-09-18 15:21:16'),(25,1000000001,'Transfer',1000,'2026-09-18 16:23:29'),(26,1000000001,'Deposit',500,'2026-09-19 23:06:31'),(27,1000000001,'Withdrawal',500,'2026-09-19 23:07:49'),(28,1000000001,'Transfer',500,'2026-09-19 23:09:51'),(29,1000000001,'Deposit',500,'2026-09-20 07:46:20'),(30,1000000001,'Withdrawal',200,'2026-09-20 07:46:20'),(31,1000000001,'Transfer',300,'2026-09-20 07:46:20');
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-09-24 12:45:25
