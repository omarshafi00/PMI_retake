import java.util.HashMap;
import java.util.Map;

public class Dentist {
    HashMap<String, String> appointments;

    public Dentist() {
        appointments = new HashMap();
    }

    public CharSequence getAppointments() {
        StringBuilder sb = new StringBuilder();
        appointments.forEach((key, value) -> sb.append(key).append(" ").append(value).append("\r\n"));
        int last = sb.lastIndexOf("\r\n");
        if (last >= 0) {
            sb.delete(last, sb.length());
        }
        return sb.toString();
    }

    public void newAppointment(String patientName, String timestamp) {
        if (!appointments.containsKey(patientName))
            appointments.put(patientName, timestamp);
    }

    public void resign(String patientName) {
        appointments.remove(patientName);
    }
}