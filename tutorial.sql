DROP SCHEMA IF EXISTS `BDTutorial`;
CREATE SCHEMA IF NOT EXISTS `BDTutorial` DEFAULT CHARACTER SET utf8 ;

use tutorial;

CREATE TABLE IF NOT EXISTS `tutorial`.`VideoTutorial` (
  `idVideoTutorial` INT NOT NULL,
  `descripción` VARCHAR(150) NOT NULL,
  `titulo` VARCHAR(100) NOT NULL,
  `fecha` DATE NOT NULL,
  PRIMARY KEY (`idVideoTutorial`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `tutorial`.`Comentario` (
  `idComentario` VARCHAR(3) NOT NULL,
  `descripcion` TEXT NOT NULL,
  `estudiante` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idComentario`))
  
ENGINE = InnoDB;




