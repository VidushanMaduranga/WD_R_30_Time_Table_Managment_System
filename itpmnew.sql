-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Apr 07, 2021 at 07:50 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `itpmnew`
--

-- --------------------------------------------------------

--
-- Table structure for table `moduletag`
--

CREATE TABLE `moduletag` (
  `indexId` int(5) NOT NULL,
  `name` varchar(50) NOT NULL,
  `code` int(5) NOT NULL,
  `type01` varchar(50) NOT NULL,
  `type01Code` int(5) NOT NULL,
  `type02` varchar(50) NOT NULL,
  `type02Code` int(5) NOT NULL,
  `type03` varchar(50) NOT NULL,
  `type03Code` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `moduletag`
--

INSERT INTO `moduletag` (`indexId`, `name`, `code`, `type01`, `type01Code`, `type02`, `type02Code`, `type03`, `type03Code`) VALUES
(2, 'hhh', 7, 'hj', 7, 'gf', 34, 'n', 99);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `sID` int(5) NOT NULL,
  `sYear` varchar(50) NOT NULL,
  `sSemester` varchar(50) NOT NULL,
  `sProgramme` varchar(50) NOT NULL,
  `sMaiGroupNumber` varchar(50) NOT NULL,
  `sSubGroupNumber` varchar(50) NOT NULL,
  `sMainGroupId` varchar(50) NOT NULL,
  `sSubGroupId` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`sID`, `sYear`, `sSemester`, `sProgramme`, `sMaiGroupNumber`, `sSubGroupNumber`, `sMainGroupId`, `sSubGroupId`) VALUES
(1, 'Y1', 'S1', 'dff', '7', '7', '6', '7'),
(2, 'Y1', 'S1', 'sd', '3', '2', '5', '7'),
(5, 'Y1', 'S1', 'gh', '9', '6', '3', '8'),
(6, 'Y2', 'S1', 'eddf', '4', '7', '6', '8'),
(67, 'Y1', 'S1', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tags`
--

CREATE TABLE `tags` (
  `TagID` int(5) NOT NULL,
  `moTypeCode` varchar(5) NOT NULL,
  `moType` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tags`
--

INSERT INTO `tags` (`TagID`, `moTypeCode`, `moType`) VALUES
(1, '001', 'tute'),
(2, '004', 'lab');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `moduletag`
--
ALTER TABLE `moduletag`
  ADD PRIMARY KEY (`indexId`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`sID`);

--
-- Indexes for table `tags`
--
ALTER TABLE `tags`
  ADD PRIMARY KEY (`TagID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
