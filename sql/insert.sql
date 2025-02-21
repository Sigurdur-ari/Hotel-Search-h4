--Mock test insert data
INSERT INTO hotels (name, location, rating, ratingCount,
                    accessibility, pets, refundable, photoURL, checkInTime, checkOutTime)
            VALUES ('Test1', 'Reykjavík', 8.9, 1000, TRUE, FALSE, FALSE, 'photo1.is', '16:30', '10:00');

INSERT INTO hotels (name, location, rating, ratingCount,
                    accessibility, pets, refundable, photoURL, checkInTime, checkOutTime)
            VALUES ('Test2', 'Akureyri', 7.5, 200, TRUE, TRUE, FALSE, 'photo2.is', '15:30', '11:00');


INSERT INTO hotelRooms (hotelName, date, roomNum, capacity, pricePerNight)
            VALUES('Test1', "2024-12-10", 1, 4, 12000);
INSERT INTO hotelRooms (hotelName, date, roomNum, capacity, pricePerNight)
            VALUES('Test1', "2024-12-11", 2, 2, 8000);
INSERT INTO hotelRooms (hotelName, date, roomNum, capacity, pricePerNight)
            VALUES('Test2', "2024-12-10", 1, 4, 12000);
INSERT INTO hotelRooms (hotelName, date, roomNum, capacity, pricePerNight)
            VALUES('Test2', "2024-12-11", 2, 3, 7000);

