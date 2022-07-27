public class calculator {
        public static void main (String [] args) {
            int a = 5;
            int b = 5;

            char sign = '+'; // +, -, *, /, ^, %
            //Сложение
            if (sign == '+') {
                int sum = a + b;
                System.out.println(a + " " + sign + " " + b + " = "  + sum);
            }
            //Вычитание
            else if  (sign == '-') {
                int subtraction = a - b;
                System.out.println(a + " " + sign + " " + b + " = "  + subtraction);
            }
            //Умножение
            else if (sign == '*') {
                int  multiplication = a*b;
                System.out.println(a + " " + sign + " " + b + " = "  + multiplication);
            }
            //Деление по модулю
            else if  (sign == '%') {
                int mod = a % b;
                System.out.println(a + " " + sign + " " + b + " = "  + mod);
            }
            //Возведение в степень,переменная b является стпенью
            else if  (sign == '^') {
                System.out.println("Число " + a + " в степени " + b + " равно " + Math.pow(a, b));


            }

        }
    }


