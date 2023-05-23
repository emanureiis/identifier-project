package br.com.emanureiis.liquidador.api.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * informa ao contêiner do Spring
 * que a classe deve ser instanciada
 * e gerenciada como um bean (objeto
 * gerenciado pelo contêiner de inversão
 * de controle, que  cria, configura e fornece
 * esses objetos conforme necessário).
 * */
@Component
@Getter
@Setter
public class Credito {
    private String codigo = "teste";
    private String nomeCliente = "teste";
    private double naoLiquidado = 0001;
}
