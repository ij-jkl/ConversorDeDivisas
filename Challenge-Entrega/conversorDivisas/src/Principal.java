import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1) Dolar --> Peso Argentino");
            System.out.println("2) Peso Argentino --> Dolar");
            System.out.println("3) Dolar --> Real Brasilero");
            System.out.println("4) Real Brasilero --> Dolar");
            System.out.println("5) Dolar --> Peso Colombiano");
            System.out.println("6) Peso Colombiano --> Dolar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida para utilizar:");

            int opcion = lectura.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.println("Ingrese el monto a convertir: ");
                double monto = lectura.nextDouble();
                String currency1 = "";
                String currency2 = "";

                switch (opcion) {
                    case 1:
                        currency1 = "USD";
                        currency2 = "ARS";
                        break;
                    case 2:
                        currency1 = "ARS";
                        currency2 = "USD";
                        break;
                    case 3:
                        currency1 = "USD";
                        currency2 = "BRL";
                        break;
                    case 4:
                        currency1 = "BRL";
                        currency2 = "USD";
                        break;
                    case 5:
                        currency1 = "USD";
                        currency2 = "COP";
                        break;
                    case 6:
                        currency1 = "COP";
                        currency2 = "USD";
                        break;
                }

                realizarConversion(new Consultas(), currency1, currency2, monto);
            } else if (opcion == 7) {
                System.out.println("Programa Finalizado. ");
                break; // Salir del bucle while
            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 7.");
            }
        }
    }

    private static void realizarConversion(Consultas consultas, String currency1, String currency2, double monto) {
        ApiGet apiGet = consultas.consultaBusca(currency1, currency2);
        double conversionRate = apiGet.conversion_rate();
        double montoConvertido = monto * conversionRate;

        System.out.println("-------------------------------------");
        System.out.println("Monto convertido de " + currency1 + " a " + currency2 + " equivale a un total de : " + montoConvertido);
    }
}

// Jordan Isaac Conversor Monedas 28/4/2024