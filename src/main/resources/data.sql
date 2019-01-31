INSERT INTO store (latitude, longitude, name, dish_description, city)
  VALUES
    (1, 1, 'teste1', 'teste11', 'Cidade1'),
    (2, 2, 'teste2', 'teste22', 'Cidade2'),
    (3, 3, 'teste3', 'teste33', 'Cidade3'),
    (4, 4, 'teste4', 'teste44', 'Cidade4');

INSERT INTO product (id, description, price, store_id)
  VALUES
    (1, 'product description 1', 1.5, 1),
    (2, 'product description 2', 2.5, 1),
    (3, 'product description 3', 3.5, 2),
    (4, 'product description 4', 4.5, 2);



-- When you create a bigserial column in Postgresql, you are actually creating a sequence. When you manually inserted an ID value of '1', Postgresql did not update the sequence to take this into account. Hibernate lets Postgresql use the sequence to generate the ID, but the first value produced is '1', which clashes. The second value is fine.
--
-- If you created the problem by going behind Hibernate and using SQL directly, you should fix it the same way: use ALTER SEQUENCE to set the next value:
--
