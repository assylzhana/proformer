package proforma.com.proforma.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import proforma.com.proforma.models.Category;
import proforma.com.proforma.models.Data;
import proforma.com.proforma.repositories.DataRepository;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DataService {
    @Autowired
    private DataRepository dataRepository;

    public List<Data> getAllData() {
        List<Data> list = dataRepository.findAll();
        Collections.sort(list,Comparator.comparing(Data::getId));
        return list;
    }

    public void editData(Data data) {
        dataRepository.save(data);
    }

    public Data addData(Data data) {
        return dataRepository.save(data);
    }

    public void deleteDataById(Long id) {
        dataRepository.deleteById(id);
    }


    public void editData(Long id) {
        Data data = dataRepository.findById(id).orElse(null);
        dataRepository.save(data);

    }

    public Data getDataById(Long id) {
        return dataRepository.findById(id).orElse(null);
    }
}
