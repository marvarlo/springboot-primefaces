INSERT INTO BRANDS (BRANDID,BRAND,ACTIVE) VALUES (1, 'Nike', 1);
INSERT INTO BRANDS (BRANDID,BRAND,ACTIVE) VALUES (2, 'Reebok', 1);
INSERT INTO BRANDS (BRANDID,BRAND,ACTIVE) VALUES (3, 'Adidas', 1);
INSERT INTO BRANDS (BRANDID,BRAND,ACTIVE) VALUES (4, 'Puma', 1);
alter sequence SEQUENCE_BRANDS restart with 5;

INSERT INTO PRODUCTS (PRODUCTID, PRODUCT, PRICE, URL_IMAGE, BRANDID, QUANTITY) VALUES
(1,'Tenis Nike Precision VI de unisex adulto para básquetbol', 1479.20, 'https://www.liverpool.com.mx/medias/1092270-1.jpg', 1, 50),
(2,'Tenis Nike Court Legacy Lift de mujer para casual', 1839.20, 'https://www.liverpool.com.mx/medias/1092271-1.jpg', 1, 50),
(3,'Tenis Nike W Air Force 1 para mujer', 2399.00, 'https://www.liverpool.com.mx/medias/1092272-1.jpg', 1, 50),
(4,'Zapatillas De Fútbol nike time legend 9 elite fg Tenis Originales', 750.00, 'https://cf.shopee.com.mx/file/5c7b8f0a3c9a7f3f6d0d9b8c5a0d8e3b', 1, 50),
(5,'NikeCourt Air Zoom Vapor 11 Calzado de tenis para cancha dura para mujer', 3199.00, 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/9a6b7c9a-6c4e-4c2e-bb8e-6a0d7f2f9a8e/nikecourt-air-zoom-vapor-11-calzado-de-tenis-para-cancha-dura-para-mujer-0XZpMn.png', 1, 50),
(6,'NikeCourt Air Zoom Pro Calzado de tenis para cancha dura para mujer', 2079.00, 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/7d3b7c4d-cb9e-4c0d-bb8a-fb8c2d6c3f7e/nikecourt-air-zoom-pro-calzado-de-tenis-para-cancha-dura-para-mujer-BRZgQw.png', 1, 50),
(7,'Air Jordan 1 Low Calzado para mujer', 2899.00, 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/6d7a9bda-e0e4-4c9d-a8e2-f0b3a8c7d6dd/air-jordan-1-low-calzado-para-mujer-xLrXjL.png', 1, 50),
(8,'Air Jordan 1 Mid Calzado para hombre', 3199.00, 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/0dbb7f06-e6fb-4aaf-bd67-fa8e0e9ab2fd/air-jordan-1-mid-calzado-para-hombre-KkTJGw.png', 1, 50),
(9,'Nike Dunk Low Retro Calzado para hombre', 2209.00, 'https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/bbdfaa58-bd95-4c37-aeb9-dbb', 1, 50);
INSERT INTO PRODUCTS (PRODUCTID, PRODUCT, PRICE, URL_IMAGE, BRANDID, QUANTITY) VALUES
(10,'Tenis Reebok Zig Dynamica 2 Adventure de hombre para correr', 1599.20, 'https://www.reebok.mx/dw/image/v2/BJPK_PRD/on/demandware.static/-/Sites-reebok-catalog/default/dw0d024612/images2/GW8854/GW8854_01.jpg?sw=531&sh=531&sm=fit', 2, 50),
(11,'Tenis Reebok Flexagon energy TR 4 de hombre para entrenamiento', 1039.20, 'https://www.liverpool.com.mx/medias/1092275-1.jpg', 2, 50),
(12,'Tenis Reebok Ztaur Run II de hombre para entrenamiento', 1279.20, 'https://www.liverpool.com.mx/medias/1092276-1.jpg', 2, 50),
(13,'Tenis Reebok Nano x3 de mujer para entrenamiento', 2899.00, 'https://www.liverpool.com.mx/medias/1092277-1.jpg', 2, 50),
(14,'Tenis Reebok Zig Dynamica Adventure de mujer para entrenamiento', 1599.20, 'https://www.liverpool.com.mx/medias/1092278-1.jpg', 2, 50),
(15,'Tenis Reebok Energen Lite de hombre para correr', 1119.20, 'https://www.liverpool.com.mx/medias/1092279-1.jpg', 2, 50);
INSERT INTO PRODUCTS (PRODUCTID, PRODUCT, PRICE, URL_IMAGE, BRANDID, QUANTITY) VALUES
(16,'Tenis ADIDAS The Indoor Cycling Shoe unisex para entrenamiento', 2639.00, 'https://www.liverpool.com.mx/medias/1092280-1.jpg', 3, 30),
(17,'Tenis ADIDAS Response Runner U unisex adulto para correr', 1039.20, 'https://www.liverpool.com.mx/medias/1092281-1.jpg', 3, 30),
(18,'Tenis ADIDAS Copa Pure.3 TF unisex adulto para fútbol', 2099.00, 'https://www.liverpool.com.mx/medias/1092282-1.jpg', 3, 30),
(19,'Tenis ADIDAS Predator Accuracy.3 FG unisex adulto para fútbol', 2099.00, 'https://www.liverpool.com.mx/medias/1092283-1.jpg', 3, 30),
(20,'Tenis ADIDAS Predator Accuracy.4 TF unisex adulto para fútbol', 1873.75, 'https://www.liverpool.com.mx/medias/1092284-1.jpg', 3, 30),
(21,'Tenis ADIDAS Hog 4 unisex para box', 3999.00, 'https://www.liverpool.com.mx/medias/1092285-1.jpg', 3, 30);
INSERT INTO PRODUCTS (PRODUCTID, PRODUCT, PRICE, URL_IMAGE, BRANDID, QUANTITY) VALUES
(22,'Tenis Puma Future Match Creativity unisex para entrenamiento', 2249.00, 'https://www.liverpool.com.mx/medias/1092286-1.jpg', 4, 60),
(23,'Tenis Puma de mujer para entrenamiento', 1279.20, 'https://www.liverpool.com.mx/medias/1092287-1.jpg', 4, 30),
(24,'Tenis Puma para mujer', 2079.20, 'https://www.liverpool.com.mx/medias/1092288-1.jpg', 4, 45),
(25,'Tenis Puma Incinerate unisex adulto para entrenamiento', 1199.20, 'https://www.liverpool.com.mx/medias/1092289-1.jpg', 4, 10),
(26,'Tenis Puma Rebound Joy Low para hombre', 2399.00, 'https://www.liverpool.com.mx/medias/1092290-1.jpg', 4, 30),
(27,'Tenis Puma Flyer Runner Femme Wns de mujer para entrenamiento', 1239.20, 'https://www.liverpool.com.mx/medias/1092291-1.jpg', 4, 1);
alter sequence SEQUENCE_PRODUCTS restart with 28;