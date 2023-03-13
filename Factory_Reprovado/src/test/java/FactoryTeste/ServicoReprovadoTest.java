package FactoryTeste;

import Factory.IServico;
import Factory.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoReprovadoTest {

    @Test
    void deveExecutarReprovadoClassificao() {
        IServico servico = ServicoFactory.obterServico("Reprovado");
        assertEquals("Reprovado por Classificao", servico.executar());
    }

    @Test
    void deveExecutarReprovadoKill() {
        IServico servico = ServicoFactory.obterServico("Reprovado");
        assertEquals("Reprovado por Kill", servico.cancelar());
    }

}
