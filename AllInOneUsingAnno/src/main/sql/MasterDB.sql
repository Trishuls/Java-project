-- Database: MasterDB

-- DROP DATABASE "MasterDB";

CREATE DATABASE "MasterDB"
    WITH 
    OWNER = trishul
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

COMMENT ON DATABASE "MasterDB"
    IS 'This DB contains all the details of Supervisor and clients added by him';
    
 CREATE TABLE super_admin
(
	id bigserial,
	user_name character varying,
	password character varying,
	email character varying,
	contact_no bigint,
	address character varying,
	login_flag character varying default 'F',
	added_on timestamp with time zone,
	updated_on timestamp with time zone
);

INSERT INTO super_admin(name,email,contact_no,address,password) VALUES ('Trishul','trishul2614@gmail.com',9944110022,'Mysuru','123');

CREATE TABLE clients_table
(
	id bigserial,
	client_name character varying, 
	client_location character varying,
	client_contact_no bigint
);