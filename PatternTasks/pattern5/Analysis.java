package pattern5;

class Analysis {
    private String type;
    private String result;
    private String patientEmail;

    public Analysis(String type, String result, HealthMonitoringSystem.Patient patient) {
        this.type = type;
        this.result = result;
        this.patientEmail = patient.getEmail();
    }

    public String getType() {
        return type;
    }

    public String getResult() {
        return result;
    }

    public String getPatientEmail() {
        return patientEmail;
    }
}