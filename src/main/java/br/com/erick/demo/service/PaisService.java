package br.com.erick.demo.service;

import br.com.erick.demo.model.Pais;
import br.com.erick.demo.repository.PaisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService {

    private final PaisRepository paisRepository;

    public PaisService(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    public void saveAll(List<Pais> paisList) {
        paisRepository.saveAll(paisList);
    }

}
