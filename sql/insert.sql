--Mock test insert data
INSERT INTO hotels (name, location, rating, ratingCount,
                    accessibility, pets, refundable, photoURL, checkInTime, checkOutTime)
            VALUES ('Basalt Hotel', 'Borgarnes', 9.5, 1144, TRUE, FALSE, FALSE, 'photos/borgarnes.jpg', '15:00', '11:00'),
            ('Hotel Hafnarfjall', 'Borgarnes', 8.2, 144, TRUE, FALSE, FALSE, 'photos/Hafnarfjall.jpg', '15:00', '11:00'),
            ('Hotel Hamar', 'Borgarnes', 8.8, 14299, TRUE, FALSE, TRUE, 'photos/hamar.jpg', '14:00', '12:00'),
            ('Konvin Hotel', 'Keflavík', 7.1, 14299, TRUE, FALSE, TRUE, 'photos/konvin.jpg', '16:00', '12:00'),
            ('Aurora Hotel', 'Keflavík', 8.3, 1249, TRUE, FALSE, TRUE, 'photos/keflavík.jpg', '14:00', '12:00'),
            ('Hotel Katla', 'Vík', 7.5, 13443, TRUE, TRUE, FALSE, 'photos/vík.jpg', '15:30', '11:00'),
            ('Hotel Vík í Mýrdal', 'Vík', 7.9, 3443, TRUE, TRUE, FALSE, 'photos/víkimýrdal.jpg', '13:30', '11:00'),
            ('Sel - Hotel Mývatn', 'Mývatnssveit', 6.8, 8976, FALSE, TRUE, FALSE, 'photos/myvatn.jpg', '15:00', '12:00'),
            ('Fosshótel Mývatn', 'Mývatnssveit', 9.3, 676, FALSE, TRUE, FALSE, 'photos/fosshotelmyvatnt.jpg', '10:00', '12:00')
            ('Mývatn - Berjaya Iceland Hotels', 'Mývatnssveit', 9.0, 6671, TRUE, FALSE, TRUE, 'photos/berjaya.jpg', '14:00', '11:00'),,
            ('Hotel Isafjordur-Torg', 'Ísafjörður', 8, 2600, TRUE, TRUE, TRUE, 'photos/isafjordur.jpg', '14:00', '11:00'),   
            ('Hotel Isafjordur-Höfn', 'Ísafjörður', 8, 9856, TRUE, TRUE, TRUE, 'photos/horn.jpg', '14:00', '11:00'),
            ('Hotel Mikligardur', 'Sauðárkrókur', 7.5, 2230, FALSE, FALSE, FALSE, 'photos/mikligardur.jpg', '15:00', '12:00'),
            ('Helluland Guesthouse', 'Sauðárkrókur', 9.2, 897, FALSE, TRUE, TRUE, 'photos/helluland.jpg', '14:30', '11:00'),
            ('The Hill Hotel', 'Flúðir', 8.2, 765, TRUE, FALSE, FALSE, 'photos/fludir.jpg', '13:30', '11:00'),
            ('Klettar Tower Iceland', 'Flúðir', 9.1, 1190, TRUE, FALSE, TRUE, 'photos/tower.jpg', '14:00', '12:00'),
            ('Harbour View Cottages', 'Grindavík', 8.7, 22456, TRUE, TRUE, FALSE, 'photos/cottages.jpg', '12:00', '11:00'),
            ('Converted Water Tower', 'Grindavík', 9.0, 9321, TRUE, TRUE, TRUE, 'photos/watertower.jpg', '12:30', '12:00'),
            ('Hotel Búdir', 'Snæfellsnes', 8.9, 2341, FALSE, FALSE, FALSE, 'photos/budir.jpg', '14:00', '11:00'),
            ('Kambur Cottages', 'Snæfellsnes', 9.0, 8754, TRUE, FALSE, FALSE, 'photos/kambur.jpg', '12:00', '11:00'),
            ('Hotel Selja', 'Hvolsvöllur', 6.6, 443, TRUE, FALSE, TRUE, 'photos/selja.jpg', '13:00', '11:00'),
            ('Hotel Eyjafjallajökull', 'Hvolsvöllur', 8.4, 780, TRUE, TRUE, FALSE, 'photos/eyjafjallajökull.jpg', '14:30', '12:00'),
            ('Seljalandsfoss Horizons', 'Hvolsvöllur', 9.4, 1456, FALSE, TRUE, FALSE, 'photos/horizons.jpg', '14:00', '12:00'),
            ('Siglo Hotel by Keahotels', 'Siglufjörður', 7.4, 17899, TRUE, TRUE, TRUE, 'photos/siglo.jpg', '15:00', '12:00'),
            ('The Herring House', 'Siglufjörður', 9.6, 9876, FALSE, FALSE, FALSE, 'photos/herring.jpg', '14:00', '13:00'),
        
            

