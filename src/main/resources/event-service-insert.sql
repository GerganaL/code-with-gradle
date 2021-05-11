USE quarkus;
INSERT INTO events(id, startTime, endTime, status, type, title, clientName, guestsCount, freeText)
VALUES (1, '2008-11-11', '2008-11-12', 'finished', 'Repair & Nutrition', 'Best hair care in town', 'Julia Phonex', 9,
        'For naturally beautiful hair from roots to tips!'),
       (2, '2015-02-05', '2015-02-10', 'finished', 'Conference',
        'Run by The Australian Association of National Advertisers', 'Jeff Goodby', 250,
        'Conferences are often used by B2B marketers. They require a lot of work (and budget!), but bigger events also hold the opportunity for bigger gain.'),
       (3, '2016-03-01', '2016-03-10', 'finished', 'Trade shows and expos.', 'Samsung RSNA Opening day', 'Robert Phily',
        530,
        'There are often still workshops and classes, but the “main event” (so to speak!) is meeting with a whole bunch of sellers in a specific industry.'),
       (4, '2017-04-21', '2017-04-25', 'finished', 'Sponsorship', 'Free the favourite word', 'Scott Maccalon', 17,
        'The whole point of sponsoring that event is to get sales; without getting contact details, you cannot nurture relationships. This is why many people give away swag at events. (aka, “stuff we all get,” aka freebies.)'),
       (5, '2019-12-30', '2020-01-05', 'finished', 'Workshops and classes', 'B2B Marketing', 'Silvia May', 60,
        'A B2B marketing company could do something similar and offer a class with free training on its product or service. Alternatively, it could bring in a guest speaker to teach on a topic its users all care about, '),
       (6, '2021-07-14', '2021-07-14', 'in progress', 'A seminar or half-day event.',
        'Here’s How Startup Marketing Conference', 'Matt Murphy', 200,
        'Propllr offers reasonably priced tickets, with the opportunity for startups to learn tactics for success from their peers.'),
       (7, '2020-09-13', '2020-09-15', 'finished', 'Networking sessions', ' tips for nervous networkers here!',
        'Katerine Clinton', 340,
        'Every business professional knows the importance of networking. It can benefit your current job or your career as a whole. A networking session doesn’t require the educational element –- no speakers required!');


INSERT INTO services(id, name, description, price)
VALUES (1, 'Hair care', 'Repair & Nutrition For naturally beautiful hair from roots to tips!', 56),
       (2, 'Country club', 'A country club is a privately owned club, often with a membership quota and admittance by invitation or sponsorship, that generally offers both a variety of recreational sports and facilities for dining and entertaining. ', 1500),
       (3, 'Streaming service', 'An online provider of entertainment (music, movies, etc.) that delivers the content via an Internet connection to the subscriber''s computer, TV or mobile device.', 2200),
       (4, 'Education', 'A program that focuses on the general theory and practice of learning and teaching; the basic principles of educational psychology; the art of teaching; the planning and administration of educational activities.', 60000),
       (5, 'Marketing', 'Marketing refers to activities a company undertakes to promote the buying or selling of a product or service. Marketing includes advertising, selling, and delivering products to consumers or other businesses.', 5300);



INSERT INTO service_event(service_id, event_id)
VALUES (1, 1),
       (2,2),
       (5,3),
       (4,4),
       (5,6),
       (3,7);



