-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 19, 2019 at 02:55 PM
-- Server version: 10.3.15-MariaDB
-- PHP Version: 7.2.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db-cafes`
--

-- --------------------------------------------------------

--
-- Table structure for table `BangGia`
--

CREATE TABLE `BangGia` (
  `ID` int(11) NOT NULL,
  `MaSP` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaBG` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Dongia` float DEFAULT NULL,
  `Giam` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `BanPhong`
--

CREATE TABLE `BanPhong` (
  `Soban` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `MaKV` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaBG` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Bophan`
--

CREATE TABLE `Bophan` (
  `MaBP` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `Macha` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TenBP` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Chungtu`
--

CREATE TABLE `Chungtu` (
  `SoCT` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `NgayCT` datetime DEFAULT NULL,
  `Loai` tinyint(4) DEFAULT NULL,
  `Soban` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaKH` varchar(7) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Sokhach` int(11) DEFAULT NULL,
  `Noidung` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaThungan` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaNhanvien` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Giam` float DEFAULT NULL,
  `ThueVAT` float DEFAULT NULL,
  `PhiPV` float DEFAULT NULL,
  `Sotien` float DEFAULT NULL,
  `Tratruoc` float DEFAULT NULL,
  `ConNo` float DEFAULT NULL,
  `NgayDat` datetime DEFAULT NULL,
  `Trangthai` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `DongCT`
--

CREATE TABLE `DongCT` (
  `ID` int(11) NOT NULL,
  `SoCT` varchar(7) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaSP` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaDVT` varchar(7) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Soluong` float DEFAULT NULL,
  `Dongia` float DEFAULT NULL,
  `Giovao` datetime DEFAULT NULL,
  `Giora` datetime DEFAULT NULL,
  `Tralai` float DEFAULT NULL,
  `Giam` float DEFAULT NULL,
  `Ghichu` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Donvitinh`
--

CREATE TABLE `Donvitinh` (
  `MaDVT` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `Macdinh` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `DVTKhac`
--

CREATE TABLE `DVTKhac` (
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Khachhang`
--

CREATE TABLE `Khachhang` (
  `MaKH` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `Manhom` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TenKH` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Diachi` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Dienthoai` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Masothue` varchar(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ThuDK` float DEFAULT NULL,
  `TraDK` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Khuvuc`
--

CREATE TABLE `Khuvuc` (
  `MaKV` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `TenKV` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `LoaiBangGia`
--

CREATE TABLE `LoaiBangGia` (
  `MaBG` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `TenBG` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Macdinh` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Nhanvien`
--

CREATE TABLE `Nhanvien` (
  `MaNV` varchar(7) COLLATE utf8_unicode_ci NOT NULL,
  `MaBP` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Hoten` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Diachi` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Dienthoai` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Masothue` varchar(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `IsKetoan` tinyint(4) DEFAULT NULL,
  `isThungan` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Nhomhang`
--

CREATE TABLE `Nhomhang` (
  `Manhom` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `Macha` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Tennhom` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Loainhom` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `NhomKhach`
--

CREATE TABLE `NhomKhach` (
  `Manhom` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `Macha` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Tennhom` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Loainhom` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `SanPham`
--

CREATE TABLE `SanPham` (
  `MaSP` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `Manhom` varchar(5) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TenSP` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaDVT` varchar(7) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SLDK` float DEFAULT NULL,
  `GTDK` float DEFAULT NULL,
  `IsMenu` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Thanhphan`
--

CREATE TABLE `Thanhphan` (
  `ID` int(11) NOT NULL,
  `MaSP` int(11) DEFAULT NULL,
  `MaDVT` int(11) DEFAULT NULL,
  `MaTP` int(11) DEFAULT NULL,
  `MaDVTTP` int(11) DEFAULT NULL,
  `Soluong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `BangGia`
--
ALTER TABLE `BangGia`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `BanPhong`
--
ALTER TABLE `BanPhong`
  ADD PRIMARY KEY (`Soban`);

--
-- Indexes for table `Bophan`
--
ALTER TABLE `Bophan`
  ADD PRIMARY KEY (`MaBP`);

--
-- Indexes for table `Chungtu`
--
ALTER TABLE `Chungtu`
  ADD PRIMARY KEY (`SoCT`);

--
-- Indexes for table `DongCT`
--
ALTER TABLE `DongCT`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `Donvitinh`
--
ALTER TABLE `Donvitinh`
  ADD PRIMARY KEY (`MaDVT`);

--
-- Indexes for table `Khachhang`
--
ALTER TABLE `Khachhang`
  ADD PRIMARY KEY (`MaKH`);

--
-- Indexes for table `Khuvuc`
--
ALTER TABLE `Khuvuc`
  ADD PRIMARY KEY (`MaKV`);

--
-- Indexes for table `LoaiBangGia`
--
ALTER TABLE `LoaiBangGia`
  ADD PRIMARY KEY (`MaBG`);

--
-- Indexes for table `Nhanvien`
--
ALTER TABLE `Nhanvien`
  ADD PRIMARY KEY (`MaNV`);

--
-- Indexes for table `Nhomhang`
--
ALTER TABLE `Nhomhang`
  ADD PRIMARY KEY (`Manhom`);

--
-- Indexes for table `NhomKhach`
--
ALTER TABLE `NhomKhach`
  ADD PRIMARY KEY (`Manhom`);

--
-- Indexes for table `SanPham`
--
ALTER TABLE `SanPham`
  ADD PRIMARY KEY (`MaSP`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `BangGia`
--
ALTER TABLE `BangGia`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `DongCT`
--
ALTER TABLE `DongCT`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
