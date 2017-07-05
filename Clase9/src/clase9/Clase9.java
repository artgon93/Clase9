/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

/**
 *
 * @author Estudiantes
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FuncionesYMetodos clase1 = new FuncionesYMetodos();
        
        int vec[] = new int[30];
        clase1.iniciar(vec);
        System.out.println(clase1.mostrarVec(vec));
        clase1.iniciarVecRdm(vec);
        System.out.println(clase1.mostrarVec(vec));        
        
////        int vec[] = new int[30];
////        clase1.iniciarVecRdm(vec);
////        System.out.println(clase1.mostrarVecRdm(vec));
////        
////        
//        int mat[][] = new int[5][5];
//        clase1.iniciarMatRdm(mat);
//        System.out.println(clase1.mostrarMat(mat));
    }
    
}
