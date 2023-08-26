package vti.com.example.finalExam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vti.com.example.finalExam.entity.Accessory;

import java.util.List;
@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM rocket34 where type = ")
    public List<Accessory> getByType(String type); // Native query

}
