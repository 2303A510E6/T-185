import java.util.*;

public class CareerCounselling {

    private static final Map<String, String[]> careerOptions = new HashMap<>();

    private static final Map<String, String> careerMentors = new HashMap<>();

    private static final Map<String, String> careerResources = new HashMap<>();

    static {

        careerOptions.put("Technology", new String[]{"Software Engineer", "Data Scientist", "Cybersecurity Expert"});
        careerOptions.put("Medicine", new String[]{"Doctor", "Nurse", "Pharmacist"});
        careerOptions.put("Finance", new String[]{"Investment Banker", "Chartered Accountant", "Financial Analyst"});
        careerOptions.put("Arts", new String[]{"Graphic Designer", "Musician", "Filmmaker"});
        careerOptions.put("Engineering", new String[]{"Mechanical Engineer", "Civil Engineer", "Electrical Engineer"});


        careerMentors.put("Technology", "John Doe (Senior Software Engineer at Google)");
        careerMentors.put("Medicine", "Dr. Priya Sharma (Senior Cardiologist)");
        careerMentors.put("Finance", "Amit Gupta (CFO at XYZ Bank)");
        careerMentors.put("Arts", "Rohit Mehra (Award-winning Filmmaker)");
        careerMentors.put("Engineering", "Anjali Verma (Project Manager at Tesla)");


        careerResources.put("Technology", "Explore CS degrees, coding bootcamps, and AI courses.");
        careerResources.put("Medicine", "Pursue MBBS, Nursing, or Pharmacy degrees.");
        careerResources.put("Finance", "Get CFA, MBA, or Chartered Accountancy certification.");
        careerResources.put("Arts", "Join media, film studies, or graphic design programs.");
        careerResources.put("Engineering", "B.Tech or M.Tech in various specializations.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====================================");
        System.out.println("   WELCOME TO CAREER COUNSELLING");
        System.out.println("====================================");

        while (true) {

            System.out.println("\nSelect your area of interest:");
            int index = 1;
            List<String> fields = new ArrayList<>(careerOptions.keySet());

            for (String field : fields) {
                System.out.println(index + ". " + field);
                index++;
            }
            System.out.println(index + ". Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == index) {
                System.out.println("Exiting the Career Counselling Program. Goodbye!");
                break;
            }

            if (choice < 1 || choice > fields.size()) {
                System.out.println("Invalid choice. Please select a valid option.");
                continue;
            }

            String selectedField = fields.get(choice - 1);
            displayCareerDetails(selectedField);
        }

        scanner.close();
    }

    private static void displayCareerDetails(String field) {
        System.out.println("\n====================================");
        System.out.println("   CAREER GUIDANCE FOR " + field.toUpperCase());
        System.out.println("====================================");

        System.out.println("Recommended Career Paths:");
        for (String career : careerOptions.get(field)) {
            System.out.println(" - " + career);
        }

        System.out.println("\nCareer Mentor: " + careerMentors.get(field));

        System.out.println("\nResources: " + careerResources.get(field));

        System.out.println("====================================\n");
    }
}