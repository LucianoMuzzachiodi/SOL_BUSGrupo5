-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-05-2024 a las 21:25:30
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `solbusgrupo5`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `colectivo`
--

CREATE TABLE `colectivo` (
  `ID_Colectivo` int(11) NOT NULL,
  `Matrícula` varchar(10) NOT NULL,
  `Marca` varchar(20) NOT NULL,
  `Modelo` varchar(50) NOT NULL,
  `Capacidad` int(100) NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario`
--

CREATE TABLE `horario` (
  `ID_Horario` int(11) NOT NULL,
  `ID_Ruta` int(11) NOT NULL,
  `Hora_Salida` time NOT NULL,
  `Hora_Llegada` time NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasaje`
--

CREATE TABLE `pasaje` (
  `ID_Pasaje` int(11) NOT NULL,
  `ID_Pasajero` int(11) NOT NULL,
  `ID_Colectivo` int(11) NOT NULL,
  `ID_Ruta` int(11) NOT NULL,
  `Fecha_Viaje` date NOT NULL,
  `Hora_Viaje` time NOT NULL,
  `Asiento` int(100) NOT NULL,
  `Precio` decimal(6,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasajero`
--

CREATE TABLE `pasajero` (
  `ID_Pasajero` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellido` varchar(20) NOT NULL,
  `DNI` int(10) NOT NULL,
  `Correo` varchar(30) NOT NULL,
  `Teléfono` varchar(15) NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pasajero`
--

INSERT INTO `pasajero` (`ID_Pasajero`, `Nombre`, `Apellido`, `DNI`, `Correo`, `Teléfono`, `Estado`) VALUES
(1, 'Luciano', 'Muzzachiodi', 31201637, 'muluan@hotmail.com', '266386093', 0),
(2, 'Cintia', 'Andreani', 42697806, 'cintia@hotmail.com', '2664750476', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ruta`
--

CREATE TABLE `ruta` (
  `ID_Ruta` int(11) NOT NULL,
  `Origen` varchar(30) NOT NULL,
  `Destino` varchar(30) NOT NULL,
  `Duración_Estimada` time NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `colectivo`
--
ALTER TABLE `colectivo`
  ADD PRIMARY KEY (`ID_Colectivo`),
  ADD UNIQUE KEY `Matrícula` (`Matrícula`);

--
-- Indices de la tabla `horario`
--
ALTER TABLE `horario`
  ADD PRIMARY KEY (`ID_Horario`),
  ADD KEY `ID_Ruta` (`ID_Ruta`);

--
-- Indices de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD PRIMARY KEY (`ID_Pasaje`),
  ADD KEY `ID_Ruta` (`ID_Ruta`),
  ADD KEY `ID_Colectivo` (`ID_Colectivo`),
  ADD KEY `ID_Pasajero` (`ID_Pasajero`);

--
-- Indices de la tabla `pasajero`
--
ALTER TABLE `pasajero`
  ADD PRIMARY KEY (`ID_Pasajero`),
  ADD UNIQUE KEY `DNI` (`DNI`);

--
-- Indices de la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD PRIMARY KEY (`ID_Ruta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `colectivo`
--
ALTER TABLE `colectivo`
  MODIFY `ID_Colectivo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `horario`
--
ALTER TABLE `horario`
  MODIFY `ID_Horario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  MODIFY `ID_Pasaje` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pasajero`
--
ALTER TABLE `pasajero`
  MODIFY `ID_Pasajero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ruta`
--
ALTER TABLE `ruta`
  MODIFY `ID_Ruta` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `horario`
--
ALTER TABLE `horario`
  ADD CONSTRAINT `horario_ibfk_1` FOREIGN KEY (`ID_Ruta`) REFERENCES `ruta` (`ID_Ruta`);

--
-- Filtros para la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD CONSTRAINT `pasaje_ibfk_1` FOREIGN KEY (`ID_Colectivo`) REFERENCES `colectivo` (`ID_Colectivo`),
  ADD CONSTRAINT `pasaje_ibfk_3` FOREIGN KEY (`ID_Ruta`) REFERENCES `ruta` (`ID_Ruta`),
  ADD CONSTRAINT `pasaje_ibfk_4` FOREIGN KEY (`ID_Pasajero`) REFERENCES `pasajero` (`ID_Pasajero`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
