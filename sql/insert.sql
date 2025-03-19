--Mock test insert data
INSERT INTO hotels (name, location, rating, ratingCount,
                    accessibility, pets, refundable, photoURL, checkInTime, checkOutTime)
            VALUES ('Basalt Hotel', 'Borgarnes', 9.5, 1144, TRUE, FALSE, FALSE, 'photos/borgarnes.jpg', '15:00', '11:00'),
            ('Aurora Hotel', 'Keflavík', 8.3, 14.299, TRUE, FALSE, TRUE, 'photos/keflavík.jpg', '14:00', '12:00'),
            ('Hotel Katla', 'Vík', 7.5, 3443, TRUE, TRUE, FALSE, 'photos/vík.jpg', '15:30', '11:00'),
            ('Sel - Hotel Mývatn', 'Mývatnssveit', 6.8, 8976, FALSE, TRUE, FALSE, 'photos/myvatn.jpg', '15:00', '12:00'),
            ('Hotel Isafjordur', 'Ísafjörður', 8, 671, TRUE, TRUE, TRUE, 'photos/isafjordur.jpg', '14:00', '11:00');


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