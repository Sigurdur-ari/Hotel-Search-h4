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
    hotelName TEXT,
    username TEXT,
    roomNumber INTEGER,
    totalPrice INTEGER,
    checkInDate TEXT CHECK (checkInDate LIKE '____-__-__'),
    checkOutDate TEXT CHECK (checkOutDate LIKE '____-__-__'),
    capacity INTEGER,
    location TEXT,
    isRefundable INTEGER CHECK (isRefundable IN (0,1)),
    FOREIGN KEY (hotelName, checkInDate, roomNumber) REFERENCES hotelRooms(hotelName, date, roomNum)
);
