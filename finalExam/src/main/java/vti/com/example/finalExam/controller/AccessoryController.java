package vti.com.example.finalExam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vti.com.example.finalExam.entity.Accessory;
import vti.com.example.finalExam.service.AccessoryService;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/v1")
public class AccessoryController {

    //GET POST PUT DELETE + PATH
    private final AccessoryService accessoryService;

    public AccessoryController(@Autowired AccessoryService accessoryService) {
        this.accessoryService = accessoryService;
    }
    @GetMapping("/accessory")
    public List<Accessory> getAll() {
        return accessoryService.findAll();
    }

    //    @GetMapping("")
//    public Page<Accessory> findAll(){
//        Pageable pageable = Pageable.ofSize(10);
//        //Pageable pageable = pageable.of(0, 20);
//        return accessoryService.findAllPaging(pageable);
//
//    }

    @GetMapping("/accessory/{id}")
    public Accessory getOne(@PathVariable Long id) {
        Optional<Accessory> accessoryOptional = accessoryService.findOneOptional(id);
        if (accessoryOptional.isPresent()) {
            return accessoryOptional.get();
        } else {
            return null;
        }
    }
//    @GetMapping("/accessory/findByType")
//    public List<Accessory> getByType(@RequestParam String type) {
//        return accessoryService.findAllPaging();
//    }

    // Thêm 1 (n) đối tượng
    // url: http://localhost:8080/api/v1/...+ POST
    @PostMapping("/accessory")
    public Accessory createJob(@RequestBody Accessory accessory) {
        return accessoryService.save(accessory);
    }

    // sửa 1 (n) đối tượng
    // url: http://localhost:8080/api/v1/.... + PUT
    @PutMapping("/accessory/{id}")
    public Accessory getOne(@PathVariable Long id, @RequestBody Accessory accessory) {
        return accessoryService.save(accessory);

    }
    // Xóa 1 (n) đối tượng
    // url: http://localhost:8080/api/v1/.... + DELETE
    @DeleteMapping("/accessory/{id}")
    public void deleteOne(@PathVariable Long id){
        accessoryService.deleteById(id);
    }
}
