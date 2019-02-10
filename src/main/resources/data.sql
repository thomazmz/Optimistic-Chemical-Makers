INSERT INTO `store`(`protocol`, `name`, `city`, `longitude`, `latitude`, `dish_description`) VALUES ('5640f4538237d9c4aaf3b751c4d11769b3fc1e3165ed3b912c508768f7fc15fd', 'Monteiro´s Lanches', 'SAO PAULO', -46.64097300, -23.60365800, 'Lanches');
INSERT INTO `store`(`protocol`, `name`, `city`, `longitude`, `latitude`, `dish_description`) VALUES ('a660f6374ab1a743468f576cb89e3a8cd9b9776a363ada7002a5db6066a8b572', 'True Food', 'SAO PAULO', -46.65790800, -23.55442300, 'Comida Saudável');
INSERT INTO `store`(`protocol`, `name`, `city`, `longitude`, `latitude`, `dish_description`) VALUES ('07fc65555705243de378cc34222909fe9f44ad055b855ec8b7b9b8df86d70874', 'Testador', 'SAO PAULO', -46.68878200, -23.60052900, 'Fit');
INSERT INTO `store`(`protocol`, `name`, `city`, `longitude`, `latitude`, `dish_description`) VALUES ('adc9c524d56679d7fb7ffd9d5b2a3eaba5209758751576f2ffa5d2a6432565f8', 'Restaurante dus Guri', 'SAO PAULO', -46.76341500, -23.58710100, 'Dia do Lixo');
INSERT INTO `store`(`protocol`, `name`, `city`, `longitude`, `latitude`, `dish_description`) VALUES ('6b511620f33db24724ba2b2fe6c31d78a4247c6360f83c785afe181ac15c6996', 'Restaurante du cupinxa', 'SAO PAULO', -46.74373400, -23.64276300, 'Vegan');


INSERT INTO `product`(`description`, `protocol`, `store_id`, `classification`, `price`) VALUES ('Galinhada executivo', '00002d8401f2d47cef5bb54b4e1cea226ec5155f2b5fb5fab4163b71d3eeb281', 1, 'Almoço por até R$ 13,90', 13.90);
INSERT INTO `product`(`description`, `protocol`, `store_id`, `classification`, `price`) VALUES ('Hamgurguer', '00006fa61eebf64da44f96788d6efb4a03f3dbcc6b0cfce08fce3e5095f364f9', 2, 'teste ruim', 25.90);
INSERT INTO `product`(`description`, `protocol`, `store_id`, `classification`, `price`) VALUES ('Churrasco', '00007964e46724000380162eb5bb541bd9213d309e766634396c669c05236fe9', 3, 'teste idiota', 1.90);
INSERT INTO `product`(`description`, `protocol`, `store_id`, `classification`, `price`) VALUES ('Salada Zika', '0000ba772533c4242eb038da8b2a891d550a1199a2287085a6711728cefffcd6', 4, 'teste cagado', 3.90);
INSERT INTO `product`(`description`, `protocol`, `store_id`, `classification`, `price`) VALUES ('Suco', '0000bfbb030501276c8b2b845c5d5bd9d40551af6e39ea2a2e52954d83aa8667', 5, 'teste zika', 43.90);

INSERT INTO `delivery_boy`(`longitude`, `latitude`, `protocol`) VALUES (-46.76341500, -23.58710100, '204f9ecd305044eab8f38187bbfdc3bb');
INSERT INTO `delivery_boy`(`longitude`, `latitude`, `protocol`) VALUES (-46.68878200, -23.60052900, 'd193cf7d8419411bb83d74e64a732b23');
INSERT INTO `delivery_boy`(`longitude`, `latitude`, `protocol`) VALUES (-46.76341500, -23.58710101, 'ebccdabe06424508ba44c5250fd64c15');
INSERT INTO `delivery_boy`(`longitude`, `latitude`, `protocol`) VALUES (-46.64097300, -23.60365800, 'eb7e580e9602465893c98c6a5750dded');
INSERT INTO `delivery_boy`(`longitude`, `latitude`, `protocol`) VALUES (-46.74373400, -23.64276300, 'f2c672494b5448c78a4ca75d7b29479f');