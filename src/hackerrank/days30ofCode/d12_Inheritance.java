package hackerrank.days30ofCode;

public class d12_Inheritance {
    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

    class Student extends Person{
        private int[] testScores;

        /*
         *   Class Constructor
         *
         *   @param firstName - A string denoting the Person's first name.
         *   @param lastName - A string denoting the Person's last name.
         *   @param id - An integer denoting the Person's ID number.
         *   @param scores - An array of integers denoting the Person's test scores.
         */
        // Write your constructor here
        Student(String firstName, String lastName, int id, int[] testScores){
            super(firstName,lastName,id);
            this.testScores = testScores;
        }

        /*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         */
        // Write your method here
        public char calculate(){
            char letter = '0';
            float avg =0;
            int avgRounded =0;
            int sum = 0;
            for (int i = 0; i < testScores.length; i++) {
                sum += testScores[i];
            }
            avg = sum / testScores.length;
            avgRounded = Math.round(avg);

            if (avgRounded >= 90) return 'O';
            else if (avgRounded >= 80) return 'E';
            else if (avgRounded >= 70) return 'A';
            else if (avgRounded >= 55) return 'P';
            else if (avgRounded >= 40) return 'D';
            else return 'T';
        }
    }
}
