DROP SCHEMA IF EXISTS `hb-one-to-one-mapping`;

CREATE SCHEMA `hb-one-to-one-mapping`;

use `hb-one-to-one-mapping`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `student_gfg_detail`;

-- -----------------------------------------------------
-- Table `hb-one-to-one-mapping`.`student_gfg_detail`
-- -----------------------------------------------------
CREATE TABLE `student_gfg_detail` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `college` varchar(128) DEFAULT NULL,
  `no_of_problems_solved` INT DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `instructor`;

-- -----------------------------------------------------
-- Table `hb-one-to-one-mapping`.`student`
-- -----------------------------------------------------
CREATE TABLE `hb-one-to-one-mapping`.`student` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL DEFAULT NULL,
  `last_name` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `student_gfg_detail_id` INT UNIQUE,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`student_gfg_detail_id`) 
  REFERENCES `hb-one-to-one-mapping`.`student_gfg_detail` (`id`) 
  ON DELETE NO ACTION
  ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

SET FOREIGN_KEY_CHECKS = 1;