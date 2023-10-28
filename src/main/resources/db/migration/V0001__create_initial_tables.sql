CREATE TABLE region (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE consultant (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    region_id BIGINT,
    FOREIGN KEY (region_id) REFERENCES region(id)
);


CREATE TABLE status (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE records (
     id BIGINT AUTO_INCREMENT PRIMARY KEY,
     client VARCHAR(255) NOT NULL,
     code VARCHAR(255) NOT NULL,
     date_send DATE NOT NULL,
     date_register DATE NOT NULL,
     consultant_id BIGINT,
     status_id BIGINT,
     FOREIGN KEY (consultant_id) REFERENCES consultant(id),
     FOREIGN KEY (status_id) REFERENCES status(id)
);

CREATE TABLE message (
     id BIGINT AUTO_INCREMENT PRIMARY KEY,
     message VARCHAR(255),
     records_id BIGINT,
     FOREIGN KEY (records_id) REFERENCES records(id)
);