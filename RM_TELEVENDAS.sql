-- MySQL dump 10.16  Distrib 10.1.37-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: RM_TELEVENDAS
-- ------------------------------------------------------
-- Server version	10.1.37-MariaDB-0+deb9u1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `RM_Assinaturas`
--

DROP TABLE IF EXISTS `RM_Assinaturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RM_Assinaturas` (
  `RM_ID` int(11) NOT NULL AUTO_INCREMENT,
  `RM_Servico` varchar(255) DEFAULT NULL,
  `RM_Duracao` int(20) DEFAULT NULL,
  `RM_Tipo_de_Assinatura` varchar(255) DEFAULT NULL,
  `RM_Bonus` varchar(255) DEFAULT NULL,
  `RM_Assistencia` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`RM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RM_Assinaturas`
--

LOCK TABLES `RM_Assinaturas` WRITE;
/*!40000 ALTER TABLE `RM_Assinaturas` DISABLE KEYS */;
INSERT INTO `RM_Assinaturas` VALUES (1,'Super 4K',30,'Pos','HBO+TELECINE+PREMIERE+COMBATE+BBB20+PHILOS','Grátis'),(2,'Top 4K',30,'Pos','TELECINE+PREMIERE+COMBATE+BBB20','Grátis'),(3,'Super HD',30,'Pos','PREMIERE+COMBATE','Coparticpativo'),(4,'Top HD',30,'Pos','HBO','Coparticipativo'),(5,'Básico',30,'Pré','HBO BASIC','PRÉ-PAGO');
/*!40000 ALTER TABLE `RM_Assinaturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RM_Clientes`
--

DROP TABLE IF EXISTS `RM_Clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RM_Clientes` (
  `RM_ID` int(11) NOT NULL AUTO_INCREMENT,
  `RM_Nome` varchar(255) DEFAULT NULL,
  `RM_CPF` int(15) DEFAULT NULL,
  `RM_Telefone` int(15) DEFAULT NULL,
  `RM_Rua` varchar(255) DEFAULT NULL,
  `RM_Bairro` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`RM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RM_Clientes`
--

LOCK TABLES `RM_Clientes` WRITE;
/*!40000 ALTER TABLE `RM_Clientes` DISABLE KEYS */;
INSERT INTO `RM_Clientes` VALUES (1,'Pedro Paulo Brito',1513038273,2147483647,'Avenida procolio rola','Jesus de Nazare'),(2,'João Miguel Ferreira',1624149384,2147483647,'Avenida das Nacoes','Paraiso'),(3,'Antonio Dergan Gomes',2147483647,2147483647,'Avenida Princesa Isabel','Fonte Nova'),(4,'Vitor Vasconcelos Tavares',2147483647,2147483647,'Rua joao Paulo 2','Bone Azul'),(5,'Marcelo Lima da Gama',2147483647,2147483647,'Rua Perimetra','Cidade Nova');
/*!40000 ALTER TABLE `RM_Clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RM_Fornecedor`
--

DROP TABLE IF EXISTS `RM_Fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RM_Fornecedor` (
  `RM_ID` int(11) NOT NULL AUTO_INCREMENT,
  `RM_Denominacao` varchar(255) DEFAULT NULL,
  `RM_CNPJ` varchar(255) DEFAULT NULL,
  `RM_Telefone` int(15) DEFAULT NULL,
  `RM_Email` varchar(255) DEFAULT NULL,
  `RM_Cidade` varchar(255) DEFAULT NULL,
  `RM_Bairro` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`RM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RM_Fornecedor`
--

LOCK TABLES `RM_Fornecedor` WRITE;
/*!40000 ALTER TABLE `RM_Fornecedor` DISABLE KEYS */;
INSERT INTO `RM_Fornecedor` VALUES (1,'Marcos Vinicius e Brenda Pizzaria Ltda','09265435000132',2147483647,'seguranca@marcosviniciusebrendapizzarialtda.com.br','Macapá','Boné Azul'),(2,'Evelyn e Sabrina Pizzaria ME','18030048000108',2147483647,'sac@evelynesabrinapizzariame.com.br','Macapá','Muca'),(3,'Caleb e Nair Doces & Salgados ME','10089777000128',2147483647,'ti@calebenairdocessalgadosme.com.br','Macapá','Central'),(4,'Bryan e Luan Doces & Salgados ME','92015268000115',2147483647,'fabricacao@bryaneluandocessalgadosme.com.br','Macapá','Jardim Marco Zero'),(5,'Lúcia e Vitória Publicidade e Propaganda ME','91972617000124',2147483647,'manutencao@luciaevitoriapublicidadeepropagandame.com.br','Macapá','Santa Rita');
/*!40000 ALTER TABLE `RM_Fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RM_Funcionarios`
--

DROP TABLE IF EXISTS `RM_Funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RM_Funcionarios` (
  `RM_ID` int(11) NOT NULL AUTO_INCREMENT,
  `RM_Nome` varchar(255) DEFAULT NULL,
  `RM_CPF` varchar(255) DEFAULT NULL,
  `RM_Experiencia` varchar(255) DEFAULT NULL,
  `RM_Salario` float DEFAULT NULL,
  `RM_Nivel_de_Acesso` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`RM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RM_Funcionarios`
--

LOCK TABLES `RM_Funcionarios` WRITE;
/*!40000 ALTER TABLE `RM_Funcionarios` DISABLE KEYS */;
INSERT INTO `RM_Funcionarios` VALUES (1,'Henry Gael Carvalho','10099602296','Administrador',5000,'Administrativo'),(2,'Bryan Fábio Nascimento','28944145288','Gerente',3500,'Supervisão'),(3,'Luiz Otávio Francisco Pereira','98689082212','Supervisor',2500,'Supervisão'),(4,'Pietro Filipe da Rocha','21339845261','Atendente',1500,'Funcionario'),(5,'Isabel Yasmin Fernandes','67635038222','Atendente',500,'Funcionario');
/*!40000 ALTER TABLE `RM_Funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RM_Produtos`
--

DROP TABLE IF EXISTS `RM_Produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RM_Produtos` (
  `RM_ID` int(11) NOT NULL AUTO_INCREMENT,
  `RM_Descricao` varchar(255) DEFAULT NULL,
  `RM_Valor` float DEFAULT NULL,
  `RM_Quantidade` int(15) DEFAULT NULL,
  `RM_Lote` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`RM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RM_Produtos`
--

LOCK TABLES `RM_Produtos` WRITE;
/*!40000 ALTER TABLE `RM_Produtos` DISABLE KEYS */;
INSERT INTO `RM_Produtos` VALUES (1,'Frigideira Eletrica',100,10,'210'),(2,'Jogo de Panelas de anti-aderente',250,8,'110'),(3,'Jogo de Cama Casal',165,5,'160'),(4,'Jogo de Cama Solteiro',60,3,'170'),(5,'Jogo de Capa de Sofá',185,7,'165');
/*!40000 ALTER TABLE `RM_Produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RM_Vendedora`
--

DROP TABLE IF EXISTS `RM_Vendedora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RM_Vendedora` (
  `RM_ID` int(11) NOT NULL AUTO_INCREMENT,
  `RM_Nome` varchar(255) DEFAULT NULL,
  `RM_CPF` varchar(255) DEFAULT NULL,
  `RM_Nivel_de_acesso` int(15) DEFAULT NULL,
  `RM_Experiencia` varchar(255) DEFAULT NULL,
  `RM_Salario` float DEFAULT NULL,
  PRIMARY KEY (`RM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RM_Vendedora`
--

LOCK TABLES `RM_Vendedora` WRITE;
/*!40000 ALTER TABLE `RM_Vendedora` DISABLE KEYS */;
INSERT INTO `RM_Vendedora` VALUES (1,'Aparecida Bruna Alessandra Carvalho','57756733282',0,'Vendedora',1500),(2,'Nicole Analu da Cunha','14618136200',0,'Vendedora',1500),(3,'Cláudia Nina Hadassa Porto','55676632267',0,'Vendedora',1500),(4,'Ayla Maya Sueli da Costa','32921250225',0,'Vendedora',1500),(5,'Clara Rita Márcia Melo','67548420242',0,'Vendedora',1500);
/*!40000 ALTER TABLE `RM_Vendedora` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-07 13:01:26
