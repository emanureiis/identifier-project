package br.com.emanureiis.liquidador.api.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListaDeCreditos {
    public static List<Credito> lista = new ArrayList<Credito>();
}
