CREATE TABLE estudio(
                        id                     INT NOT NULL,
                        nomeFantasia           VARCHAR(100) NOT NULL,
                        dataCadastro           DATE NOT NULL,
                        dataUltimaAtualizacao  TIMESTAMP
);

CREATE TABLE conteudo(
                         id                     INT NOT NULL,
                         nome                   VARCHAR(100) NOT NULL,
                         descricao              VARCHAR(300) NOT NULL,
                         fotoUrl                VARCHAR(1000),
                         dataCadastro           DATE NOT NULL,
                         dataUltimaAtualizacao  TIMESTAMP,
                         id_estudio           INT NOT NULL,
                         FOREIGN KEY (id_estudio) REFERENCES estudio(id)
);

CREATE TABLE usuario(
                        id                     INT NOT NULL,
                        nomeCompleto           VARCHAR(100) NOT NULL,
                        email                  VARCHAR(300) NOT NULL,
                        senha                  VARCHAR(30)  NOT NULL,
                        dataCadastro           DATE NOT NULL,
                        dataUltimaAtualizacao  TIMESTAMP
);

CREATE TABLE categoria(
                          id                     INT NOT NULL,
                          nome                   VARCHAR(100) NOT NULL,
                          descricao              VARCHAR(300) NOT NULL
);

CREATE TABLE categoriaConteudo(
                                 id                     INT NOT NULL,
                                 id_categoria           INT NOT NULL,
                                 id_conteudo             INT NOT NULL,
                                 FOREIGN KEY (id_categoria) REFERENCES categoria(id),
                                 FOREIGN KEY (id_conteudo) REFERENCES conteudo(id)
);