INSERT INTO hotelRooms (hotelName, date, roomNum, capacity, pricePerNight)
          VALUES('Basalt Hotel', "2025-05-10", 101, 1, 15000),
          ('Basalt Hotel',"2025-05-10", 102, 2, 18000)
          ('Basalt Hotel', "2025-05-10", 103, 3, 21000)
          ('Basalt Hotel', "2025-05-17", 104, 4, 25000)
          ('Basalt Hotel', "2025-05-17", 105, 5, 28000)
          ('Basalt Hotel', "2025-05-24", 106, 6, 18000)
          ('Basalt Hotel', "2025-05-24", 101, 2, 12000)
          ('Aurora Hotel', "2025-05-10", 201, 1, 11200),
          ('Aurora Hotel', "2025-05-10", 202, 3, 11500),
          ('Aurora Hotel', "2025-05-17", 203, 4, 11600),
          ('Aurora Hotel', "2025-05-17", 204, 2, 11200),
          ('Aurora Hotel', "2025-05-17", 205, 5, 11200),
          ('Aurora Hotel', "2025-05-24", 206, 6, 11200),
          ('Aurora Hotel', "2025-05-24", 207, 4, 11200),
          ('Hotel Katla', "2025-05-10", 301, 2, 18000),
          ('Hotel Katla', "2025-05-10", 302, 1, 18000),
          ('Hotel Katla', "2025-05-17", 303, 5, 18000),
          ('Hotel Katla', "2025-05-17", 304, 6, 18000),
          ('Hotel Katla', "2025-05-24", 305, 2, 18000),
          ('Hotel Katla', "2025-05-24", 306, 3, 18000),
          ('Hotel Katla', "2025-05-24", 307, 1, 18000),
          ('Sel - Hotel Mývatn', "2025-05-10", 101, 1, 22110),
          ('Sel - Hotel Mývatn', "2025-05-10", 102, 2, 23310),
          ('Sel - Hotel Mývatn', "2025-05-17", 103, 3, 24110),
          ('Sel - Hotel Mývatn', "2025-05-17", 104, 4, 25110),
          ('Sel - Hotel Mývatn', "2025-05-24", 105, 5, 26110),
          ('Sel - Hotel Mývatn', "2025-05-24", 106, 6, 27110),
          ('Sel - Hotel Mývatn', "2025-05-24", 107, 2, 28110),
          ('Hotel Isafjordur-Torg', "2025-05-10", 110, 6, 23110),
          ('Hotel Isafjordur-Torg', "2025-05-10", 111, 4, 16110),
          ('Hotel Isafjordur-Torg', "2025-05-10", 112, 2, 11190),
          ('Hotel Isafjordur-Torg', "2025-05-17", 113, 5, 18110),
          ('Hotel Isafjordur-Torg', "2025-05-17", 114, 3, 16110),
          ('Hotel Isafjordur-Torg', "2025-05-24", 115, 1, 11110),
          ('Hotel Hafnarfjall',"2025-05-10", 301, 2, 18000)
          ('Hotel Hafnarfjall', "2025-05-10", 302, 4, 21000)
          ('Hotel Hafnarfjall', "2025-05-17", 303, 4, 25000)
          ('Hotel Hafnarfjall', "2025-05-17", 304, 5, 28000)
          ('Hotel Hafnarfjall', "2025-05-24", 305, 1, 18000)
          ('Hotel Hafnarfjall', "2025-05-24", 1, 1, 12000)
          ('Hotel Hamar', "2025-05-10", 210, 3, 18200),
          ('Hotel Hamar', "2025-05-10", 211, 2, 15000),
          ('Hotel Hamar', "2025-05-17", 212, 2, 15000),
          ('Hotel Hamar', "2025-05-17", 213, 1, 12000),
          ('Hotel Hamar', "2025-05-17", 214, 1, 12100),
          ('Hotel Hamar', "2025-05-24", 215, 4, 12100),
          ('Konvin Hotel', "2025-05-24", 201, 2, 11200),
          ('Konvin Hotel', "2025-05-10", 202, 2, 18000),
          ('Konvin Hotel', "2025-05-10", 203, 6, 25000),
          ('Konvin Hotel', "2025-05-17", 204, 4, 24000),
          ('Konvin Hotel', "2025-05-17", 205, 3, 23000),
          ('Konvin Hotel', "2025-05-24", 206, 1, 18000),
          ('Konvin Hotel', "2025-05-24", 207, 1, 18000),
          ('Hotel Vík í Mýrdal', "2025-05-24", 101, 1, 18000),
          ('Hotel Vík í Mýrdal', "2025-05-10", 102, 2, 21110),
          ('Hotel Vík í Mýrdal', "2025-05-10", 103, 3, 30110),
          ('Hotel Vík í Mýrdal', "2025-05-17", 104, 3, 30110),
          ('Hotel Vík í Mýrdal', "2025-05-17", 105, 6, 43110),
          ('Fosshótel Mývatn', "2025-05-24", 101, 2, 12110),
          ('Fosshótel Mývatn', "2025-05-24", 102, 2, 12110),
          ('Fosshótel Mývatnn', "2025-05-24", 103, 3, 16110),
          ('Fosshótel Mývatn', "2025-05-10", 104, 4, 18110),
          ('Fosshótel Mývatn', "2025-05-10", 105, 4, 18110),
          ('Fosshótel Mývatn', "2025-05-10", 106, 5, 19110),
          ('Fosshótel Mývatn', "2025-05-17", 107, 5, 19110),
          ('Fosshótel Mývatn', "2025-05-17", 108, 6, 20010),
          ('Hotel Isafjordur-Höfn', "2025-05-24", 111, 1, 19000),
          ('Hotel Isafjordur-Höfn',"2025-05-10", 112, 2, 20000)
          ('Hotel Isafjordur-Höfn', "2025-05-10", 113, 3, 21000)
          ('Hotel Isafjordur-Höfn', "2025-05-17", 114, 4, 25000)
          ('Hotel Isafjordur-Höfn', "2025-05-17", 115, 5, 28000)
          ('Hotel Isafjordur-Höfn', "2025-05-24", 116, 6, 29000)
          ('Hotel Isafjordur-Höfn', "2025-05-24", 117, 6, 29000)
          ('Hotel Mikligardur', "2025-05-10", 201, 1, 15200),
          ('Hotel Mikligardur', "2025-05-10", 202, 2, 17900),
          ('Hotel Mikligardur', "2025-05-17", 203, 3, 18900),
          ('Hotel Mikligardur', "2025-05-17", 204, 4, 19000),
          ('Hotel Mikligardur', "2025-05-17", 205, 5, 20100),
          ('Hotel Mikligardur', "2025-05-24", 206, 6, 22000),
          ('Helluland Guesthouse', "2025-05-24", 1, 1, 12000),
          ('Helluland Guesthouse', "2025-05-10", 2, 1, 12000),
          ('Helluland Guesthouse', "2025-05-10", 3, 2, 14000),
          ('Helluland Guesthouse', "2025-05-17", 4, 2, 14000),
          ('Helluland Guesthouse', "2025-05-17", 5, 3, 13000),
          ('Helluland Guesthouse', "2025-05-24", 6, 4, 14000),
          ('Helluland Guesthouse', "2025-05-24", 7, 6, 18000),
          ('The Hill Hotel', "2025-05-24", 301, 6, 28000),
          ('The Hill Hotel', "2025-05-10", 111, 5, 21110),
          ('The Hill Hotel', "2025-05-10", 123, 5, 21110),
          ('The Hill Hotel', "2025-05-17", 143, 4, 20110),
          ('The Hill Hotell', "2025-05-17", 444, 2, 16110),
          ('The Hill Hotel', "2025-05-24", 155, 3, 17110),
          ('The Hill Hotel', "2025-05-24", 122, 2, 16110),
          ('Klettar Tower Iceland', "2025-05-24", 11, 1, 3110),
          ('Klettar Tower Iceland', "2025-05-10", 12, 2, 31110),
          ('Klettar Tower Iceland', "2025-05-10", 13, 3, 31110),
          ('Klettar Tower Iceland', "2025-05-10", 14, 4, 31110),
          ('Klettar Tower Iceland', "2025-05-17", 15, 5, 31110),
          ('Klettar Tower Iceland', "2025-05-17", 16, 6, 31110),
          ('Klettar Tower Iceland', "2025-05-24", 17, 7, 31110),
          ('Harbour View Cottages', "2025-05-17", 105, 5, 28000)
          ('Harbour View Cottages', "2025-05-24", 107, 4, 18000)
          ('Harbour View Cottages', "2025-05-24", 108, 3, 12900)
          ('Harbour View Cottages', "2025-05-10", 201, 2, 12200),
          ('Harbour View Cottages', "2025-05-10", 202, 1, 11200),
          ('Harbour View Cottages', "2025-05-17", 203, 6, 24200),
          ('Harbour View Cottages', "2025-05-17", 204, 5, 2300),
          ('Harbour View Cottages', "2025-05-17", 205, 4, 2200),
          ('Converted Water Tower', "2025-05-24", 206, 3, 21200),
          ('Converted Water Tower', "2025-05-24", 207, 2, 12200),
          ('Converted Water Tower', "2025-05-10", 308, 2, 12000),
          ('Converted Water Tower', "2025-05-17", 312, 2, 12000),
          ('Converted Water Tower', "2025-05-17", 314, 1, 11800),
          ('Converted Water Tower', "2025-05-24", 315, 1, 11800),
          ('Hotel Búdir', "2025-05-24", 311, 2, 18000),
          ('Hotel Búdir', "2025-05-24", 313, 2, 18000),
          ('Hotel Búdir', "2025-05-10", 114, 5, 24010),
          ('Hotel Búdir', "2025-05-10", 115, 4, 22110),
          ('Hotel Búdir', "2025-05-17", 116, 3, 21910),
          ('Hotel Búdir', "2025-05-17", 134, 4, 22110),
          ('Hotel Búdir', "2025-05-24", 145, 6, 27110),
          ('Kambur Cottages', "2025-05-24", 111, 1, 11110),
          ('Kambur Cottages', "2025-05-24", 112, 1, 11110),
          ('Kambur Cottages', "2025-05-10", 113, 4, 21110),
          ('Kambur Cottages', "2025-05-10", 114, 4, 21110),
          ('Kambur Cottages', "2025-05-10", 115, 4, 2110),
          ('Kambur Cottages', "2025-05-17", 116, 6, 30110),
          ('Kambur Cottages', "2025-05-17", 117, 6, 30110),
          ('Hotel Selja', "2025-05-24", 101, 2, 18110),
          ('Hotel Selja',"2025-05-10", 102, 1, 18110)
          ('Hotel Selja', "2025-05-10", 103, 2, 21000)
          ('Hotel Selja', "2025-05-17", 104, 3, 25000)
          ('Hotel Selja', "2025-05-17", 105, 4, 28000)
          ('Hotel Selja', "2025-05-24", 107, 5, 30000)
          ('Hotel Selja', "2025-05-24", 108, 6, 32000)
          ('Hotel Selja', "2025-05-10", 201, 1, 21000),
          ('Hotel Eyjafjallajökull', "2025-05-10", 223, 1, 11200),
          ('Hotel Eyjafjallajökull', "2025-05-17", 224, 1, 11200),
          ('Hotel Eyjafjallajökull', "2025-05-17", 225, 2, 12200),
          ('Hotel Eyjafjallajökull', "2025-05-17", 226, 2, 12200),
          ('Hotel Eyjafjallajökull', "2025-05-24", 227, 3, 13200),
          ('Hotel Eyjafjallajökull', "2025-05-24", 228, 3, 13200),
          ('Hotel Eyjafjallajökull', "2025-05-10", 341, 4, 14900),
          ('Seljalandsfoss Horizons', "2025-05-10", 342, 4, 35000),
          ('Seljalandsfoss Horizons', "2025-05-17", 343, 5, 38000),
          ('Seljalandsfoss Horizons', "2025-05-17", 344, 5, 38000),
          ('Seljalandsfoss Horizons', "2025-05-24", 345, 6, 40000),
          ('Seljalandsfoss Horizons', "2025-05-24", 346, 6, 40000),
          ('Seljalandsfoss Horizons', "2025-05-24", 347, 1, 18100),
          ('Seljalandsfoss Horizons', "2025-05-10", 148, 1, 18110),
          ('Seljalandsfoss Horizons', "2025-05-10", 149, 2, 19110),
          ('Siglo Hotel by Keahotels', "2025-05-17", 111, 2, 15000),
          ('Siglo Hotel by Keahotels', "2025-05-17", 112, 3, 17111),
          ('Siglo Hotel by Keahotels', "2025-05-24", 113, 3, 17111),
          ('Siglo Hotel by Keahotels', "2025-05-24", 114, 4, 18111),
          ('Siglo Hotel by Keahotels', "2025-05-24", 115, 4, 18111),
          ('Siglo Hotel by Keahotels', "2025-05-10", 116, 5, 19111),
          ('Siglo Hotel by Keahotels', "2025-05-10", 117, 5, 19111),
          ('The Herring House', "2025-05-10", 12, 1, 12300),
          ('The Herring House', "2025-05-17", 13, 2, 14100),
          ('The Herring House', "2025-05-17", 14, 2, 14100),
          ('The Herring House', "2025-05-24", 15, 4, 18100),
          ('The Herring House',"2025-05-10", 102, 4, 18100)
          ('The Herring House', "2025-05-10", 103, 3, 17000)
          ('The Herring House', "2025-05-17", 104, 4, 18100)
          ('The Herring House', "2025-05-17", 105, 5, 28000)
          ('Mývatn - Berjaya Iceland Hotels', "2025-05-24", 107, 6, 39000)
          ('Mývatn - Berjaya Iceland Hotels', "2025-05-24", 108, 6, 39000)
          ('Mývatn - Berjaya Iceland Hotels', "2025-05-10", 208, 5, 36000),
          ('Mývatn - Berjaya Iceland Hotels', "2025-05-10", 209, 5, 36000),
          ('Mývatn - Berjaya Iceland Hotels', "2025-05-17", 211, 4, 33000),
          ('Mývatn - Berjaya Iceland Hotels', "2025-05-17", 213, 2, 30000),


INSERT INTO booking (hotelName, username, roomNumber, totalPrice, checkInDate, checkOutDate, capacity, location, isRefundable)
          VALUES('testingHotel', 'jon', 404, 1, '2025-03-20', '2025-03-21', 1, 'here', 0);