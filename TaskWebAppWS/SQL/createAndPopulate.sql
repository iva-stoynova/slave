create table root.T_PEOPLE
    (
    ID INT not null primary key GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1),
    FULL_NAME varchar(90) not null,
    PIN varchar(10),
    EMAIL varchar(40)
    );

insert into root.T_PEOPLE(FULL_NAME, PIN, EMAIL) VALUES ('ИВАН ПЕТРОВ ИВАНОВ', NULL, NULL);
insert into root.T_PEOPLE(FULL_NAME, PIN, EMAIL) VALUES ('ДИМИТЪР БОРИСОВ АЛЕКСИЕВ', '0000002345', 'alexiev@somedomain.com');
insert into root.T_PEOPLE(FULL_NAME, PIN, EMAIL) VALUES ('ДИМИТЪР БОРИСОВ АЛЕКСИЕВ', '0000002300', 'alexiev_2@somedomain.com');
insert into root.T_PEOPLE(FULL_NAME, PIN, EMAIL) VALUES ('МАРГАРИТА БОЖКОВА ДИМИТРОВА', '0000005453', 'margarita@somedomain.com');
insert into root.T_PEOPLE(FULL_NAME, PIN, EMAIL) VALUES ('МАРГАРИТА БОЖКОВА ДИМИТРОВА', '0000003453', 'margarita_2@somedomain.com');
insert into root.T_PEOPLE(FULL_NAME, PIN, EMAIL) VALUES ('МАРГАРИТА БОЖКОВА ДИМИТРОВА', '0000003451', 'margarita_3@somedomain.com');
insert into root.T_PEOPLE(FULL_NAME, PIN, EMAIL) VALUES ('ЕЛЕНА ПЕТРОВА МАГДАЛЕНОВА', '0000003451', 'elena@somedomain.com');
insert into root.T_PEOPLE(FULL_NAME, PIN, EMAIL) VALUES ('ГЕОРГИ САПУНДЖИЕВ МАВРОДИЕВ', NULL, 'georgi@somedomain.com');
insert into root.T_PEOPLE(FULL_NAME, PIN, EMAIL) VALUES ('ДАНИЕЛА МАНОЛОВА СТОЯНОВА', NULL, 'daniela@somedomain.com');
insert into root.T_PEOPLE(FULL_NAME, PIN, EMAIL) VALUES ('НИКОЛАЙ ЗАХАРИЕВ ПЕТРОВ', NULL, 'nikolay_petrov@somedomain.com');
insert into root.T_PEOPLE(FULL_NAME, PIN, EMAIL) VALUES ('ВАЛЕНТИНА СЕРГЕЕВА ТЕРЕШКОВА', NULL, 'tereshkova@somedomain.com');
insert into root.T_PEOPLE(FULL_NAME, PIN, EMAIL) VALUES ('ГЕНАДИ ЦВЕТКОВ МАНАСИЕВ', NULL, 'genady.manasiev@somedomain.com');
insert into root.T_PEOPLE(FULL_NAME, PIN, EMAIL) VALUES ('СЕВЕРИН АЛЕКСИЕВ АЛЕКСИЕВ', NULL, 'severin.alexiev@somedomain.com');
