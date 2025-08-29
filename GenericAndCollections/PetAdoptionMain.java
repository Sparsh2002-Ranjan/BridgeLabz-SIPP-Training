import java.util.*;

class Pet {
    private String type;
    private int age;
    private boolean adopted;

    public Pet(String type, int age, boolean adopted) {
        this.type = type;
        this.age = age;
        this.adopted = adopted;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void adopt() {
        this.adopted = true;
    }

    @Override
    public String toString() {
        return type + " (Age: " + age + ", Adopted: " + adopted + ")";
    }
}

class PetAdoptionPortal<T extends Pet> {
    private List<T> pets = new ArrayList<>();

    public void addPet(T pet) {
        pets.add(pet);
    }

    public List<T> getAvailablePets(String type, int maxAge) {
        List<T> available = new ArrayList<>();
        for (T pet : pets) {
            if (!pet.isAdopted()  && pet.getAge() <= maxAge) {
                available.add(pet);
            }
        }
        return available;
    }

    public boolean adoptPet(String type, int age) {
        for (T pet : pets) {
            if ( pet.getAge() == age && !pet.isAdopted()) {
                pet.adopt();
                return true;
            }
        }
        return false;
    }

    public List<T> getAllPets() {
        return pets;
    }
}

public class PetAdoptionMain {
    public static void main(String[] args) {
        PetAdoptionPortal<Pet> portal = new PetAdoptionPortal<>();
        Scanner sc = new Scanner(System.in);

        boolean bb = true;
        while (bb) {
            System.out.println("\nPress 1 to add new pet");
            System.out.println("Press 2 to look at all the pets");
            System.out.println("Press 3 to filter available pets by type & age");
            System.out.println("Press 4 to adopt a pet");
            System.out.println("Press 5 to exit");
            System.out.print("Enter choice: ");

            int n = sc.nextInt();
            sc.nextLine(); 

            switch (n) {
                case 1:
                    System.out.println("Enter pet type:");
                    String type = sc.next();
                    System.out.println("Enter pet age:");
                    int age = sc.nextInt();
                    System.out.println("Is the pet adopted? (yes/no):");
                    String adoptedStr = sc.next();
                    boolean adopted = adoptedStr.equalsIgnoreCase("yes");
                    portal.addPet(new Pet(type, age, adopted));
                    System.out.println("Pet added successfully!");
                    break;

                case 2:
                    System.out.println("All Pets:");
                    for (Pet p : portal.getAllPets()) {
                        System.out.println(p);
                    }
                    if (portal.getAllPets().isEmpty()) {
                        System.out.println("No pets added yet.");
                    }
                    break;

                case 3:
                    System.out.println("Enter pet type to filter:");
                    String filterType = sc.next();
                    System.out.println("Enter maximum age:");
                    int maxAge = sc.nextInt();
                    List<Pet> list = portal.getAvailablePets(filterType, maxAge);
                    if (list.isEmpty()) {
                        System.out.println("No pet matches the conditions provided.");
                    } else {
                        for (Pet pet : list) {
                            System.out.println(pet);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter type of pet to adopt:");
                    String adoptType = sc.next();
                    System.out.println("Enter exact age of pet to adopt:");
                    int adoptAge = sc.nextInt();
                    boolean success = portal.adoptPet(adoptType, adoptAge);
                    if (success) {
                        System.out.println("Pet adopted successfully!");
                    } else {
                        System.out.println("No matching pet available for adoption.");
                    }
                    break;

                case 5:
                    bb = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
