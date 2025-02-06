public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        // Nombres originales
        String nombre1 = "Luis", nombre2 = "Cristina", nombre3 = "Rosa";

        // Transformar los nombres
        String nuevo1 = transformarNombre(nombre1);
        String nuevo2 = transformarNombre(nombre2);
        String nuevo3 = transformarNombre(nombre3);

        // Unir y mostrar el resultado
        String resultado = nuevo1 + "_" + nuevo2 + "_" + nuevo3;
        System.out.println(resultado);
    }

    public static String transformarNombre(String nombre) {
        if (nombre.length() < 3) {
            return "Nombre inválido";
        }

        // Obtener el segundo carácter en mayúscula
        char segundo = Character.toUpperCase(nombre.charAt(1));

        // Obtener los dos últimos caracteres
        String ultimos = nombre.substring(nombre.length() - 2);

        // Construir el nuevo nombre
        return segundo + "." + ultimos;
    }
}
