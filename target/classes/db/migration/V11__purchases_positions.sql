-- Create the purchases_positions table
CREATE TABLE public.purchases_positions (
    purchase_number BIGINT PRIMARY KEY,  -- Keep as BIGINT for manual entry
    amount DOUBLE PRECISION,
    reclamation_exist CHAR(1) COLLATE pg_catalog."default",
    product_id BIGINT,
    purchase_id BIGINT NOT NULL,
    CONSTRAINT fk_product FOREIGN KEY (product_id)
        REFERENCES public.products (product_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_purchase FOREIGN KEY (purchase_id)
        REFERENCES public.purchases (purchase_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
) TABLESPACE pg_default;

-- Change owner to postgres
ALTER TABLE public.purchases_positions
    OWNER TO postgres;

-- Insert records into purchases_positions with unique purchase numbers
INSERT INTO public.purchases_positions (purchase_number, purchase_id, product_id, amount, reclamation_exist) VALUES
    (1001, 1, 25, 0.5, 'N'),
    (1002, 1, 20, 1, 'N'),
    (1003, 1, 5, 10, 'N'),
    (1004, 1, 8, 8, 'N'),
    (1005, 1, 7, 5, 'N'),
    (2001, 2, 9, 2, 'N'),
    (3001, 3, 1, 1, 'N'),
    (3002, 3, 17, 7, 'N'),
    (3003, 3, 22, 12, 'N'),
    (3004, 3, 7, 6, 'N');
