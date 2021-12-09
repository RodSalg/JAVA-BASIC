/*
 * Este programa é fornecido como está. Use-o por sua conta e risco.
 * Copyleft {alguns direitos reservados}
 * CC-BY-SA, Aluno: Thiago Rodrigo Monteiro Salgado, 2021,2022...
 */
package citygame;

import jade.core.Profile;
import jade.core.ProfileImpl;

/** //esse aqui eh nosso main, iremos startar tudo por ele
 * ponto de entrada do sistema do jogo
 * @author RodrigoSalgado
 */
public class CityGame {

    /** inicia o JADE e o agente servidor nele
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        jade.core.Runtime rt;
        rt = jade.core.Runtime.instance();
        Profile p = new ProfileImpl();
    }
    
}
