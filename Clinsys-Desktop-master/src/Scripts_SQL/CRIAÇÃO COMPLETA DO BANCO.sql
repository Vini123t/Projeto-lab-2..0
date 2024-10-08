

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';



-- -----------------------------------------------------
-- Schema clinsys
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `clinsys` DEFAULT CHARACTER SET utf8 ;
USE `clinsys` ;

-- -----------------------------------------------------
-- Table `clinsys`.`Endereco`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `clinsys`.`Endereco` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `cep` CHAR(8) NOT NULL,
  `numero` INT NULL,
  `telFixo` CHAR(10) NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE INDEX `codigo_UNIQUE` (`codigo` ASC));


-- -----------------------------------------------------
-- Table `clinsys`.`Pessoa`
-- -----------------------------------------------------


CREATE TABLE IF NOT EXISTS `clinsys`.`Pessoa` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `endereco` INT NOT NULL,
  `nome` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `status` BOOLEAN NOT NULL,
  INDEX `fk_Pessoa_Endereco_idx` (`endereco` ASC),
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  CONSTRAINT `fk_Pessoa_Endereco`
    FOREIGN KEY (`endereco`)
    REFERENCES `clinsys`.`Endereco` (`codigo`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `clinsys`.`PessoaFisica`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `clinsys`.`PessoaFisica` (
  `id` INT NOT NULL,
  `dataNasc` DATE NOT NULL,
  `rg` CHAR(9) NOT NULL,
  `cpf` CHAR(11) NOT NULL,
  `sexo` CHAR NOT NULL,
  `celular` CHAR(11) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC),
  UNIQUE INDEX `rg_UNIQUE` (`rg` ASC),
  UNIQUE INDEX `celular_UNIQUE` (`celular` ASC),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  CONSTRAINT `fk_PessoaFisica_Pessoa1`
    FOREIGN KEY (`id`)
    REFERENCES `clinsys`.`Pessoa` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE );


-- -----------------------------------------------------
-- Table `clinsys`.`RespFinJuridico`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `clinsys`.`RespFinJuridico` (
  `cnpj` CHAR(14) NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_RespFinJuridico_Pessoa1_idx` (`id` ASC),
  UNIQUE INDEX `cnpj_UNIQUE` (`cnpj` ASC),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  CONSTRAINT `fk_RespFinJuridico_Pessoa1`
    FOREIGN KEY (`id`)
    REFERENCES `clinsys`.`Pessoa` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `clinsys`.`Paciente`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `clinsys`.`Paciente` (
  `id` INT NOT NULL,
  `respfin` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  CONSTRAINT `fk_Paciente_PessoaFisica1`
    FOREIGN KEY (`id`)
    REFERENCES `clinsys`.`PessoaFisica` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
    CONSTRAINT `fk_Paciente_Pessoa`
    FOREIGN KEY (`respfin`)
    REFERENCES `clinsys`.`Pessoa` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `clinsys`.`RespFinFisico`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `clinsys`.`RespFinFisico` (
  `id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  CONSTRAINT `fk_RespFinFisico_PessoaFisica1`
    FOREIGN KEY (`id`)
    REFERENCES `clinsys`.`PessoaFisica` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `clinsys`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinsys`.`Usuario` (
  `id` INT NOT NULL,
  `login` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(255) NOT NULL,
  INDEX `fk_Usuario_PessoaFisica1_idx` (`id` ASC),
  PRIMARY KEY (`login`),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  CONSTRAINT `fk_Usuario_PessoaFisica1`
    FOREIGN KEY (`id`)
    REFERENCES `clinsys`.`PessoaFisica` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);

-- -----------------------------------------------------
-- Table `clinsys`.`LogAcessos`
-- -----------------------------------------------------

CREATE TABLE `clinsys`.`LogAcessos` (
`id` INT NOT NULL AUTO_INCREMENT,
`userid` INT NOT NULL,
`username` VARCHAR(255) NOT NULL,
`data` DATETIME NOT NULL,
CONSTRAINT FOREIGN KEY (`userid`)
REFERENCES `clinsys`.`Usuario`(`id`),
PRIMARY KEY(`id`));




-- -----------------------------------------------------
-- inserção do usuario ROOT do sistema
-- -----------------------------------------------------

INSERT INTO Endereco (codigo,cep,numero,telFixo) 
VALUES (1,'29000000','7','2730900000');



INSERT INTO Pessoa (id,endereco,nome,email,status)
VALUES (1,1,'aaaaaaaaaaa','aaa.aaaa@gmail.com',1);



INSERT INTO PessoaFisica (id,dataNasc,rg,cpf,sexo,celular) VALUES
(1,'1987-03-30','0101010ES','01010101011','M','27988079601');



INSERT INTO Usuario (id,login,senha) VALUES
(1,'admin','admin');




SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


-- -----------------------------------------------------
-- Procedures usadas no sistema
-- -----------------------------------------------------

DELIMITER $$

CREATE PROCEDURE getRespFinFisico (IN id INT)
BEGIN
    SELECT endereco,nome,email,status,dataNasc,rg,cpf,sexo,celular,cep,numero,telFixo
    FROM Pessoa JOIN PessoaFisica
        ON Pessoa.id = PessoaFisica.id JOIN RespFinFisico
            ON RespFinFisico.id = Pessoa.id JOIN Endereco
                ON Endereco.codigo = endereco
    WHERE Pessoa.id = id;
END $$



DELIMITER $$

CREATE PROCEDURE getRespFinJuridico (IN id INT)
BEGIN
    SELECT endereco,nome,email,status,cnpj,cep,numero,telFixo
    FROM Pessoa JOIN RespFinJuridico
        ON Pessoa.id = RespFinJuridico.id JOIN Endereco
            ON endereco = Endereco.codigo
    WHERE Pessoa.id = id;
END $$

DELIMITER $$;