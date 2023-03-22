package vetores;

import javax.swing.JOptionPane;

public class Vetores {

    public static void main(String[] args) {

        String nomes[] = new String[10];
        double parciais[] = new double[10];
        double bimestrais[] = new double[10];
        double medias[] = new double[10];
        boolean aprovado[] = new boolean[10];

        /**
         * Preenchendo nomes
         */
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog(
                    "Digite o nome do " + (i + 1) + "º aluno."
            );
        }

        /**
         * Preenchendo parciais
         */
        for (int i = 0; i < parciais.length; i++) {
            parciais[i] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Digite a nota parcial do " + (i + 1) + "º aluno."
                    )
            );
        }

        /**
         * Preenchendo bimestrais
         */
        for (int i = 0; i < bimestrais.length; i++) {
            bimestrais[i] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Digite a nota bimestral do " + (i + 1) + "º aluno."
                    )
            );
        }

        /**
         * Calculando médias
         */
        for (int i = 0; i < medias.length; i++) {
            medias[i] = (parciais[i] + bimestrais[i]) / 2;
        }

        /**
         * Verificando se o aluno passou
         */
        for (int i = 0; i < medias.length; i++) {
            if (medias[i] >= 6) {
                aprovado[i] = true;
            } else {
                aprovado[i] = false;
            }
        }

        /**
         * Imprimindo informações
         */
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("O aluno " + nomes[i] + " tirou " + parciais[i] + " na parcial e " + bimestrais[i] + " na bimestral, obtendo média " + medias[i] + ". Aprovado?: " + aprovado[i]);
        }

    }

}
