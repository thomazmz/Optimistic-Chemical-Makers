INSERT INTO `store`(`id`, `protocol`, `name`, `city`, `latitude`, `longitude`, `dish_description`)
VALUES (1, '416296f0dc3c4094a0a27a5584df855a', 'Mc Donalds Silva Só', 'PORTO ALEGRE', -30.042617, -51.204800, 'Lanches');

INSERT INTO `store`(`id`, `protocol`, `name`, `city`, `latitude`, `longitude`, `dish_description`)
VALUES (2, '9df51ec38e9d4b079c24332cd0dc44b5', 'Coqueiro Lanches', 'PORTO ALEGRE', -30.115465, -51.254236, 'Xis');

INSERT INTO `store`(`id`, `protocol`, `name`, `city`, `latitude`, `longitude`, `dish_description`)
VALUES (3, 'f7fdc4f02159436e9a63d0a76c288040', 'Subway Agronomia', 'PORTO ALEGRE', -30.061968, -51.162254, 'Sanduíches');



INSERT INTO `product`(`description`, `protocol`, `store_id`, `classification`, `price`) VALUES ('Mc Lanche Feliz', 'e25305740fa047c78c7695bdc9a9eb86', 1, 'Para crianças', 18.90);
INSERT INTO `product`(`description`, `protocol`, `store_id`, `classification`, `price`) VALUES ('Big Mac', '9f58b56bf809444eb1e2f7eb235233d0', 1, 'Um clássico', 25.90);

INSERT INTO `product`(`description`, `protocol`, `store_id`, `classification`, `price`) VALUES ('Xis Salada', '322f5041f4b8445c8421af7e7b0e8a7e', 2, 'Xis salada com ovo', 20.90);
INSERT INTO `product`(`description`, `protocol`, `store_id`, `classification`, `price`) VALUES ('Xis Coração', '68a6923cfc0247118be4ffc46bd1f6ac', 2, 'Xis coração com ovo', 22.90);

INSERT INTO `product`(`description`, `protocol`, `store_id`, `classification`, `price`) VALUES ('BMT', 'ed0b8df5aa134bc9aa7a2612b799d948', 3, 'Salame e presunto', 20.90);
INSERT INTO `product`(`description`, `protocol`, `store_id`, `classification`, `price`) VALUES ('Frango Teriyaki', 'bf09c8c9f34a4e79a1d3eedbe1737035', 3, 'Frango com molho Teriyaki', 22.90);


INSERT INTO `delivery_boy`(`longitude`, `latitude`, `protocol`) VALUES (-46.76341500, -23.58710100, '204f9ecd305044eab8f38187bbfdc3bb');
INSERT INTO `delivery_boy`(`longitude`, `latitude`, `protocol`) VALUES (-46.68878200, -23.60052900, 'd193cf7d8419411bb83d74e64a732b23');
INSERT INTO `delivery_boy`(`longitude`, `latitude`, `protocol`) VALUES (-46.76341500, -23.58710101, 'ebccdabe06424508ba44c5250fd64c15');
INSERT INTO `delivery_boy`(`longitude`, `latitude`, `protocol`) VALUES (-46.64097300, -23.60365800, 'eb7e580e9602465893c98c6a5750dded');
INSERT INTO `delivery_boy`(`longitude`, `latitude`, `protocol`) VALUES (-46.74373400, -23.64276300, 'f2c672494b5448c78a4ca75d7b29479f');

