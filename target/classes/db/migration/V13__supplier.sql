-- Create the supplier table
CREATE TABLE public.supplier (
    supplier_id BIGINT NOT NULL,
    activity_status VARCHAR(255) COLLATE pg_catalog."default",
    supplier_name VARCHAR(255) COLLATE pg_catalog."default",
    mode_of_transport_code VARCHAR(255) COLLATE pg_catalog."default",
    CONSTRAINT supplier_pkey PRIMARY KEY (supplier_id),
    CONSTRAINT fk_mode_of_transport FOREIGN KEY (mode_of_transport_code)
        REFERENCES public.types_of_transport (code) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
) TABLESPACE pg_default;

-- Change owner to postgres
ALTER TABLE public.supplier
    OWNER TO postgres;

-- Insert records into supplier
INSERT INTO public.supplier (supplier_id, supplier_name, mode_of_transport_code, activity_status) VALUES
    (1, 'Morliny', 'VAN', 'A'),
    (2, 'Koral', 'BUS', 'N'),
    (3, 'Pepco', 'TIR', 'N'),
    (4, 'Lidl', 'TIR', 'N'),
    (5, 'Obi', 'VAN', 'A'),
    (6, 'Decathlon', 'TIR', 'N'),
    (7, 'Biedronka', 'TIR', 'N'),
    (8, 'Auchan', 'BUS', 'N'),
    (9, 'Lewiatan', 'TIR', 'N'),
    (10, 'Intermarche', 'VAN', 'A'),
    (11, 'Bricomarche', 'TIR', 'N'),
    (12, 'Tesco', 'TIR', 'N'),
    (13, 'E.Leclerc', 'TIR', 'N'),
    (14, 'Amica', 'BUS', 'N'),
    (15, 'Avon', 'AUT', 'A'),
    (16, 'Puma', 'TIR', 'N'),
    (17, 'Lego', 'VAN', 'A'),
    (18, 'Militaria', 'TIR', 'N'),
    (19, 'Delikatesy', 'AUT', 'A'),
    (20, 'Jogobella', 'VAN', 'A');
