--Mock test insert data
INSERT INTO hotels (name, location, rating, ratingCount,
                    accessibility, pets, refundable, photoURL, checkInTime, checkOutTime)
            VALUES ('Grand Rey', 'Reykjavík', 8.9, 1000, TRUE, FALSE, FALSE, 'photos/hotel1.jpg', '16:30', '10:00'),
            ('Grand Ak', 'Akureyri', 7.5, 200, TRUE, TRUE, FALSE, 'photos/hotel2.jpg', '15:30', '11:00'),
            ('Grand Ís', 'Ísafjörður', 7.5, 200, TRUE, TRUE, FALSE, 'photos/hotel2.jpg', '15:30', '11:00'),
            ('Hilton Ís', 'Ísafjörður', 6, 4000, TRUE, TRUE, FALSE, 'photos/hotel1.jpg', '15:00', '11:00'),
            ('Spara Ís', 'Ísafjörður', 9.7, 20000, TRUE, TRUE, TRUE, 'photos/default.jpg', '14:00', '11:00');


INSERT INTO hotelRooms (hotelName, date, roomNum, capacity, pricePerNight)
          VALUES('Grand Rey', "2025-03-20", 1, 2, 12000),
          ('Grand Rey', "2025-03-20", 2, 2, 1200),
          ('Grand Rey', "2025-03-20", 3, 2, 18000),
          ('Grand Ak', "2025-03-20", 1, 2, 1110),
          ('Grand Ak', "2025-03-20", 2, 2, 121200),
          ('Grand Ak', "2025-03-20", 3, 2, 132100),
          ('Grand Ís', "2025-03-20", 1, 2, 31200),
          ('Grand Ís', "2025-03-20", 2, 2, 43124),
          ('Grand Ís', "2025-03-20", 3, 2, 5342),
          ('Grand Ís', "2025-03-21", 4, 2, 100),
          ('Hilton Ís', "2025-03-20", 1, 2, 31200),
          ('Hilton Ís', "2025-03-20", 2, 2, 43124),
          ('Hilton Ís', "2025-03-20", 3, 2, 5342),
          ('Hilton Ís', "2025-03-20", 4, 2, 1000),
          ('Spara Ís', "2025-03-20", 1, 2, 1000000),
          ('Spara Ís', "2025-03-20", 2, 2, 1000000),
          ('Spara Ís', "2025-03-20", 3, 2, 1000000),
          ('Spara Ís', "2025-03-20", 4, 2, 10000);

INSERT INTO booking (hotelName, username, roomNumber, totalPrice, checkInDate, checkOutDate, capacity, location, isRefundable)
          VALUES('testingHotel', 'jon', 404, 1, '2025-03-20', '2025-03-21', 1, 'here', 0);