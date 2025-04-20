package Nivel_Intermediario.Metodos;

public class StaticEVoid {
    public static int somar(int a, int b){
        return a + b;
    }
    public static void testandoStaticVoid(){
        System.out.println("Apenas testando o método static void!");
    }

    public String getName(String firstName, String lastName) {
        return getName(firstName, "", lastName);
    }

    public String getName(String firstName, String middleName, String lastName) {
        if (!middleName.isEmpty()) {
            return firstName + " " + lastName;
        }
        return firstName + " " + middleName + " " + lastName;
    }

    public static void main(String[] args) {
        System.out.println("==========Testando method static int==========");
        int resultadoSoma = StaticEVoid.somar(9,9);
        System.out.println(resultadoSoma);

        System.out.println("===========Testando method static void==========");
        testandoStaticVoid();

        System.out.println("=========Testando o método ");
    }
}
