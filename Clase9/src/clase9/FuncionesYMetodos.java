/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class FuncionesYMetodos {    
        
    public int[] iniciar(int[] vector){
        int vec[] = vector;
        for (int i=0; i<=vec.length-1; i++){  
          vec[i]=i;            
        }
        return vec;              
    }
    
//1. Cree un vector de enteros para almacenar números del 1 al 30. Introduzca estos
//números de forma aleatoria en el vector.    
    
    public int[] iniciarVecRdm(int[] vector){
        int vec[] = vector;
        for (int i=0; i<=vec.length-1; i++){       
            vec[i]=(int) (Math.random()*30+1);            
        }
        return vec;              
    }
    
//2. Cree una función que almacene los números en un String separados por “” y 
//retorne esta hilera. Esta es la función imprimir, que se encarga de desplegar
//un vector en pantalla.    

    public int[] iniciarVec(int[] vector){
        int vec[] = vector;
        for (int i=0; i<=vec.length-1; i++){       
            vec[i]=(int) (Math.random()*30+1);            
        }
        return vec;              
    }    
    
    
    
    
    
    public String mostrarVec(int[] vec){
        String str ="";
        for (int i=0; i<=vec.length-1; i++){       
               
            
            if(i != vec.length-1){
                str += vec[i] + ", ";  
            }else{
                str += vec[i] + System.lineSeparator();
            }             
              
        }
        return str;              
    }
    
    
    
    
    
////    public int[] iniciarVecRdm(int[] vector){
////       // Scanner sc = new Scanner(System.in);
////        Random rn = new Random();
////        int answer = rn.nextInt(30) + 1;
////        
////        int vec[] = vector;
////        for(int i = 0; i<=vec.length-1;i++){
////            vec[i]=answer;
////        }
////        return vec;
////    }
//    
//    
////    1. Cree un vector de enteros para almacenar números del 1 al 30. Introduzca estos números de
////    forma aleatoria en el vector.    
//    
//    public String mostrarVecRdm(int[] vec){
//        Random rn = new Random();
//        String frase= "";
//        for(int i = 0; i<vec.length;i++){
//            int answer = rn.nextInt(30);
//            
//            if(i != vec.length-1){
//                    frase = frase + answer +", ";   
//                }else{
//                    frase = frase + answer;
//                }
//            
//            
//        }
//        return frase;
//    }
//    
////2.Cree una función que almacene los números en un String separados por “” y retorne esta
////hilera. Esta es la función imprimir, que se encarga de desplegar un vector en pantalla.
//    
//    
//    
//    public int[][] iniciarMatRdm(int[][] matriz){
//        int mat[][] = matriz;
//        String str ="";
//        
//        for(int i = 0; i<mat.length;i++){
//            for(int j = 0; j<mat[0].length;j++){
////                if(j != mat[0].length-1){
//                    str += (int) (Math.random()*30+1);   
////                }else{
////                    str += (int) (Math.random()*30+1) + System.lineSeparator();
////                }
//            }
//        }return mat;
//    }
//    
//    
//    public String mostrarMat(int[][] matriz){
//
//        String str ="";
//        for (int i=0; i<matriz.length; i++){       
//           for (int j=0; j<matriz.length; j++){       
//               str += matriz[i][j] + ", ";        
//           }            
//        }
//        return str;              
//    }
//    
//    //vec[i] = (int) (Math.random()*30+1);
//    
//    //Cree una matriz de enteros de 5x5 e inicialícela con valores aleatorios.
//    
////    public String mostrarMatRdm(int mat[][]){
////        String str ="";
////        for (int i=0; i<mat.length; i++){
////           for (int j=0; j<mat[0].length; j++){ 
////                if(j != mat[0].length-1){
////                    str += (int) (Math.random()*30+1) + ", ";   
////                }else{
////                    str += (int) (Math.random()*30+1) + System.lineSeparator();
////                }
////           } 
////        }
////        return str;              
////    }
    
    
    
}
