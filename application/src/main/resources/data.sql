--- CATEGORIES ---
insert into CATEGORY (ID, NAME,  WEIGHT  ) values (1, 'Abatz', 1);
insert into CATEGORY (ID, NAME,  WEIGHT  ) values (2, 'Gevee', 2);
insert into CATEGORY (ID, NAME,  WEIGHT  ) values (3, 'Edgepulse', 3);
insert into CATEGORY (ID, NAME,  WEIGHT  ) values (4, 'Skajo', 4);
insert into CATEGORY (ID, NAME,  WEIGHT  ) values (5, 'Topicstorm', 5);

--- FEEDS ---
insert into FEED (ID, DESCRIPTION, LINK, TITLE) values (1, 'Short lasting unilateral neuralgiform headache with conjunctival injection and tearing (SUNCT)', 'https://bloglines.com/morbi/ut.aspx', '9/11');
insert into FEED (ID, DESCRIPTION, LINK, TITLE) values (2, 'Child physical abuse, suspected', 'https://cocolog-nifty.com/ut/at.aspx', 'Stealth');
insert into FEED (ID, DESCRIPTION, LINK, TITLE) values (3, 'Ulcerative (chronic) rectosigmoiditis with complications', 'https://alibaba.com/integer/ac/leo/pellentesque/ultrices/mattis/odio.json', 'The Dancer');
insert into FEED (ID, DESCRIPTION, LINK, TITLE) values (4, 'Traumatic hemorrhage of cerebrum, unspecified, with loss of consciousness of 31 minutes to 59 minutes, sequela', 'http://apple.com/in/tempus/sit/amet/sem.xml', 'Consequences of Love, The (Conseguenze dell''amore, Le)');
insert into FEED (ID, DESCRIPTION, LINK, TITLE) values (5, 'Anterior subluxation of right ulnohumeral joint, initial encounter', 'https://businessinsider.com/placerat/praesent/blandit.jsp', 'Junkopia');
insert into FEED (ID, DESCRIPTION, LINK, TITLE) values (6, 'Greenstick fracture of shaft of unspecified ulna, initial encounter for closed fracture', 'https://youtube.com/ligula/pellentesque.jpg', 'Mooz-lum');
insert into FEED (ID, DESCRIPTION, LINK, TITLE) values (7, 'Complete lesion of thoracic spinal cord', 'https://rakuten.co.jp/amet/justo/morbi/ut/odio/cras.png', '3096 Days');
insert into FEED (ID, DESCRIPTION, LINK, TITLE) values (8, 'Pedestrian on foot injured in collision with car, pick-up truck or van in traffic accident, subsequent encounter', 'http://bloglovin.com/posuere/cubilia/curae/donec.jsp', 'Nancy Drew: Detective');
insert into FEED (ID, DESCRIPTION, LINK, TITLE) values (9, 'Nondisplaced midcervical fracture of left femur, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with nonunion', 'http://npr.org/orci/nullam/molestie.jpg', 'Man Who Couldn''t Say No, The (Mies joka ei osannut sanoa EI)');
insert into FEED (ID, DESCRIPTION, LINK, TITLE) values (10, 'Partially resolved traumatic cataract, bilateral', 'http://yellowpages.com/molestie/lorem.js', 'God Said ''Ha!''');

--- FEEDS_CATEGORIES ---

insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (8, 3);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (10, 5);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (9, 4);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (1, 3);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (5, 5);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (6, 1);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (9, 5);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (1, 4);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (3, 5);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (7, 5);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (10, 4);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (9, 2);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (10, 3);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (5, 4);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (4, 3);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (5, 2);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (1, 1);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (3, 3);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (9, 3);
insert into FEED_CATEGORY  (FEED_ID, CATEGORY_ID) values (8, 5);

