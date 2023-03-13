package FactoryTeste;

import Factory.IServico;
import Factory.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCampeaoTest {

    @Test
    void deveExecutarCampeao() {
        IServico servico = ServicoFactory.obterServico("Campeao");
        assertEquals("Campeao Encontrado", servico.executar());
    }

    @Test
    void deveCancelarCampeao() {
        IServico servico = ServicoFactory.obterServico("Campeao");
        assertEquals("Campeao não Encontrado", servico.cancelar());
    }

}