package exercicios.lista2013.ex516;

public class ConversaoDeUnidadesDeTemperatura {
    
    public static double celsiusParaFahrenheit(double c) {
        return (9.0 / 5.0) * c + 32;
    }

    public static double celsiusParaKelvin(double c) {
        return c + 273.15;
    }

    public static double celsiusParaReaumur(double c) {
        return c * 4.0 / 5.0;
    }

    public static double celsiusParaRankine(double c) {
        return celsiusParaKelvin(c) * 1.8;
    }

    public static double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public static double fahrenheitParaKelvin(double f) {
        return celsiusParaKelvin(fahrenheitParaCelsius(f));
    }

    public static double fahrenheitParaReaumur(double f) {
        return celsiusParaReaumur(fahrenheitParaCelsius(f));
    }

    public static double fahrenheitParaRankine(double f) {
        return f + 459.67;
    }

    public static double kelvinParaCelsius(double k) {
        return k - 273.15;
    }

    public static double kelvinParaFahrenheit(double k) {
        return celsiusParaFahrenheit(kelvinParaCelsius(k));
    }

    public static double kelvinParaReaumur(double k) {
        return celsiusParaReaumur(kelvinParaCelsius(k));
    }

    public static double kelvinParaRankine(double k) {
        return k * 1.8;
    }

    public static double reaumurParaCelsius(double re) {
        return re * 5.0 / 4.0;
    }

    public static double reaumurParaFahrenheit(double re) {
        return celsiusParaFahrenheit(reaumurParaCelsius(re));
    }

    public static double reaumurParaKelvin(double re) {
        return celsiusParaKelvin(reaumurParaCelsius(re));
    }

    public static double reaumurParaRankine(double re) {
        return celsiusParaRankine(reaumurParaCelsius(re));
    }

    public static double rankineParaKelvin(double r) {
        return r / 1.8;
    }

    public static double rankineParaCelsius(double r) {
        return kelvinParaCelsius(rankineParaKelvin(r));
    }

    public static double rankineParaFahrenheit(double r) {
        return r - 459.67;
    }

    public static double rankineParaReaumur(double r) {
        return celsiusParaReaumur(rankineParaCelsius(r));
    }
}
