CREATE DATABASE  IF NOT EXISTS `student-management-system`;
USE `student-management-system`;

CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
   PRIMARY KEY (`id`)
);
INSERT INTO `student` VALUES 
	(1,'1011','Andrews'),
	(2,'1012','Baumgarten'),
	(3,'1013','Gupta'),
	(4,'1014','Petrov'),
	(5,'1015','Vega');
