CREATE TABLE `company` (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255)
);
CREATE TABLE `user` (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  company_id BIGINT,
  name VARCHAR(255),
  CONSTRAINT `FK_user__company__id` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`)
);
INSERT INTO `company` (name) 
  VALUES ('company name');
INSERT INTO `user` (name) 
  VALUES ('user name');
