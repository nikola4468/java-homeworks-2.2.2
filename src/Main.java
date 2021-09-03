public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 80; //Масса тела в кг
        int height = 185; //Рост в см
        int bmi = service.calculate(weight, height);
        System.out.println("ИМТ = " + bmi);
        if (bmi <= 16) {
            System.out.println("Выраженный дефицит массы тела");
        }
        if (bmi > 16 && bmi < 19) {
            System.out.println("Недостаточная (дефицит) масса тела");
        }
        if (bmi >= 19 && bmi < 25) {
            System.out.println("Норма");
        }
        if (bmi >= 25 && bmi < 30) {
            System.out.println("Избыточная масса тела (предожирение)");
        }
        if (bmi >= 30 && bmi < 35) {
            System.out.println("Ожирение первой степени");
        }
        if (bmi >= 35 && bmi < 40) {
            System.out.println("Ожирение второй степени");
        }
        if (bmi >= 40) {
            System.out.println("Ожирение третьей степени");
        }
    }

}