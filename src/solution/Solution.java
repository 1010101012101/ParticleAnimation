/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.Arrays;

/**
 *
 * @author Pierre-Alexandre Lassonde
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ParticleAnimation p = new ParticleAnimation();
        ParticleAnimation p1 = new ParticleAnimation();
        ParticleAnimation p2 = new ParticleAnimation();
        ParticleAnimation p3 = new ParticleAnimation();
        ParticleAnimation p4 = new ParticleAnimation();
        ParticleAnimation p5 = new ParticleAnimation();
        
        System.out.print(Arrays.toString(p.animate(2, "..R....")));
        System.out.print(Arrays.toString(p1.animate(3, "RR..LRL")));
        System.out.print(Arrays.toString(p2.animate(2, "LRLR.LRLR")));
        System.out.print(Arrays.toString(p3.animate(10, "RLRLRLRLRL")));
        System.out.print(Arrays.toString(p4.animate(1, "...")));
        System.out.print(Arrays.toString(p5.animate(1, "LRRL.LR.LRR.R.LRRL."))); // Dernier test
    }

    
}
