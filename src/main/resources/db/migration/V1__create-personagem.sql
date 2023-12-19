create table personagem (
    id BIGINT not null auto_increment,
    nome varchar(60) not null unique,
    pontos int not null,
    desenho_pers varchar(255),
    papel varchar(100) not null,

    primary key (id)
);
