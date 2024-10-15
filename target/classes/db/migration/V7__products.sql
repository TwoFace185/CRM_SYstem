-- Create the products table
CREATE TABLE public.products (
    product_id SERIAL PRIMARY KEY,  -- Change to SERIAL for auto-incrementing
    name_of_product VARCHAR(255) COLLATE pg_catalog."default" NOT NULL,
    purchase_price DOUBLE PRECISION NOT NULL,
    selling_price DOUBLE PRECISION NOT NULL,
    su VARCHAR(255) COLLATE pg_catalog."default",
    tax_rate DOUBLE PRECISION NOT NULL,
    product_type VARCHAR(255) COLLATE pg_catalog."default",
    CONSTRAINT fk_product_type FOREIGN KEY (product_type)
        REFERENCES public.product_type (product_type_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

-- Change owner to postgres
ALTER TABLE public.products
    OWNER TO postgres;

-- Insert records into products
INSERT INTO public.products (name_of_product, product_type, selling_price, purchase_price, tax_rate, su) VALUES
    ('Baton "Mars"', 'SLO', 2.5, 1.5, 23, 'SZT'),
    ('chleb', 'PIE', 3, 1.2, 23, 'SZT'),
    ('płatki owsiane 0.5kg', 'NAS', 2.25, 1.45, 23, 'SZT'),
    ('płatki owsiane 1kg', 'NAS', 4, 2.4, 23, 'SZT'),
    ('mleko', 'NAB', 3.5, 2, 23, 'SZT'),
    ('jogurt "Danone"', 'NAB', 3.5, 2, 23, 'SZT'),
    ('woda gazowana', 'NAP', 1.9, 1, 23, 'SZT'),
    ('woda niegazowana', 'NAP', 1.9, 1, 23, 'SZT'),
    ('oranżada', 'NAP', 2.49, 2, 23, 'SZT'),
    ('bułka przenna', 'PIE', 0.5, 0.3, 23, 'SZT'),
    ('bułka żytnia', 'PIE', 0.7, 0.5, 23, 'SZT'),
    ('balsam do ciała', 'KOS', 20, 14, 23, 'SZT'),
    ('krem do rąk', 'KOS', 8, 6.4, 23, 'SZT'),
    ('dezodorant', 'KOS', 9, 4.4, 23, 'SZT'),
    ('piwo', 'ALK', 4, 2.8, 30, 'SZT'),
    ('wódka polska', 'ALK', 25, 14, 30, 'SZT'),
    ('whiskey', 'ALK', 60, 40, 30, 'SZT'),
    ('czekolada', 'SLO', 5, 2, 23, 'SZT'),
    ('ryż', 'NAS', 3, 1.5, 23, 'SZT'),
    ('kasza gryczana', 'NAS', 3, 1.7, 23, 'SZT'),
    ('jabłko', 'OWO', 4, 2.52, 16, 'KG'),
    ('pomarańcza', 'OWO', 8, 5.01, 16, 'KG'),
    ('banan', 'OWO', 7.25, 4.99, 16, 'KG'),
    ('pomidor malinowy', 'WAR', 12.99, 10.99, 16, 'KG'),
    ('ogórek', 'WAR', 2.99, 1.99, 16, 'KG');
