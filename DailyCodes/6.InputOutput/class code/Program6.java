import java.io.*;

class Program6 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter Owner Name");
            String name = br.readLine();

            System.out.println("Enter Wing");
            char wing = (char) br.read();
            br.readLine(); // Consume the newline character

            System.out.println("Enter Flat No");
            int flat = Integer.parseInt(br.readLine());

            System.out.println("*****************************");
            System.out.println("Owner Name: " + name);
            System.out.println("Wing: " + wing);
            System.out.println("Flat No: " + flat);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
