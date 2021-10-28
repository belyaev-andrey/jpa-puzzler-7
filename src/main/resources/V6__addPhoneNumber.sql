ALTER TABLE owner
    ADD phone_number VARCHAR(255);

UPDATE owner
SET phone_number = '33-33-33'
WHERE id = 1;