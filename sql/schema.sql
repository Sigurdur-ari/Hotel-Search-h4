CREATE TABLE IF NOT EXISTS hotels (
    name TEXT PRIMARY KEY,
    location TEXT,
    rating REAL,
    ratingCount INTEGER,
    accessibility INTEGER CHECK (accessibility IN (0,1)),
    pets INTEGER CHECK (pets IN (0,1)),
    refundable INTEGER CHECK (refundable IN (0,1)),
    photoURL TEXT,
    checkInTime TEXT,
    checkOutTime TEXT
);

CREATE TABLE IF NOT EXISTS hotelRooms (
    hotelName TEXT REFERENCES hotels(name),
    date TEXT CHECK (date LIKE '____-__-__'),
    roomNum INTEGER,
    capacity INTEGER,
    pricePerNight INTEGER,
    PRIMARY KEY (hotelName, date, roomNum)
);

CREATE TABLE IF NOT EXISTS booking (
    username TEXT,
    roomNumber INTEGER,
    hotelName TEXT,
    date TEXT CHECK (date LIKE '____-__-__'),
    FOREIGN KEY (hotelName, date, roomNumber) REFERENCES hotelRooms(hotelName, date, roomNum)
);
