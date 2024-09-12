insert into cozinha (nome) values ('Tailandesa');
insert into cozinha (nome) values ('Indiana');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Tai Tai', 9.5, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Ind Ind', 8.5, 2);

insert into estado (nome) values ('São Paulo');
insert into estado (nome) values ('Minas Gerais');

insert into cidade (nome, estado_id) values ('Guarulhos', 1);
insert into cidade (nome, estado_id) values ('Belo Horizonte', 2);
insert into cidade (nome, estado_id) values ('Campinas', 1);

insert into permissao (nome, descricao) values ('CONSULTAR_COZINHAS', 'Permite consultar cozinhas');
insert into permissao (nome, descricao) values ('EDITAR_COZINHAS', 'Permite editar cozinhas');

insert into forma_pagamento (descricao) values ('Cartão de Crédito')
insert into forma_pagamento (descricao) values ('Cartão de Débito')
insert into forma_pagamento (descricao) values ('Dinheiro')
