package training.classes;

public class Main {
    private static Patient[] patientList;

    public static void main(String[] args) {
        Main main = new Main();

        main.setPatientList();
        main.printPatientsByDiagnosis("Allergy");
        System.out.println();
        main.printPatientsByCardNumber(33240, 33270);
    }

    private void setPatientList() {
        patientList = new Patient[]{
                new Patient(121, "Petrova", "Anna", "Nikolaevna", "Lenina 24", 297474936, 33412, "Avitaminosis"),
                new Patient(122, "Kiselev", "Igor", "Ivanovich", "Pirogova 76 - 12", 298463754, 33265, "Adenoma"),
                new Patient(123, "Silin", "Leonid", "Nikolaevich", "Pobedy 64 - 23", 337474445, 33245, "Allergy"),
                new Patient(124, "Ivanova", "Irina", "iosifovna", "Kirova 21 - 2", 291134584, 22545, "Arthritis"),
                new Patient(125, "Mironova", "Elena", "Ivanovna", "Esenina 129 - 35", 336647545, 33874, "Adenoma"),
                new Patient(126, "Nikolaev", "Dmitry", "Dmitrievich", "Lenina 38", 297074547, 33248, "Alcoholism"),
                new Patient(127, "Isaev", "Vasily", "Petrovich", "Geroev 19", 294456363, 33250, "Allergy"),
                new Patient(128, "Kirov", "Alexey", "Ivanovich", "Mira 46", 298904546, 33269, "Anemia"),
                new Patient(129, "Levin", "Kirill", "Eliseevich", "Gornaya 90 - 12", 291765345, 33278, "Artritis"),
                new Patient(130, "Horina", "Olga", "Petrovna", "Sadovaya 8", 296737373, 33598, "Allergy")
        };
    }

    private void printPatientsByDiagnosis(String diagnosis) {
        for (Patient patient : patientList) {
            if (patient.getDiagnosis().equals(diagnosis)) {
                System.out.println(patient);
            }
        }
    }

    private void printPatientsByCardNumber(long medicalCardNumberMin, long medicalCardNumberMax) {
        for (Patient patient : patientList) {
            if (patient.getMedicalCardNumber() >= medicalCardNumberMin && patient.getMedicalCardNumber() <= medicalCardNumberMax) {
                System.out.println(patient);
            }
        }
    }
}