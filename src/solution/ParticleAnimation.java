/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Pierre-Alexander Lassonde
 */
public class ParticleAnimation {
    
    ArrayList<Particle> particles = new ArrayList();
    
    public String[] animate(int speed, String init){
        
        int chamberSize = init.length();
        char[] chamber = new char[chamberSize];
        char[] location = init.toCharArray();
        ArrayList<String> result = new ArrayList();
        
        initialize(chamber);
 
        for (int i = 0; i < location.length; i++){
            
            if (location[i] != '.'){
                particles.add(new Particle(location[i],i, chamberSize));
            }
        }
        
        while(!particles.isEmpty()){
            
            for (Particle p : particles){

                    chamber[p.position] = p.toChar();
            }

            result.add(new String(chamber));
            initialize(chamber);
            updateParticles(speed, chamberSize);
        }
        
        result.add(new String(chamber));

        String[] display = new String[result.size()];
        
        for (int i = 0; i < result.size(); i++)
                display[i] = result.get(i);
        
        return display;
    }

    private void updateParticles(int speed, int size) {
        
        for (Particle p : particles){
            
            if (p.direction == 'R'){
                p.position = p.position + speed;
            }
            if (p.direction == 'L'){
                p.position = p.position - speed;
            }
        }
        
        cleanChamber();
    }

    private void initialize(char[] chamber) {
        for (int i = 0; i < chamber.length; i++){
            chamber[i] = '.';
        }
    }

    private void cleanChamber() {
        
        Iterator<Particle> it = particles.iterator();
        while (it.hasNext()) {
            Particle p = it.next();
            if (p.isOutside()) {
              it.remove();
            }
        }
    }


    
}
