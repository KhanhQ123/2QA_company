package phattrienungdungvoij2ee.bai5_qlsp_jpa.service;

import phattrienungdungvoij2ee.bai5_qlsp_jpa.model.Dichvu;

import java.util.List;

public interface DichvuService {
    List<Dichvu> getAllServices();
    Dichvu getServiceById(Long id);
    Dichvu saveService(Dichvu dichvu);
    void deleteService(Long id);
}
