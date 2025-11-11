package application;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pagamento {
    protected String idTransacao;
    protected double valor;
    protected LocalDateTime dataHora;
    protected String descricao;
    protected String status;


}
