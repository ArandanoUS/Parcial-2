import RegistroUsuario.Usuario;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de registro de usuarios.");

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su correo electrónico: ");
        String correo = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        Usuario usuario = new Usuario(nombre, correo, contrasena);

        if (!usuario.validarCorreo()) {
            System.out.println("Correo electrónico no válido.");
            return;
        }

        if (!usuario.validarContrasena()) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return;
        }

        System.out.println("¡Registro exitoso!");
        System.out.println("Datos del usuario:");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Correo electrónico: " + usuario.getCorreo());
    }
}