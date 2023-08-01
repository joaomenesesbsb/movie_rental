INSERT INTO tb_book (author, description, price, title) VALUES ('Lucas Meneses', 'Uma historia de super heroi sobre origem', 2.5, 'Espetacular Homem Aranha');
INSERT INTO tb_book (author, description, price, title) VALUES ('Douglas Adams', 'Aventura espacial', 3.6, 'O guia definittivo dos mochileiros das galaxias');
INSERT INTO tb_book (author, description, price, title) VALUES ('Estela Lima', 'Conto de fadas', 10, 'Minha princesa');
INSERT INTO tb_book (author, description, price, title) VALUES ('Lucas Meneses', 'Uma historia de super heroi a viganca', 1.6, 'Espetacular Homem Aranha 2');
INSERT INTO tb_book (author, description, price, title) VALUES ('Victor Silva', 'Reino encantado', 3.5, 'Umunculo');

INSERT INTO tb_role (role_name) VALUES ('ROLE_CLIENT');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');



INSERT INTO tb_user (name, email, phone, password, birth_date, cpf, restriction) VALUES ('Maria Brown', 'maria@gmail.com', '988888888', '$2a$10$wnDg387Q11c4KYeVqmf2IumprkBVa39/41KAnkpviMEj9fbNuUmvG', '2001-07-25','33322233320','true');
INSERT INTO tb_user (name, email, phone, password, birth_date, cpf, restriction) VALUES ('Joao Victor', 'joao@gmail.com', '977777777', '$2a$10$wnDg387Q11c4KYeVqmf2IumprkBVa39/41KAnkpviMEj9fbNuUmvG', '1987-12-13', '16122233320','false');

INSERT INTO tb_address(city, country, number, post_code, client_id) VALUES ('gama','Brasil','17',72222111,1);
INSERT INTO tb_address(city, country, number, post_code, client_id) VALUES ('Sao Paulo','Brasil','28',6455589,2);
INSERT INTO tb_address(city, country, number, post_code, client_id) VALUES ('gama','Brasil','27',72222227,1);

INSERT INTO tb_user_role (user_id, role_id) VALUES (1,1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2,1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2,2);

INSERT INTO tb_genre (likes, name) VALUES (5, 'action');
INSERT INTO tb_genre (likes, name) VALUES (2, 'horror');
INSERT INTO tb_genre (likes, name) VALUES (1, 'anime');
INSERT INTO tb_genre (likes, name) VALUES (6, 'comedy');
INSERT INTO tb_genre (likes, name) VALUES (10, 'adventure');
INSERT INTO tb_genre (likes, name) VALUES (7, 'hero');
INSERT INTO tb_genre (likes, name) VALUES (2, 'fairy tale');

INSERT INTO tb_book_genre (book_id, genre_id) VALUES (1,5);
INSERT INTO tb_book_genre (book_id, genre_id) VALUES (2, 6);
INSERT INTO tb_book_genre (book_id, genre_id) VALUES (3, 7);
INSERT INTO tb_book_genre (book_id, genre_id) VALUES (4, 5);
INSERT INTO tb_book_genre (book_id, genre_id) VALUES (5, 7);

INSERT INTO tb_order (instant, status, client_id) VALUES (TIMESTAMP WITH TIME ZONE '2023-08-01T13:00:00Z', 3,2);

INSERT INTO tb_order_item (book_id, order_id, days, price) VALUES (1, 1, 5, 2.5);
INSERT INTO tb_order_item (book_id, order_id, days, price) VALUES (2, 1, 5, 3.6);
INSERT INTO tb_order_item (book_id, order_id, days, price) VALUES (3, 1, 5, 10);

INSERT INTO tb_payment (order_id, instant, type_of_payment) VALUES (1, TIMESTAMP WITH TIME ZONE '2023-08-01T14:00:00Z',1);
