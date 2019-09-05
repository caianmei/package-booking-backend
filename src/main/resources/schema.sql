CREATE TABLE `package` (
  `id` varchar(20) NOT NULL,
  `receiver` varchar(20) DEFAULT NULL,
  `telPhone` varchar(11) DEFAULT NULL,
  `weight` int(5) DEFAULT NULL,
  `status`  varchar(33) DEFAULT NULL,
  `fetchTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;