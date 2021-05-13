create table employees
(
    id       serial not null,
    username    varchar(255),
    email varchar(255),
    password  varchar(255)
);

alter table employees owner to postgres;

create table portfolios
(
    name      varchar(255),
    birthday     varchar(255),
    gender     varchar(255),
    experience varchar(255),
    speciality    varchar(255),
    lastWork varchar(255)
);

alter table portfolios owner to postgres;
