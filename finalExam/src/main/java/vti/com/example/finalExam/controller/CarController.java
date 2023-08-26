package vti.com.example.finalExam.controller;

import org.apache.commons.logging.Log;
import org.apache.coyote.Request;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vti.com.example.finalExam.entity.Car;
import vti.com.example.finalExam.service.CarService;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/v1")
public class CarController {
    //GET POST PUT DELETE + PATH
    final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    // Lấy toàn bộ danh sách
    // url: http://address:port/api/version/object
    // url: http://localhost:8080/api/v1/... + GET ALL
    @GetMapping("/car")
    public List<Car> getAll() {
        return carService.findAll();
    }

    //    @GetMapping("")
//    public Page<Car> findAll(){
//        Pageable pageable = Pageable.ofSize(10);
//        //Pageable pageable = pageable.of(0, 20);
//        return carService.findAllPaging(pageable);
//
//    }

//    @GetMapping("/car")
//    public ResponseEntity<Car> findByLicensePlateAndRepairDate(
//            @RequestParam("LicensePlate") String LicensePlate,
//            @RequestParam("RepairDate") @DateTimeFormat(pattern = "yyyy-MM-dd") String repairDate) {
//        Optional<Car> car = carService.findByLicensePlateAndRepairDate(LicensePlate, repairDate);
//        return car.map(reponse);
//        }
//    )

    @GetMapping("/car/{id}")
    public Car getCarById(@PathVariable Long id) {
        Optional<Car> carOptional = carService.findOneOptional(id);
        if (carOptional.isPresent()) {
            return carOptional.get();
        } else {
            return null;
        }
    }

//    @GetMapping("/car/findByType")
//    public List<Car> getByType(@RequestParam String type) {
//        return carService.findAllPaging();
//    }

    // Thêm 1 (n) đối tượng
    // url: http://localhost:8080/api/v1/... + POST
    @PostMapping("/car")
    public Car createJob(@RequestBody Car car) {
        return carService.save(car);
    }

    // sửa 1 (n) đối tượng
    // url: http://localhost:8080/api/v1/... + PUT
    @PutMapping("/car/{id}")
    public Car getOne(@RequestParam Long id, @RequestBody Car car) {
        return carService.save(car);

    }
    // Xóa 1 (n) đối tượng
    // url: http://localhost:8080/api/v1/... + DELETE
    @DeleteMapping("/car")
    public void deleteOne(@RequestParam Long id){
        carService.deleteById(id);
    }
}
