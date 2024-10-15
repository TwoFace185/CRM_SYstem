-- Create the sys_user table
CREATE TABLE public.sys_user (
    user_id SERIAL PRIMARY KEY,  -- Auto-incrementing user_id
    employee_id VARCHAR(255) NOT NULL,
    manager_id BIGINT,  -- Changed to BIGINT to reference user_id
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    role VARCHAR(50),
    active BOOLEAN NOT NULL DEFAULT TRUE
);

ALTER TABLE public.sys_user
    OWNER TO postgres;

-- Insert records into sys_user
INSERT INTO public.sys_user (employee_id, manager_id, username, password, email, role, active)
VALUES
    ('emp_1', NULL, 'admin', 'admin123', 'admin@example.com', 'ROLE_ADMIN', true),
    ('emp_2', 1, 'user1', 'user123', 'user1@example.com', 'ROLE_USER', true),
    ('emp_3', 1, 'user2', 'user456', 'user2@example.com', 'ROLE_USER', true),
    ('emp_4', 2, 'user3', 'user789', 'user3@example.com', 'ROLE_USER', true),
    ('emp_5', 18, 'user4', 'user101', 'user4@example.com', 'ROLE_USER', true),
    ('emp_6', 3, 'user5', 'user202', 'user5@example.com', 'ROLE_USER', true),
    ('emp_7', 3, 'user6', 'user303', 'user6@example.com', 'ROLE_USER', true),
    ('emp_8', 4, 'user7', 'user404', 'user7@example.com', 'ROLE_USER', true),
    ('emp_9', 4, 'user8', 'user505', 'user8@example.com', 'ROLE_USER', true),
    ('emp_10', 5, 'user9', 'user606', 'user9@example.com', 'ROLE_USER', true);
