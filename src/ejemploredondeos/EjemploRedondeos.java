/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploredondeos;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author alienware
 */
public class EjemploRedondeos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("RoundingMode.UP");
        System.out.println("Redondea cualquier decimal a su entero superior");

        BigDecimal positiveDecimal = new BigDecimal("2.535");
        BigDecimal positiveRedondeado = positiveDecimal.setScale(2, RoundingMode.UP);
        System.out.println("Decimal positivo: " + positiveDecimal);
        System.out.println("Decimal redondeado: " + positiveRedondeado);


        System.out.println("");


        BigDecimal negativeDecimal = new BigDecimal("-2.535");
        BigDecimal negativeRedondeado = negativeDecimal.setScale(2, RoundingMode.UP);
        System.out.println("Decimal negativo: " + negativeDecimal);
        System.out.println("Decimal redondeado: " + negativeRedondeado);

        System.out.println("-----------------------------------------------------------------");

        System.out.println("RoundingMode.DOWN");
        System.out.println("Redondea el decimal a 0. Este metodo no incrementa o decrementa el valor");

        positiveDecimal = new BigDecimal("2.535");
        positiveRedondeado = positiveDecimal.setScale(2, RoundingMode.DOWN);
        System.out.println("Decimal positivo: " + positiveDecimal);
        System.out.println("Decimal redondeado: " + positiveRedondeado);


        System.out.println("");


        negativeDecimal = new BigDecimal("-2.535");
        negativeRedondeado = negativeDecimal.setScale(2, RoundingMode.DOWN);
        System.out.println("Decimal negativo: " + negativeDecimal);
        System.out.println("Decimal redondeado: " + negativeRedondeado);

        System.out.println("-----------------------------------------------------------------");

        System.out.println("RoundingMode.CEILING");
        System.out.println("Para un valor positivo actua igual que RoundingMode.UP y para un valor negativo actua igual que RoundingMode.DOWN");

        positiveDecimal = new BigDecimal("2.535");
        positiveRedondeado = positiveDecimal.setScale(2, RoundingMode.CEILING);
        System.out.println("Decimal positivo: " + positiveDecimal);
        System.out.println("Decimal redondeado: " + positiveRedondeado);


        System.out.println("");


        negativeDecimal = new BigDecimal("-2.535");
        negativeRedondeado = negativeDecimal.setScale(2, RoundingMode.CEILING);
        System.out.println("Decimal negativo: " + negativeDecimal);
        System.out.println("Decimal redondeado: " + negativeRedondeado);

        System.out.println("-----------------------------------------------------------------");

        System.out.println("RoundingMode.FLOOR");
        System.out.println("Para un valor positivo actua igual que RoundingMode.DOWN y para un valor negativo actua igual que RoundingMode.UP");

        positiveDecimal = new BigDecimal("2.535");
        positiveRedondeado = positiveDecimal.setScale(2, RoundingMode.FLOOR);
        System.out.println("Decimal positivo: " + positiveDecimal);
        System.out.println("Decimal redondeado: " + positiveRedondeado);


        System.out.println("");


        negativeDecimal = new BigDecimal("-2.535");
        negativeRedondeado = negativeDecimal.setScale(2, RoundingMode.FLOOR);
        System.out.println("Decimal negativo: " + negativeDecimal);
        System.out.println("Decimal redondeado: " + negativeRedondeado);

        System.out.println("-----------------------------------------------------------------");

        System.out.println("RoundingMode.HALF_DOWN");
        System.out.println("Redondea hacia abajo solo si el decimal es > a 0.5");

        positiveDecimal = new BigDecimal("2.535");
        positiveRedondeado = positiveDecimal.setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("Decimal positivo: " + positiveDecimal);
        System.out.println("Decimal redondeado: " + positiveRedondeado);


        System.out.println("");


        negativeDecimal = new BigDecimal("-2.527");
        negativeRedondeado = negativeDecimal.setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("Decimal negativo: " + negativeDecimal);
        System.out.println("Decimal redondeado: " + negativeRedondeado);

        System.out.println("-----------------------------------------------------------------");

        System.out.println("RoundingMode.HALF_EVEN");
        System.out.println("Redondea hacia arriba solo si su numero mas cercano a la izquierda es impar");

        positiveDecimal = new BigDecimal("1.535");
        positiveRedondeado = positiveDecimal.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Decimal positivo: " + positiveDecimal);
        System.out.println("Decimal redondeado: " + positiveRedondeado);


        System.out.println("");


        negativeDecimal = new BigDecimal("-1.535");
        negativeRedondeado = negativeDecimal.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Decimal negativo: " + negativeDecimal);
        System.out.println("Decimal redondeado: " + negativeRedondeado);

      

    }
}
