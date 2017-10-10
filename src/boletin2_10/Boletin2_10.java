package boletin2_10;

import java.util.Scanner;

public class Boletin2_10 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float soldo_fixo,totalv,km,diasd,soldob,soldol;
        System.out.println("Soldo Fixo");
        soldo_fixo=teclado.nextFloat();
        System.out.println("Total de Ventas");
        totalv=teclado.nextFloat();
        System.out.println("Kilometros");
        km=teclado.nextFloat();
        System.out.println("Dias de desplazamiento");
        diasd=teclado.nextFloat();
        soldob=(float) (soldo_fixo+(0.05*totalv)+2*km+30*diasd);
        float irpf=(float) 0.18;
        float retencion_seguridad_social=36;
        soldol=(float) (soldob-(irpf*soldob)-retencion_seguridad_social);
        System.out.println("Soldo bruto = "+soldob);
        System.out.println("Soldo liquido = "+soldol);
        

    }
    
}