import model.Doctor;
import model.Patient;
import model.User;

import javax.print.Doc;
import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //model.Doctor myDoctor = new model.Doctor();
        //myDoctor.name="Alejandro Rodriguez";
        //myDoctor.showName();
        //myDoctor.showId();
        //model.Doctor myDoctorEdu = new model.Doctor();
        ///myDoctorEdu.showId();
        /*model.Patient patient = new model.Patient("Alejandra", "alejandra@gmail.com");
        patient.setHeight(54.6);
        System.out.println(patient.getHeight());

        patient.setPhoneNumber("47312954865");
        System.out.println(patient.getPhoneNumber());


        Doctor myDoctor = new Doctor("Oscar Sanchez", "oscar@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "6pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");
        System.out.println(myDoctor);

        User user = new Doctor("Oscar","oscar@gmail.com");
        user.showDataUser();
        User userPA = new Patient("Eduardo","oscar@gmail.com");
        userPA.showDataUser();
        //Clase anonima
        User user1 = new User("Carlos", "carlos@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Angeles");
                System.out.println("Departamento: Geriatria");
            }
        };
        user1.showDataUser();
        /*
        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        System.out.println(patient);*/

        showMenu();
    }

}