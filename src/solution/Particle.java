/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author Pierre-Alexandre Lassonde
 */
class Particle {
    
    char direction;
    int position;
    int chamberSize;

    Particle(char direction, int position, int chamberSize) {
        this.direction = direction;
        this.position = position;
        this.chamberSize = chamberSize;
    }
    
    boolean isOutside(){
        
        if (position < 0)
            return true;
        
        if (position > (chamberSize - 1))
            return true;

        return false;
    }
    
    char toChar(){
        return 'X';
    }
    
}
