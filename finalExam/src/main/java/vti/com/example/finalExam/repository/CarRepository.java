package vti.com.example.finalExam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vti.com.example.finalExam.entity.Car;

import java.util.List;
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM Car WHERE license_Plate")
     List<Car> findByLicensePlate(@Param( "licensePlate") String licensePlate); // Native query
}
