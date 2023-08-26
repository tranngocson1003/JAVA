package vti.com.example.finalExam.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vti.com.example.finalExam.entity.Accessory;
import vti.com.example.finalExam.repository.AccessoryRepository;

import java.util.List;
import java.util.Optional;
@Service
public class AccessoryService {
    final AccessoryRepository accessoryRepository;

    public AccessoryService(AccessoryRepository accessoryRepository) {
        this.accessoryRepository = accessoryRepository;
    }
    //findAll
    public List<Accessory> findAll(){
        return accessoryRepository.findAll();
    }
    public Page<Accessory> findAllPaging(Pageable pageable){
        return accessoryRepository.findAll(pageable);
    }
    //findOne
    public Optional<Accessory> findOneOptional(Long id){
        return accessoryRepository.findById(id);
    }
    public Accessory findOne(Long id){
        Optional<Accessory> optionalAccessory = accessoryRepository.findById(id);
        if (optionalAccessory.isPresent()){
            return optionalAccessory.get();
        }
        return new Accessory();
    }
    //save
    public Accessory save(Accessory accessory){
        return accessoryRepository.save(accessory);
    }
    //update
    public Accessory update(Accessory accessory){
        return accessoryRepository.save(accessory);
    }
    //delete
    public Void delete(Accessory accessory){
        accessoryRepository.delete(accessory);
        return null;
    }
    public Accessory deleteById(Long id){
        accessoryRepository.deleteById(id);
        return null;
    }
}
