package org.autobots;


import java.util.ArrayList;
import java.util.List;


public class GerenciadorAutobots {

    // numeros se repetiam no código se precisasse mudar teriam que ser mudados em varios lugares,
    // então foi criado constantes que possam ser usadas para evitar retrabalho e
    // facilitar a leitura de código

    private static final int ENERGON_MAXIMO_ELITE = 500;
    private static final int ENERGON_PADRAO = 200;
    private static final int REPARAR_ENERGON_100 = 100;

    private List<Autobot> lista = new ArrayList<>();

    public void adicionar(Autobot a) {
        lista.add(a);
    }


//    O problema era o <=. Como tem 3 Autobots, lista.size() retorna 3, mas os índices vão de 0 até 2.
    public double calcularEnergonTotal() {
        double total = 0;
        for (int i = 0; i < lista.size(); i++) {

            total += lista.get(i).getEnergon();
        }
        return total;
    }

    // == compara numeros e boolenos, não necessariamente o conteúdo das strings
    public Autobot buscar(String nome) {
        for (Autobot a : lista) {
            if (a.getNome().equals(nome)) {
                return a;
            }
        }
        return null;
    }

    public List<Autobot> listarIndisponiveis() {
        List<Autobot> indisponiveis = new ArrayList<>();

        for (Autobot a : lista) {
            if (a.getEnergon() <= 0) {
                indisponiveis.add(a);
            }
        }

        return indisponiveis;
    }

    //pegava a exceção, mas não fazia nada com ela
    public void reparar(Autobot a) {
        try {
            if (a.getEnergon() < 0) {
                throw new Exception("Energon negativo");
            }
            a.setEnergon(a.getEnergon() + REPARAR_ENERGON_100 );
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ClassificacaoENUM classificar(Autobot a) {
        if (a.getEnergon() > ENERGON_MAXIMO_ELITE) {
            return ClassificacaoENUM.ELITE;
        } else if (a.getEnergon() > ENERGON_PADRAO) {
            return ClassificacaoENUM.PADRÃO;
        } else {
            return ClassificacaoENUM.RESERVA;
        }
    }
}