--- ENTRIES ---
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (1, 'Hartley Van Geffen', 'Unspecified fracture of shaft of unspecified radius, subsequent encounter for open fracture type IIIA, IIIB, or IIIC with routine healing', '48ef8170-e042-4ca5-8090-b124cc7c93f4', 'https://rambler.ru/vehicula/consequat.js', 'Get Real', 1);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (2, 'Everard Ricardin', 'Symblepharon, unspecified eye', 'a521e1e0-3924-4955-965b-470676ebb651', 'https://vk.com/sapien/quis/libero/nullam/sit.png', 'Star Trek: Generations', 6);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (3, 'Kora Rappa', 'Blister (nonthermal) of right elbow, sequela', '00184e6c-3402-463b-be15-c269ff2cecb1', 'https://gov.uk/eu/tincidunt/in/leo/maecenas/pulvinar/lobortis.png', 'Doors, The', 9);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (4, 'Gunter Crosston', 'Burn of second degree of right palm', 'ce55c80c-4e38-4226-8d3d-d8bb0083bb2d', 'https://infoseek.co.jp/quis/orci/eget.aspx', 'Garbage Warrior', 7);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (5, 'Skipton Dootson', 'Toxic effects of carbon tetrachloride', '9c7b04f9-c526-4618-84f3-1eb554f93902', 'https://jugem.jp/nulla/suscipit/ligula/in.aspx', 'Birdman', 3);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (6, 'Hamilton Domico', 'Eustachian salpingitis', '374387c4-9674-4fb6-8383-8293572c1e5c', 'https://google.com.au/sed/vestibulum/sit/amet/cursus/id/turpis.png', 'Miracle on 34th Street', 8);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (7, 'Ruth Fotheringham', 'Laceration with foreign body of unspecified finger with damage to nail', 'f681fd36-9f4d-44cb-bfbc-b6078b6095fd', 'https://jugem.jp/porttitor/lorem/id/ligula/suspendisse/ornare.html', 'Hachiko: A Dog''s Story (a.k.a. Hachi: A Dog''s Tale)', 10);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (8, 'Waly Deboo', 'Dislocation of C1/C2 cervical vertebrae, subsequent encounter', '4d330fbd-53c5-4c98-bf75-c3b2b1ba8391', 'https://stanford.edu/orci.xml', 'Happythankyoumoreplease', 6);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (9, 'Taddeo Weighell', 'Nondisplaced Rolando''s fracture, left hand, subsequent encounter for fracture with routine healing', '002930d8-5fcf-4f1d-b588-b3bfb2fe9e05', 'http://joomla.org/a/nibh/in/quis.json', 'Last Summer in the Hamptons', 2);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (10, 'Fayre Tenbrug', 'Intentional self-harm by hot tap water', 'f5b72bd3-66b1-4c2a-ab92-8c9952178f08', 'http://economist.com/pretium/iaculis/diam/erat/fermentum/justo.js', 'Hot Rods to Hell', 9);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (11, 'Shell Moisey', 'Burn of unspecified degree of left toe(s) (nail), initial encounter', 'a101a195-4785-4133-a955-33001619e1b3', 'https://yellowpages.com/vestibulum/ante/ipsum/primis.html', 'Extraordinary Adventures of Mr. West in the Land of the Bolsheviks, The (Neobychainye priklyucheniya mistera Vesta v strane bolshevikov)', 1);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (12, 'Margi Tolerton', 'Psychomotor deficit following cerebral infarction', '0f1bc93a-4494-4ded-bd6a-81e26917b1e4', 'https://shutterfly.com/amet/nulla/quisque/arcu.jsp', 'Streamers', 8);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (13, 'Korrie Braams', 'Enteropathic arthropathies, unspecified hip', '2d9fb97a-4c36-435a-974e-cb24f277b90d', 'http://tinyurl.com/eu/sapien/cursus/vestibulum/proin/eu.aspx', 'Macao', 4);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (14, 'Prudi Bryan', 'Toxic effect of venom of centipedes and venomous millipedes, undetermined', 'b2c75397-73bc-4a3e-a334-f8203d06db22', 'https://dot.gov/volutpat.js', 'Max Payne', 6);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (15, 'Graham Damato', 'Monocular exotropia with A pattern, left eye', 'f2a7edd9-f3af-40d5-968e-2eb3f911b499', 'http://github.com/in/felis.png', 'Go for Sisters', 10);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (16, 'Chastity Austwick', 'Chronic gout due to renal impairment, unspecified ankle and foot', '894884ce-de7f-48a9-86ed-49414b5f33c8', 'https://latimes.com/tempus/vivamus/in.jsp', 'Bow, The (Hwal)', 6);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (17, 'Cyndi Broadbridge', 'Salter-Harris Type III physeal fracture of upper end of humerus, left arm, subsequent encounter for fracture with routine healing', '9d3e3e30-ba14-46b4-9e53-18e475ae3353', 'http://soundcloud.com/quis/augue/luctus/tincidunt/nulla.jsp', 'Violet Tendencies', 4);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (18, 'Lena North', 'Other superficial bite of right eyelid and periocular area, initial encounter', '364dbc7a-002c-481f-b029-18f84a2d1c9a', 'http://edublogs.org/vestibulum.jpg', 'Colorado Avenue', 8);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (19, 'Faustine Skett', 'Pathological fracture, pelvis, subsequent encounter for fracture with nonunion', '0728567e-0c4b-4413-a053-8c4583206975', 'http://forbes.com/a/feugiat/et/eros.aspx', 'Woman on the Beach (Haebyeonui yeoin)', 8);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (20, 'Arleen Tremellan', 'Displaced fracture of lateral malleolus of unspecified fibula, subsequent encounter for open fracture type I or II with nonunion', '73cd0a25-9811-4dee-beb5-24835eec2d76', 'https://de.vu/ipsum/integer/a/nibh.jsp', 'Silkwood', 9);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (21, 'Gradey Dryden', 'Other injury due to other accident to sailboat', '3ecff612-fcd7-43da-9d4d-ff7327dd1ae7', 'https://ucsd.edu/in/porttitor/pede/justo.aspx', 'Fruitvale Station', 9);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (22, 'Robenia BoHlingolsen', 'Nondisplaced oblique fracture of shaft of left tibia, subsequent encounter for open fracture type I or II with delayed healing', '173f3816-1d8c-4a28-bead-4821c70c539e', 'http://discuz.net/sapien/quis/libero/nullam.json', 'Sweetie', 7);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (23, 'Morgan Tucsell', 'Puncture wound with foreign body of anus', '5ee74db7-2f11-43cf-9315-2215fb172e1d', 'https://joomla.org/volutpat/in/congue.png', 'Tom Horn', 6);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (24, 'Worthington Eads', 'Nondisplaced fracture of epiphysis (separation) (upper) of left femur, subsequent encounter for open fracture type I or II with malunion', '557ecd47-975e-4b35-8647-38fe5402760e', 'https://earthlink.net/integer.png', 'Apartment 1303 3D', 1);
insert into FEED_ENTRY (ID, AUTHOR, DESCRIPTION, GUID, LINK, TITLE, FEED_ID) values (25, 'Bowie Ciardo', 'Nondisplaced fracture of medial phalanx of left ring finger, subsequent encounter for fracture with malunion', 'f3f10891-c725-4e5c-9a6b-06ad4d5bd4c2', 'https://fc2.com/ultrices/libero/non/mattis/pulvinar/nulla/pede.png', 'Brown''s Requiem', 2);
