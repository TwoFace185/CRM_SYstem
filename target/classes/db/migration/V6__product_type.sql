-- Create the product_type table
CREATE TABLE public.product_type (
    product_type_id VARCHAR(255) NOT NULL,
    discount DOUBLE PRECISION,
    full_name VARCHAR(255),
    period_of_availability CHAR(1),
    CONSTRAINT product_type_pkey PRIMARY KEY (product_type_id)
);

-- Change owner to postgres
ALTER TABLE public.product_type
    OWNER to postgres;

-- Insert records into product_type
INSERT INTO public.product_type (product_type_id, full_name, discount, period_of_availability)
VALUES
    ('ALK', 'alkohol', NULL, 'D'),
    ('KOS', 'kosmetyki', NULL, 'D'),
    ('NAB', 'nabiał', NULL, 'K'),
    ('NAP', 'napoje', NULL, 'D'),
    ('NAS', 'nasiona', NULL, 'D'),
    ('OWO', 'owoc', NULL, 'K'),
    ('PIE', 'pieczywo', NULL, 'K'),
    ('SLO', 'słodycz', NULL, 'D'),
    ('WAR', 'warzywo', NULL, 'K');
