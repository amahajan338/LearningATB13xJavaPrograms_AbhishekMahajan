package ex_27_task;

import java.util.Scanner;

public class domain_type_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the website URL: ");
        String website = sc.nextLine().toLowerCase();

        // Check domain type
        if (website.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (website.endsWith(".org")) {
            System.out.println("Organization website");
        } else if (website.endsWith(".edu")) {
            System.out.println("Educational website");
        } else if (website.endsWith(".gov")) {
            System.out.println("Government website");
        } else if (website.endsWith(".net")) {
            System.out.println("Network website");
        } else if (website.endsWith(".in")) {
            System.out.println("Indian website");
        } else {
            System.out.println("Unknown or unsupported domain type");
        }
    }
}
