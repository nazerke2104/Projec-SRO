import java.io.*;
import java.util.Scanner;

public class Sro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Атыңды енгіз: ");
        String name = sc.nextLine();

        System.out.print("Жасыңды енгіз: ");
        int age = sc.nextInt();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt", true))) {
            writer.write("Аты: " + name + ", Жасы: " + age);
            writer.newLine();
            System.out.println("Сақталды!");
        } catch (IOException e) {
            System.out.println("Қате: " + e.getMessage());
        }

        System.out.println("\nФайлдағы мәліметтер:");
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Оқу кезінде қате!");
        }
    }
}