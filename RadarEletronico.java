import java.util.Scanner;

public class RadarEletronico {
    public static void main(String[] args) {

        //Escreva um programa que leia a velocidade de um carro. Se ele ultrapassar 80 Km/h,
        // mostre uma mensagem dizendo que ele foi multado. A multa vai custar R$ 7,00 para cada Km acima do limite.

        Scanner sc = new Scanner(System.in);

        double velocidade, multa = 0;

        System.out.println("Seja Bem Vindo ao Radar Eletrônico!");

        System.out.println("Me informe a sua velocidade para saber se você levou multa ou não (Km/h): ");
        velocidade = sc.nextDouble();

        if (velocidade > 80){
            multa = (velocidade - 80)* 7;

            System.out.printf("Você foi multado! Estava a uma velocidade de: %.0fKm acima do limite permitido e sua multa é de  R$ %.2f ", (velocidade - 80), multa);
        }else{
            System.out.println("Você não foi multado! Continue andando na velocidade permitida!");
        }


    }
}
