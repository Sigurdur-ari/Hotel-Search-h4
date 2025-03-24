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
            ('Mývatn - Berjaya Iceland Hotels', 'Mývatnssveit', 9.0, 6671, TRUE, FALSE, TRUE, 'photos/berjaya.jpg', '14:00', '11:00'),
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
            ('Grand Hotel Reykjavík', 'Reykjavík', 8.9, 1000, TRUE, FALSE, FALSE, 'photos/grandrey.jpg', '15:00', '10:00'),
            ('Fosshotel Reykjavík',  'Reykjavík', 8.4, 800, TRUE, FALSE, TRUE, 'photos/fossrey.jpg', '15:30', '11:00'),
            ('Hilton Reykjavík', 'Reykjavík', 9.2, 850, TRUE, FALSE, FALSE, 'photos/hiltonrey.jpg', '16:00', '11:00'),
            ('Reykjavík Center Hotel', 'Reykjavík', 7.5, 400, TRUE, TRUE, TRUE, 'photos/centerrey.jpg', '15:00', '11:00'),
            ('Hotel Saga', 'Reykjavík', 8.0, 900, FALSE, FALSE, FALSE, 'photos/sagarey.jpg', '15:30', '10:00'),
            ('Oddsson Hotel', 'Reykjavík', 7.3, 750, TRUE, FALSE, TRUE, 'photos/oddsonrey.jpg', '16:00', '10:00'),
            ('Reykjavík Edition', 'Reykjavík', 9.2, 1200,  TRUE, FALSE, FALSE, 'photos/editionrey.jpg', '15:00', '10:00'),
            ('Hotel Kea', 'Akureyri', 8.7, 1300, TRUE, TRUE, FALSE, 'photos/hotelkea.jpg', '15:00', '11:00'),
            ('Icelandair Hotel Akureyri', 'Akureyri', 8.9, 1100, TRUE, TRUE, TRUE, 'photos/icelandairak.jpg', '15:30', '10:30'),
            ('Hotel Akureyri', 'Akureyri', 8.2, 650, FALSE, FALSE, FALSE, 'photos/hotelak.jpg', '15:00', '10:00'),
            ('Berjaya Akureyri Hotel', 'Akureyri', 8.5, 600, TRUE, TRUE, TRUE, 'photos/berjayaak.jpg', '15:30', '11:00'),
            ('Hotel Norðurland', 'Akureyri', 7.8, 550, TRUE, FALSE, FALSE, 'photos/nordurlandak.jpg', '16:00', '10:00'),
            ('Centrum Hotel Akureyri', 'Akureyri', 7.9, 600, TRUE, FALSE, TRUE, 'photos/centrumak.jpg', '16:00', '10:30'),
            ('Hotel Valaskjálf', 'Egilsstaðir', 8.2, 600, FALSE, TRUE, FALSE, 'photos/valaskjalf.jpg', '15:00', '11:00')
            ('Lake Hotel Egilsstaðir', 'Egilsstaðir', 9.0,1200, TRUE, TRUE, TRUE, 'photos/lakehotel.jpg', '15:30', '10:30'),
            ('Hótel Hallormsstaður', 'Egilsstaðir', 8.5, 900, TRUE, TRUE, TRUE, 'photos/hallormsstadur.jpg', '15:00', '10:00'),
            ('Eyvindará Guesthouse', 'Egilsstaðir', 8.0, 450, FALSE, TRUE, FALSE, 'photos/eyvindara.jpg', '15:30', '11:00'),
            ('Hotel Edda Egilsstaðir', 'Egilsstaðir', 7.8, 1500, TRUE, FALSE, FALSE, 'photos/eddaegils.jpg', '16:00', '10:00'),
            ('Hotel Vestmannaeyjar', 'Vestmannaeyjar', 8.5, 1050, TRUE, TRUE, TRUE, 'photos/hotelvestmannaeyjar.jpg', '15:00', '11:00'),
            ('Guesthouse Hamar', 'Vestmannaeyjar', 6.8, 450, FALSE, TRUE, FALSE, 'photos/guesthousehamar.jpg', '16:00', '10:00'),
            ('Hotel Eyjar', 'Vestmannaeyjar', 8.7, 980, TRUE, FALSE, TRUE, 'photos/hoteleyjar.jpg', '15:30', '10:30'),
            ('Hotel Selfoss', 'Selfoss', 8.6, 900, TRUE, TRUE, TRUE, 'photos/hotelselfoss.jpg', '15:00', '11:00'),
            ('Guesthouse Selfoss', 'Selfoss', 7.9, 650, FALSE, TRUE, FALSE, 'photos/guesthouseselfoss.jpg', '16:00', '10:00'),
            ('Landhótel', 'Selfoss', 8.8, 1230, TRUE, FALSE, TRUE, 'photos/landhotel.jpg', '15:30', '10:30'),
            ('Hotel South Coast', 'Selfoss', 8.4, 890, TRUE, TRUE, TRUE, 'photos/hotelsouthcoast.jpg', '15:00', '10:00');
        
            

