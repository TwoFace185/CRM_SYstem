-- Create the customers table
CREATE TABLE public.customers (
    customer_id SERIAL PRIMARY KEY,  -- Change to SERIAL for auto-incrementing
    city VARCHAR(255),
    firstname VARCHAR(255) NOT NULL,
    lastname VARCHAR(255) NOT NULL,
    pesel CHAR(11),  -- Change to CHAR for fixed length
    zip_code VARCHAR(255)
);

-- Insert records into customers
INSERT INTO public.customers (customer_id, city, firstname, lastname, pesel, zip_code)
VALUES
    (DEFAULT, 'Płock', 'Bronisław', 'Foka', '72120573948', '09-400'),
    (DEFAULT, 'Płock', 'Joanna', 'Frączak', '80041146587', '09-400'),
    (DEFAULT, 'Gdańsk', 'Kazimiera', 'Wecław', '65091047612', '22-100'),
    (DEFAULT, 'Warszawa', 'Bartosz', 'Przybylski', '01101442863', '02-241'),
    (DEFAULT, 'Kraków', 'Katarzyna', 'Fackiewicz', '85031856317', '30-006'),
    (DEFAULT, 'Szczecin', 'Krzysztof', 'Jarzyna', '75110621863', '70-003');
