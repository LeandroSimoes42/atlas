ALTER TABLE consultant
    ADD CONSTRAINT fk_region_id
        FOREIGN KEY (region_id)
            REFERENCES region(id)
            ON DELETE CASCADE;