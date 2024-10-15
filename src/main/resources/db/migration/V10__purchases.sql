-- Create the purchases table
CREATE TABLE public.purchases (
    purchase_id SERIAL PRIMARY KEY,  -- Change to SERIAL for auto-incrementing
    invoice_exist CHAR(1) COLLATE pg_catalog."default",
    purchase_date TIMESTAMP WITHOUT TIME ZONE,
    receipt_exist CHAR(1) COLLATE pg_catalog."default",
    customer_id BIGINT NOT NULL,
    invoice_id BIGINT,
    CONSTRAINT fk_customer FOREIGN KEY (customer_id)
        REFERENCES public.customers (customer_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_invoice FOREIGN KEY (invoice_id)
        REFERENCES public.selling_invoice (invoice_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
) TABLESPACE pg_default;

-- Change owner to postgres
ALTER TABLE public.purchases
    OWNER TO postgres;

-- Insert records into purchases
INSERT INTO public.purchases (customer_id, receipt_exist, invoice_exist, invoice_id, purchase_date) VALUES
    (4, 'N', 'T', 1, TO_DATE('04-FEB-18', 'DD-MON-RR')),
    (2, 'T', 'N', NULL, TO_DATE('04-SEP-18', 'DD-MON-RR')),
    (6, 'T', 'N', NULL, TO_DATE('04-DEC-18', 'DD-MON-RR'));
