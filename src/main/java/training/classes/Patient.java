package training.classes;

public class Patient {
    private long id;
    private String familyName;
    private String name;
    private String patronymic;
    private String address;
    private long phoneNumber;
    private long medicalCardNumber;

    public Patient(long id, String familyName, String name) {
        this.id = id;
        this.familyName = familyName;
        this.name = name;
    }

    public Patient(long id, String familyName, String name, String patronymic, String address, long phoneNumber, long medicalCardNumber, String diagnosis) {
        this.id = id;
        this.familyName = familyName;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAdress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(long medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    private String diagnosis;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return familyName + " " + name + " " + patronymic + " with medical card number " + medicalCardNumber;
    }

}