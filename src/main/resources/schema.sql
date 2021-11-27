CREATE TABLE city(
    id INTEGER PRIMARY KEY,
    name VARCHAR(40) NOT NULL,
    country_id INTEGER NOT NULL);

CREATE TABLE country(
    id INTEGER PRIMARY KEY,
    name VARCHAR(15) NOT NULL,
    postal_code INTEGER);

CREATE TABLE condition(
    id INTEGER PRIMARY KEY,
    city_id INTEGER NOT NULL,
    temperature FLOAT,
    wind FLOAT,
    humidity FLOAT,
    times TIMESTAMP);

    ALTER TABLE city ADD CONSTRAINT city_country FOREIGN KEY(country_id) REFERENCES country(id);
    ALTER TABLE condition ADD CONSTRAINT city_condition FOREIGN KEY

