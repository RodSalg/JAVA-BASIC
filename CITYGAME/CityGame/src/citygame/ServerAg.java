/*
 * Este programa é fornecido como está. Use-o por sua conta e risco.
 * Copyleft {alguns direitos reservados}
 * CC-BY-SA, Aluno: Thiago Rodrigo Monteiro Salgado, 2021,2022...
 */
package citygame;

import jade.core.Agent;

/**
 * Agente do servidor do jogo
 * @author RodrigoSalgado
 */
public class ServerAg extends Agent {
    
    @Override
    protected void setup(){
        System.out.println("Server " + getLocalName() + " start");
    }
    
    @Override
    protected void takeDown(){
        System.out.println("Server " + getLocalName() + "Finish");
    }
    
}
