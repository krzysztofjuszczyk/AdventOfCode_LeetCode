package hackerrank.days30ofCode;

public class ClassVsInstance {
    public class Person {
        private int age;

        public Person(int initialAge) {
            if (initialAge < 0) {
                age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            } else {
                age = initialAge;
            }
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            String s = "";
            if (age < 13) {
                s = "You are young.";
            } else if (age < 18) {
                s = "You are a teenager.";
            } else s = "You are old.";

            System.out.println(s);
        }

        public void yearPasses() {
            age++;
        }
    }
}
