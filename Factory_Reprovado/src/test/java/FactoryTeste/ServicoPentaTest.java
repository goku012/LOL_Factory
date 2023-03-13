package FactoryTeste;

import Factory.IServico;
import Factory.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPentaTest {

    @Test
    void deveExecutarPenta() {
        IServico servico = ServicoFactory.obterServico("Penta");
        assertEquals("PentaKill", servico.executar());
    }

    @Test
    void deveCancelarPenta() {
        IServico servico = ServicoFactory.obterServico("Penta");
        assertEquals("Falhou PentaKill", servico.cancelar());
    }

}