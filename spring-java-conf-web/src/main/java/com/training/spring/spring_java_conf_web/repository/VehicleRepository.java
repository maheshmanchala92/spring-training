package com.training.spring.spring_java_conf_web.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.spring.spring_java_conf_web.model.FourWheeler;
import com.training.spring.spring_java_conf_web.model.SixWheeler;
import com.training.spring.spring_java_conf_web.model.TwoWheeler;
import com.training.spring.spring_java_conf_web.model.Vehicle;

@Repository
public class VehicleRepository {

	@Autowired
	private SessionFactory factory;

	public Session getSession() {
		return factory.openSession();
	}

	public void saveVehicle() {
		Session session = getSession();
		Transaction tx = session.beginTransaction();

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		session.save(vehicle); // 98304 //98308

		TwoWheeler twoWheeler = new TwoWheeler();
		twoWheeler.setVehicleName("Bike");
		twoWheeler.setSteeringTwoWheeler("Bike Steering Handle");
		twoWheeler.setModelName("Pulser180CC");
		session.save(twoWheeler); //98305

		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.setVehicleName("Alto");
		fourWheeler.setSteeringFourWheeler("Alto Steering Wheel");
		session.save(fourWheeler);// 98306
		
		SixWheeler sixwheeler = new SixWheeler();
		sixwheeler.setVehicleName("JCB");
		sixwheeler.setSteeringFourWheeler("JCB Steering Wheel");
		sixwheeler.setGares(5);
		session.save(sixwheeler);//98307

		tx.commit();
	}
}
