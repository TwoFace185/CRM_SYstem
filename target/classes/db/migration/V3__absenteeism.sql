CREATE TABLE public.absenteeism
(
    id bigint NOT NULL,
    date_from timestamp without time zone,
    date_to timestamp without time zone,
    employee_id bigint NOT NULL,
    roa_code bigint NOT NULL,
    CONSTRAINT absenteeism_pkey PRIMARY KEY (id),
    CONSTRAINT fkl6k7j7sug12nj7n4qi364h2uj FOREIGN KEY (roa_code)
        REFERENCES public.reasons_of_absenteeism (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fknbtc1eev8hql0g4ejl1j1nt80 FOREIGN KEY (employee_id)
        REFERENCES public.sys_user (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE public.absenteeism
    OWNER to postgres;
INSERT INTO public.absenteeism (id, date_from, date_to, employee_id, roa_code)
VALUES
    (1, '2018-01-15', '2018-01-27', 4, 4),  -- employee_id 4 exists
    (2, '2018-02-27', '2018-03-05', 2, 4),  -- employee_id 2 exists
    (3, '2018-09-04', '2019-03-04', 3, 2),  -- using employee_id 3 (20 does not exist)
    (4, '2017-08-12', '2018-05-04', 1, 1),  -- employee_id 1 exists
    (5, '2018-10-05', '2018-10-05', 9, 9);  -- employee_id 9 exists
