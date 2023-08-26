package vti.com.example.finalExam.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vti.com.example.finalExam.entity.Car;
import vti.com.example.finalExam.repository.CarRepository;

import java.util.List;
import java.util.Optional;
@Service
public class CarService {
    final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    //findAll
    public List<Car> findAll(){
        return carRepository.findAll();
    }
    public Page<Car> findAllPaging(Pageable pageable){
        return carRepository.findAll(pageable);
    }
    public Optional<Car> findByLicensePlateAndRepairDate(long id){
        return carRepository.findById(id);

    }

    //findOne
    public Optional<Car> findOneOptional(Long id){
        return carRepository.findById(id);
    }
    public Car findOne(Long id){
        Optional<Car> optionalCar = carRepository.findById(id);
        if (optionalCar.isPresent()){
            return optionalCar.get();
        }
        return new Car();
    }

    //save
    public Car save(Car car){
        return carRepository.save(car);
    }

    //update
    public Car update(Car car){
        return carRepository.save(car);
    }

    //delete
    public Void delete(Car car){
        carRepository.delete(car);
        return null;
    }
    public Car deleteById(Long id){
        carRepository.deleteById(id);
        return null;
    }

//    public Optional<Car> findByLicensePlateAndRepairDate(String licensePlate, String repairDate) {
//        carRepository.findById(deleteById())
//    }
}
