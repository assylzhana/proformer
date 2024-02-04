package proforma.com.proforma.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import proforma.com.proforma.models.Category;
import proforma.com.proforma.models.Data;
import proforma.com.proforma.repositories.DataRepository;

import java.io.IOException;
import java.util.List;

@Service
public class DataService {
    @Autowired
    private DataRepository dataRepository;

    public List<Data> getAllData() {
        return dataRepository.findAll();
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


}
