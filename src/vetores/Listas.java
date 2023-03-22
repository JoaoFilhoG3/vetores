package vetores;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Listas {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<String>();
        List<Double> parciais = new ArrayList<Double>();
        List<Double> bimestrais = new ArrayList<Double>();
        List<Double> medias = new ArrayList<Double>();
        List<Boolean> aprovado = new ArrayList<Boolean>();

        /**
         * Preenchendo nomes
         */
        for (int i = 0; i < 5; i++) {
            nomes.add(JOptionPane.showInputDialog(
                    "Digite o nome do " + (i + 1) + "º aluno."
            ));
        }

        /**
         * Preenchendo parciais
         */
        for (int i = 0; i < 5; i++) {
            parciais.add(Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Digite a nota parcial do " + (i + 1) + "º aluno."
                    )
            ));
        }

        /**
         * Preenchendo bimestrais
         */
        for (int i = 0; i < 5; i++) {
            bimestrais.add(Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Digite a nota bimestral do " + (i + 1) + "º aluno."
                    )
            ));
        }

        /**
         * Calculando médias
         */
        for (int i = 0; i < 5; i++) {
            medias.add((parciais.get(i) + bimestrais.get(i)) / 2);
        }

        /**
         * Verificando se o aluno passou
         */
        for (int i = 0; i < 5; i++) {
            if (medias.get(i) >= 6) {
                aprovado.add(true);
            } else {
                aprovado.add(false);
            }
        }

        /**
         * Imprimindo informações
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("O aluno " + nomes.get(i) + " tirou " + parciais.get(i) + " na parcial e " + bimestrais.get(i) + " na bimestral, obtendo média " + medias.get(i) + ". Aprovado?: " + aprovado.get(i));
        }

    }

}
