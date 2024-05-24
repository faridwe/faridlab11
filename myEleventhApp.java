public class myEleventhApp {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        Student topStudent = students.stream()
                .max(Comparator.comparing(Student::calculateAverageGrade))
                .orElse(null);

        if (topStudent != null) {
            System.out.println("Student with the highest average: " + topStudent.getFirstName() + " " +
                    topStudent.getLastName() + " (" + topStudent.getIndexNumber() + ") - Average: " +
                    topStudent.calculateAverageGrade());
        }

        System.out.println("Students sorted by last names:");
        students.stream()
                .sorted(Comparator.comparing(Student::getLastName))
        {
}
