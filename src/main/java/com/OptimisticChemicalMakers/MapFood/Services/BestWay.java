package com.OptimisticChemicalMakers.MapFood.Services;

import com.OptimisticChemicalMakers.MapFood.models.Geolocation;

public class BestWay {

    private void exec(Integer num, Double[][] caminhoMenor) {

        Double menor = 0d;
        int k = 0;
        Double somaCaminhoMenorA = 0d;
        Double somaCaminhoMenorB = 0d;

        for (int i = 0; i < num ; i++)
        {
            for (int j = 0; j < num; j++)
            {
                System.out.print(caminhoMenor[i][j] + " | ");
            }
            System.out.println("");
        }

        for (int i = 0 , con = 0 ; i < num && con < num; ) {

            somaCaminhoMenorB += menor;
            menor = Double.MAX_VALUE;

            for (int j = 0 ; j < num; j++) {

                if( i != j && caminhoMenor[i][j] != 0d ){

                    if( caminhoMenor[i][j] <= menor ) {
                        caminhoMenor[j][i] = 0d;
                        menor = caminhoMenor[i][j];
                        k = j;

                    } else {
                        caminhoMenor[i][j] = 0d;
                        caminhoMenor[j][i] = 0d;
                    }

                }

            }

            System.out.print("[" + i + "]");
            System.out.print("[" + k + "]");
            System.out.println(" dis. " + menor);
            con++;
            i = k;
        }

        for (int i = 0; i < num ; i++)
        {
            for (int j = 0; j < num; j++)
            {
                System.out.print(caminhoMenor[i][j] + " | ");
            }
            System.out.println("");
        }

        System.out.println(somaCaminhoMenorB);
        System.out.println(somaCaminhoMenorA);

    }

    public static void main(String[] args) {

        Integer num = 5; // tamanho matriz
        Double[][] caminhoMenor = new Double[num][num];

        Geolocation ponto1 = new Geolocation((float) -23.603477 ,(float) -46.659798);
        Geolocation ponto2 = new Geolocation((float) -23.617418 ,(float) -46.677605);
        Geolocation ponto3 = new Geolocation((float) -23.606516 ,(float) -46.666485);
        Geolocation ponto4 = new Geolocation((float) -23.67268 , (float) -46.660618);
        Geolocation ponto5 = new Geolocation((float) -23.599142 ,(float) -46.63839);
        Geolocation ponto6 = new Geolocation((float) -23.599062 ,(float) -46.638718);
        Geolocation ponto7 = new Geolocation((float) -23.607517 ,(float) -46.66967);
        Geolocation ponto8 = new Geolocation((float) -23.604328 ,(float) -46.665733);
        Geolocation ponto9 = new Geolocation((float) -23.597881 ,(float) -46.63655);
        Geolocation ponto10 = new Geolocation((float) -23.602749 ,(float) -46.664246);
        Geolocation ponto11 = new Geolocation((float) -23.660072 ,(float) -46.679417);
        Geolocation ponto12 = new Geolocation((float) -23.602737 ,(float) -46.66514);
        Geolocation ponto13 = new Geolocation((float) -23.602737 ,(float) -46.66514);
        Geolocation ponto14 = new Geolocation((float) -23.670849 ,(float) -46.66903);
        Geolocation ponto15 = new Geolocation((float) -23.668098 ,(float) -46.673145);


        Geolocation restaurante = new Geolocation((float) -23.59769 ,(float) -46.642616);


        caminhoMenor[0][0] = restaurante.distanceTo(restaurante);
        caminhoMenor[0][1] = restaurante.distanceTo(ponto1);
        caminhoMenor[0][2] = restaurante.distanceTo(ponto4);
        caminhoMenor[0][3] = restaurante.distanceTo(ponto8);
        caminhoMenor[0][4] = restaurante.distanceTo(ponto1);

        caminhoMenor[1][0] = ponto1.distanceTo(restaurante);
        caminhoMenor[1][1] = ponto1.distanceTo(ponto1);
        caminhoMenor[1][2] = ponto1.distanceTo(ponto4);
        caminhoMenor[1][3] = ponto1.distanceTo(ponto8);
        caminhoMenor[1][4] = ponto1.distanceTo(ponto1);

        caminhoMenor[2][0] = ponto4.distanceTo(restaurante);
        caminhoMenor[2][1] = ponto4.distanceTo(ponto1);
        caminhoMenor[2][2] = ponto4.distanceTo(ponto4);
        caminhoMenor[2][3] = ponto4.distanceTo(ponto8);
        caminhoMenor[2][4] = ponto4.distanceTo(ponto1);

        caminhoMenor[3][0] = ponto8.distanceTo(restaurante);
        caminhoMenor[3][1] = ponto8.distanceTo(ponto1);
        caminhoMenor[3][2] = ponto8.distanceTo(ponto4);
        caminhoMenor[3][3] = ponto8.distanceTo(ponto8);
        caminhoMenor[3][4] = ponto8.distanceTo(ponto1);

        caminhoMenor[4][0] = ponto1.distanceTo(restaurante);
        caminhoMenor[4][1] = ponto1.distanceTo(ponto1);
        caminhoMenor[4][2] = ponto1.distanceTo(ponto4);
        caminhoMenor[4][3] = ponto1.distanceTo(ponto8);
        caminhoMenor[4][4] = ponto1.distanceTo(ponto1);

        BestWay bw = new BestWay();

        bw.exec(num,caminhoMenor);
    }

}


