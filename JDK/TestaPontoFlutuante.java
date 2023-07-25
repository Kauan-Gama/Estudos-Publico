
public class TestaPontoFlutuante {
     public static void main(String[] args) {

        double salario; 
        salario = 5250.70;
        System.out.println("Meu Salário é " + salario);

        double idade = 18;

        double divisao = 3.14 / 2;
        System.out.println(divisao);

        //se a variavel declarada for int o resultado será arredondado
        int OutraDivisao = 5 / 2;
        System.out.println(OutraDivisao);
        //Resultado: 2

        //O Resultado Será 2.0
        double novaTentativa = 5 / 2;
        System.out.println(novaTentativa);

        //Para que o resultado seja 2.5 é necessário usar numeros quebrados na equação, como...
        double TentativaTres = 5.0 / 2;
        System.out.println(TentativaTres);
     }
}
