-- Create the departments table
CREATE TABLE public.departments (
    department_code SERIAL PRIMARY KEY,  -- Auto-incrementing department_code
    city VARCHAR(255),
    department_name VARCHAR(255),
    manager_id BIGINT,
    CONSTRAINT fk_manager FOREIGN KEY (manager_id)
        REFERENCES public.sys_user (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

-- Change owner to postgres
ALTER TABLE public.departments
    OWNER TO postgres;

-- Insert records into departments
INSERT INTO public.departments (city, department_name, manager_id)
VALUES
    ('Warszawa Śródmieście', 'Księgowość', 1),  -- Assuming manager_id 1 exists
    ('Piaseczno', 'Produkcja', 2),               -- Assuming manager_id 2 exists
    ('Warszawa Centrum', 'Administracja', 3),   -- Assuming manager_id 3 exists
    ('Warszawa Centrum', 'IT', 1),               -- Manager 1 (admin)
    ('Warszawa Śródmieście', 'Sprzedaż', 2),    -- Manager 2
    ('Warszawa Ochota', 'Planowanie i zakupy', 3),  -- Manager 3
    ('Kraków', 'HR', 4),                         -- Assuming manager_id 4 exists
    ('Łódź', 'Badanie i rozwój', 5),             -- Assuming manager_id 5 exists
    ('Szczecin', 'Dział prawny', 6),             -- Assuming manager_id 6 exists
    ('Gdańsk Oliwa', 'Public relations', 7),     -- Assuming manager_id 7 exists
    ('Poznań', 'Transport', 8),                   -- Assuming manager_id 8 exists
    ('Zakopane', 'Logistyka', 9);                 -- Assuming manager_id 9 exists
