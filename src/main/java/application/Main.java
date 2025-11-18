package application;

public class Main {
    public static void main(String[] args) {
        PagamentoCartaoCredito pag1 = new PagamentoCartaoCredito(200, "Exemplo de pagamento", "1234567890", "Fulano", "11/06", "346", 0);
        pag1.exibirDetalhesPagamento();
        Priorizavel pri = pag1;

        pri.definirPrioridade(4);
        System.out.println(pag1.obterNivelPrioridade());

        pag1.processar();

        PagamentoBoleto pag3 = new PagamentoBoleto(300, "Exemplo");
        pag3.exibirDetalhesPagamento();

        Pagamento pagamentos[] = {pag1, pag3};

        for (Pagamento p: pagamentos) {
            System.out.println(p.getIdTransacao());
        }
    }
}

