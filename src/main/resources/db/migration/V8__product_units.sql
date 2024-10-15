-- Create the product_units table
CREATE TABLE public.product_units (
    id SERIAL PRIMARY KEY,  -- Change to SERIAL for auto-incrementing
    conversion_factor DOUBLE PRECISION,
    uom VARCHAR(255) COLLATE pg_catalog."default",
    uom_alt VARCHAR(255) COLLATE pg_catalog."default",
    product_id BIGINT NOT NULL,
    CONSTRAINT fk_product FOREIGN KEY (product_id)
        REFERENCES public.products (product_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

-- Change owner to postgres
ALTER TABLE public.product_units
    OWNER TO postgres;

-- Insert records into product_units
INSERT INTO public.product_units (product_id, uom, uom_alt, conversion_factor) VALUES
    (1, 'szt', 'kg', 0.2),
    (2, 'szt', 'kg', 0.6),
    (3, 'kg', 'szt', 2),
    (4, 'kg', 'szt', 1),
    (5, 'szt', 'l', 1.5),
    (5, 'szt', 'kg', 1.6),
    (6, 'szt', 'l', 0.2),
    (7, 'szt', 'l', 1.5),
    (8, 'szt', 'l', 1.5),
    (9, 'szt', 'l', 2),
    (10, 'szt', 'kg', 0.05),
    (11, 'szt', 'kg', 0.08),
    (12, 'szt', 'l', 0.5),
    (12, 'szt', 'kg', 0.6),
    (13, 'szt', 'kg', 0.3),
    (13, 'szt', 'l', 0.25),
    (14, 'szt', 'l', 0.07),
    (15, 'szt', 'l', 0.5),
    (16, 'szt', 'l', 0.5),
    (17, 'szt', 'l', 0.7),
    (18, 'szt', 'kg', 0.35),
    (19, 'szt', 'kg', 1),
    (20, 'szt', 'kg', 1),
    (21, 'kg', 'szt', 5),
    (22, 'kg', 'szt', 4),
    (23, 'kg', 'szt', 6),
    (24, 'kg', 'szt', 8),
    (25, 'kg', 'szt', 7);
