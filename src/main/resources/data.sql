INSERT INTO categoria(id, nome, descricao)
VALUES (1, 'ação', 'lorem ipsum');

INSERT INTO estudio(id, nomeFantasia, dataCadastro, dataUltimaAtualizacao)
VALUES (1, 'netflix', '2018-07-05',CURRENT_TIMESTAMP());

INSERT INTO conteudo(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, id_estudio)
VALUES (1, 'finalspace', 'lorem ipsum', 'https://static.wikia.nocookie.net/final-space/images/d/d6/Final_Space_Netflix.jpg/revision/latest/top-crop/width/360/height/450?cb=20190116121424&path-prefix=pt-br', '2021-07-01', CURRENT_TIMESTAMP(),1);

INSERT INTO categoriaConteudo(id, id_categoria, id_conteudo)
VALUES (1, 1, 1);

INSERT INTO usuario(id, nomeCompleto, email, senha, dataCadastro, dataUltimaAtualizacao)
VALUES (1, 'Joao', 'joao@gmail.com', '123123', '2021-03-23', CURRENT_TIMESTAMP());

