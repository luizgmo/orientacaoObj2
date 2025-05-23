package exercicios.genericos.ex2;

import java.util.List;

public class SomaNumeros {
    public static class Resultado {
        private final long somaPares;
        private final long somaImpares;

        public Resultado(long somaPares, long somaImpares) {
            this.somaPares = somaPares;
            this.somaImpares = somaImpares;
        }

        public long getSomaPares() {
            return somaPares;
        }

        public long getSomaImpares() {
            return somaImpares;
        }

        @Override
        public String toString() {
            return "Soma dos pares = " + somaPares + ", Soma dos ímpares = " + somaImpares;
        }
    }

    public static <T extends Number> Resultado somarParesEImpares(List<T> numeros) {
        long somaPares = 0;
        long somaImpares = 0;

        for (T num : numeros) {
            long valor = num.longValue();
            if (valor % 2 == 0) {
                somaPares += valor;
            } else {
                somaImpares += valor;
            }
        }

        return new Resultado(somaPares, somaImpares);
    }
}
