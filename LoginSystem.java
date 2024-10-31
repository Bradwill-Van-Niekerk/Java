// import java.util.HashMap;
// import java.util.Scanner;
 
// public class LoginSystem {
//     private HashMap<String, String> users;
 
//     public LoginSystem() {
//         users = new HashMap<>();
//     }
 
//     // Method to register a new user
//     public void register(String username, String password) {
//         if (users.containsKey(username)) {
//             System.out.println("Username already exists.");
//         } else {
//             users.put(username, password);
//             System.out.println("User registered successfully.");
//         }
//     }
 
//     // Method to login a user
//     public boolean login(String username, String password) {
//         if (users.containsKey(username) && users.get(username).equals(password)) {
//             return true;
//         } else {
//             return false;
//         }
//     }
 
//     public static void main(String[] args) {
//         LoginSystem loginSystem = new LoginSystem();
//         Scanner scanner = new Scanner(System.in);
 
//         // Register users
//         System.out.println("Register new users:");
//         loginSystem.register("user1", "password1");
//         loginSystem.register("user2", "password2");
 
//         // Login process
//         System.out.println("\nLogin:");
//         System.out.print("Username: ");
//         String username = scanner.nextLine();
//         System.out.print("Password: ");
//         String password = scanner.nextLine();
 
//         if (loginSystem.login(username, password)) {
//             System.out.println("Login successful!");
//         } else {
//             System.out.println("Invalid username or password.");
//         }
 
//         scanner.close();
//     }
// }