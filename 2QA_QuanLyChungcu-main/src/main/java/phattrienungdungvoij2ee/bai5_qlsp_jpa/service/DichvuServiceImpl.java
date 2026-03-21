package phattrienungdungvoij2ee.bai5_qlsp_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phattrienungdungvoij2ee.bai5_qlsp_jpa.model.Dichvu;
import phattrienungdungvoij2ee.bai5_qlsp_jpa.repository.DichvuRepository;

import java.util.List;

@Service
public class DichvuServiceImpl implements DichvuService {
    @Autowired
    private DichvuRepository dichvuRepository;

    @Override
    public List<Dichvu> getAllServices() {
        return dichvuRepository.findAll();
    }

    @Override
    public Dichvu getServiceById(Long id) {
        return dichvuRepository.findById(id).orElse(null);
    }

    @Override
    public Dichvu saveService(Dichvu dichvu) {
        return dichvuRepository.save(dichvu);
    }

    @Override
    public void deleteService(Long id) {
        dichvuRepository.deleteById(id);
    }
}
