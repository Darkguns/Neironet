import  java.lang.Math;
public class matematic//класс созданый для математических расчетов
{
    public  static double sigmoid(double x)//метод для расчета сигмоид
        {
            return 1/(1+Math.exp(-x));
        }

    public  static double sigmoidDX(double x)//метод для расчета производной сигмоиды
    {
        return Math.exp(-x)/Math.pow(1+Math.exp(-x),2);
    }
}
