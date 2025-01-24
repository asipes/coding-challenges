-- Создаём тип ENUM для low_fats, если он не существует
DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_type WHERE typname = 'low_fats_enum') THEN
CREATE TYPE low_fats_enum AS ENUM ('Y', 'N');
END IF;
END $$;

-- Создаём тип ENUM для recyclable, если он не существует
DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_type WHERE typname = 'recyclable_enum') THEN
CREATE TYPE recyclable_enum AS ENUM ('Y', 'N');
END IF;
END $$;

-- Создаём таблицу Products
CREATE TABLE IF NOT EXISTS Products (
                                        product_id INT PRIMARY KEY,
                                        low_fats low_fats_enum,
                                        recyclable recyclable_enum
);

-- Очищаем таблицу
TRUNCATE TABLE Products;
