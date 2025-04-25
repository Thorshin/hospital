package org.example.hopital;

import org.example.hopital.entities.Patient;
import org.example.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(HopitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		patientRepository.save(new Patient(null, "Mohamed", new Date(), false, 5));
		patientRepository.save(new Patient(null, "Omar", new Date(), false, 4));
		patientRepository.save(new Patient(null, "Yahya", new Date(), false, 6));
		//		Patient patient = new Patient();
//		patient.setNom("Mohamed");
//		patient.setMalade(false);
//		patient.setId(null);
//		patient.setDateNaissance(new Date());
//		patient.setScore(23);
//
//		Patient patient2 = new Patient(null, "Yassine", new Date(), false, 123);
//		Patient patient3 = Patient.builder()
//				.nom("Imane")
//				.dateNaissance(new Date())
//				.score(56)
//				.malade(true)
//				.build();
//
	}
}
