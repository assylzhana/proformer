package proforma.com.proforma.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import proforma.com.proforma.models.Category;
import proforma.com.proforma.models.Data;
import proforma.com.proforma.services.DataService;

import java.awt.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/table")
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping("/list")
    public List<Data> listData() {
        return dataService.getAllData();
    }

    @GetMapping("/{id}")
    public Data getData(@PathVariable Long id){
        return dataService.getDataById(id);
    }
    @PostMapping
    public void addData( @RequestBody Data data) {

        dataService.addData(data);
    }

    @PutMapping()
    public void edit(@RequestBody Data data) {
        dataService.editData(data);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        dataService.deleteDataById(id);
    }
}