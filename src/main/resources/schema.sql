SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;


CREATE TABLE IF NOT EXISTS `customers` (
  `id` int(11) NOT NULL,
  `longitude` double(10,8) DEFAULT NULL,
  `latitude` double(10,8) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `delivery_boy` (
  `id` int(11) NOT NULL,
  `longitude` double(10,8) NOT NULL,
  `latitude` double(10,8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `item_order` (
  `id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `order_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `orders` (
  `id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `accepted_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `prepared_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `estimated_devlivery_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `customer_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `products` (
  `id` int(11) NOT NULL,
  `item_description` varchar(114) DEFAULT NULL,
  `item_id` varchar(64) DEFAULT NULL,
  `restaurant_id` varchar(64) DEFAULT NULL,
  `restaurant` varchar(40) DEFAULT NULL,
  `classification` varchar(45) DEFAULT NULL,
  `unit_price` decimal(5,2) DEFAULT NULL,
  `address_city` varchar(12) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `stores` (
  `id` int(11) NOT NULL,
  `restaurant_id` text NOT NULL,
  `restaurant` varchar(100) NOT NULL,
  `address_city` varchar(100) NOT NULL,
  `longitude` double(10,8) NOT NULL,
  `latitude` double(10,8) NOT NULL,
  `dish_description` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=latin1;


ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `delivery_boy`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `item_order`
  ADD PRIMARY KEY (`id`), ADD KEY `FK_product_order` (`product_id`);

ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`), ADD KEY `FK_Customer_Order` (`customer_id`);

ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `stores`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `customers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=1001;
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=1001;
ALTER TABLE `stores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=1001;

ALTER TABLE `item_order`
ADD CONSTRAINT `FK_product_order` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);

ALTER TABLE `orders`
ADD CONSTRAINT `FK_Customer_Order` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
