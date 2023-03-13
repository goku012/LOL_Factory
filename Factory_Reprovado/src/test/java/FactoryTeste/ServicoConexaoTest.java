package FactoryTeste;

import Factory.IServico;
import Factory.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoConexaoTest {

    @Test
    void deveExecutarConexao() {
        IServico servico = ServicoFactory.obterServico("Conexao");
        assertEquals("Conexao Boa", servico.executar());
    }

    @Test
    void deveCancelarConexao() {
        IServico servico = ServicoFactory.obterServico("Conexao");
        assertEquals("Conexao Ruim", servico.cancelar());
    }

}