INSERT INTO hotelRooms (hotelName, date, roomNum, capacity, pricePerNight)
          VALUES('Basalt Hotel', "2025-05-10", 101, 1, 15000),
          ('Basalt Hotel',"2025-05-10", 102, 2, 18000),
          ('Basalt Hotel', "2025-05-10", 103, 3, 21000),
          ('Basalt Hotel', "2025-05-17", 104, 4, 25000),
          ('Basalt Hotel', "2025-05-17", 105, 5, 28000),
          ('Basalt Hotel', "2025-05-24", 106, 6, 18000),
          ('Basalt Hotel', "2025-05-24", 101, 2, 12000),
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
          ('Hotel Hafnarfjall',"2025-05-10", 301, 2, 18000),
          ('Hotel Hafnarfjall', "2025-05-10", 302, 4, 21000),
          ('Hotel Hafnarfjall', "2025-05-17", 303, 4, 25000),
          ('Hotel Hafnarfjall', "2025-05-17", 304, 5, 28000),
          ('Hotel Hafnarfjall', "2025-05-24", 305, 1, 18000),
          ('Hotel Hafnarfjall', "2025-05-24", 1, 1, 12000),
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
          ('Hotel Isafjordur-Höfn',"2025-05-10", 112, 2, 20000),
          ('Hotel Isafjordur-Höfn', "2025-05-10", 113, 3, 21000),
          ('Hotel Isafjordur-Höfn', "2025-05-17", 114, 4, 25000),
          ('Hotel Isafjordur-Höfn', "2025-05-17", 115, 5, 28000),
          ('Hotel Isafjordur-Höfn', "2025-05-24", 116, 6, 29000),
          ('Hotel Isafjordur-Höfn', "2025-05-24", 117, 6, 29000),
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
          ('Harbour View Cottages', "2025-05-17", 105, 5, 28000),
          ('Harbour View Cottages', "2025-05-24", 107, 4, 18000),
          ('Harbour View Cottages', "2025-05-24", 108, 3, 12900),
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
          ('Hotel Selja',"2025-05-10", 102, 1, 18110),
          ('Hotel Selja', "2025-05-10", 103, 2, 21000),
          ('Hotel Selja', "2025-05-17", 104, 3, 25000),
          ('Hotel Selja', "2025-05-17", 105, 4, 28000),
          ('Hotel Selja', "2025-05-24", 107, 5, 30000),
          ('Hotel Selja', "2025-05-24", 108, 6, 32000),
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
          ('The Herring House',"2025-05-10", 102, 4, 18100),
          ('The Herring House', "2025-05-10", 103, 3, 17000),
          ('The Herring House', "2025-05-17", 104, 4, 18100),
          ('The Herring House', "2025-05-17", 105, 5, 28000),
          ('Mývatn - Berjaya Iceland Hotels', "2025-05-24", 107, 6, 39000),
          ('Mývatn - Berjaya Iceland Hotels', "2025-05-24", 108, 6, 39000),
          ('Mývatn - Berjaya Iceland Hotels', "2025-05-10", 208, 5, 36000),
          ('Mývatn - Berjaya Iceland Hotels', "2025-05-10", 209, 5, 36000),
          ('Mývatn - Berjaya Iceland Hotels', "2025-05-17", 211, 4, 33000),
          ('Mývatn - Berjaya Iceland Hotels', "2025-05-17", 213, 2, 30000),
          ('Grand Hotel Reykjavík', "2025-05-10", 101, 1, 15000),
          ('Grand Hotel Reykjavík', "2025-05-10", 102, 2, 18000),
          ('Grand Hotel Reykjavík', "2025-05-10", 103, 3, 21000),
          ('Grand Hotel Reykjavík', "2025-05-17", 104, 4, 25000),
          ('Grand Hotel Reykjavík', "2025-05-17", 105, 5, 28000),
          ('Grand Hotel Reykjavík', "2025-05-24", 106, 6, 32000),
          ('Grand Hotel Reykjavík', "2025-05-24", 107, 2, 18000),
          ('Grand Hotel Reykjavík', "2025-05-24", 108, 3, 21000),
          ('Fosshotel Reykjavík', "2025-05-10", 201, 1, 14000),
          ('Fosshotel Reykjavík', "2025-05-10", 202, 2, 17000),
          ('Fosshotel Reykjavík', "2025-05-10", 203, 3, 20000),
          ('Fosshotel Reykjavík', "2025-05-17", 204, 4, 24000),
          ('Fosshotel Reykjavík', "2025-05-17", 205, 5, 27000),
          ('Fosshotel Reykjavík', "2025-05-24", 206, 6, 30000),
          ('Fosshotel Reykjavík', "2025-05-24", 207, 2, 17000),
          ('Fosshotel Reykjavík', "2025-05-24", 208, 3, 20000),
          ('Hilton Reykjavík', "2025-05-10", 301, 1, 16000),
          ('Hilton Reykjavík', "2025-05-10", 302, 2, 19000),
          ('Hilton Reykjavík', "2025-05-10", 303, 3, 22000),
          ('Hilton Reykjavík', "2025-05-17", 304, 4, 26000),
          ('Hilton Reykjavík', "2025-05-17", 305, 5, 29000),
          ('Hilton Reykjavík', "2025-05-24", 306, 6, 34000),
          ('Hilton Reykjavík', "2025-05-24", 307, 2, 19000),
          ('Hotel Saga', "2025-05-10", 201, 1, 10000),
          ('Hotel Saga', "2025-05-17", 201, 1, 12000),
          ('Hotel Saga', "2025-05-24", 202, 2, 15000),
          ('Hotel Saga', "2025-05-10", 402, 2, 17000),
          ('Hotel Saga', "2025-05-10", 203, 4, 24000),
          ('Hotel Saga', "2025-05-17", 303, 4, 24000),
          ('Hotel Saga', "2025-05-24", 304, 4, 24000),
          ('Oddsson Hotel', "2025-05-10", 101, 1, 12000),
          ('Oddsson Hotel', "2025-05-24", 102, 1, 12000),
          ('Oddsson Hotel', "2025-05-17", 103, 2, 15000),
          ('Oddsson Hotel', "2025-05-10", 105, 2, 15000),
          ('Oddsson Hotel', "2025-05-24", 105, 2, 18000),
          ('Oddsson Hotel', "2025-05-17", 201, 4, 23000),
          ('Oddsson Hotel', "2025-05-10", 202, 6, 27000),
          ('Reykjavík Center Hotel', "2025-05-10", 105, 2, 16000),
          ('Reykjavík Center Hotel', "2025-05-24", 201, 2, 17000),
          ('Reykjavík Center Hotel', "2025-05-17", 202, 3, 20000),
          ('Reykjavík Center Hotel', "2025-05-10", 203, 3, 20000),
          ('Reykjavík Center Hotel', "2025-05-24", 301, 4, 25000),
          ('Reykjavík Center Hotel', "2025-05-10", 401, 4, 28000),
          ('Reykjavík Center Hotel', "2025-05-17", 402, 6, 32000),
          ('Reykjavík Edition', "2025-05-17", 101, 1, 25000),
          ('Reykjavík Edition', "2025-05-24", 102, 1, 26000),
          ('Reykjavík Edition', "2025-05-10", 201, 2, 30000),
          ('Reykjavík Edition', "2025-05-17", 202, 2, 31000),
          ('Reykjavík Edition', "2025-05-24", 301, 3, 35000),
          ('Reykjavík Edition', "2025-05-10", 401, 4, 40000),
          ('Reykjavík Edition', "2025-05-17", 501, 4, 42000),
          ('Reykjavík Edition', "2025-05-24", 501, 6, 42000),
          ('Hotel Kea', "2025-05-10", 401, 1, 13000),
          ('Hotel Kea', "2025-05-10", 402, 2, 16000),
          ('Hotel Kea', "2025-05-10", 403, 3, 19000),
          ('Hotel Kea', "2025-05-17", 404, 4, 23000),
          ('Hotel Kea', "2025-05-17", 405, 5, 27000),
          ('Hotel Kea', "2025-05-24", 406, 6, 31000),
          ('Hotel Kea', "2025-05-24", 407, 2, 16000),
          ('Hotel Kea', "2025-05-24", 408, 3, 19000),
          ('Icelandair Hotel Akureyri', "2025-05-24", 101, 1, 19000),
          ('Icelandair Hotel Akureyri', "2025-05-10", 102, 2, 24000),
          ('Icelandair Hotel Akureyri', "2025-05-17", 201, 2, 27000),
          ('Icelandair Hotel Akureyri', "2025-05-24", 202, 3, 30000),
          ('Icelandair Hotel Akureyri', "2025-05-10", 301, 4, 34000),
          ('Icelandair Hotel Akureyri', "2025-05-17", 401, 4, 34000),
          ('Icelandair Hotel Akureyri', "2025-05-24", 402, 5, 35000),
          ('Icelandair Hotel Akureyri', "2025-05-10", 403, 5, 37000),
          ('Icelandair Hotel Akureyri', "2025-05-17", 404, 6, 37000),
          ('Hotel Akureyri', "2025-05-17", 101, 1, 17000),
          ('Hotel Akureyri', "2025-05-17", 102, 2, 21000),
          ('Hotel Akureyri', "2025-05-24", 201, 2, 24000),
          ('Hotel Akureyri', "2025-05-10", 202, 3, 27000),
          ('Hotel Akureyri', "2025-05-17", 203, 3, 27000),
          ('Hotel Akureyri', "2025-05-17", 301, 4, 31000),
          ('Hotel Akureyri', "2025-05-24", 302, 5, 31000),
          ('Hotel Akureyri', "2025-05-10", 303, 6, 31000),
          ('Berjaya Akureyri Hotel', "2025-05-10", 101, 1, 17500),
          ('Berjaya Akureyri Hotel', "2025-05-17", 102, 1, 22000),
          ('Berjaya Akureyri Hotel', "2025-05-24", 201, 2, 26000),
          ('Berjaya Akureyri Hotel', "2025-05-10", 202, 2, 29000),
          ('Berjaya Akureyri Hotel', "2025-05-17", 301, 3, 33000),
          ('Berjaya Akureyri Hotel', "2025-05-10", 401, 4, 36000),
          ('Berjaya Akureyri Hotel', "2025-05-24", 403, 2, 33000),
          ('Hotel Norðurland', "2025-05-24", 101, 1, 16000),
          ('Hotel Norðurland', "2025-05-10", 102, 2, 20000),
          ('Hotel Norðurland', "2025-05-17", 201, 2, 23000),
          ('Hotel Norðurland', "2025-05-24", 202, 3, 26000),
          ('Hotel Norðurland', "2025-05-10", 301, 4, 30000),
          ('Hotel Norðurland', "2025-05-17", 302, 4, 30000),
          ('Hotel Norðurland', "2025-05-24", 303, 5, 32000),
          ('Centrum Hotel Akureyri', "2025-05-17", 101, 1, 16500),
          ('Centrum Hotel Akureyri', "2025-05-24", 102, 2, 21000),
          ('Centrum Hotel Akureyri', "2025-05-17", 201, 2, 24000),
          ('Centrum Hotel Akureyri', "2025-05-17", 202, 3, 27000),
          ('Centrum Hotel Akureyri', "2025-05-10", 301, 4, 31000),
          ('Centrum Hotel Akureyri', "2025-05-10", 401, 6, 35000),
          ('Centrum Hotel Akureyri', "2025-05-24", 402, 6, 35000),
          ('Hotel Valaskjálf', "2025-05-10", 101, 1, 15000),
          ('Hotel Valaskjálf', "2025-05-10", 102, 2, 18000),
          ('Hotel Valaskjálf', "2025-05-17", 103, 3, 21000),
          ('Hotel Valaskjálf', "2025-05-24", 104, 3, 25000),
          ('Hotel Valaskjálf', "2025-05-24", 105, 4, 28000),
          ('Hotel Valaskjálf', "2025-05-24", 205, 5, 28000),
          ('Hotel Valaskjálf', "2025-05-17", 206, 5, 28000),
          ('Lake Hotel Egilsstaðir', "2025-05-17", 201, 1, 20000),
          ('Lake Hotel Egilsstaðir', "2025-05-24", 202, 1, 20000),
          ('Lake Hotel Egilsstaðir', "2025-05-10", 203, 3, 29000),
          ('Lake Hotel Egilsstaðir', "2025-05-17", 204, 4, 32000),
          ('Lake Hotel Egilsstaðir', "2025-05-10", 205, 5, 35000),
          ('Lake Hotel Egilsstaðir', "2025-05-10", 206, 6, 36000),
          ('Lake Hotel Egilsstaðir', "2025-05-24", 206, 6, 38000),
          ('Hótel Hallormsstaður', "2025-05-10", 401, 1, 16500),
          ('Hótel Hallormsstaður', "2025-05-24", 502, 2, 20000),
          ('Hótel Hallormsstaður', "2025-05-24", 603, 4, 24000),
          ('Hótel Hallormsstaður', "2025-05-10", 304, 4, 28000),
          ('Hótel Hallormsstaður', "2025-05-17", 205, 5, 31000),
          ('Hótel Hallormsstaður', "2025-05-17", 106, 6, 35000),
          ('Hótel Hallormsstaður', "2025-05-17", 207, 2, 22000),
          ('Eyvindará Guesthouse', "2025-05-24", 101, 1, 14000),
          ('Eyvindará Guesthouse', "2025-05-10", 202, 2, 16500),
          ('Eyvindará Guesthouse', "2025-05-17", 303, 3, 19000),
          ('Eyvindará Guesthouse', "2025-05-10", 404, 4, 22000),
          ('Eyvindará Guesthouse', "2025-05-24", 105, 2, 17500),
          ('Eyvindará Guesthouse', "2025-05-17", 206, 4, 26000),
          ('Eyvindará Guesthouse', "2025-05-24", 307, 6, 29000),
          ('Hotel Edda Egilsstaðir', "2025-05-10", 501, 1, 15500),
          ('Hotel Edda Egilsstaðir', "2025-05-17", 502, 1, 15500)
          ('Hotel Edda Egilsstaðir', "2025-05-17", 402, 2, 18500),
          ('Hotel Edda Egilsstaðir', "2025-05-24", 303, 3, 21000),
          ('Hotel Edda Egilsstaðir', "2025-05-17", 204, 4, 25000),
          ('Hotel Edda Egilsstaðir', "2025-05-10", 105, 5, 29000),
          ('Hotel Edda Egilsstaðir', "2025-05-10", 306, 6, 32000),
          ('Hotel Edda Egilsstaðir', "2025-05-24", 207, 2, 20000),
          ('Hotel Vestmannaeyjar', "2025-05-10", 101, 1, 18000),
          ('Hotel Vestmannaeyjar', "2025-05-17", 202, 2, 22000),
          ('Hotel Vestmannaeyjar', "2025-05-24", 303, 3, 25000),
          ('Hotel Vestmannaeyjar', "2025-05-10", 404, 4, 29000),
          ('Hotel Vestmannaeyjar', "2025-05-17", 105, 2, 20000),
          ('Hotel Vestmannaeyjar', "2025-05-24", 206, 5, 32000),
          ('Hotel Vestmannaeyjar', "2025-05-17", 307, 6, 35000)
          ('Guesthouse Hamar', "2025-05-24", 101, 1, 14000),
          ('Guesthouse Hamar', "2025-05-10", 202, 2, 16000),
          ('Guesthouse Hamar', "2025-05-17", 303, 3, 19000),
          ('Guesthouse Hamar', "2025-05-24", 404, 4, 22000),
          ('Guesthouse Hamar', "2025-05-10", 105, 2, 17000),
          ('Guesthouse Hamar', "2025-05-17", 206, 5, 25000),
          ('Guesthouse Hamar', "2025-05-24", 307, 6, 28000),
          ('Hotel Eyjar', "2025-05-10", 501, 1, 17500),
          ('Hotel Eyjar', "2025-05-17", 402, 2, 21000),
          ('Hotel Eyjar', "2025-05-24", 303, 3, 24000),
          ('Hotel Eyjar', "2025-05-10", 204, 4, 28000),
          ('Hotel Eyjar', "2025-05-17", 105, 5, 30000),
          ('Hotel Eyjar', "2025-05-24", 306, 6, 33000),
          ('Hotel Eyjar', "2025-05-17", 207, 2, 22000),
          ('Hotel Selfoss', "2025-05-10", 101, 1, 19000),
          ('Hotel Selfoss', "2025-05-17", 202, 2, 23000),
          ('Hotel Selfoss', "2025-05-24", 303, 3, 26000),
          ('Hotel Selfoss', "2025-05-10", 404, 4, 30000),
          ('Hotel Selfoss', "2025-05-17", 105, 2, 22000),
          ('Hotel Selfoss', "2025-05-24", 206, 5, 34000),
          ('Hotel Selfoss', "2025-05-17", 307, 6, 37000),
          ('Guesthouse Selfoss', "2025-05-24", 101, 1, 15000),
          ('Guesthouse Selfoss', "2025-05-10", 202, 2, 18000),
          ('Guesthouse Selfoss', "2025-05-17", 303, 3, 21000),
          ('Guesthouse Selfoss', "2025-05-24", 404, 4, 24000),
          ('Guesthouse Selfoss', "2025-05-10", 105, 2, 19000),
          ('Guesthouse Selfoss', "2025-05-17", 206, 5, 27000),
          ('Guesthouse Selfoss', "2025-05-24", 307, 6, 30000),
          ('Landhótel', "2025-05-10", 501, 1, 20000),
          ('Landhótel', "2025-05-17", 402, 2, 24000),
          ('Landhótel', "2025-05-24", 303, 3, 27000),
          ('Landhótel', "2025-05-10", 204, 4, 31000),
          ('Landhótel', "2025-05-17", 105, 5, 35000),
          ('Landhótel', "2025-05-24", 306, 6, 38000),
          ('Landhótel', "2025-05-17", 207, 2, 23000),
          ('Hotel South Coast', "2025-05-10", 401, 1, 18500),
          ('Hotel South Coast', "2025-05-17", 502, 2, 22000),
          ('Hotel South Coast', "2025-05-24", 603, 3, 25000),
          ('Hotel South Coast', "2025-05-10", 304, 4, 29000),
          ('Hotel South Coast', "2025-05-17", 205, 5, 32000),
          ('Hotel South Coast', "2025-05-24", 106, 6, 36000),
          ('Hotel South Coast', "2025-05-17", 207, 2, 24000);

INSERT INTO booking (hotelName, username, roomNumber, totalPrice, checkInDate, checkOutDate, capacity, location, isRefundable)
          VALUES('testingHotel', 'jon', 404, 1, '2025-03-20', '2025-03-21', 1, 'here', 0);