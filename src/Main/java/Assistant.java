public class Assistant extends Dentist{

    public void refreshAppointment(String patientName1, String timestamp2) {
        if (appointments.containsKey(patientName1))
            appointments.put(patientName1, timestamp2);

    }
}