// Responsável por definir as regras de visibilidade do modulo sistema.
module conta.sistema {
    // usa spring
    requires javax.inject;
    requires spring.tx;
    requires spring.jdbc;
    requires hsqldb;
    requires java.sql;
    requires spring.context;

    // expondo porta de entrada (driver)
    exports conta.sistema.casouso.porta;
    exports conta.sistema.casouso.imp;

    // expondo sistema negocio
    exports conta.sistema.dominio.modelo;
    exports conta.sistema.dominio.servico;

    // expondo adptadores de saidas (driven)
    exports conta.sistema.porta;
    exports conta.adaptador.dev;
    exports conta.adaptador.prod;
    exports conta.build;

    // abre reflexão spring
    opens conta.sistema.casouso.porta;
    opens conta.sistema.casouso.imp;
    opens conta.sistema.dominio.servico;
    opens conta.adaptador.prod;
    opens conta.adaptador.dev;
    opens conta.build;
}